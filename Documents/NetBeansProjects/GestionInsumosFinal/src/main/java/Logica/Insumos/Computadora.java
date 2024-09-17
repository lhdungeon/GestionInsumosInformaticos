
package Logica.Insumos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computadora extends Insumo implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String motherboard;
    private String procesador;
    private String memoria;
    private String discoRigido;
    private String placaVideo;

    public Computadora() {
    }

    public Computadora(int id, String motherboard, String procesador, String memoria, String discoRigido, String placaVideo) {
        this.id = id;
        this.motherboard = motherboard;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
        this.placaVideo = placaVideo;
    }

    public Computadora(int id, String motherboard, String procesador, String memoria, String discoRigido, String placaVideo, String tipo, String marca, int cantidad, String proveedor, String fechaIngreso) {
        super(tipo, marca, cantidad, proveedor, fechaIngreso);
        this.id = id;
        this.motherboard = motherboard;
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
        this.placaVideo = placaVideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getDiscoRigido() {
        return discoRigido;
    }

    public void setDiscoRigido(String discoRigido) {
        this.discoRigido = discoRigido;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }


    
  
}
