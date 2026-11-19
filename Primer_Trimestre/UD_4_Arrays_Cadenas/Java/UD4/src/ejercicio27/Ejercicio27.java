
package ejercicio27;

import java.util.Scanner;

/**
 * Ejercicio 27
 * 
 * @author 03_1DAW
 */

public class Ejercicio27 {
    
    public static void main(String[] args) {
        
        // Varible
        String frase, palabra;
        
        boolean contiene=false, empiezaPalabra=false, teminaPalabra=false;
        
        int posicion;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la frase:");
        
        frase = entrada.nextLine();
        
        System.out.println("Introduce la palabra buscada:");
        
        palabra = entrada.nextLine();
        
        contiene = frase.contains(palabra); //.toLoweCase() para normalizar en frase y palabra
        
        posicion = frase.indexOf(palabra);
        
        //empiezaPalabra = frase.indexOf(palabra) == 0;
        empiezaPalabra = frase.startsWith(palabra);
                
        //teminaPalabra = frase.indexOf(palabra) == (frase.length() - (palabra.length()-1));
        teminaPalabra = frase.endsWith(palabra);
        
        System.out.println("\nFrase: " + frase);
        
        System.out.println("Palabra: " + palabra);
        
        System.out.println("\n¿Contiene la palabra? " + contiene);
        
        System.out.println("Posicion: " + posicion);
        
        System.out.println("¿Comienza por ella? " + empiezaPalabra);
        
        System.out.println("¿Termina por ella? " + teminaPalabra);
        
    }
    
}
