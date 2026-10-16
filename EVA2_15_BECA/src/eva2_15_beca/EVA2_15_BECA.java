/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               Scanner captu = new Scanner(System.in);
        int promedio, ingresos;
        System.out.println("¿Cuál es tu promedio?");
        promedio = captu.nextInt();
        
        System.out.println("¿cuales son tus ingresos mensuales?");
        ingresos = captu.nextInt();
        if( (promedio>=80) && (ingresos < 10000) ){
            System.out.println("Tienes beca");
        }else{ 
            System.out.println("No tienes beca");
        }
    }
    }

    
