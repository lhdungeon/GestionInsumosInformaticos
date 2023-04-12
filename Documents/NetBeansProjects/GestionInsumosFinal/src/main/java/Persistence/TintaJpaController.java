
package Persistence;

import Logica.Tinta;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class TintaJpaController implements Serializable {

    public TintaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public TintaJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tinta tinta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tinta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tinta tinta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tinta = em.merge(tinta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tinta.getId();
                if (findTinta(id) == null) {
                    throw new NonexistentEntityException("The tinta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tinta tinta;
            try {
                tinta = em.getReference(Tinta.class, id);
                tinta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tinta with id " + id + " no longer exists.", enfe);
            }
            em.remove(tinta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tinta> findTintaEntities() {
        return findTintaEntities(true, -1, -1);
    }

    public List<Tinta> findTintaEntities(int maxResults, int firstResult) {
        return findTintaEntities(false, maxResults, firstResult);
    }

    private List<Tinta> findTintaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tinta.class));
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

    public Tinta findTinta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tinta.class, id);
        } finally {
            em.close();
        }
    }

    public int getTintaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tinta> rt = cq.from(Tinta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
