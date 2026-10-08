package Ejercicio25;

import java.util.Scanner;

/**
 * Ejercicio 25
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio25 {
    
    public static void main(String[] args) {
        
        // Constantes
        
        final double PRECIO_MANZANAS = 2.35; // Precio por kilo de manzanas
                
        final double PRECIO_PERAS = 1.95; // Precio por kilo de peras
        
        // Variables
        
        double kilosManzanas; // Kilos de manzanas por semestre
        
        double kilosPeras; // Kilos de manzanas por semestre
        
        // Pedimos los valores al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número de kilos de manzanas comprados por semestre: ");
        
        kilosManzanas = entrada.nextDouble(); // Hay que escribir con , el numero decimal
        
        System.out.println("Introduce el número de kilos de peras comprados por semestre: ");
        
        kilosPeras = entrada.nextDouble(); // Hay que escribir con , el numero decimal
        
        // Cálculos
        
        kilosManzanas *= PRECIO_MANZANAS;
        
        kilosPeras *=  PRECIO_PERAS;
        
        // Mostrar los resultados por pantallas
        
        System.out.println("Precio manzanas totales: " + kilosManzanas);
        
        System.out.println("Precio peras totales: " + kilosPeras);
        
        
    }
    
}
