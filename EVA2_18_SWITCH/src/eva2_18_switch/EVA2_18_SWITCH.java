/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
       System.out.println("introduce el numero del dia (1-7 :)");
       int dia = captu.nextInt();
       
       switch(dia) {
           case 1:
               System.out.println("Domingo");
               //aqui ponemos cuantas instrucciones necesitemos
               break;//termina el caso
            case 2:
               System.out.println("Lunes");
            case 3:
               System.out.println("Martes");
            case 4:
               System.out.println("Miercoles ");
            case 5:
               System.out.println("Jueves");
            case 6:
               System.out.println("Viernes");
            case 7:
               System.out.println("Sabado");
            break;
            default:
                System.out.println("Dia no valido");
               
               
       }
       
        
        
       }
}
