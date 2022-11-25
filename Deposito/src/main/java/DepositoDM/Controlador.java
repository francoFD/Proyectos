package DepositoDM;

import java.util.ArrayList;

public class Controlador {

    public static void main(String[] args) {
        int a; //Valor login
        //Objeto Vista
        Vista vista = new Vista();

        do {
            a = vista.login();

            ////////////////////////////////////////////////////////////////
            ///////////////////////NUEVO PROVEEDOR//////////////////////////
            ////////////////////////////////////////////////////////////////
            if (a == 1) {
                //Resivo los atributos
                String nameprovee = vista.añadirProveedor();
                //Intancio
                Proveedor prov = new Proveedor(nameprovee);
                //Envio el objeto para ser almacenado
                Modelo.guardarProveedores(prov);

                ////////////////////////////////////////////////////////////////
                ///////////////////////NUEVO PRODUCTO///////////////////////////
                ////////////////////////////////////////////////////////////////
                ArrayList<String> atributos = new ArrayList();
                //Resivo los atributos
                atributos = vista.añadirProducto();
                //Instancio el producto 
                String nbre = atributos.get(0);
                int cantidad = Integer.parseInt(atributos.get(1));
                String marca = atributos.get(2);
                //Agrego el id del Proveedor
                Producto producto = new Producto(nbre, cantidad, marca, prov);
                //Envio al modelo para ser almacenado en txt
                Modelo.guardarProductos(producto);

            }

            /////////////////////////////////////////////////////////////////////////
            /////////////////////// CUENTAS REGISTRADAS /////////////////////////////
            /////////////////////////////////////////////////////////////////////////
            if (a == 2) {
                ArrayList<Proveedor> MostrarProveedores = new ArrayList();
                //Añado los objetos que tiene el array retorndo al array de mostrarProveedores
                MostrarProveedores.addAll(Modelo.verProveedores());
                //Recorro el array y Resivo el id de la cuenta elegida
                int cuentaVip = vista.verArrayProveedores(MostrarProveedores);
                
                Proveedor cuenta = MostrarProveedores.get(cuentaVip);
                
                ////////////////////////////////////////////////////////////////
                //////////////////////////NUEVO PRODUCTO////////////////////////
                ////////////////////////////////////////////////////////////////
                ArrayList<String> atributos = new ArrayList();
                //Resivo los atributos
                atributos = vista.añadirProducto();
                //Instancio el producto
                String nbre = atributos.get(0);
                int cantidad = Integer.parseInt(atributos.get(1));
                String marca = atributos.get(2);
                Producto producto = new Producto(nbre, cantidad, marca, cuenta);
                //Envio el producto para ser almacenado en txt
                Modelo.guardarProductos(producto);

            }

            ////////////////////////////////////////////////////////////////
            /////////////////////////GENERAR FACTURA////////////////////////
            ////////////////////////////////////////////////////////////////
            if (a == 3) {
                //Arrays 
                ArrayList<Proveedor> mostrarProveedores = new ArrayList();
                ArrayList<Producto> mostrarProductos = new ArrayList();

                //////////////////////////PROVEEDOR/////////////////////////////
                //Añado los objetos que tiene el array retorndo al array de mostrarProveedores
                mostrarProveedores.addAll(Modelo.verProveedores());
                //Envio el array de Proveedores a la vista y recibo un Proveedor identificado
                Proveedor proveedorFacturado = vista.identificarProveedor(mostrarProveedores);

                ///////////////////////////PRODUCTO/////////////////////////////
                //Añado los objetos que tiene el array retorndo al array de mostrarProductos
                mostrarProductos.addAll(Modelo.verProductos());
                //Envio un array de Productos a la vista y recibo un Producto identificado
                Producto productoFacturado = vista.identificarProducto(mostrarProductos);

                Factura factura = new Factura(proveedorFacturado, productoFacturado);
                Modelo.guardarFactura(factura);
            }

            ////////////////////////////////////////////////////////////////
            ///////////////////////VISTASO AL DEPOSITO//////////////////////
            ////////////////////////////////////////////////////////////////
            if (a == 4) {
                ArrayList<Producto> mostrarProductos = new ArrayList();
                //Añado los objetos que tiene el array retorndo al array de mostrarProductos
                mostrarProductos.addAll(Modelo.verProductos());
                //Envio el array a la vista para imprimirlo por consola
                vista.verProducto(mostrarProductos);
            }

            ////////////////////////////////////////////////////////////////
            ////////////////////VISTASO A LAS FACTURAS//////////////////////
            ////////////////////////////////////////////////////////////////
            if (a == 5) {
                ArrayList<Factura> mostrarFactura = new ArrayList();
                //Añado las facturas que estoy retornando desde el modelo
                mostrarFactura.addAll(Modelo.verFacturas());
                //Recorro el array y luego lo imprimo desde la vista
                vista.verFacturas(mostrarFactura);
            }
            
            ////////////////////////////////////////////////////////////////
            /////////////////////////VER PROVEEDORES////////////////////////
            ////////////////////////////////////////////////////////////////
            if (a == 6) {
                ArrayList<Proveedor> MostrarProveedores = new ArrayList();
                //Añado los objetos que tiene el array retorndo al array de mostrarProveedores
                MostrarProveedores.addAll(Modelo.verProveedores());
                //Recorro el array y luego lo imprimo desde la vista
                vista.verCuentas(MostrarProveedores);
            }
        } while (a != 0);
    }
}
