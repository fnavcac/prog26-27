
package ejercicio13;

import java.util.Scanner;

/**
 * Ejercicio 13
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        // Varible
        int[] numeros = {12, 5, 8, 21, 5, 4, 16, 9, 5};
        
        int numeroBuscado;
        
        // Mostar el array
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        // Pedir el numero buscado
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\nIntroduce el numero a buscar en el array:");
        
        numeroBuscado = entrada.nextInt();
        
        // Recorrer el array y mostrar el si se ha encontrado
        for (int i=0; i<numeros.length; i++) {
            
            if(numeros[i] == numeroBuscado) System.out.println("El numero " + numeroBuscado + " se encuentra en la posicion " + i);
            
        }
        
    }
    
}
