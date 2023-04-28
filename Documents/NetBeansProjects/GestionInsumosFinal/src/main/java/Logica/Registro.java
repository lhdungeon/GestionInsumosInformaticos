
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Registro implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_registro;
       
    private ArrayList <String>insumos_retirados;
    private ArrayList <Integer> cantidad_Insumos;
    
    private String servicio;
    
    @Temporal(TemporalType.DATE)
    Date fecha;
    
    @ManyToOne
    private Sala sala;

    public Registro() {
    }

    public Registro(int id_registro, ArrayList<String> insumos_retirados, ArrayList<Integer> cantidad_Insumos, String servicio, Date fecha, Sala sala) {
        this.id_registro = id_registro;
        this.insumos_retirados = insumos_retirados;
        this.cantidad_Insumos = cantidad_Insumos;
        this.servicio = servicio;
        this.fecha = fecha;
        this.sala = sala;
    }

    public ArrayList<Integer> getCantidad_Insumos() {
        return cantidad_Insumos;
    }

    public void setCantidad_Insumos(ArrayList<Integer> cantidad_Insumos) {
        this.cantidad_Insumos = cantidad_Insumos;
    }



    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala servi) {
        this.sala = servi;
    }

    

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public ArrayList<String> getInsumos_retirados() {
        return insumos_retirados;
    }

    public void setInsumos_retirados(ArrayList<String> insumos_retirados) {
        this.insumos_retirados = insumos_retirados;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
