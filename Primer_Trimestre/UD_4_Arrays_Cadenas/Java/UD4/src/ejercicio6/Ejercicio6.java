
package ejercicio6;

/**
 * Ejercicio 6
 * 
 * @author 03_1DAW
 */

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = {12, 5, 8, 20, 3, 15};
        
        // Mostrar resultados
        
        System.out.println("Usando un for\n============");
        
        for(int i=0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
        System.out.println("\nUsando un for-each\n============");
        
        for(int n : numeros){
            
            System.out.println(n);
            
        }
        
        System.out.println("\nMostrar solo los mayores de 10\n============");
        
        for(int i=0; i<numeros.length; i++) {
            
            if(numeros[i] > 10) System.out.println(numeros[i]);
            
        }
        
    }
    
}
