
package Logica.Insumos;

import javax.persistence.Basic;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Insumo {
    
    @Basic
    private String tipo;
    private String marca;
    private int cantidad;
    private String proveedor;
    private String fechaIngreso;

    public Insumo() {
    }

    public Insumo(String tipo, String marca, int cantidad, String proveedor, String fechaIngreso) {
        this.tipo = tipo;
        this.marca = marca;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
