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
import Logica.Login.Login;
import Logica.Servicios.Servicio;
import Logica.Insumos.RegistroInsumos;
import Logica.Servicios.Sala;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class SalaJpaController implements Serializable {

    public SalaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public SalaJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sala sala) {
        if (sala.getListaRegistros() == null) {
            sala.setListaRegistros(new LinkedList<RegistroInsumos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Login login = sala.getLogin();
            if (login != null) {
                login = em.getReference(login.getClass(), login.getId());
                sala.setLogin(login);
            }
            Servicio servicio = sala.getServicio();
            if (servicio != null) {
                servicio = em.getReference(servicio.getClass(), servicio.getId());
                sala.setServicio(servicio);
            }
            LinkedList<RegistroInsumos> attachedListaRegistros = new LinkedList<RegistroInsumos>();
            for (RegistroInsumos listaRegistrosRegistroInsumosToAttach : sala.getListaRegistros()) {
                listaRegistrosRegistroInsumosToAttach = em.getReference(listaRegistrosRegistroInsumosToAttach.getClass(), listaRegistrosRegistroInsumosToAttach.getId_registro());
                attachedListaRegistros.add(listaRegistrosRegistroInsumosToAttach);
            }
            sala.setListaRegistros(attachedListaRegistros);
            em.persist(sala);
            if (login != null) {
                Sala oldSalaOfLogin = login.getSala();
                if (oldSalaOfLogin != null) {
                    oldSalaOfLogin.setLogin(null);
                    oldSalaOfLogin = em.merge(oldSalaOfLogin);
                }
                login.setSala(sala);
                login = em.merge(login);
            }
            if (servicio != null) {
                servicio.getSala().add(sala);
                servicio = em.merge(servicio);
            }
            for (RegistroInsumos listaRegistrosRegistroInsumos : sala.getListaRegistros()) {
                Sala oldSalaOfListaRegistrosRegistroInsumos = listaRegistrosRegistroInsumos.getSala();
                listaRegistrosRegistroInsumos.setSala(sala);
                listaRegistrosRegistroInsumos = em.merge(listaRegistrosRegistroInsumos);
                if (oldSalaOfListaRegistrosRegistroInsumos != null) {
                    oldSalaOfListaRegistrosRegistroInsumos.getListaRegistros().remove(listaRegistrosRegistroInsumos);
                    oldSalaOfListaRegistrosRegistroInsumos = em.merge(oldSalaOfListaRegistrosRegistroInsumos);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sala sala) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sala persistentSala = em.find(Sala.class, sala.getId());
            Login loginOld = persistentSala.getLogin();
            Login loginNew = sala.getLogin();
            Servicio servicioOld = persistentSala.getServicio();
            Servicio servicioNew = sala.getServicio();
            LinkedList<RegistroInsumos> listaRegistrosOld = persistentSala.getListaRegistros();
            LinkedList<RegistroInsumos> listaRegistrosNew = sala.getListaRegistros();
            if (loginNew != null) {
                loginNew = em.getReference(loginNew.getClass(), loginNew.getId());
                sala.setLogin(loginNew);
            }
            if (servicioNew != null) {
                servicioNew = em.getReference(servicioNew.getClass(), servicioNew.getId());
                sala.setServicio(servicioNew);
            }
            LinkedList<RegistroInsumos> attachedListaRegistrosNew = new LinkedList<RegistroInsumos>();
            for (RegistroInsumos listaRegistrosNewRegistroInsumosToAttach : listaRegistrosNew) {
                listaRegistrosNewRegistroInsumosToAttach = em.getReference(listaRegistrosNewRegistroInsumosToAttach.getClass(), listaRegistrosNewRegistroInsumosToAttach.getId_registro());
                attachedListaRegistrosNew.add(listaRegistrosNewRegistroInsumosToAttach);
            }
            listaRegistrosNew = attachedListaRegistrosNew;
            sala.setListaRegistros(listaRegistrosNew);
            sala = em.merge(sala);
            if (loginOld != null && !loginOld.equals(loginNew)) {
                loginOld.setSala(null);
                loginOld = em.merge(loginOld);
            }
            if (loginNew != null && !loginNew.equals(loginOld)) {
                Sala oldSalaOfLogin = loginNew.getSala();
                if (oldSalaOfLogin != null) {
                    oldSalaOfLogin.setLogin(null);
                    oldSalaOfLogin = em.merge(oldSalaOfLogin);
                }
                loginNew.setSala(sala);
                loginNew = em.merge(loginNew);
            }
            if (servicioOld != null && !servicioOld.equals(servicioNew)) {
                servicioOld.getSala().remove(sala);
                servicioOld = em.merge(servicioOld);
            }
            if (servicioNew != null && !servicioNew.equals(servicioOld)) {
                servicioNew.getSala().add(sala);
                servicioNew = em.merge(servicioNew);
            }
            for (RegistroInsumos listaRegistrosOldRegistroInsumos : listaRegistrosOld) {
                if (!listaRegistrosNew.contains(listaRegistrosOldRegistroInsumos)) {
                    listaRegistrosOldRegistroInsumos.setSala(null);
                    listaRegistrosOldRegistroInsumos = em.merge(listaRegistrosOldRegistroInsumos);
                }
            }
            for (RegistroInsumos listaRegistrosNewRegistroInsumos : listaRegistrosNew) {
                if (!listaRegistrosOld.contains(listaRegistrosNewRegistroInsumos)) {
                    Sala oldSalaOfListaRegistrosNewRegistroInsumos = listaRegistrosNewRegistroInsumos.getSala();
                    listaRegistrosNewRegistroInsumos.setSala(sala);
                    listaRegistrosNewRegistroInsumos = em.merge(listaRegistrosNewRegistroInsumos);
                    if (oldSalaOfListaRegistrosNewRegistroInsumos != null && !oldSalaOfListaRegistrosNewRegistroInsumos.equals(sala)) {
                        oldSalaOfListaRegistrosNewRegistroInsumos.getListaRegistros().remove(listaRegistrosNewRegistroInsumos);
                        oldSalaOfListaRegistrosNewRegistroInsumos = em.merge(oldSalaOfListaRegistrosNewRegistroInsumos);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sala.getId();
                if (findSala(id) == null) {
                    throw new NonexistentEntityException("The sala with id " + id + " no longer exists.");
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
            Sala sala;
            try {
                sala = em.getReference(Sala.class, id);
                sala.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sala with id " + id + " no longer exists.", enfe);
            }
            Login login = sala.getLogin();
            if (login != null) {
                login.setSala(null);
                login = em.merge(login);
            }
            Servicio servicio = sala.getServicio();
            if (servicio != null) {
                servicio.getSala().remove(sala);
                servicio = em.merge(servicio);
            }
            LinkedList<RegistroInsumos> listaRegistros = sala.getListaRegistros();
            for (RegistroInsumos listaRegistrosRegistroInsumos : listaRegistros) {
                listaRegistrosRegistroInsumos.setSala(null);
                listaRegistrosRegistroInsumos = em.merge(listaRegistrosRegistroInsumos);
            }
            em.remove(sala);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sala> findSalaEntities() {
        return findSalaEntities(true, -1, -1);
    }

    public List<Sala> findSalaEntities(int maxResults, int firstResult) {
        return findSalaEntities(false, maxResults, firstResult);
    }

    private List<Sala> findSalaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sala.class));
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

    public Sala findSala(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sala.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sala> rt = cq.from(Sala.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
