
package ejercicio16;

/**
 * Ejercicio 16
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = {3, 5, 2, 3, 7, 5, 9, 1};
        
        int contador;
        
        for (int i=0; i<numeros.length; i++) {
            
            contador = 0;
            
            for (int j=0 ; j<numeros.length; j++) {
                
                if (numeros[j] == numeros[i]) contador++;
                
            }
            
            if (contador == 1) System.out.println("El numero " + numeros[i] + " aparece 1 vez");
            
        }
        
    }
    
}
