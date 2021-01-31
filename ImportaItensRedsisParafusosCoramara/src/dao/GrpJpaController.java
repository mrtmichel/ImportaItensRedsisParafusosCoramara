/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entidades.Grp;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Prod;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author mrtmi
 */
public class GrpJpaController implements Serializable {

    public GrpJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Grp grp) throws PreexistingEntityException, Exception {
        if (grp.getProdList() == null) {
            grp.setProdList(new ArrayList<Prod>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Prod> attachedProdList = new ArrayList<Prod>();
            for (Prod prodListProdToAttach : grp.getProdList()) {
                prodListProdToAttach = em.getReference(prodListProdToAttach.getClass(), prodListProdToAttach.getCodEstq());
                attachedProdList.add(prodListProdToAttach);
            }
            grp.setProdList(attachedProdList);
            em.persist(grp);
            for (Prod prodListProd : grp.getProdList()) {
                Grp oldCodGrpOfProdListProd = prodListProd.getCodGrp();
                prodListProd.setCodGrp(grp);
                prodListProd = em.merge(prodListProd);
                if (oldCodGrpOfProdListProd != null) {
                    oldCodGrpOfProdListProd.getProdList().remove(prodListProd);
                    oldCodGrpOfProdListProd = em.merge(oldCodGrpOfProdListProd);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findGrp(grp.getCodGrp()) != null) {
                throw new PreexistingEntityException("Grp " + grp + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Grp grp) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Grp persistentGrp = em.find(Grp.class, grp.getCodGrp());
            List<Prod> prodListOld = persistentGrp.getProdList();
            List<Prod> prodListNew = grp.getProdList();
            List<Prod> attachedProdListNew = new ArrayList<Prod>();
            for (Prod prodListNewProdToAttach : prodListNew) {
                prodListNewProdToAttach = em.getReference(prodListNewProdToAttach.getClass(), prodListNewProdToAttach.getCodEstq());
                attachedProdListNew.add(prodListNewProdToAttach);
            }
            prodListNew = attachedProdListNew;
            grp.setProdList(prodListNew);
            grp = em.merge(grp);
            for (Prod prodListOldProd : prodListOld) {
                if (!prodListNew.contains(prodListOldProd)) {
                    prodListOldProd.setCodGrp(null);
                    prodListOldProd = em.merge(prodListOldProd);
                }
            }
            for (Prod prodListNewProd : prodListNew) {
                if (!prodListOld.contains(prodListNewProd)) {
                    Grp oldCodGrpOfProdListNewProd = prodListNewProd.getCodGrp();
                    prodListNewProd.setCodGrp(grp);
                    prodListNewProd = em.merge(prodListNewProd);
                    if (oldCodGrpOfProdListNewProd != null && !oldCodGrpOfProdListNewProd.equals(grp)) {
                        oldCodGrpOfProdListNewProd.getProdList().remove(prodListNewProd);
                        oldCodGrpOfProdListNewProd = em.merge(oldCodGrpOfProdListNewProd);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = grp.getCodGrp();
                if (findGrp(id) == null) {
                    throw new NonexistentEntityException("The grp with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Grp grp;
            try {
                grp = em.getReference(Grp.class, id);
                grp.getCodGrp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The grp with id " + id + " no longer exists.", enfe);
            }
            List<Prod> prodList = grp.getProdList();
            for (Prod prodListProd : prodList) {
                prodListProd.setCodGrp(null);
                prodListProd = em.merge(prodListProd);
            }
            em.remove(grp);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Grp> findGrpEntities() {
        return findGrpEntities(true, -1, -1);
    }

    public List<Grp> findGrpEntities(int maxResults, int firstResult) {
        return findGrpEntities(false, maxResults, firstResult);
    }

    private List<Grp> findGrpEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Grp.class));
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

    public Grp findGrp(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Grp.class, id);
        } finally {
            em.close();
        }
    }

    public int getGrpCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Grp> rt = cq.from(Grp.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
