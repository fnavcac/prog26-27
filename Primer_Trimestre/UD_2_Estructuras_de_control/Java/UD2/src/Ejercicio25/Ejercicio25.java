
package Ejercicio25;

import java.util.Scanner;

/**
 * Ejercicio 25
 * 
 * Calcular el factorial de un número introducido por el usuario
 * 
 * @author 03_1DAW
 */

public class Ejercicio25 {
    
    public static void main(String[] args) {
        
        // Variables, declaración e incialización
        
        int factorial = 1; // El factorial es la multiplicación de los números
        
        int numIntroducido;
        
        // Pedir el dato al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número para calcular el factorial:");
        
        numIntroducido = entrada.nextInt();
        
        
        // Cálculo
        
        for(int i=numIntroducido; i>1; i--) {
            
            factorial *= i;
            
        }
        
        System.out.println("El factorial de " + numIntroducido + "! es " + factorial);
        
    }
    
}
