/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_iff;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuál es tu edad?");
        edad = captu.nextInt();
        //PARENTESIS OBLIGATRORIOS, DENTRO DE LA EXPRESIÓN CONDICIONAL (VERDADERO O FALSO)
        if(edad >= 18){ 
            System.out.println("PUEDES ENTRAR");
        }else{
            System.out.println("NO PUEDES ENTRAR"); 
} 
    }
    
}
