/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Reparaciones;

import Logica.Servicios.Sala;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reparacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @ManyToOne
    private Sala sala;
    
    @OneToOne
    public Tecnico receptor;
    @OneToOne
    Tecnico reparador;
    @OneToOne
    Tecnico quienEntrega;
    
    String estado;// = {"Pendiente", "En revision", "Completado","Requiere insumo"};
    String modelo;
    String diagnostico;
    String detalleTecnico;
    
    String tipoDeReparacion;

    String fechaRecepcion;
    String fechaEstimativa;
    String fechaFinalizacion;

    
    /* Orden de trabajo corresponde a toda la informacion requerida */ 
     
    
    public Reparacion()
    {
    
    }

    public Reparacion(int id, Sala sala, Tecnico receptor, Tecnico reparador, Tecnico quienEntrega, String modelo, String diagnostico, String detalleTecnico) {
        this.id = id;
        this.sala = sala;
        this.receptor = receptor;
        this.reparador = reparador;
        this.quienEntrega = quienEntrega;
        this.modelo = modelo;
        this.diagnostico = diagnostico;
        this.detalleTecnico = detalleTecnico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Tecnico getReceptor() {
        return receptor;
    }

    public void setReceptor(Tecnico receptor) {
        this.receptor = receptor;
    }

    public Tecnico getReparador() {
        return reparador;
    }

    public void setReparador(Tecnico reparador) {
        this.reparador = reparador;
    }

    public Tecnico getQuienEntrega() {
        return quienEntrega;
    }

    public void setQuienEntrega(Tecnico quienEntrega) {
        this.quienEntrega = quienEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDetalleTecnico() {
        return detalleTecnico;
    }

    public void setDetalleTecnico(String detalleTecnico) {
        this.detalleTecnico = detalleTecnico;
    }

    public String getTipoDeReparacion() {
        return tipoDeReparacion;
    }

    public void setTipoDeReparacion(String tipoDeReparacion) {
        this.tipoDeReparacion = tipoDeReparacion;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getFechaEstimativa() {
        return fechaEstimativa;
    }

    public void setFechaEstimativa(String fechaEstimativa) {
        this.fechaEstimativa = fechaEstimativa;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }   

}
