package DepositoDM;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public int login() {
        //Scanner leer
        Scanner Leer = new Scanner(System.in);

        //Menu
        System.out.println("                      ");
        System.out.println("----------------------");
        System.out.println("    Deposito Login    ");
        System.out.println("----------------------");
        System.out.println("1= Registrar Proveedor");
        System.out.println("2= Iniciar Proveedor Registrado");
        System.out.println("3= Generar Factura");
        System.out.println("4= Ver Deposito");
        System.out.println("5= Ver Facturas");
        System.out.println("6= Ver Proveedores");
        System.out.println("0= Salir");
        System.out.println("----------------------");
        int log;
        log = Leer.nextInt();

        return log;
    }

    public ArrayList añadirProducto() {
        //Scanners String e Int
        Scanner leer = new Scanner(System.in);
        Scanner leerNumero = new Scanner(System.in);

        String nomb;
        System.out.println("Ingrese el nombre del producto");
        nomb = leer.nextLine();

        int num;
        System.out.println("Ingrese las unidades");
        num = leerNumero.nextInt();

        String marc;
        System.out.println("Ingrese la marca");
        marc = leer.nextLine();

        //Conversion de int a string
        String numero = Integer.toString(num);

        //ArrayList de tipo String 
        ArrayList<String> atributos = new ArrayList();
        atributos.add(nomb);
        atributos.add(numero);
        atributos.add(marc);

        return (atributos);
    }

    public void verProducto(ArrayList mostrarMercaderia) {
        //Recorro el array y lo imprimo por pantalla
        System.out.println("---------------------------------");
        System.out.println("            Productos            ");
        System.out.println("---------------------------------");
        for (int i = 0; i < mostrarMercaderia.size(); i++) {
            System.out.println(" " + i + "_" + mostrarMercaderia.get(i));
            System.out.println("                        ");
        }
        System.out.println("---------------------------------");
    }

    public String añadirProveedor() {
        //Scanners String e Int
        Scanner leer = new Scanner(System.in);

        String provee;
        System.out.println("Ingrese el nombre");
        provee = leer.nextLine();

        return provee;
    }

    public int verArrayProveedores(ArrayList<Proveedor> mostrarProveedores) {
        //Scanner leer
        Scanner Leer = new Scanner(System.in);

        //Recorro el array y lo imprimo por pantalla
        System.out.println("-------------------------");
        System.out.println("       Proveedores       ");
        System.out.println("-------------------------");

        int i;
        for (i = 0; i < mostrarProveedores.size(); i++) {
            System.out.println(" " + i + "_" + mostrarProveedores.get(i));
        }
        System.out.println("-------------------------");
        System.out.println("                         ");
        System.out.println("-------------------------");

        System.out.println("Indique su usuario");
        int us=0;
        us = Leer.nextInt();
        
        return us;

    }
    
    public Proveedor identificarProveedor(ArrayList<Proveedor>mostrarProveedores){
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("     Lista de proveedores    ");
        System.out.println("-----------------------------");
        
        for(int i=0; i<mostrarProveedores.size(); i++){
            System.out.println(" "+ i +" "+ mostrarProveedores.get(i));
        }
        System.out.println("-----------------------------");
        System.out.println("Identifique el proveedor");
        int prov;
        prov = Leer.nextInt();
        
        Proveedor proveedor = mostrarProveedores.get(prov);
        
        return proveedor;
    }
    
    public Producto identificarProducto(ArrayList<Producto>mostrarProductos){
        
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("     Lista de productos      ");
        System.out.println("-----------------------------");

        for(int i=0; i<mostrarProductos.size(); i++){
            System.out.println(" "+ i +" "+ mostrarProductos.get(i));
        }
        System.out.println("-----------------------------");
        System.out.println("Identifique el producto");
        int p;
        p = Leer.nextInt();
        
        Producto producto = mostrarProductos.get(p);
        
        return producto;
    }
    
    public void verFacturas(ArrayList<Factura>mostrarFacturas){
        System.out.println("-------------------------------------------------");
        System.out.println("                FACTURAS DE COMPRA               ");
        System.out.println("-------------------------------------------------");
        for(int i = 0; i<mostrarFacturas.size(); i++){
            System.out.println(mostrarFacturas.get(i));
        }
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");
    }
    
    public void verCuentas(ArrayList<Proveedor>mostrarProveedores){
        System.out.println("-------------------------------------------------");
        System.out.println("              Proveedores Registrados            ");
        System.out.println("-------------------------------------------------");
        for(int i = 0; i<mostrarProveedores.size(); i++){
            System.out.println(mostrarProveedores.get(i));
        }
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");
    }
}
