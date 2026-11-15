
package ejercicio10;

/**
 * Ejercicio 10
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] array = {3, 8, 5, 2, 9};
        
        int[] arrayInvertido;
        
        // Crear el array invertido
        arrayInvertido = invertirArray(array);
        
        // Mostar ambos arrays
        mostrarArray(array);
        
        mostrarArray(arrayInvertido);
        
    }
    
    public static int[] invertirArray (int[] numerosArray) {
        
        int[] arrayInvertido = new int[numerosArray.length];
        
        for (int i=0; i<numerosArray.length; i++) {
            
            arrayInvertido[i] = numerosArray[(numerosArray.length - 1) - i];
            
        }
        
        return arrayInvertido;
        
    }
    
    public static void mostrarArray(int[] numerosArray) {
        
        System.out.println("\nEl array es:");
        
        for (int i=0; i<numerosArray.length; i++) {
            
            System.out.println(numerosArray[i]);
            
        }
        
    }
    
}
