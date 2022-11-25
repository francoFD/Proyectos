
package DepositoDM;

import java.io.Serializable;
import java.util.UUID;

public class Factura implements Serializable{
    private String nro;
    private Proveedor proveedor;
    private Producto producto;


    public Factura(Proveedor proveedor, Producto producto) {
        this.nro = UUID.randomUUID().toString().toUpperCase().substring(0 , 4);
        this.proveedor = proveedor;
        this.producto = producto;
    }

    public String getNro() {
        return nro;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
        @Override
    public String toString() {
        return " -Numero de tramite: " + nro +
               "\n      -Datos del proveedor: " + proveedor + 
               "\n      -Datos del producto: " + producto;
    }
    
}
