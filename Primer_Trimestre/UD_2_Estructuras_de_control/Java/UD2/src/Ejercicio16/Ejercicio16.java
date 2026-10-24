
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int numIntroducido;
        
        // Pedir el dato al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el numero hasta el que se quiera contar:");
        
        numIntroducido = entrada.nextInt();
        
        
        // Mostrar los datos al usuario
        
        System.out.println("\nInicia la cuenta:");
        
        for (int i=1; i<=numIntroducido; i++) {
            
            System.out.println(i);
            
        }
        
    }
    
}
