
package ejercicio29;

import java.util.Scanner;

/**
 * Ejercicio 29
 * 
 * @author fran
 */

public class Ejercicio29 {
    
    public static void main(String[] args) {
        
        // Variable
        String nombreCompleto;
        
        String nombreSinEspacios, nombreMayuscula, nombreMinuscula, nombreGuiones;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entrada: ");
        
        nombreCompleto = entrada.nextLine();
        
        // Salida
        nombreSinEspacios = nombreCompleto.strip(); //.trim()
        
        nombreMayuscula = nombreSinEspacios.toUpperCase();
        
        nombreMinuscula = nombreMayuscula.toLowerCase();
        
        nombreGuiones = nombreSinEspacios.replace(" ", "-");
        
        
        System.out.println("\nResultado:");
        
        System.out.println(nombreMayuscula);
        
        System.out.println(nombreMinuscula);
        
        System.out.println(nombreGuiones);
        
    }
    
}
