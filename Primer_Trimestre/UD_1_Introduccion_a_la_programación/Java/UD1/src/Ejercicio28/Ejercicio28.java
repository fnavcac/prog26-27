package Ejercicio28;

import java.util.Scanner;

// /** .... */ indica un comentario de documentación, lo que se conoce como comentario Javadoc.

/**
 * Ejercicio 28
 * 
 * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre
 * (notas enteras que se solicitarán al usuario).
 * 
 * El programa debe mostrar la nota media el curso como aparece en el boletín
 * de calificaciones (solo la parte entera) y como se usa en el expediente
 * académico (con decimales).
 * 
 * @author @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class Ejercicio28 {
    
    /*
    Esto se utiliza para comentar en varias líneas o como un bloque sin que aparezca
    en la documentación de la clase.

    En este ejercicio vamos a usar la clase Scanner para pedir los datos al usuario y 
    a dividir con / para obtener el resultado, hay que hacer un casting para obtener
    los valores en decimal.
    */
    
    // Esto se usa para un comentario de una línea.
    
    public static void main(String[] args) {
        
        // Variables
        
        int notaPrimer, notaSegundo, notaTercero;
        
        int mediaEntera;
        
        double mediaDecimal;
        
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la nota con valor entero del primer trimestre: ");
        
        notaPrimer = entrada.nextInt();
        
        System.out.println("Introduce la nota con valor entero del segundo trimestre: ");
        
        notaSegundo = entrada.nextInt();
        
        System.out.println("Introduce la nota con valor entero del tercer trimestre: ");
        
        notaTercero = entrada.nextInt();
        
        
        // Realizar la media en entero y decimal
        
        mediaEntera = (notaPrimer + notaSegundo + notaTercero) / 3; // Quita la parte decimal
        
        System.out.println("La nota media como aparece en el boletín de calificaciones (Entero) es: " + mediaEntera);
        
        mediaDecimal = (notaPrimer + notaSegundo + notaTercero) / 3.0; // Al poner 3.0 hace un castingé
        
        System.out.println("La nota media como aparece en el expediente académico (Decimal) es: " + mediaDecimal);
        
    }
    
}
