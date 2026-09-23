/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_4_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bono = 0, salario, salarioF;
        String nombre ;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el nombre de empleado");
        nombre = captu.nextLine();
        System.out.println("Introduce el salario mensual");
        salario = captu.nextDouble();
    if (salario <= 12000) { 
        bono = salario * 0.10;
        salarioF = salario + bono;
        System.out.println("Nombre = " + nombre);
        System.out.println("Salario mensual = $" + salario);
        System.out.println("Bono = $" + bono);
        System.out.println("Salario final = $" + salarioF);
    
        } else{
        bono = salario * 0.05;
        salarioF = salario + bono;
        System.out.println("Nombre = " + nombre);
        System.out.println("Salario mensual = $" + salario);
        System.out.println("Bono = $" + bono);
        System.out.println("Salario final = $" + salarioF);
   
    }
     
    }
    
}
