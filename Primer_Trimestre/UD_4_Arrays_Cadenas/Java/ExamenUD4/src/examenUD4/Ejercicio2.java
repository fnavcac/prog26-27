
package examenUD4;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Variables
        String frase, fraseNueva, palabraBuscar, palabraInicio;
        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la frase:");
        
        frase = entrada.nextLine();
        
        // Normalizo la frase
        frase = frase.toLowerCase();
        
        // Operaciones varias
        System.out.println("\nLongitud de la frase: " + frase.length());
        
        System.out.println("Primer caracter: " + frase.charAt(0));
        
        System.out.println("Segundo caracter: " + frase.charAt(frase.length()-1));
        
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
        
        
        System.out.println("\nIntroduce una palabra para buscar en la frase:");
        
        palabraBuscar = entrada.nextLine();
        
        // Normalizo la palabra buscada
        palabraBuscar = palabraBuscar.toLowerCase();
        
        System.out.println("La frase contiene esa palabra? " + frase.contains(palabraBuscar));
        
        
        System.out.println("\nIntroduce otra palabra para comprobar si frase comienza por ella:");
        
        palabraInicio = entrada.nextLine();
        
        // Normalizo la palabra del inicio
        palabraInicio = palabraInicio.toLowerCase();
        
        System.out.println("La frase comienza por esa palabra? " + frase.startsWith(palabraInicio));
        
        
        System.out.println("\nInntroduce otra frase para ver si coincide:");
        
        fraseNueva =  entrada.nextLine();
        
        // No normalizo porque uso equalsIgnoreCase() para no tener en cuenta las mayusculas y minusculas
        System.out.println("Coinciden ambas frases? " + frase.equalsIgnoreCase(fraseNueva));
        
    }
    
}
