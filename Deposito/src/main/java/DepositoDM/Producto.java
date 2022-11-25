
package DepositoDM;

import java.io.Serializable;

public class Producto implements Serializable{

    private String nombre;
    private int cantidad;
    private String marca;
    private Proveedor prov;
    
    public Producto(String Nombre, int Cantidad, String Marca, Proveedor Prov) {
        this.nombre = Nombre;
        this.cantidad = Cantidad;
        this.marca = Marca;
        this.prov = Prov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public Proveedor getProv() {
        return prov;
    }

    public void setProv(Proveedor prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return " " + nombre + " - " + cantidad + " - " + marca+ " - " +prov;
    }
    
     @Override
    public boolean equals(Object Obj) {
        Producto NewMercaderia = (Producto) Obj;
        return (NewMercaderia.nombre==nombre) && (NewMercaderia.cantidad==cantidad)&&((NewMercaderia.marca==marca));
    }
}
