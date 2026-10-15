
package Ejercicio8;

import java.util.Scanner;

/**
 * Ejercicio 8
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int nota;
        
        
        // Pedir al usuario la nota
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la nota (entera):");
        
        nota = entrada.nextInt();
        
        
        // Realizamos el switch y mostramos al usuario por pantalla
        
        switch (nota) {
            
            case 0, 1, 2, 3, 4:
                System.out.println("\nInsuficiente\n");
                break;
                
            case 5:
                System.out.println("\nSuficiente\n");
                break;
                
            case 6:             
                System.out.println("\nBien\n");
                break;
                
            case 7, 8:              
                System.out.println("\nNotable\n");
                break;
                
            case 9, 10:               
                System.out.println("\nSobresaliente\n");
                break;
                
            default:
                System.out.println("No has introducido una nota valida");
                
            
        }
        
        
        // Versión moderna
        
        switch (nota) {
            
            case 0, 1, 2, 3, 4 -> System.out.println("\nInsuficiente\n");
                
            case 5 -> System.out.println("\nSuficiente\n");
                
            case 6 -> System.out.println("\nBien\n");
                
            case 7, 8 -> System.out.println("\nNotable\n");
                
            case 9, 10 -> System.out.println("\nSobresaliente\n");
                
            default -> System.out.println("No has introducido una nota valida");
                
            
        }
        
        
        // Con if/else if/else
        
        if (nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4) {
            
                System.out.println("\nInsuficiente\n");
            
        } else if  (nota == 5) {
            
                System.out.println("\nSuficiente\n");
                
        } else if  (nota == 6) {
            
                System.out.println("\nBien\n");
                
        } else if  (nota == 7 || nota == 8) {
            
                System.out.println("\nNotable\n");
                
        } else if  (nota == 9 || nota == 10) {
            
                System.out.println("\nSobresaliente\n");
                
        } else {
            
            System.out.println("No has introducido una nota valida");
            
        }
        
    }
    
}
