
package ejercicio18;

/**
 * Ejercicio 18
 * 
 * @author 03_1DAW, fran
 */

public class ModificadorArray {
    
    public static void main(String[] args) {
        
        // Variables
        int[] arrayPruebas = {1, 2, 4, 5,};
        
        int factor = 3;
        
        int[] arrayCopia;
        
        
        // Mostrar calculos en array
        System.out.println("Array original: ");
        
        mostrar(arrayPruebas);
        
        arrayCopia = copiar(arrayPruebas);
        
        
        System.out.println("\nArray tras el incremento: ");
        
        incrementar(arrayPruebas);
        
        mostrar(arrayPruebas);
    
        
        System.out.println("\nArray tras multiplicar por " + factor + ": ");
        
        multiplicar(arrayPruebas, factor);
        
        mostrar(arrayPruebas);
        
        
        System.out.println("\nArray tras rellenar con ceros: ");
        
        rellenarCeros(arrayPruebas);
        
        mostrar(arrayPruebas);
        
        
        // Mostar la copia del array
        System.out.println("\nCopia del array original: ");
        
        mostrar(arrayCopia);
        
    }
    
    public static void mostrar(int[] numeros) {
        
        for (int n: numeros) {
            
            System.out.print(n + " ");
            
        }
        
    }
    
    public static void incrementar(int[] numeros) {
        
        for (int i=0; i<numeros.length; i++) {
            
            numeros[i] += 1;
            
        }
        
    }
    
    public static void multiplicar(int[] numeros, int factor) {
        
        for (int i=0; i<numeros.length; i++) {
            
            numeros[i] *= factor;
            
        }
        
    }
    
    public static void rellenarCeros(int[] numeros) {
        
        for (int i=0; i<numeros.length; i++) {
            
            numeros[i] = 0;
            
        }
        
    }
    
    public static int[] copiar(int[] numeros) {
        
        int[] copia = new int[numeros.length];
        
        for (int i=0; i<numeros.length; i++) {
            
            copia[i] = numeros[i];
            
        }
        
        return copia;
        
    }
    
}
