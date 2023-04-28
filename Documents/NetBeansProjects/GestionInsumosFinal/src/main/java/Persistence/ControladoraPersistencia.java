
package Persistence;

import Logica.Hardware;
import Logica.Sala;
import Logica.Computadora;
import Logica.Registro;
import Logica.Servicio;
import Logica.Tinta;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    
    ComputadoraJpaController compuJpaControl = new ComputadoraJpaController();
    HardwareJpaController hardJpaControl = new HardwareJpaController();
    SalaJpaController salaJpaControl = new SalaJpaController();
    ServicioJpaController servicioJpaControl = new ServicioJpaController();
    TintaJpaController tintaJpaControl = new TintaJpaController();
    RegistroJpaController registroJpaControl = new RegistroJpaController();

        //ALTAS
    public void nuevoTinta(Tinta nuevoTinta) {
        tintaJpaControl.create(nuevoTinta);
    }

    public void nuevoSala(Sala nuevoSala) {
        salaJpaControl.create(nuevoSala);
    }
    
    public void nuevoServicio(Servicio nuevoServicio){     
        servicioJpaControl.create(nuevoServicio);
    }

    public void nuevoHardware(Hardware nuevoHardware){
        hardJpaControl.create(nuevoHardware);
    }

    public void nuevoComputadora(Computadora nuevoComputadora){
        compuJpaControl.create(nuevoComputadora);
    }
    
    public void nuevoRegistro(Registro nuevoRegistro){
        registroJpaControl.create(nuevoRegistro);
    }

    //BAJAS
    public void eliminarTinta(int id) {
        try {
            tintaJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSala(int id){
    
        try {
            salaJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarServicio(int id){
        try {
            servicioJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarComputadora(int id){
        try {
            compuJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarHardware(int id){
        try {
            hardJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarRegistro(int id){
        try {
            registroJpaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //MODIFICACION
    public void editarTinta(Tinta tinta) {
        try {
            tintaJpaControl.edit(tinta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarSala(Sala sala){
        
        try {
            salaJpaControl.edit(sala);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarHardware(Hardware hardware) {
        try {
            hardJpaControl.edit(hardware);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarServicio(Servicio servicio) {
        try {
            servicioJpaControl.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarComputadora(Computadora computadora) {
        try {
            compuJpaControl.edit(computadora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarRegistro(Registro registro){
        try {
            registroJpaControl.edit(registro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //LECTURA
    public Tinta buscarTinta(int Id) {
        return tintaJpaControl.findTinta(Id);
    }

    public Computadora buscarComputadora(int Id) {
        return compuJpaControl.findComputadora(Id);
    }

    public Hardware buscarHardware(int Id) {
        return hardJpaControl.findHardware(Id);
    }

    public Sala buscarSala(int id){
        return salaJpaControl.findSala(id);
    }
    
    public Servicio buscarServicio(int Id) {
        return servicioJpaControl.findServicio(Id);
    }
    
    public Registro buscarRegistro(int id){
        return registroJpaControl.findRegistro(id);
    }

    public ArrayList<Tinta> buscarListaTinta() {
        List<Tinta> listaTinta = tintaJpaControl.findTintaEntities();
        ArrayList<Tinta>listaTintaArrayLista = new ArrayList(listaTinta);
        return listaTintaArrayLista;
    }

    public ArrayList<Computadora> buscarListaComputadoras() {
         List<Computadora> listaCompu = compuJpaControl.findComputadoraEntities();
         ArrayList<Computadora>listaCompuArrayList = new ArrayList(listaCompu);
         return listaCompuArrayList;
    }

    public ArrayList<Hardware> buscarListaHardware() {
         List<Hardware> listaHard = hardJpaControl.findHardwareEntities();
         ArrayList<Hardware>listaHardArrayList = new ArrayList(listaHard);
         return listaHardArrayList;
    }

    public ArrayList<Sala> buscarListaSalas() {
         List<Sala> listaSala = salaJpaControl.findSalaEntities();
         ArrayList<Sala>listaSalaArrayList = new ArrayList(listaSala);
         return listaSalaArrayList;
    }
    
    public ArrayList<Servicio> buscarListaServicios(){
        List<Servicio>listaServicio= servicioJpaControl.findServicioEntities();
        ArrayList<Servicio>listaServicioArrayList= new ArrayList(listaServicio);
        return listaServicioArrayList;
    }
    
    public ArrayList<Registro> buscarListaRegistro(){
        List<Registro> listaRegistro = registroJpaControl.findRegistroEntities();
        ArrayList<Registro>listaRegistroArrayList = new ArrayList(listaRegistro);
        return listaRegistroArrayList;
    }




}





