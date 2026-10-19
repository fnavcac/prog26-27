
package Ejercicio12;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        // Variable
        
        int contador = 1;
        
        String mensaje = " ¡Hola Mundo!";
        
        
        // Mostramos por pantalla el mensaje
        
        while (contador <= 100) {
            
            System.out.println(contador + mensaje);
            
            // Si se quiere parar en un mensaje concreto se puede usar break
            //if (contador == 77) break;
            
            contador++; // Incrementamos el contados
            
        }
        
    }
    
}
