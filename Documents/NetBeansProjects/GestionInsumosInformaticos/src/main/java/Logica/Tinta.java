
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tinta extends Insumo implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String modelo;
    private String impresora;

    public Tinta() {
    }

    public Tinta(int id, String modelo, String impresora) {
        this.id = id;
        this.modelo = modelo;
        this.impresora = impresora;
    }

    public Tinta(int id, String modelo, String impresora, String tipo, String marca, int cantidad, String proveedor, String fechaIngreso) {
        super(tipo, marca, cantidad, proveedor, fechaIngreso);
        this.id = id;
        this.modelo = modelo;
        this.impresora = impresora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImpresora() {
        return impresora;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }
    
    
  
}
