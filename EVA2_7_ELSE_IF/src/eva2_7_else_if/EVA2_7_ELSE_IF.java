/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_7_ELSE_IF {

    public static void main(String[] args) {
        //TEMPERATURA
        //35 MUY CALIDO
        //20 AGRADABLE
        //10 FRESCO
        //MUY FRIO
        int temp;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuál es la temperatura?");
        temp = captu.nextInt();
        if (temp >= 35)
        System.out.println("Muy cálido");
       
        else if(temp >= 20)
           System.out.println("Agradable");
        else if(temp >= 10)
           System.out.println("Fresco");
        else 
            System.out.println("Muy frio");
                
    }
        
        
    
}
