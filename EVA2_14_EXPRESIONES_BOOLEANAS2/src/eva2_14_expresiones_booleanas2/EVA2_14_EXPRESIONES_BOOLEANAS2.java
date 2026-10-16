
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BECA
        //PROMEDIO >= 95
        //ESTA EN EQUIPO REPRESENTATIVO
        Scanner captu = new Scanner(System.in);
        int prom;
        boolean repre = true;
        System.out.println("¿Cuál es tu promedio?");
        prom = captu.nextInt();
        System.out.println("¿perteneces a un equipo representativo?");
        repre = captu.nextBoolean();
        if( (prom>=95) || (repre = true)){
            System.out.println("Tienes beca");
        }else{ 
            System.out.println("No tienes beca");
        }
    }
}
