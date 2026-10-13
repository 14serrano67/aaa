/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ayudantia10;

public class Trabajador {

    private String nombre;
    private String rut;
    private int antiguedad;

    public Trabajador(String nombre, String rut, int antiguedad) {
        this.nombre = nombre;
        this.rut = rut;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre
                + " | Rut: " + rut
                + " | Antiguedad: " + antiguedad);
    }


    public static void agregarTrabajador(Trabajador[] trabajadores, Trabajador nuevo) {

        int cantidad = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                cantidad++;
            }
        }

        if (cantidad == trabajadores.length) {
            System.out.println("El arreglo esta lleno");
            return;
        }

        int posicion = 0;

        while (posicion < cantidad &&
                trabajadores[posicion].getAntiguedad() <= nuevo.getAntiguedad()) {
            posicion++;
        }

        for (int i = cantidad; i > posicion; i--) {
            trabajadores[i] = trabajadores[i - 1];
        }

        trabajadores[posicion] = nuevo;

        System.out.println("Trabajador agregado correctamente");
    }


    public static void mostrarTrabajadoresPorAntiguedad(
            Trabajador[] trabajadores, int minima, int maxima) {

        boolean encontrado = false;

        for (int i = 0; i < trabajadores.length; i++) {

            if (trabajadores[i] != null) {

                if (trabajadores[i].getAntiguedad() >= minima &&
                        trabajadores[i].getAntiguedad() <= maxima) {

                    trabajadores[i].mostrarInformacion();
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No hay trabajadores en ese rango");
        }
    }
}
