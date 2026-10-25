
package Ejercicio26;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio26 {
    
    /*
    Este algoritmo hace que al introducir 2 numeros enteros mayores
    de 0, los compara y asigna un nuevo valor resultado de la resta 
    hasta que el segundo numero sea 0, dicha comparacion se hace en 
    funcion de si el primer numero es mayor que el segundo.
    */
    
    public static void main(String[] args) {
        
        // Variables
        
        int a, b;
        
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduzca dos numero mayores que 0:");
        
        a = entrada.nextInt();
        
        b = entrada.nextInt();
        
        
        // Calculos, bucles y condiciones
        
        while (b != 0) {

            if (a > b) {

                a = a - b;

            } else {

                b = b - a;

            }

        }
        
        
        // Mostrar resultado por pantalla
    
        System.out.println("Valor de a: " + a);
    
    }
    
}
