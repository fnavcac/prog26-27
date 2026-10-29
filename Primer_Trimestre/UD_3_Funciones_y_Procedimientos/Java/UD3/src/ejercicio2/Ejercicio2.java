
package ejercicio2;

import java.util.Scanner;

/**
 * Ejericicio 2
 * 
 * @author 03_1DAW
 */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int resultado;
        
        int numIntroducido;
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        
        numIntroducido = entrada.nextInt();
        
        
        // Invocar o llamar a los metodos y mostrar por pantalla
        
        resultado = calcularDoble(numIntroducido);
        
        System.out.println(resultado);
        
        mostrarMensaje();
        
    }
    
    
    // Funcion es si devuelve algo
    public static int calcularDoble(int numero) {
        
        return numero * 2;
        
    }
    
    // Procedimiento es si no devuelve nada
    public static void mostrarMensaje() {
        
        System.out.println("Hola");
        
    }
    
}
