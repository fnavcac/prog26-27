
package ejercicio34;

import java.util.Scanner;

/**
 * Ejercicio 34
 * 
 * @author fran
 */

public class Ejercicio34 {
    
    public static void main(String[] args) {
        
        // Variables
        String frase;
        
        char caracter;
        
        boolean aparece = false;
        
        int posicionInicial=-1, posicionFinal=-1, contador=0;
        
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la frase:");
        
        frase = entrada.nextLine();
        
        System.out.println("Introduce el caracter buscado:");
        
        caracter = entrada.nextLine().charAt(0); // Nos devuelve el caracater
        
        
        // Operaciones varias
        for (int i=0; i<frase.length(); i++) {
            
            if(frase.charAt(i) == caracter && posicionInicial == -1) {
                
                aparece = true;
                
                posicionInicial = i;
                
            }
            if (frase.charAt(i) == caracter) {
                
                contador++;
                
                posicionFinal = i;
                
                // Me muestra todas las posiciones del caracter buscado
                System.out.println("Posicion: " + i);
            
            }
            
        }
        
        System.out.println("\nAparece: " + aparece);
        
        System.out.println("Numero de apariciones: " + contador);
        
        System.out.println("Primera posicion: " + posicionInicial);
        
        System.out.println("Ultima posicion: " + posicionFinal);
        
    }
    
}
