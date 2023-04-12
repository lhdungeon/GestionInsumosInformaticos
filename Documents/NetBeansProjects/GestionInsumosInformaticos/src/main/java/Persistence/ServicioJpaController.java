/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Registro;
import Logica.Servicio;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrador
 */
public class ServicioJpaController implements Serializable {

    public ServicioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ServicioJpaController(){
        emf=Persistence.createEntityManagerFactory("GestionInsumosInformaticos");
    }    
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Servicio servicio) {
        if (servicio.getListaRegistros() == null) {
            servicio.setListaRegistros(new ArrayList<Registro>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Registro> attachedListaRegistros = new ArrayList<Registro>();
            for (Registro listaRegistrosRegistroToAttach : servicio.getListaRegistros()) {
                listaRegistrosRegistroToAttach = em.getReference(listaRegistrosRegistroToAttach.getClass(), listaRegistrosRegistroToAttach.getId_registro());
                attachedListaRegistros.add(listaRegistrosRegistroToAttach);
            }
            servicio.setListaRegistros(attachedListaRegistros);
            em.persist(servicio);
            for (Registro listaRegistrosRegistro : servicio.getListaRegistros()) {
                Servicio oldServiOfListaRegistrosRegistro = listaRegistrosRegistro.getServi();
                listaRegistrosRegistro.setServi(servicio);
                listaRegistrosRegistro = em.merge(listaRegistrosRegistro);
                if (oldServiOfListaRegistrosRegistro != null) {
                    oldServiOfListaRegistrosRegistro.getListaRegistros().remove(listaRegistrosRegistro);
                    oldServiOfListaRegistrosRegistro = em.merge(oldServiOfListaRegistrosRegistro);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Servicio servicio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicio persistentServicio = em.find(Servicio.class, servicio.getId());
            ArrayList<Registro> listaRegistrosOld = persistentServicio.getListaRegistros();
            ArrayList<Registro> listaRegistrosNew = servicio.getListaRegistros();
            ArrayList<Registro> attachedListaRegistrosNew = new ArrayList<Registro>();
            for (Registro listaRegistrosNewRegistroToAttach : listaRegistrosNew) {
                listaRegistrosNewRegistroToAttach = em.getReference(listaRegistrosNewRegistroToAttach.getClass(), listaRegistrosNewRegistroToAttach.getId_registro());
                attachedListaRegistrosNew.add(listaRegistrosNewRegistroToAttach);
            }
            listaRegistrosNew = attachedListaRegistrosNew;
            servicio.setListaRegistros(listaRegistrosNew);
            servicio = em.merge(servicio);
            for (Registro listaRegistrosOldRegistro : listaRegistrosOld) {
                if (!listaRegistrosNew.contains(listaRegistrosOldRegistro)) {
                    listaRegistrosOldRegistro.setServi(null);
                    listaRegistrosOldRegistro = em.merge(listaRegistrosOldRegistro);
                }
            }
            for (Registro listaRegistrosNewRegistro : listaRegistrosNew) {
                if (!listaRegistrosOld.contains(listaRegistrosNewRegistro)) {
                    Servicio oldServiOfListaRegistrosNewRegistro = listaRegistrosNewRegistro.getServi();
                    listaRegistrosNewRegistro.setServi(servicio);
                    listaRegistrosNewRegistro = em.merge(listaRegistrosNewRegistro);
                    if (oldServiOfListaRegistrosNewRegistro != null && !oldServiOfListaRegistrosNewRegistro.equals(servicio)) {
                        oldServiOfListaRegistrosNewRegistro.getListaRegistros().remove(listaRegistrosNewRegistro);
                        oldServiOfListaRegistrosNewRegistro = em.merge(oldServiOfListaRegistrosNewRegistro);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = servicio.getId();
                if (findServicio(id) == null) {
                    throw new NonexistentEntityException("The servicio with id " + id + " no longer exists.");
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
            Servicio servicio;
            try {
                servicio = em.getReference(Servicio.class, id);
                servicio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicio with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Registro> listaRegistros = servicio.getListaRegistros();
            for (Registro listaRegistrosRegistro : listaRegistros) {
                listaRegistrosRegistro.setServi(null);
                listaRegistrosRegistro = em.merge(listaRegistrosRegistro);
            }
            em.remove(servicio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Servicio> findServicioEntities() {
        return findServicioEntities(true, -1, -1);
    }

    public List<Servicio> findServicioEntities(int maxResults, int firstResult) {
        return findServicioEntities(false, maxResults, firstResult);
    }

    private List<Servicio> findServicioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Servicio.class));
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

    public Servicio findServicio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Servicio.class, id);
        } finally {
            em.close();
        }
    }

    public int getServicioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Servicio> rt = cq.from(Servicio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
