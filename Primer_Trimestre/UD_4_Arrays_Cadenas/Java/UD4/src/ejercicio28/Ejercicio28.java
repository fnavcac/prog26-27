
package ejercicio28;

import java.util.Scanner;

/**
 * Ejercicio 28
 *
 * @author 03_1DAW
 */

public class Ejercicio28 {

    public static void main(String[] args) {

        // Variable
        String frase;

        int posicionInicial, posicionFinal;
        
        String fraseSubcadena = "No es una subcadena valida";
        
        String palabra;

        // Pedir la informacion al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introudce la frase buscada: ");

        frase = entrada.nextLine();

        System.out.println("Introduce la posicion inicial:");
        
        posicionInicial = entrada.nextInt();
        
        System.out.println("Introduce la posicion final:");
        
        posicionFinal = entrada.nextInt();
        
        
        if (posicionInicial >= 0 && frase.length() > posicionFinal && posicionInicial <= posicionFinal) {
            
            fraseSubcadena = frase.substring(posicionInicial, posicionFinal);
            
        }
        
        
        System.out.println("\nFrase inicial:\n" + frase);
        
        System.out.println("Subcadena:\n" + fraseSubcadena);
        
        
        palabra = primeraPalabra(frase);
        
        System.out.println("\nLa primera palabra de la frase es:\n" + palabra);

    }
    
    public static String primeraPalabra(String frase) {
        
        int indiceEspacio = frase.indexOf(" ");
        
        String palabra = frase.substring(0, indiceEspacio);
        
        return palabra;
        
    }

}
