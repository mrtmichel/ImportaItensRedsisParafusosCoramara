/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entidades.Grp;
import entidades.Prod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author mrtmi
 */
public class ProdJpaController implements Serializable {

    public ProdJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Prod prod) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Grp codGrp = prod.getCodGrp();
            if (codGrp != null) {
                codGrp = em.getReference(codGrp.getClass(), codGrp.getCodGrp());
                prod.setCodGrp(codGrp);
            }
            em.persist(prod);
            if (codGrp != null) {
                codGrp.getProdList().add(prod);
                codGrp = em.merge(codGrp);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProd(prod.getCodEstq()) != null) {
                throw new PreexistingEntityException("Prod " + prod + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Prod prod) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Prod persistentProd = em.find(Prod.class, prod.getCodEstq());
            Grp codGrpOld = persistentProd.getCodGrp();
            Grp codGrpNew = prod.getCodGrp();
            if (codGrpNew != null) {
                codGrpNew = em.getReference(codGrpNew.getClass(), codGrpNew.getCodGrp());
                prod.setCodGrp(codGrpNew);
            }
            prod = em.merge(prod);
            if (codGrpOld != null && !codGrpOld.equals(codGrpNew)) {
                codGrpOld.getProdList().remove(prod);
                codGrpOld = em.merge(codGrpOld);
            }
            if (codGrpNew != null && !codGrpNew.equals(codGrpOld)) {
                codGrpNew.getProdList().add(prod);
                codGrpNew = em.merge(codGrpNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = prod.getCodEstq();
                if (findProd(id) == null) {
                    throw new NonexistentEntityException("The prod with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Prod prod;
            try {
                prod = em.getReference(Prod.class, id);
                prod.getCodEstq();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The prod with id " + id + " no longer exists.", enfe);
            }
            Grp codGrp = prod.getCodGrp();
            if (codGrp != null) {
                codGrp.getProdList().remove(prod);
                codGrp = em.merge(codGrp);
            }
            em.remove(prod);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Prod> findProdEntities() {
        return findProdEntities(true, -1, -1);
    }

    public List<Prod> findProdEntities(int maxResults, int firstResult) {
        return findProdEntities(false, maxResults, firstResult);
    }

    private List<Prod> findProdEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Prod.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Prod findProd(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Prod.class, id);
        } finally {
            em.close();
        }
    }

    public int getProdCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Prod> rt = cq.from(Prod.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void zeraEstoque() {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.createNativeQuery("UPDATE Prod SET prod.estqunsd_prod = 0, prod.sit_prod = -1, prod.del_prod = 'S'").executeUpdate();
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Prod findProdByNome(String[] linha) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery query = em.createQuery("SELECT p FROM Prod p WHERE p.nomProd = ?1", Prod.class);
            query.setParameter(1, linha[1]);
            List<Prod> prods = new ArrayList<>();
            prods = query.getResultList();
            if (prods.size() > 0) {
                return prods.get(0);
            }
        } finally {
            em.close();
        }
        return null;
    }

    public void createNewProd(Prod prod, String[] linha) {
        prod.setCodEstq(getCodEstq());
        prod.setCodbarProd(String.valueOf(getCodbarProd()));
        prod.setNomProd(linha[1]);
        prod.setDelProd("N");
        prod.setSitProd((short) 10);
        prod.setEstqunsdProd(Double.parseDouble(linha[2]));
        prod.setCusunmedProd(Double.parseDouble(linha[3]));
        prod.setCustofabProd(Double.parseDouble(linha[3]));
        prod.setCustoljProd(Double.parseDouble(linha[3]));
        prod.setTipiProd(linha[4]);
        try {
            prod.setCsosnProd(Short.valueOf(linha[6]));
        } catch (Exception e) {
            prod.setCsosnProd((short) 102);
        }
        prod.setCestProd(linha[7]);
        try {
            create(prod);
        } catch (Exception ex) {
            Logger.getLogger(ProdJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateProduto(Prod prod, String[] linha) {
        prod.setNomProd(linha[1]);
        prod.setDelProd("N");
        prod.setSitProd((short) 10);
        prod.setEstqunsdProd(Double.parseDouble(linha[2]));
        prod.setCusunmedProd(Double.parseDouble(linha[3]));
        prod.setCustofabProd(Double.parseDouble(linha[3]));
        prod.setCustoljProd(Double.parseDouble(linha[3]));
        try {
            edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ProdJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCodEstq() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNativeQuery("SELECT GEN_ID(GEN_COD_ESTQ, 1) FROM RDB$DATABASE");
            int codEstq = Integer.parseInt(String.valueOf(query.getSingleResult()));
            return codEstq;
        } finally {
            em.close();
        }
    }

    public String getCodbarProd() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNativeQuery("SELECT GEN_ID(GEN_CODBAR_1, 1) FROM RDB$DATABASE");
            String codbarProd = String.valueOf(query.getSingleResult());
            return codbarProd;
        } finally {
            em.close();
        }
    }

    public void createNewProdBySilimar(Prod prod, String[] linha) {
        prod.setCodEstq(getCodEstq());
        prod.setCodbarProd(String.valueOf(getCodbarProd()));
        prod.setNomProd(linha[1]);
        prod.setDelProd("N");
        prod.setSitProd((short) 10);
        prod.setEstqunsdProd(Double.parseDouble(linha[2]));
        prod.setCusunmedProd(Double.parseDouble(linha[3]));
        prod.setCustofabProd(Double.parseDouble(linha[3]));
        prod.setCustoljProd(Double.parseDouble(linha[3]));
        try {
            create(prod);
        } catch (Exception ex) {
            Logger.getLogger(ProdJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Prod findProdByNomeSimiliar(String[] linha) {
        if (linha[1].startsWith("MANG.AJUSTAVEL")) {
            System.out.println("");
        }

        String nome = StringUtils.replace(linha[1], "  ", " ");
        nome = StringUtils.replace(nome, ".", " ");
        String[] aux = StringUtils.splitPreserveAllTokens(nome, " ");
        StringBuilder sb = new StringBuilder();
        if (aux.length >= 3) {
            sb.append("%");
            for (int i = 0; i < 3; i++) {
                double tam = aux[i].length();
                int metade = (int) (tam / 2 + 1);
                sb.append(StringUtils.substring(aux[i], 0, metade)).append("%");
            }
        } else {
            sb.append(aux[0]).append("%");
        }
        nome = sb.toString();
        EntityManager em = getEntityManager();
        try {
            TypedQuery query = em.createQuery("SELECT p FROM Prod p WHERE p.nomProd like ?1", Prod.class);
            query.setParameter(1, nome);
            List<Prod> prods = new ArrayList<>();
            prods = query.getResultList();
            if (prods.size() > 0) {
                return prods.get(0);
            } else {
                nome = StringUtils.replace(linha[1], "  ", " ");
                nome = StringUtils.replace(nome, ".", " ");
                aux = StringUtils.splitPreserveAllTokens(nome, " ");
                sb = new StringBuilder();
                sb.append(aux[0]).append("%");
                query = em.createQuery("SELECT p FROM Prod p WHERE p.nomProd like ?1", Prod.class);
                query.setParameter(1, sb.toString());
                prods = new ArrayList<>();
                prods = query.getResultList();
                if (prods.size() > 0) {
                    return prods.get(0);
                }
            }
        } finally {
            em.close();
        }
        return null;
    }

}
