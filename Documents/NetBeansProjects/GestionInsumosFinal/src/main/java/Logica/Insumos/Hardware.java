
package Logica.Insumos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hardware extends Insumo implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombre;

    public Hardware() {
    }

    public Hardware(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Hardware(int id, String nombre, String tipo, String marca, int cantidad, String proveedor, String fechaIngreso) {
        super(tipo, marca, cantidad, proveedor, fechaIngreso);
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
   
}
