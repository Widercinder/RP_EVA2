/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PREGUNTAR CALIFICACION
        //EVALUAR
        //MOSTRAR SI ACREDITA O NO ACREDITA
        double cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion");    
        cali = captu.nextDouble();
        
        if(cali >= 70) {
        System.out.println("ACREDDITASTE");
        }
        else{
        System.out.println("NO ACREDITASTE");
        }
    }
    
}
