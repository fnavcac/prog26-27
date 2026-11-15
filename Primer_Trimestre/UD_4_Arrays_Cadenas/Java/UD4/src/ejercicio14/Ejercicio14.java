
package ejercicio14;

import java.util.Scanner;

/**
 * Ejercicio 14
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        // Varible
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
        
        //int numeroBuscado;
        
        int contador;
        
        // Mostar el array
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
        /*
        // Pedir el numero buscado
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\nIntroduce el numero a buscar en el array:");
        
        numeroBuscado = entrada.nextInt();
        */
        
        
        // Recorrer el array y mostrar el si se ha encontrado
        /*
        contador = 0;
        
        for (int i=0; i<numeros.length; i++) {
            
            if(numeros[i] == numeroBuscado) contador++;
            
        }
        
        System.out.println("El numero buscado " + numeroBuscado + " aparece " + contador);
        */
        
        // Para poner dos saltos de linea
        System.out.println("\n");
        
        for (int i=0; i<numeros.length; i++) {
            
            contador = 0;
            
            for (int j=0; j<numeros.length; j++) {
                
                if (numeros[j] == numeros[i]) {
                    
                    contador++;
                
                }
                
            }
            
            System.out.println("El numero " + numeros[i] + " aparece " + contador);
            
        }
    }
    
}
