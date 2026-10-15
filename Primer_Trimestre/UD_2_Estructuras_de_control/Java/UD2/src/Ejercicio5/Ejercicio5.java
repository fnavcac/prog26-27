
package Ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 5
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        // Variables
        
        double num1, num2;
        
        
        // Pedir al usuario los datos por pantalla
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número 1:");
        
        num1 = entrada.nextDouble(); // Hay que introducir los decimales con "," en pantalla
        
        System.out.println("Introduce el número 2:");
        
        num2 = entrada.nextDouble(); // Hay que introducir los decimales con "," en pantalla
        
        
        // Comparar el número que es mayor con if/else if/else
        
        if (num1 > num2) { // Entra en este bloque si num1 > num2
            
            System.out.println("El número mayor es el (num1) " + num1);
            
        } else if (num1 == num2) { // Enrtra en este bloque si num1 == num2
            
            System.out.println("Ambos números son iguales (num1 == num2)");
                
        } else {
            
            System.out.println("El número mayor es el (num2) " + num2);
            
        }
        
        
        // Otra forma con if/else anidados
        
        if (num1 == num2){
            
            System.out.println("Ambos números son iguales (num1 == num2)");
            
        } else {
            
            if (num1 > num2) {
                
                System.out.println("El número mayor es el (num1) " + num1);
                
            } else {
                
                System.out.println("El número mayor es el (num2) " + num2);
                
            }
            
        }
        
        System.out.println("Fin del programa");
        
    }
    
}
