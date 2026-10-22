
package Ejercicio24;

/**
 * Ejercicio 24
 * 
 * Realiza la suma sólo de los números pares del 1 al 100
 * 
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio24 {
    
    public static void main(String[] args) {
        
        // Variables, declaración e incialización
        
        int sumaInversa = 0;
        
        // Realizamos el bucle
        
        for (int i=100; i>0; i--)  {
            
            if (i%2 == 0) {
                
                sumaInversa += i;
                
            }
            
            //System.out.println("Suma inversa: " +  sumaInversa);
            
        }
        
        // Mostrar el resultado por pantalla
        
        System.out.println("La suma del 100 al 1  = " + sumaInversa);
        
    }
    
}
