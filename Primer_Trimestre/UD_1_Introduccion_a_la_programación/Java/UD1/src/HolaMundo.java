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
        /*
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("x: " + x);
        */
        
        
        // Incrementos
        
        int numero1 = 1;
        int numero2 = numero1++; // Primero se asigna y luego se incrementa
        int numero3 = ++numero1; // Primero se incrementa y luego se asignas
        
        System.out.println("\nnumero1: " + numero1);
        
        System.out.println("nuemro2 = numero1++: " + numero2);
        
        System.out.println("numero3 = ++numero1: " + numero3);
        
        
        // Errores de aproximacion
        
        double errorDecimal  = (1.0/10.0) + (2.0/10.0);
        errorDecimal = errorDecimal * 10;
        
        System.out.println("\nerrorDecimal  = (1.0/10.0) + (2.0/10.0)");
        System.out.println("errorDecimal = errorDecimal * 10");
        System.out.println(errorDecimal);
        
        
        // Operador ternario
        
        int valorA, valorB;
        valorA = 3 < 5 ? 1 : -1;
        valorB = a == 7 ? 10 : 20;
        
        System.out.println("valorA = 3 < 5 ? 1 : -1 : " + valorA);
        
        System.out.println("valorB = a == 7 ? 10 : 20 : " + valorB);
        
    }
    
}
