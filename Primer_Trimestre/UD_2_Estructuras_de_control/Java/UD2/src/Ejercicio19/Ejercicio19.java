
package Ejercicio19;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        // Constantes
        
        /*
        Decido utilizar el PIN correcto como constante porque no va a 
        cambiar durante la ejecucion del programa.
        */
        
        final int PIN_CORRECTO = 2580;
        
        final int INTENTOS_PIN = 3;
        
        
        // Declaracion de Variables
        
        int pinIntroducido;
        
        int intentos;
        
        int seleccion;
        
        boolean salirEjecucion;
        
        
        // Inicializacion
        
        intentos = 1;
        
        salirEjecucion = true;
        
        
        // Bucle principal para comprobar el PIN y pedirlo al usuario
        
        Scanner entrada = new Scanner(System.in); 
        
        
        while (intentos <= 3 && salirEjecucion) {
            
            System.out.println("Introduce el PIN:");
            
            pinIntroducido = entrada.nextInt();
            
            if (pinIntroducido == PIN_CORRECTO) {
                
                System.out.println("Acceso concedido\nNumero de intentos: " + intentos);
                
                System.out.println("\nBienvenido al menu\n(1 - Mostar saldo, 2 - Retirar saldo, 3 - Reintegro, 4 - Salir del menu)");
                
                while (salirEjecucion) {
                    
                    System.out.println("\nIntroduce la opcion:");
                    
                    seleccion = entrada.nextInt();
                    
                    switch (seleccion){
                        
                        case 1: 
                            
                            System.out.println("(Muestra el saldo)");
                            
                            break;
                        
                        case 2:
                            
                            System.out.println("(Retira saldo)");
                            
                            break;
                        
                        case 3:
                            
                            System.out.println("(Reintegra)");
                            
                            break;
                        
                        case 4:
                            
                            System.out.println("(Salir del menu)");
                            
                            salirEjecucion = false;
                            
                            System.out.println("Se ha cerrado cajero");
                            
                            break;
                        
                        default: 
                            
                            System.out.println("Opcion no admitida");
                            
                            break;
                    }
                
                }
                
                
            }
            
            if (salirEjecucion) System.out.println("PIN incorrecto. Te quedan " + (INTENTOS_PIN - intentos) + " intentos.");
            
            if (intentos == INTENTOS_PIN) {
                
                System.out.println("Acceso bloqueado.");
                
                salirEjecucion = false;
            }
            
            intentos++;
            
        }
        
    }
    
}
