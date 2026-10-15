
package Ejercicio6;

import java.util.Scanner;

/**
 * Ejercicio 6
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int num;
        
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número entero por teclado:");
        
        num = entrada.nextInt();
        
        
        // Estructura de control
        
        if ( (num % 2) == 0) {
            
            System.out.println("El número " + num + " introducido es par");
            
        } else {
            
            System.out.println("El número " + num + " introducido es impar");
            
        }
        
        System.out.println("Fin del programa");
        
    }
    
}
