
package Ejercicio27;

/**
 * Ejercicio para mostrar por pantalla los 10 primeros numeros primos
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class PrimosPrimeros {
    
    public static void main(String[] args) {
        
        // Variables
        
        // Variable que me indica por cuantos es divisible
        int contadorDivisible = 0;
        
        
        // Bucles para ver si es primo o no
        
        for(int i=2; i<=10; i++) {
            
            // Segundo bucle para dividir el primer numero entre el rango de 2 a 10
            for(int j=2; j<=10; j++) {
                
                if(i % j == 0) {
                    
                    contadorDivisible++;
                    
                }
                
            }
            
            // Si es divisible por 2 o mas numeros entonces no es primo
            if(contadorDivisible < 2) System.out.println(i);
            
            contadorDivisible = 0;
            
        }
        
    }
    
}
