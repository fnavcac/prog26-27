
package Ejercicio18;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        // Mostrar los datos al usuario
        
        System.out.println("Mostrar solo los numeros pares\n===============================");
        
        for(int i=1; i<=10; i++) {
            
            if( i%2 != 0) continue;
            
            System.out.println(i);
            
        }
        
    }
    
}
