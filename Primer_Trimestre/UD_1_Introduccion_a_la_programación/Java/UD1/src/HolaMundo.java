/**
 * Primer programa hecho en el entorno de desarrollo que imprime por pantalla
 * Hola Mundo!
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        
        String saludo  = "Hola mundo!";
      
        System.out.println(saludo);
        
        // Rango de las variables
        byte a = 127;
        byte b = 1;
        a = (byte) (a + b);
        System.out.println("a: " + a);
        
        // Constantes
        final double PI = 3.141592;
        
        // PI = 3; Da error
        
        /**
         * Documentacion
         */
        
        /*
        Varias lineas de comentario
        */
        
        // Comentario de linea
        
        
        // Para escibir desde la linea de comando
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("x: " + x);
    }
    
}
