
package ejercicio11;

/**
 * Ejercicio 11
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] array = {2, 5, 3, 2, 8, 5, 9};
        
        // Mostar los valores unicos del array
        arrayValoresSinCopia(array);
                
    }
    
    public static void arrayValoresSinCopia(int[] array) {
        
        int contador;
        
        
        for (int i=0; i<array.length; i++) {
            
            contador = 0;
            
            for (int j=0; j<array.length; j++) {
                
                if (array[j] == array[i]) contador++;
                
            }
            
            if (contador == 1) {
                
                System.out.print(array[i] + " ");
                
            }
            
        }
        
    }
    
}
