package Ejercicio18;

/**
 * Ejercicio 18
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        // Variables
        int anioActual;
        int anioNacimiento;
        
        int edad;
        
        // Pedir los datos
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el año actual: ");
        anioActual = entrada.nextInt();
        
        System.out.println("Introduce tu año de nacimiento: ");
        anioNacimiento = entrada.nextInt();
        
        // Cálculos
        edad = anioActual - anioNacimiento;
        
        // Mostrar los resultados
        System.out.println("\nTienes " + edad + " años.");
    }
    
}
