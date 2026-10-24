
package Ejercicio20;

import java.util.Scanner;

/**
 * Ejercicio 20
 * 
 * Suma hasta pulsar tecla cero:
 * 
 * Suma de números hasta que el usuario ingrese 0. 
 * Cada vez que el usuario introduzca un número lo sumo a lo que ya tenía y le pregunto otra vez.
 * Este tipo de algoritmos se llaman acumuladores

 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        // Variables, declaración e inicialización
        
        double numIngresado;
        
        double sumaAcumulada = 0;
        
        // Pedir el número al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        // Usamos do while para que se realice el bucle una primera vez.
        do {
            
            System.out.println("Introduce el número a sumar acumulado:");
            
            numIngresado = entrada.nextDouble(); // Hay que utilizar , en lugar de . en al terminal
            
            sumaAcumulada += numIngresado;
            
            System.out.println("La suma acumulada es: " + sumaAcumulada);
            
        } while (numIngresado != 0);
        
    }
    
}
