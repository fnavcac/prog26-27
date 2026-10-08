package Ejercicio27;

import java.util.Scanner;

/**
 * Ejercicio 27
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio27 {
    
    public static void main(String[] args) {
        
        // Constante
        
        final double precioEntradaNormal = 8; // El precio base de la entrada
        
        // Variables
        String nombre;
        int edad;
        
        double precio, precioExtendido;
        
        // Pedir los valores por teclado
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Introduce tu edad: ");
        edad = entrada.nextInt();
        
        // Evaluar los datos
        precio = (edad < 12) ? 5 : precioEntradaNormal; // Si es menor a 12 le cuesta 5 euros
        
        System.out.println("El precio para " + nombre + ", " + edad + " años, seria: " + precio);
        
        
        // Ampliacion
        precioExtendido = (edad >= 65) ? 6 : precio; // Si es mayor de 64 le cuesta 6 en lugar de 8
        
        System.out.println("El precio extendido para " + nombre + ", " + edad + " años, seria: " + precioExtendido);
        
    }
    
}
