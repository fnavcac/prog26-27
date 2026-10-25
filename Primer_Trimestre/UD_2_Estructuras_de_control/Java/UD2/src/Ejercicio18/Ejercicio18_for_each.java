
package Ejercicio18;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio18_for_each {
    
    public static void main(String[] args) {
        
        // Variables
        
        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};
        
        double total = 0;
        
        
        // Mostrar los datos
        
        for (double precio : precios) {
            
            if (precio <= 0.0) continue;
            
            total += precio;
            
        }
        
        
        System.out.println("La suma total es " + total);
        
    }
    
}
