/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fhu86918.educastur.tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1dawd
 */
public class Tienda2026 {

    private static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        
    }
        
        public static void menu() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 -PRESTAMOS");
            System.out.println("\t\t\t\t2 -LIBROS");
            System.out.println("\t\t\t\t3 -USUARIOS");
            System.out.println("\t\t\t\t4 -LISTADOS");
            System.out.println("\t\t\t\t9 -CERRAR EL PROGRAMA");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    menuPrestamos();
                    break;
                case 2:
                    menuLibros();
                    break;
                case 3:
                    ;
                    menuUsuarios();
                    break;
                case 4:
                    menuListados();
                    break;
            }
        } while (Opcion != 9);
        System.out.println("Saliendo del programa...");
    }
    
    public static void menuPrestamos() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU PRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO");
            System.out.println("\t\t\t\t2 - DEVOLUCION");
            System.out.println("\t\t\t\t3 - PRORROGA");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    nuevoPrestamo();
                    break;
                case 2:
                    devolucionPrestamo();
                    break;
                case 3:
                    prorroga();
                    break;
                case 4:
                    listadoPrestamo();
                    break;
            }
        } while (Opcion != 9);
        menu();
    }

    public static void menuLibros() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU LIBROS\n");
            System.out.println("\t\t\t\t1 -AÑADIR");
            System.out.println("\t\t\t\t2 -LISTADO");
            System.out.println("\t\t\t\t3 -MODIFICAR");
            System.out.println("\t\t\t\t4 -ELIMINAR");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    añadirLibro();
                    break;
                case 2:
                    listadoLibro();
                    break;
                case 3:
                    ;
                    modificarLibro();
                    break;
                case 4:
                    eliminaLibro();
                    break;
            }
        } while (Opcion != 9);

        menu();
    }

    public static void menuUsuarios() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU USUARIO\n");
            System.out.println("\t\t\t\t1 -AÑADIR");
            System.out.println("\t\t\t\t2 -LISTADO");
            System.out.println("\t\t\t\t3 -MODIFICAR");
            System.out.println("\t\t\t\t4 -ELIMINAR");
            System.out.println("\t\t\t\t9 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    añadirUsuario();
                    break;
                case 2:
                    listadoUsuario();
                    break;
                case 3:
                    modificarUsuario();
                    break;
                case 4:
                    eliminaLibro();
                    break;
            }
        } while (Opcion != 9);
        menu();
    }

    public static void menuListados() {
        int Opcion;
        do {
            System.out.println("\n\n\n\n\n--------------------------------------");
            System.out.println("\t\t\t\tMENU LISTADOS\n");
            System.out.println("\t\t\t\t1 -LIBROS");
            System.out.println("\t\t\t\t2 -USUARIOS");
            System.out.println("\t\t\t\t3 -PRESTAMOS");
            System.out.println("\t\t\t\t4 -VOLVER AL MENU PRINCIPAL");

            Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    ();
                    break;
                case 2:
                    ();
                    break;
                case 3:
                    ();
                    break;
                case 4:
                    menu();
                    break;
            }
        } while (Opcion != 9);
        menu();
    }
    
}
