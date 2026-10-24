
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int numIntroducido;
        
        int contador;
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número hasta el que se quiere que se cuente:");
        
        numIntroducido = entrada.nextInt();
        
        contador = 1;
        
        
        // Convertir en positivo si introduce un entero negativo
        
        if (numIntroducido < 0) numIntroducido = numIntroducido * -1;
        
        
        // Mostrar los datos al usuario
        
        System.out.println("\nInicia la cuenta:");
            
        do {
            
            System.out.println(contador);
            
            contador++;
            
        } while (contador != (numIntroducido + 1));
        
    }
}
