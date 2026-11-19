
package ejercicio24;

import java.util.Scanner;

/**
 * Ejercicio 24
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio24 {
    
    public static void main(String[] args) {
        
        // Variable
        String palabra1, palabra2;
        
        boolean iguales, igualesSinMayuscula, mismaLongitud, mismoCaracterInicial;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la primera palabra: ");
        
        palabra1 = entrada.nextLine();
        
        System.out.println("Introduce la segunda palabra: ");
        
        palabra2 = entrada.nextLine();
        
        
        iguales = palabra1.equals(palabra2);
        
        igualesSinMayuscula = palabra1.equalsIgnoreCase(palabra2);
        
        mismaLongitud = palabra1.length() == palabra2.length();
        
        mismoCaracterInicial = palabra1.charAt(0) == palabra2.charAt(0);
        
        //palabra1.toLowerCase().charAt(0) == palabra2.toLowerCase()charAt(0);
        
        
        System.out.println("¿Son iguales? " + iguales);
        
        System.out.println("¿Son iguales ignorando mayusculas? " + igualesSinMayuscula);
        
        System.out.println("¿Tienen la misma longitud? " + mismaLongitud);
        
        System.out.println("¿Tienen el mismo caracter inicial? " + mismoCaracterInicial);
        
    }
    
}
