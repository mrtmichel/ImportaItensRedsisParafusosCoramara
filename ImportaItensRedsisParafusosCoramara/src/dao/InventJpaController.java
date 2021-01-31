/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entidades.Invent;
import entidades.InventPK;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author mrtmi
 */
public class InventJpaController implements Serializable {

    public InventJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Invent invent) throws PreexistingEntityException, Exception {
        if (invent.getInventPK() == null) {
            invent.setInventPK(new InventPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(invent);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findInvent(invent.getInventPK()) != null) {
                throw new PreexistingEntityException("Invent " + invent + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Invent invent) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            invent = em.merge(invent);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                InventPK id = invent.getInventPK();
                if (findInvent(id) == null) {
                    throw new NonexistentEntityException("The invent with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(InventPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Invent invent;
            try {
                invent = em.getReference(Invent.class, id);
                invent.getInventPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The invent with id " + id + " no longer exists.", enfe);
            }
            em.remove(invent);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Invent> findInventEntities() {
        return findInventEntities(true, -1, -1);
    }

    public List<Invent> findInventEntities(int maxResults, int firstResult) {
        return findInventEntities(false, maxResults, firstResult);
    }

    private List<Invent> findInventEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Invent.class));
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

    public Invent findInvent(InventPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Invent.class, id);
        } finally {
            em.close();
        }
    }

    public int getInventCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Invent> rt = cq.from(Invent.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
