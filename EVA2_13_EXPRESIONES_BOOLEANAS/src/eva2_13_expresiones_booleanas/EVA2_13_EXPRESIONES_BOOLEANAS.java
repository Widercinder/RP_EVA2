/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author alberto soto
 */
  //and = Y = && (para que sea verdadero ambos deben ser verdaderos)
  //or = O =|| (para que sea verdadero uno debe ser verdadero)
  //not= negacion = ! ( es el opuesto de la )
       
public class EVA2_13_EXPRESIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean entrarAntro, tieneCredencial = false;
        int edad = 18;
        entrarAntro = edad >= 18 && (tieneCredencial == true);
        System.out.println("permiso para entrar" + entrarAntro);
     
        boolean estaSoleado = false , tienesDinero = false;
        boolean permitirSalir;
        permitirSalir = (estaSoleado == true) || (tienesDinero == true );
        System.out.println("Puedes salir");
    }
    
}
