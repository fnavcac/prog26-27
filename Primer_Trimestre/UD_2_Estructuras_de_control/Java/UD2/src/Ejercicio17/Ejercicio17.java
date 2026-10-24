
package Ejercicio17;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int valorIntroducido;
        
        
        // Mostrar los datos al usuario y pedir el dato
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Cajero automatico\n=======================");
        
        while (true){
            
            System.out.println("\nIntroduce el tipo de operacion que quiere:");
        
            valorIntroducido = entrada.nextInt();
            
            
            if (valorIntroducido == 1) System.out.println("Mostrando saldo...");
            
            if (valorIntroducido == 2) System.out.println("Retirando dinero...");
            
            if (valorIntroducido == 3) {
                
                System.out.println("Gracias por usar el cajero. ¡Adios!");
                
                break;
            }
        
        }
        
        /* // Usando un switch para mostrar los resultados en lugar de un if
        while (true){
            
            System.out.println("\nIntroduce el tipo de operacion que quiere: (Usando switch)");
        
            valorIntroducido = entrada.nextInt();
            
            
            String selecciona = switch (valorIntroducido) {
                
                case 1 -> "Mostrando saldo...";

                case 2 -> "Retirando dinero...";

                case 3 -> "Gracias por usar el cajero. ¡Adios!";
                    
                default -> "Valor introducido no valido";
               
            };
            
            System.out.println(selecciona);
            
            if (selecciona.equals("Gracias por usar el cajero. ¡Adios!")) break;
        
        }
        */
    }
    
}
