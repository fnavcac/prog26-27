
package ejercicio1;

/**
 *
 * @author 03_1DAW
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        // Declaracion
        int[] numeros = new int[5];
        
        // Inicializacion
        numeros = new int[] {5, 4, 3, 2, 1};
        
        /*for (int i=0; i<numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }*/
                
        System.out.println("\nArray antes\n=============");
        
        mostrarArray(numeros);
        
        mostrarArrayLado(numeros);
        
        numeros[2] = 27;
        
        /*for (int i=0; i<numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }*/
        
        System.out.println("\nArray despues\n=============");
        
        mostrarArray(numeros);
        
        mostrarArrayLado(numeros);
        
    }
    
    public static void mostrarArray(int[] numeros){
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
    }
    
    public static void mostrarArrayLado(int[] numeros){
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
    }
    
}
