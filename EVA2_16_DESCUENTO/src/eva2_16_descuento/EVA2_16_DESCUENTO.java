/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Descuento en autobus
        int edad;
        boolean estudiante = false, credencial = false;
     
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        edad = captu.nextInt();
        captu.nextLine();
        
        if(edad < 18) { //comprobar menores
            System.out.println("Te otorgaremos descuento"); 
        }
        else if (edad < 60){
        System.out.println("¿Eres estudiante?(true/false)");
        estudiante = captu.nextBoolean();
            if (estudiante){ 
            System.out.println("¿Tienes tu credencial vigente (true/false)?");
            credencial = captu.nextBoolean();   
        }   if(credencial) {
            System.out.println("Te otorgaremos descuento");}
            else {
            System.out.println("No te otorgaremos descuento");
        }
        }
        else { // todos los mayores a 60
        System.out.println("¿Tienes tu credencial del INSEN vigente? (true/false)");
        credencial = captu.nextBoolean();

             if (credencial) {
            System.out.println("Te otorgaremos descuento");
            }
            else {
            System.out.println("No te otorgaremos descuento");
        }
    }
        
    }
}
     
       
        
        
        
        
        
    
    

