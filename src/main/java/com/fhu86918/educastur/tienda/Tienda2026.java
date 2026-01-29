/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fhu86918.educastur.tienda;
//<editor-fold defaultstate="fold" desc="IMPORTS">
import java.net.ContentHandlerFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//</editor-fold>


/**
 *
 * @author 1dawd
 */
public class Tienda2026 {

    private static Scanner sc=new Scanner(System.in);
    private ArrayList<Pedido> pedidos;
    private HashMap <String, Articulo> articulos;
    private HashMap <String, Cliente> clientes;
    /*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    ...
    // </editor-fold>
    */
    
    public Tienda2026() {
        pedidos=new ArrayList();
        articulos=new HashMap();
        clientes=new HashMap();
    }
    
    public static void main(String[] args) {

        Tienda2026 t=new Tienda2026();
        t.cargaDatos();
        t.menu();  
        
    }
    
    
    
    
    //<editor-fold defaultstate="fold" desc="MENUS">
    public void menu() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - ARTICULOS");
            System.out.println("\t\t\t\t2 - CLIENTES");
            System.out.println("\t\t\t\t3 - PEDIDOS");
            System.out.println("\t\t\t\t9 - CERRAR EL PROGRAMA");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    menuArticulos();
                    break;
                    
                case 2:
                    menuClientes();
                    break;
                    
                case 3:
                    menuPedidos();
                    break;
                    
            }
        }while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }
    
    
    
    
    public void menuArticulos() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - ALTA");
            System.out.println("\t\t\t\t2 - BAJA");
            System.out.println("\t\t\t\t3 - REPOSICION");
            System.out.println("\t\t\t\t3 - LISTADOS");
            System.out.println("\t\t\t\t9 - MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    altaArticulos();
                    break;
                    
                case 2:
                    bajaArticulos();
                    break;
                    
                case 3:
                    reposicionArticulos();
                    break;
                    
                case 4:
                    listarArticulos();
                    break;
                    
                case 9:
                    menu();
                    break;                    
            }
        }while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }
        
        
        
    public void menuClientes() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - ALTA");
            System.out.println("\t\t\t\t2 - BAJA");
            System.out.println("\t\t\t\t3 - MODIFICACION");
            System.out.println("\t\t\t\t3 - LISTADO");
            System.out.println("\t\t\t\t9 - MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    altaClientes();
                    break;
                    
                case 2:
                    bajaClientes();
                    break;
                    
                case 3:
                    modificacionClientes();
                    break;
                    
                case 4:
                    listaClientes();
                    break;
                case 9:
                    menu();
                    break;
            }
        }while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }
    
    
    
    public void menuPedidos() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - NUEVO PEDIDO");
            System.out.println("\t\t\t\t2 - LISTADO PEDIDOS");
            System.out.println("\t\t\t\t9 - MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    nuevoPedido();
                    break;
                    
                case 2:
                    listadoPedidos();
                    break;
                    
                case 9:
                    menu();
                    break;
            }
        }while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }    
//</editor-fold>
    
    
    
    // <editor-fold defaultstate="fold" desc="ARTICULOS"> 
    private void altaArticulos(){
        String idArticulo,descripcion,existencias,pvp; //Todas las
        
        sc.nextLine();
        System.out.println("ALTA DE NUEVO ARTICULO");
        
        //idArticulo validado con EXPRESION REGULAR SENCILLA
        do {            
            System.out.println("IdArticulo (IDENTIFICADOR):");
            idArticulo=sc.next();
        } while (!idArticulo.matches("[1-5][-][0-9][0-9]") || articulos.containsKey(idArticulo));
        //CONTROLAR FORMATIO id Y QUE NO EXISTA ESE ID PREVIAMENTE
        
        
        
        //Entrada descripcion sin ningun tipo de validacion
            System.out.println("DESCRIPCION");
            descripcion=sc.nextLine();
            
        //EXISTENCIAS CON VALIDACION TIPO int
        do {            
            existencias=sc.nextLine();
        } while (!MetodosAux.esInt(existencias));
        
        
        //PVP CON VALIDACION TIPO double
        do {            
            System.out.println("PVP: ");
            pvp=sc.nextLine();
        } while (!MetodosAux.esDouble(pvp));
        
        //AÑADO OBJETO ARTICULO A LA COLECCION PARSEANDO A int y double
        Articulo a = new Articulo(idArticulo, descripcion,
                Integer.parseInt(existencias), Double.parseDouble(pvp));
        articulos.put (idArticulo,a);
        System.out.println("- Articulo añadido -");
        /*podría hacerse con una única instrucción: 
        articulos.put(idArticulo, new Articulo (idArtiulo,descripcion,+
        */
    }
    
    
    
    private void bajaArticulos(){
        
    }
            
            
    private void reposicionArticulos(){
        
    }
            
            
    private void listarArticulos(){
        System.out.println("");
        for (Articulo a : articulos.values()) {//Al trabajar con Hashmaps, hay que añadir el método ".values()" para que en este caso me entregue toda la información de los artículos que pedí con el toString en la clase Articulos
            System.out.println(a);
        }
    }
    // </editor-fold>
    
    
    
    //<editor-fold defaultstate="fold" desc="CLIENTES">
    
    private void altaClientes(){
        
    }
    
    
    private void bajaClientes(){
        
    }
            
            
    private void modificacionClientes(){
        
    }
    
    
    
    private void listaClientes() {
        System.out.println("DNI clientes:");
        for (String dni : clientes.keySet()) {
            System.out.println(dni);
        }
    }
//</editor-fold>
    
    
    
    //<editor-fold defaultstate="collapsed" desc="PEDIDOS">
    
    public String generaIdPedido(String idCliente){
        String nuevoId;//variable String para ir construyendo un nuevo idPedido
    //Calculamos en la variable contador cuantos pedidos tiene el cliente asociado
        int contador = 0;
        
        for (Pedido p : pedidos) {
            if (p.getClientePedido().getIdCliente().equalsIgnoreCase(idCliente)){
                contador++;
            }
        }
        contador++; //sumamos a contador 1 para el nuevo pedido
        nuevoId= idCliente + "-" + String.format("%03d", contador) + "/" + LocalDate.now().getYear();
        return nuevoId;
    }
    
    
    
    private void nuevoPedido(){
        String idCliente;
        do {            
            System.out.println("DNI  (id) CLIENTE: ");
            idCliente=sc.nextLine().toUpperCase();
        } while (!MetodosAux.validarDNI(idCliente));
        
        
        
        //el new ArrayList (); sirve para inicializar la variable cestaCompra.add 
        ArrayList <LineaPedido>cestaCompra = new ArrayList();
        String idArticulo;
        int unidades = 0;
        do {            
            System.out.print("\nTeclea el ID del articulod deseado (FIN para terminar la compra)");
            idArticulo=sc.next();
            System.out.print("\nTeclea las unidades que deseas comprar del articulo:");
            unidades=sc.nextInt();
            cestaCompra.add(new LineaPedido(idArticulo, unidades));
            System.out.println("\nTeclee el ID del articulo deseado (FIN para terminar la compra)");
        } while (!idArticulo.equalsIgnoreCase("FIN"));
        
        if(cestaCompra.size()>0) {  //(!cestaCompra.isEmpty())
        
        generaIdPedido(idCliente);
        Pedido p = new Pedido(generaIdPedido(idCliente), clientes.get(idCliente), LocalDate.now(), cestaCompra);
        pedidos.add(p);
        }
    }
    
            
    
    private void listadoPedidos(){
        System.out.println("Pedidos:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
//</editor-fold>
    
    
    
    // <editor-fold defaultstate="fold" desc="CARGA DATOS"> 
    public void cargaDatos(){
       clientes.put("80580845T",new Cliente("80580845T","ANA ","658111111","ana@gmail.com"));
       clientes.put("36347775R",new Cliente("36347775R","LOLA","649222222","lola@gmail.com"));
       clientes.put("63921307Y",new Cliente("63921307Y","JUAN","652333333","juan@gmail.com"));
       clientes.put("02337565Y",new Cliente("02337565Y","EDU","634567890","edu@gmail.com"));
              
       articulos.put("1-11",new Articulo("1-11","RATON LOGITECH ST ",14,15));
       articulos.put("1-22",new Articulo("1-22","TECLADO STANDARD  ",9,18));
       articulos.put("2-11",new Articulo("2-11","HDD SEAGATE 1 TB  ",16,80));
       articulos.put("2-22",new Articulo("2-22","SSD KINGSTOM 256GB",9,70));
       articulos.put("2-33",new Articulo("2-33","SSD KINGSTOM 512GB",0,200));
       articulos.put("3-22",new Articulo("3-22","EPSON PRINT XP300 ",5,80));
       articulos.put("4-11",new Articulo("4-11","ASUS  MONITOR  22 ",5,100));
       articulos.put("4-22",new Articulo("4-22","HP MONITOR LED 28 ",5,180));
       articulos.put("4-33",new Articulo("4-33","SAMSUNG ODISSEY G5",12,580));
       
       LocalDate hoy = LocalDate.now();
       pedidos.add(new Pedido("80580845T-001/2025",clientes.get("80580845T"),hoy.minusDays(1), new ArrayList<>
        (List.of(new LineaPedido("1-11",3),new LineaPedido("4-22",3)))));                                                                                                                                                               
       pedidos.add(new Pedido("80580845T-002/2025",clientes.get("80580845T"),hoy.minusDays(2), new ArrayList<>
        (List.of(new LineaPedido("4-11",3),new LineaPedido("4-22",2),new LineaPedido("4-33",4)))));
       pedidos.add(new Pedido("36347775R-001/2025",clientes.get("36347775R"),hoy.minusDays(3), new ArrayList<>
        (List.of(new LineaPedido("4-22",1),new LineaPedido("2-22",3)))));
       pedidos.add(new Pedido("36347775R-002/2025",clientes.get("36347775R"),hoy.minusDays(5), new ArrayList<>
        (List.of(new LineaPedido("4-33",3),new LineaPedido("2-11",3)))));
       pedidos.add(new Pedido("63921307Y-001/2025",clientes.get("63921307Y"),hoy.minusDays(4), new ArrayList<>
        (List.of(new LineaPedido("2-11",5),new LineaPedido("2-33",3),new LineaPedido("4-33",2)))));
    }
    // </editor-fold>
    
}
