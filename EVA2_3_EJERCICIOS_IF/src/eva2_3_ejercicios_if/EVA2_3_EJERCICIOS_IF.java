/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author alberto soto
 */
public class EVA2_3_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, subtotal, total, descuento;
        int cantidad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        precio = captu.nextDouble();
        System.out.println("Introduce la cantidad");
        cantidad = captu.nextInt();
        subtotal = precio * cantidad ;
    if (subtotal >= 1000) { 
        descuento = subtotal * 0.10;
        total = subtotal - descuento;
        System.out.println("Subtotal = $" + subtotal);
        System.out.println("Descuento = $" + descuento);
        System.out.println("Total = $"  + total);
    
        } else{ 
        descuento = 0;
        total = subtotal - descuento;
        System.out.println("Subtotal = $" + subtotal);
        System.out.println("Descuento = $" + descuento );
        System.out.println("Total = $" + total);
    }
     

    }
    
}
