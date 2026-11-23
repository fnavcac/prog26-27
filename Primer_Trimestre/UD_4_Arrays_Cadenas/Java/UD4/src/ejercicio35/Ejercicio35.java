
package ejercicio35;

import java.util.Scanner;

/**
 * Ejercicio 35
 * 
 * @author fran
 */

public class Ejercicio35 {
    
    public static void main(String[] args) {
        
        // Variable
        String palabra, palabraInvertida = "";
        
        boolean palindromo = false;
        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la palabra para ver si es palindromo:");
        
        palabra = entrada.next();
        
        
        // Comprobar si es palindromo
        for (int i = palabra.length()-1; i>=0; i--) {
            
            // Para normalizar palabra .toLowerCase()
            palabraInvertida += palabra.toLowerCase().charAt(i);
            
        }
        
        /*// Otra forma de hacerlo
        for (int i = 0; i < palabra.length(); i++) {
            
            palabraInvertida += palabra.toLowerCase().charAt(palabra.length()-1 - i);
            
        }
        */
        
        if (palabra.toLowerCase().equals(palabraInvertida)) palindromo = true;
        
        System.out.println(palabra + " es palindromo? " + palindromo);
                
    }
    
}
