package DepositoDM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Modelo {

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////PRODUCTOS TXT///////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public static void guardarProductos(Producto producto) {
        ArrayList<Producto> merc = new ArrayList();
        //Agrego todos los elementos de la colección especificada al final del Array
        merc.addAll(Modelo.verProductos());
        merc.add(producto);

        //Creo un flujo de salida a disco pasandole el nombre del archivo txt
        try ( ObjectOutputStream salidaDisco = new ObjectOutputStream(new FileOutputStream("Producto.txt"))) {
            //Escribo los objetos al flujo de salida y los guarda en un archivo en disco
            salidaDisco.writeObject(merc);
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no encontrado");
        } catch (IOException e) {
            //Imprimo la excepcion
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        }
    }

    public static ArrayList<Producto> verProductos() {
        ArrayList<Producto> vProductos = new ArrayList();
        //Creo un flujo de entrada a disco para poder leer el archivo txt posteriormente
        try ( ObjectInputStream entradaDisco = new ObjectInputStream(new FileInputStream("Producto.txt"))) {
            vProductos = (ArrayList<Producto>) entradaDisco.readObject();

        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no existe en el disco. ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vProductos;
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////////PROVEEDORES TXT///////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public static void guardarProveedores(Proveedor prov) {
        ArrayList<Proveedor> proves = new ArrayList();

        proves.addAll(Modelo.verProveedores());
        proves.add(prov);

        //Creo un flujo de salida a disco pasandole el nombre del archivo txt
        try ( ObjectOutputStream canalDeSalida = new ObjectOutputStream(new FileOutputStream("Proveedores.txt"));) {
            //Escribo los objetos al flujo de salida y los guarda en un archivo en disco
            canalDeSalida.writeObject(proves);
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no encontrado");
        } catch (IOException e) {
            //Imprimo la excepcion
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        }
    }

    public static ArrayList<Proveedor> verProveedores() {
        ArrayList<Proveedor> vProveedores = new ArrayList();

        try ( ObjectInputStream canalDeEntrada = new ObjectInputStream(new FileInputStream("Proveedores.txt"));) {
            vProveedores = (ArrayList<Proveedor>) canalDeEntrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no existe en el disco. ");
        } catch (IOException e) {
            //Imprimo la excepcion
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        } catch (ClassNotFoundException e) {
            //Imprimo la excepcion
            e.printStackTrace();
        }
        return vProveedores;
    }

    ////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////FACTURAS TXT///////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public static void guardarFactura(Factura factura) {
        ArrayList<Factura> arrayFacturas = new ArrayList();

        arrayFacturas.addAll(Modelo.verFacturas());
        arrayFacturas.add(factura);

        //Creo un flujo de salida a disco pasandole el nombre del archivo txt
        try ( ObjectOutputStream canalDeSalida = new ObjectOutputStream(new FileOutputStream("Facturas.txt"));) {
            //Escribo los objetos al flujo de salida y los guarda en un archivo en disco
            canalDeSalida.writeObject(arrayFacturas);
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no encontrado");
        } catch (IOException e) {
            //Imprimo la excepcion
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        }
    }

    public static ArrayList<Factura> verFacturas() {
        ArrayList<Factura> verArrayFacturas = new ArrayList();

        try ( ObjectInputStream canalDeEntrada = new ObjectInputStream(new FileInputStream("Facturas.txt"));) {
            verArrayFacturas = (ArrayList<Factura>) canalDeEntrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(" El archivo de almacenamiento no existe en el disco. ");
        } catch (IOException e) {
            //Imprimo la excepcion
            e.printStackTrace();
            System.out.println(" Se encontro un error de entrada/salida. ");
        } catch (ClassNotFoundException e) {
            //Imprimo la excepcion
            e.printStackTrace();
        }
        return verArrayFacturas;
    }
}
