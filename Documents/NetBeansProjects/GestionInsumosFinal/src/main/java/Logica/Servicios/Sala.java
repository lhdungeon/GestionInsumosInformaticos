
package Logica.Servicios;

import Logica.Insumos.RegistroInsumos;
import Logica.Login.Login;
import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sala implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    @Basic
    private String jefeSala;
    private String sala;
    private String nombreResponsable;
    private String dniResponsable;
    private String numeroInterno;
    private String Observaciones;
    
    @OneToOne
    private Login login;
    
    @ManyToOne
    private Servicio servicio;
    
    @OneToMany(mappedBy="sala")
    private LinkedList<RegistroInsumos> listaRegistros;
    
    public Sala() {
    }

    public Sala(int id, String jefeSala, String sala, String nombreResponsable, String dniResponsable, String numeroInterno, String Observaciones, Login login, Servicio servicio, LinkedList<RegistroInsumos> listaRegistros) {
        this.id = id;
        this.jefeSala = jefeSala;
        this.sala = sala;
        this.nombreResponsable = nombreResponsable;
        this.dniResponsable = dniResponsable;
        this.numeroInterno = numeroInterno;
        this.Observaciones = Observaciones;
        this.login = login;
        this.servicio = servicio;
        this.listaRegistros = listaRegistros;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    
    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }



    public LinkedList<RegistroInsumos> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(LinkedList<RegistroInsumos> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJefeSala() {
        return jefeSala;
    }

    public void setJefeSala(String jefeSala) {
        this.jefeSala = jefeSala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }
      
    
}
