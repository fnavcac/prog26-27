
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int numeroPedido;
        
        int contador;
        
        
        // Pedir el dato al usuario e inicializar el contador
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("El programa va a contar desde el 1 al número introducido\n");
        
        System.out.println("Introduce un número entero positivo:");
        
        numeroPedido = entrada.nextInt();
        
        contador=1;
        
        
        // Usamos Math.abs(numero) para obtener el valor absoluto del número por si introduce un número negativo
        numeroPedido = Math.abs(numeroPedido);
        
        
        // Mostrar los datos por pantalla
        
        System.out.println("\nIniciamos la cuenta:");
        
        while(contador <= numeroPedido) {
            
            // Uso print en lugar de println para que no añada un salto de línea y salga todo en la misma línea
            System.out.print(contador + ", ");
            
            //System.out.println(contador);
            
            contador++;
            
        }
        
    }
    
}
