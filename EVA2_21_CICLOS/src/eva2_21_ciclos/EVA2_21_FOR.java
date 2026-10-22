/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_ciclos;

/**
 *
 * @author alberto soto
 */
public class EVA2_21_FOR {

    /**
     * @param args the command line arguments
     */
        // Repeticion de instrucciones
        // FOR --> CUANDO SABEMOS EL · DE REPETICIONES
        // WHILE--> PUEDEN SER 0 O N REPETICIONES
        // DO WHILE --> PUEDEN SER 1 O N REPETICIONES
    public static void main(String[] args) {
        // TODO code application logic here
        // IMPRIMIR UN LISTADO DE 1 AL 10
        // 3 PARA METROS 
        // PUNTO DE PARTIDA 
        // CONDICION PARA DETENERSE
        // AVANCE ---> de uno en uno
        for(int i = 1; i<=10; i++) {
            //instruccion a repetir
        System.out.print(i + " - ");
        }
        
        System.out.println();
        
        for(int i =20; i<=38; i+=2) {
            //instruccion a repetir
        System.out.print(i + " - ");
                }
        
          System.out.println();
        
       
        for(int i = 10; i>=1; i--) {
            //instruccion a repetir
        System.out.print(i + " - ");
        }
               System.out.println();
        for(int i = 2; i<=20; i+=2) {
            //instruccion a repetir
        System.out.print(i + " - ");
        }
        
        
        
    }
    
}