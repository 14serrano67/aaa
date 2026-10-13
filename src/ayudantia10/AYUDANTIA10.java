/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ayudantia10;

import java.util.*;

public class AYUDANTIA10 {

    public static void main(String[] args) {

        Trabajador[] trabajadores = {
            new Trabajador("Ana", "111-1", 5),
            new Trabajador("Pedro", "222-2", 2),
            new Trabajador("Camila", "333-3", 8),
            new Trabajador("Diego", "444-4", 1),
            new Trabajador("Sofia", "555-5", 4),
            null, null, null, null, null
        };

        // EJERCICIO 1: MOSTRAR ARREGLO INICIAL

        System.out.println("ARREGLO EN SU ORDEN INICIAL");

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                trabajadores[i].mostrarInformacion();
            }
        }

        // COMPACTAR TRABAJADORES

        int pLibre = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                if (i != pLibre) {
                    trabajadores[pLibre] = trabajadores[i];
                    trabajadores[i] = null;
                }
                pLibre++;
            }
        }

        // CONTAR TRABAJADORES

        int cantidadInicial = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                cantidadInicial++;
            }
        }

        // ORDENAR POR ANTIGUEDAD

        for (int i = 0; i < cantidadInicial - 1; i++) {
            for (int j = 0; j < cantidadInicial - 1 - i; j++) {

                if (trabajadores[j].getAntiguedad()
                        > trabajadores[j + 1].getAntiguedad()) {

                    Trabajador temp = trabajadores[j];
                    trabajadores[j] = trabajadores[j + 1];
                    trabajadores[j + 1] = temp;
                }
            }
        }

        System.out.println("ARREGLO ORDEN FINAL");

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                trabajadores[i].mostrarInformacion();
            }
        }

        // EJERCICIO 2: MENU

        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Mostrar trabajadores");
            System.out.println("3. Consultar por antiguedad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese nombre:");
                    String nombre = lector.nextLine();

                    System.out.println("Ingrese rut:");
                    String rut = lector.nextLine();

                    System.out.println("Ingrese antiguedad:");
                    int antiguedad = lector.nextInt();

                    Trabajador nuevo = new Trabajador(
                            nombre, rut, antiguedad);

                    Trabajador.agregarTrabajador(trabajadores, nuevo);
                    break;

                case 2:
                    System.out.println("LISTA DE TRABAJADORES");

                    for (int i = 0; i < trabajadores.length; i++) {
                        if (trabajadores[i] != null) {
                            trabajadores[i].mostrarInformacion();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ingrese antiguedad minima:");
                    int minima = lector.nextInt();

                    System.out.println("Ingrese antiguedad maxima:");
                    int maxima = lector.nextInt();

                    if (minima <= maxima) {
                        Trabajador.mostrarTrabajadoresPorAntiguedad(
                                trabajadores, minima, maxima);
                    } else {
                        System.out.println("Rango no valido");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4);
    }
}

    

