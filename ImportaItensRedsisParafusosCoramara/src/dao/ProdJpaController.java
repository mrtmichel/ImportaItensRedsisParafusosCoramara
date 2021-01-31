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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
            em.createNativeQuery("UPDATE Prod SET prod.estqunsdProd = 0").executeUpdate();
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
