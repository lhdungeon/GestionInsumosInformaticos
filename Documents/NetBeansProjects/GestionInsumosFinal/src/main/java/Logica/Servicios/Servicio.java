
package Logica.Servicios;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;

    
    private String nombreServicio;
    private String jefeServicio;
    
    @OneToMany(mappedBy="servicio")
    private ArrayList <Sala> sala;

    public Servicio() {

    }

    public Servicio(int id, String nombreServicio, String jefeServicio, ArrayList<Sala> sala) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.jefeServicio = jefeServicio;
        this.sala = sala;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getJefeServicio() {
        return jefeServicio;
    }

    public void setJefeServicio(String jefeServicio) {
        this.jefeServicio = jefeServicio;
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }
    
}
