
package DepositoDM;

import java.io.Serializable;
import java.util.UUID;

public class Proveedor implements Serializable {
    
    private String id;
    private String nombre;

    public Proveedor(String Nombre) {
        this.id = UUID.randomUUID().toString().toUpperCase().substring(0 , 4);
        this.nombre = Nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getId() {
        return id;
    }
    

    @Override
    public String toString() {
        return "\n ID: " + id +
               "\n NOMBRE: "+ nombre ;
    }
    
}
