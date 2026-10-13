/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ayudantia10;

/**
 *
 * @author 22452747-0
 */
public class Trabajador {
    private String nombre;
    private String rut;
    private int antiguedad;
    
    
    
    
    public Trabajador(String nombre, String rut, int antiguedad){
        this.nombre= nombre;
        this.rut=rut;
        this.antiguedad=antiguedad;
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
    
    
    public String mostrarInformacion(){
        return "Nombre: "+nombre+ " |Rut: "+rut+ " |Antiguedad: "+ antiguedad;
    }
}
