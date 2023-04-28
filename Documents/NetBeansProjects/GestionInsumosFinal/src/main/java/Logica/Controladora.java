
package Logica;

import Persistence.ControladoraPersistencia;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
          
    public String getDate(){
        
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String fecha = dateFormat.format(date);
        return fecha;
      
    }
    
    public Date getDateUnformat(){
 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Date date = new Date();
        return date;
        
           
    }
    
    //ALTAS
    public void nuevoTinta(Tinta nuevoTinta){
        controlPersis.nuevoTinta(nuevoTinta);
    }
    
    public void nuevoSala(Sala nuevoSala){
        controlPersis.nuevoSala(nuevoSala);
    }
    public void nuevoServicio(Servicio nuevoServicio){
        controlPersis.nuevoServicio(nuevoServicio);
    }
    
    public void nuevoHardware(Hardware nuevoHardware){
        controlPersis.nuevoHardware(nuevoHardware);
    }
    
    public void nuevoComputadora(Computadora nuevoComputadora){
        controlPersis.nuevoComputadora(nuevoComputadora);
    }
    
    public void nuevoRegistro(Registro nuevoRegistro){
        controlPersis.nuevoRegistro(nuevoRegistro);
    }
    
    //BAJAS
    public void eliminarTinta(int id){
        controlPersis.eliminarTinta(id);
    }
    
    public void eliminarServicio(int id){
        controlPersis.eliminarServicio(id);
    }
    
    public void eliminarHardware(int id){
        controlPersis.eliminarHardware(id);
    }
    
    public void eliminarComputadora(int id){
        controlPersis.eliminarComputadora(id);
    }
    
    public void eliminarRegistro(int id){
        controlPersis.eliminarRegistro(id);
    }
    
    //MODIFICACION 
    public void editarTinta(Tinta tinta){
        controlPersis.editarTinta(tinta);
    }
    
    public void editarHardware(Hardware hardware){
        controlPersis.editarHardware(hardware);
    }
    
    public void editarSala(Sala sala){
        controlPersis.editarSala(sala);
    }
    
    public void editarServicio (Servicio servicio){
        controlPersis.editarServicio(servicio);
    }
    
    public void editarComputadora(Computadora computadora){
        controlPersis.editarComputadora(computadora);
    }
    
    public void editarRegistro(Registro registro){
        controlPersis.editarRegistro(registro);
    }
    
    
    //LECTURA
    public Tinta buscarTinta(int Id){
        return controlPersis.buscarTinta(Id);
    }
    
    public Computadora buscarComputadora(int Id){
        return controlPersis.buscarComputadora(Id);
    }
    
    public Hardware buscarHardware(int Id){
        return controlPersis.buscarHardware(Id);
    }
    
    public Sala buscarSala(int Id){
        return controlPersis.buscarSala(Id);
    }
    
    public Servicio buscarServicio(int Id){
        return controlPersis.buscarServicio(Id);
    }
    
    public Registro buscarRegistro(int id){
        return controlPersis.buscarRegistro(id);
    }
    
    public ArrayList<Tinta>buscarListaTinta(){
        return controlPersis.buscarListaTinta();
    }
    
    public ArrayList<Computadora>buscarListaComputadora(){
        return controlPersis.buscarListaComputadoras();
    }
    
    public ArrayList<Hardware>buscarListaHardware(){
        return controlPersis.buscarListaHardware();
    }
    
    public ArrayList<Sala>buscarListaSala(){
        return controlPersis.buscarListaSalas();
    }
    
    public ArrayList<Servicio>buscarListaServicios(){
        return controlPersis.buscarListaServicios();
    }
    
    public ArrayList<Registro>buscarListaRegistro(){
        return controlPersis.buscarListaRegistro();
    }
       
}

    

