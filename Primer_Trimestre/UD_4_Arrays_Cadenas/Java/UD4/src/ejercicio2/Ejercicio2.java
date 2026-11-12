
package ejercicio2;

import java.util.Scanner;

/**
 * Ejercicio 2
 * 
 * @author 03_1DAW
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] temperaturas = new double[5];
        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<temperaturas.length; i++) {
            
            System.out.println("Introduce el valor de temperatura: ");
            
            temperaturas[i] = entrada.nextDouble();
            
        }
        
        for(int i=0; i<temperaturas.length; i++) {
            
            System.out.println("Temperatura dia " + (i+1) + ": " + temperaturas[i]);
            
        }
        
        System.out.println("Se han almacenado " + temperaturas.length + " temperaturas");
        
        for (int i=0; i<temperaturas.length; i++) {
            
            if(temperaturas[i] != 0.0) System.out.println(temperaturas[i]);
            
        }
        
    }
    
}
