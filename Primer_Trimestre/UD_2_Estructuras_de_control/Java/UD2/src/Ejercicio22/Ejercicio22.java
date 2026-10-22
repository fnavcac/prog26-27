
package Ejercicio22;

/**
 * Ejercicio 22
 * 
 * Calcular la suma de los números de 1 al 100
 * 
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        // Variables, declaración e incialización
        
        int suma = 0;
        
        // Realizamos el bucle
        
        for (int i=1; i<=100; i++)  {
            
            suma += i;
            
            //System.out.println("Suma: " + suma);
            
        }
        
        // Mostrar el resultado por pantalla
        
        System.out.println("La suma del 1 al 100  = " + suma);
        
    }
    
}
