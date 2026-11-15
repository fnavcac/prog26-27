
package ejercicio15;

import java.util.Scanner;

/**
 * Ejercicio 15
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};
        
        int contadorAprobados = 0;
        
        int contadorSuspensos = 0;
        
        boolean nota10 = false;
        
        int notaBuscar, contadorNota = 0;
        
        // Calculos y pedir dato al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nIntroduce la nota a buscar:");
        
        notaBuscar = entrada.nextInt();
        
        for (int nota : notas) {
            
            if (nota >= 5) contadorAprobados++; 
            
            if (nota < 5) contadorSuspensos++;
            
            if (nota == 10) nota10 = true;
            
            if (nota == notaBuscar) contadorNota++;
        }
        
        System.out.println("\nDatos de notas\n===================");
        
        System.out.println("Numero alumnos aprobados: " + contadorAprobados);
        
        System.out.println("Numero alumnos suspensos: " + contadorSuspensos);
        
        System.out.println("Hay algun alumno con un 10: " + nota10);
        
        
        System.out.println("Hay " + contadorNota + " alumnos con un " + notaBuscar);
        
    }
    
}
