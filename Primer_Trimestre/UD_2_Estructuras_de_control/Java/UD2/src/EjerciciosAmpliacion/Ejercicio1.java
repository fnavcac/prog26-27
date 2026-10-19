
package EjerciciosAmpliacion;

import java.util.Scanner;

/**
 * Ejercicios Ampliacion
 * 
 * Ejercicio 1
 * 
 * Desarrolla un programa Java que simule el acceso a un sistema mediante
 * un PIN de cuatro cifras.
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 0.1
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // Constantes
        
        /*
        Decido utilizar el PIN correcto como constante porque no va a 
        cambiar durante la ejecucion del programa.
        */
        
        final int PIN_CORRECTO = 2580;
        
        
        // Declaracion de Variables
        
        int pinIntroducido;
        
        int intentos;
        
        
        // Inicializacion
        
        intentos = 1;
        
        
        // Bucle principal para comprobar el PIN y pedirlo al usuario
        
        Scanner entrada = new Scanner(System.in); 
        
        
        while (intentos <= 3) {
            
            System.out.println("Introduce el PIN:");
            
            pinIntroducido = entrada.nextInt();
            
            if (pinIntroducido == PIN_CORRECTO) {
                
                System.out.println("Acceso concedido\nNumero de intentos: " + intentos);
                
                break;
                
            }
            
            System.out.println("PIN incorrecto. Te quedan " + (3 - intentos) + " intentos.");
            
            if (intentos == 3) {
                
                System.out.println("Acceso bloqueado.");
                
                break;
            }
            
            intentos++;
            
        }
    }
    
}
