/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //PEDIR 2 VALORES
        //PEDIR LA OPERACION: USAR SWITCH
        //1 SUMA
        //2 RESTA
        //3 MULTIPLICACION
        //4 DIVISION
        //DEFAULT OPERACION INVALIDA
        // REGRESAR EL RESULTADO
        //mostrar el resultado
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el primer valor");
        double valor1 = captu.nextDouble();
        System.out.println("Introduce el segundo valor");
        double valor2 = captu.nextDouble();
        
        System.out.println("Que tipo de operacion quieres hacer? (1=SUMA , 2 RESTA , 3 MULTIPLICACION , 4 DIVISION)");
        int operacion = captu.nextInt();
        
        switch(operacion) {
            case 1:
            System.out.println("Suma = " + (valor1 + valor2));
            break;
            case 2:
            System.out.println("resta = "+(valor1 - valor2));
            break;
            case 3:
            System.out.println("Multiplicacion = " +(valor1 * valor2));
            break;
            case 4:
            System.out.println("Division = " + (valor1 / valor2));
            break;
            default:
            System.out.println("Valor invalido");
            
           
        }
        
        
        
        
    }
    
}
