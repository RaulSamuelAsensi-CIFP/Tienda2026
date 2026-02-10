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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Comparator;
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
        //t.menu;
    
        /*uno();
        dos();
        tres();
        cuatro();
        cinco();*/        
    
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
        //articulos.keySet(); //Te imprime los datos que aparecen justo detrás de "articulos.put" en el cargaDatos
        
        System.out.println("");
        articulos.values().stream().forEach(a->System.out.println(a));//imprime todos los articulos 
        /*para convertir los articulos y los clientes en stream:debemos 
        seleccionar qué queremos convertir en stream de las clases, porque no podemos convertir directamente los hashmaps en stream por ello 
        debemos seleccionar o los values o los keySet.
        Ejemplo:
            articulos.values().stream().forEach(a->System.out.println(a));
            articulos
        */
        
        
        //este metodo sirve para pasar elementos de una colección a otra, se puede hacer de cualquier tipo de coleccion a cualquier otra
        //hay que meter articulos.values() porque es un hashmap, si "articulos" fuera un arraylist, valdría con meter:
        //ArrayList<Articulo> articulosAux = new ArrayList(articulos);
        ArrayList<Articulo> articulosAux = new ArrayList(articulos.values());
        System.out.println("");
        articulosAux.stream().forEach(a->System.out.println(a));//imprime todos los articulos
        
        
        //Este codigo sirve para pasar la informacion del metodo articulosAux a articulosAux2.
        ArrayList<Articulo> articulosAux2 = new ArrayList(articulosAux);
        System.out.println("");
        articulosAux2.stream()
                .filter(a->a.getPvp()<100)
                .sorted(Comparator.comparing(Articulo::getPvp))
                .forEach(a->System.out.println(a));
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
    
    private String generaIdPedido(String idCliente){
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
    
    
    private void stock (String idArticulo, int unidades) throws StockCero, StockInsuficiente{
        if (articulos.get(idArticulo).getExistencias()==0){
            throw new StockCero("Cero unidades disponibles del articulo: " + articulos.get(idArticulo).getDescripcion());
        }
        if (articulos.get(idArticulo).getExistencias()<unidades){
            throw new StockInsuficiente("En este momento solo hay " + articulos.get(idArticulo).getExistencias()
                    +"unidades desponibles del articulo: " + articulos.get(idArticulo).getDescripcion());
            
        }
        
    }
    
    
    //metodo que calcula el total de un pedido
private double totalPedido (Pedido p){
        double totalPedido=0;
        for (LineaPedido l: p.getCestaCompra()){
            totalPedido+= l.getUnidades()* articulos.get(l.getIdArticulo()).getPvp();//el metodo "+="; te va acumulando el precio de los articulos
        }
        return totalPedido;
    }
    
    private void nuevoPedido() {
        sc.nextLine();
        String idCliente;
        do{
            System.out.println("DNI (id) CLIENTE:");
            idCliente=sc.nextLine().toUpperCase();
            if (!clientes.containsKey(idCliente)){
                System.out.println("No es cliente de la tienda."
                        + " Desea darse de alta o comprar como invitado");
            }
        }while (!MetodosAux.validarDNI(idCliente));
        
        
        //el new ArrayList (); sirve para inicializar la variable cestaCompra.add 
        ArrayList <LineaPedido> cestaCompra =new ArrayList();
        String idArticulo;
        int unidades=0;
        System.out.print("\nTecle el ID del artículo deseado (FIN para terminar la compra)");
        idArticulo=sc.next();
        while (!idArticulo.equalsIgnoreCase("FIN")){
            System.out.print("\nTeclea las unidades deseadas: ");
            unidades=sc.nextInt();

            try {
                stock(idArticulo, unidades);
                cestaCompra.add(new LineaPedido(idArticulo,unidades));
                //si todo va bien, no pasará nada
            } catch (StockCero ex) {
                System.out.println(ex.getMessage());
            } catch (StockInsuficiente ex) {
                System.out.println(ex.getMessage());
                System.out.println("Las quieres (SI/NO)");
                String respuesta=sc.next();
                if (respuesta.equalsIgnoreCase("SI")){
                    cestaCompra.add(new LineaPedido(idArticulo,articulos.get(idArticulo).getExistencias()));
                }
            }
            System.out.print("\nTecle el ID del artículo deseado (FIN para terminar la compra)");
            idArticulo=sc.next();
        }
        
        
        if (!cestaCompra.isEmpty()){
            System.out.println("\nESTE ES SU PEDIDO:\n");
            double totalPedido=0;
            double totalLinea=0;
            for (LineaPedido l:cestaCompra){
                totalLinea=l.getUnidades()*articulos.get(l.getIdArticulo()).getPvp();
                totalPedido+=totalLinea;
                System.out.println( l.getIdArticulo()+"-"+ 
                        articulos.get(l.getIdArticulo()).getDescripcion()
                        + " - " + l.getUnidades()
                        + " - (" +  articulos.get(l.getIdArticulo()).getPvp()+ ")"
                        + " - " + totalLinea );
            }
            System.out.println("\t\t\t\tTotal:" + totalPedido);
            System.out.println("\nProcedemos con la compra (SI/NO) "); 
            String respuesta=sc.next();
            if (respuesta.equalsIgnoreCase("SI")){
                pedidos.add(new Pedido(generaIdPedido(idCliente), clientes.get(idCliente),
                LocalDate.now(), cestaCompra));
                for (LineaPedido l:cestaCompra){
                    articulos.get(l.getIdArticulo())
                            .setExistencias(articulos.get(l.getIdArticulo()).getExistencias()-l.getUnidades());
                }
            }
        }
    }
        
//IMPORTANTE REPASAR STREAMS PARA EL EXAMEN DEL JUEVES:  FILTER(REPASAR EN LA BIBLIOTECA), SORTED, FOREACH
    private void listadoPedidos() {
        System.out.println("");
        for (Pedido p : pedidos) {
            System.out.println(p + "- Total: " + totalPedido(p));
        }
        
        System.out.println("\n");
        pedidos.stream().sorted(Comparator.comparing(p->totalPedido(p)))//El metodo sorted ordena por defecto://Letras: a - z;  Numeros: menor a mayor
                .forEach(p->System.out.println(p + "- Total: " + totalPedido(p))); //el forEach sirve para que te dé el resultado del método que pides ()
    
        System.out.println("\n");
        pedidos.stream().sorted(Comparator.comparing(p->totalPedido((Pedido)p)).reversed())
                .forEach(p->System.out.println(p + "- Total: " + totalPedido(p)));
    
        System.out.println("\n");
        pedidos.stream().filter(p-> totalPedido(p)>1000)                            //filtra los pedidos y te muestra los de más de 1000 euros
                .sorted(Comparator.comparing(Pedido::getFechaPedido))      //ordena los pedidos de más de mil euros por fecha de pedido
                .forEach(p->System.out.println(p + "- Total: " + totalPedido(p)));
    }
    
    
//libros.stream().sorted(Comparator.comparing(Libro::getTitulo)).forEach(l-> System.out.println(l));
//Ejemplo de ordenación en biblioteca, si tenemos definida e inicializada la variable. En el caso de la tienda: "p"; en el metodo al que se llama para la ordenacion (totalPedido)
    
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
       pedidos.add(new Pedido("63921307Y-001/2024",clientes.get("63921307Y"),hoy.minusDays(4), new ArrayList<>
        (List.of(new LineaPedido("2-11",5),new LineaPedido("2-33",3),new LineaPedido("4-33",2)))));
    }
    // </editor-fold>
    
    


    //<editor-fold defaultstate="collapsed" desc="EJERCICIOS DE FILTRADO">
    private void articulosCeroExistencias(){
        articulos.values().stream()
                .filter(a->a.getExistencias()<1);
                
    }
    private void ejerciciosDeFiltrado(){
        
        System.out.println("Articulos de menos de 100 euros, ordenados por precio");
        articulos.values().stream()
                .filter(a->a.getPvp()<100)
                .sorted(Comparator.comparing(Articulo::getPvp))
                .forEach(a->System.out.println(a));
        
        System.out.println("Filtrar artículos con stock superior a un valor dado");
        int n = sc.nextInt();
        articulos.values().stream()
                .filter(a-> a.getExistencias() > n) //para un valor inferior, habría que usar:".filter(a-> a.getExistencias() < n)"
                .forEach(a-> System.out.println(a));
        
        
        System.out.println("Filtrar artículos cuyo PVP esté entre dos valores");
        int q = sc.nextInt();
        int w = sc.nextInt();
        articulos.values().stream()
                .filter(a-> a.getPvp() < q && a.getPvp() > w)
                .forEach(a-> System.out.println(a));


        System.out.println("Filtrar artículos cuyo ID empiece por un número concreto"); //te salen por pantalla los articulos cuyo id empieze por 4-
        int tipoProducto = sc.nextInt();
        String prefijo = tipoProducto + "4-";
        articulos.values().stream()
                .filter(a-> a.getIdArticulo().startsWith(prefijo))
                .forEach(a-> System.out.println(a));
        

        System.out.println("");
        ArrayList<Articulo> articulosAux = new ArrayList(articulos.values());
        String idArticulo;
        System.out.println("Articulos por ID");
        System.out.print("\nTecle el primer digito del ID del artículo:");
        idArticulo = sc.next();
        articulosAux.stream()
                .filter(a -> String.valueOf(a.getIdArticulo()).startsWith(idArticulo))
                .sorted(Comparator.comparing(Articulo::getIdArticulo))
                .forEach(System.out::println);
 
    }
    
//</editor-fold>
    
    
    
    //<editor-fold defaultstate="collapsed" desc="SOLUCION EXAMEN 5/2/2026">
    
    private void uno(){
        String[] secciones={"","PERIFERICOS","ALMACENAMIENTO","IMPRESORAS","MONITORES"};
        System.out.println("SECCION A LISTAR:");
        String sec=sc.next();
        System.out.println("ARTICULOS DE LA SECCION " + secciones[Integer.parseInt(sec)] +":");
        
        //CON Bucle FOR-EACH 
        for(Articulo a:articulos.values()){
            if (a.getIdArticulo().startsWith(sec)){
                System.out.println(a);
            }
        }
        System.out.println("");
        
        //CON STREAMS
        articulos.values().stream()
                .filter(a->a.getIdArticulo().startsWith(sec))
                .forEach(a->System.out.println(a));
        
    }
    
    //LISTADO DE TODOS LOS ARTICULOS CLASIFICADOS POR SECCIONES
    private void dos() {
        String[] secciones={"","PERIFERICOS","ALMACENAMIENTO","IMPRESORAS","MONITORES"};
        for (int i=1; i<=4;i++){
            System.out.println(secciones[i]);
            String prefijo = Integer.toString(i);
            
            
            articulos.values().stream().filter(a -> a.getIdArticulo().startsWith(prefijo)).forEach(System.out::println);
        }
    }
    
    
    //Dado un cliente mostrar sus pedidos junto con el importe de cada uno
    //y también el total gastado por el usuario en la tienda
    //validar si el dni introducido es correcto y si es cliente de la tienda
    private void tres(){
        String dni;
        do{
            System.out.println("DNI CLIENTE:");
            dni=sc.nextLine().toUpperCase();
        }while (!MetodosAux.validarDNI(dni));
        if (clientes.containsKey(dni)){
            float total=0;
            System.out.println("PEDIDOS DEL CLIENTE " + clientes.get(dni).getNombre() +":");
            for (Pedido p:pedidos){
                if (p.getClientePedido().getIdCliente().equals(dni)){
                    System.out.println(p + "\tTOTAL: " + totalPedidoExam(p));
                    total += totalPedidoExam(p);
                }
            }
            System.out.println("\nTOTAL GASTADO: " + total);
        }else{
            System.out.println("ESE CLIENTE NO EXISTE");
        }
    }
    
    private double totalPedidoExam (Pedido p){
        double totalPedido=0;
        for (LineaPedido l: p.getCestaCompra()){
            totalPedido+= l.getUnidades()* articulos.get(l.getIdArticulo()).getPvp();
        }
        return totalPedido;
    }
    
    //LISTADO DE LOS ARTICULOS ORDENADOS DE MAYOR A MENOR POR UNIDADES VENDIDAS. SE APOYA EN EL METODO unidadesVendidas()
    private void cuatro() {
        System.out.println("LISTADO ARTICULOS - UNIDADES VENDIDAS:\n"); 
        articulos.values().stream()
            .sorted(Comparator.comparing(a -> unidadesVendidas((Articulo) a)).reversed())
            .forEach(a -> System.out.println("\t" + a.getDescripcion() + "\tVENDIDAS: " + unidadesVendidas(a))); 
    }

   
    private int unidadesVendidas (Articulo a){
        int c=0;
        for (Pedido p:pedidos){
            for (LineaPedido l:p.getCestaCompra()){
                if (l.getIdArticulo().equals(a.getIdArticulo())){
                    c+=l.getUnidades();
                }
            }
        }
        return c;
    }

    //Crear un ArrayList ClientesSIN con los clientes que no han hecho ningún pedido e imprimirlo
    private void cinco() {
        ArrayList<Cliente> clientesSIN=new ArrayList();
       
        for (Cliente c:clientes.values()){
            int cont=0;
            for (Pedido p:pedidos){
                if (p.getClientePedido().equals(c)){
                    cont++;
                    break;
                }
            }
            if (cont==0){
                clientesSIN.add(c);
            }
        }
        System.out.println("LISTADO CLIENTES SIN PEDIDOS:\n");
        for (Cliente c:clientesSIN){
            System.out.println(c);
        }
    }
    
    //</editor-fold>
    
    
    
    //<editor-fold defaultstate="collapsed" desc="EXAMEN 3/2/2026">
    
/*    ArrayList<Articulo> articulosAux = new ArrayList(articulos.values());
    
    
    private void uno() {
        System.out.println("");
        String idArticulo;
        idArticulo = sc.next();
        articulosAux.stream()
                .filter(a -> String.valueOf(a.getIdArticulo()).startsWith(idArticulo))
                .sorted(Comparator.comparing(Articulo::getIdArticulo))
                .forEach(a-> System.out.println(a));
    }    
    

    private void dos() {
        int perifericos = 1;        
        String familia1 = perifericos + "1-";
        int almacenamiento = 2;
        String familia2 = almacenamiento + "2";
        int impresoras = 3;
        String familia3 = impresoras + "3-";
        int monitores = 4;
        String familia4 = monitores + "4-";

                
        System.out.println("PERIFERICOS");
        articulosAux.stream()
                .filter(b-> b.getIdArticulo().startsWith(familia1, perifericos))
                .forEach(b->System.out.println(b));
        
        System.out.println("ALMACENAMIENTO");
        articulosAux.stream()
                .filter(c-> c.getIdArticulo().startsWith(familia2, almacenamiento))
                .forEach(c->System.out.println(c)); 
        
        System.out.println("IMPRESORAS");
        articulosAux.stream()
                .filter(d-> d.getIdArticulo().startsWith(familia3, impresoras))
                .forEach(d->System.out.println(d)); 
        
        System.out.println("MONITORES");
        articulosAux.stream()
                .filter(e-> e.getIdArticulo().startsWith(familia4, monitores))
                .forEach(e->System.out.println(e));    }


    public void tres() { //Pedidos de un cliente y total gastado
        
        int totalGastado = 0;
        
        for (Pedido p : pedidos) {
            if (p.getClientePedido().getIdCliente().equalsIgnoreCase(idCliente)){
                System.out.println("PEDIDOS DEL  CLIENTE " + p.getIdPedido());
            }
        }

        System.out.println("\t\t\t\tTOTAL:" + totalPedido);

    }        

    


    private static void cuatro() {//Listado de todos los articulos oredenados de mas a menos unidades vendidas
        
    }

 
    ArrayList<Cliente> clientesAux = new ArrayList(clientes.values());
    private static void cinco() { //= Listado de clientes sin pedidos
        for (Object object : col) {
            
        }
    }*/



//</editor-fold>

}
