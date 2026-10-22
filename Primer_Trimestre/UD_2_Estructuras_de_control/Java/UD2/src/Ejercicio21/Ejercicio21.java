
package Ejercicio21;

import java.util.Scanner;

/**
 * Ejercicio 21
 * 
 * Imprimir la tabla de multiplicar de un número.
 * 
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int numIntroducido;
        
        // Pedir dato al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número del que se quiera mostrar la tabla de multiplicación:");
        
        numIntroducido = entrada.nextInt();
        
        
        // Mostar la tabla al usuario
        
        System.out.println("Tabla de multiplicación de: " + numIntroducido);
            
        System.out.println("==================================");
        
        for(int i=0; i<=10; i++) {
            
            System.out.println(numIntroducido + " x " + i + " = " + (numIntroducido * i));
            
        }
        
    }
    
}
