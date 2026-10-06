package Ejercicio20;

/**
 * Ejercicio 20
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        // Varibales
        int nota1, nota2;
        
        double resultadoMedia;
        
        // Pedir valores
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor de la nota 1:");
        nota1 = entrada.nextInt();
        
        System.out.println("Introduce el valor de la nota 1:");
        nota2 = entrada.nextInt();
        
        // Cálculos
        
        // Hay que hacer un casting explícito para pasar a double
        resultadoMedia = ((double)nota1 + (double)nota2) / 2;
        
        // Mostrar resultados
        
        System.out.println("La nota media es de " + resultadoMedia);
    }
    
}
