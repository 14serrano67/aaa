/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayudantia10;

/**
 *
 * @author 22452747-0
 */
public class AYUDANTIA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Trabajador [] trabajadores ={
        new Trabajador ( " Ana " , " 111 -1 " , 5) ,
        new Trabajador ( " Pedro " , " 222 -2 " , 2) ,
        new Trabajador ( " Camila " , " 333 -3 " , 8) ,
        new Trabajador ( " Diego " , " 444 -4 " , 1) ,
        new Trabajador ( " Sofia " , " 555 -5 " , 4) ,
        null , null , null , null , null
        };
        
        System.out.println("ARREGLO EN SU ORDEN INICIAL");
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i]!=null){
                trabajadores[i].mostrarInformacion();
            }
            
        }
        
        int pLibre=0;
        
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i]!=null){
                if(i!= pLibre){
                    trabajadores[pLibre]= trabajadores[i];
                    trabajadores[i]= null;
                }
                pLibre++;
            }
        }
        
        int cantidadInicial=0;
        for (int i = 0; i < trabajadores.length ;i++) {
            if(trabajadores[i]!=null){
                cantidadInicial++;
            }
        }
        
        for(int i =0; i< cantidadInicial - 1;i++){
            for (int j = 0; j < cantidadInicial-1-i; j++) {
                if(trabajadores[j].getAntiguedad()>trabajadores[j+1].getAntiguedad()){
                    Trabajador temp= trabajadores[j];
                    trabajadores[j]= trabajadores[j+1];
                    trabajadores[j+1]=temp;
                }
            }
        }
        System.out.println("ARREGLO ORDEN FINAL");
        for (int i = 0; i < trabajadores.length; i++) {
            if(trabajadores[i])
            
        }
    }
    
}
