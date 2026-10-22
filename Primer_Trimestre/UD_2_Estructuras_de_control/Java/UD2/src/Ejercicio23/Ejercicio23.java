
package Ejercicio23;

/**
 * Ejercicio 23
 * 
 * Realiza la suma desde el 100 al 1
 * 
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        // Variables, declaración e incialización
        
        int sumaInversa = 0;
        
        // Realizamos el bucle
        
        for (int i=100; i>0; i--)  {
            
            sumaInversa += i;
            
            //System.out.println("Suma inversa: " +  sumaInversa);
            
        }
        
        // Mostrar el resultado por pantalla
        
        System.out.println("La suma del 100 al 1  = " + sumaInversa);
        
    }
    
}
