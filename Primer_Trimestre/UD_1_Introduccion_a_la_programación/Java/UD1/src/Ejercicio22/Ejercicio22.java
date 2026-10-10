package Ejercicio22;

/**
 * Ejercicio 22
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        // Variables
        int edad;
        
        boolean mayorEdad;
        
        // Pedir datos al usuario
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("Introduce tu edad por favor:");
        edad = entrada.nextInt();
        
        
        // Comprobación
        mayorEdad = edad >= 18;
        
        // Mostrar los resultados por pantalla
        System.out.println("¿Eres mayor de edad?: " + mayorEdad);
        
    }
    
}
