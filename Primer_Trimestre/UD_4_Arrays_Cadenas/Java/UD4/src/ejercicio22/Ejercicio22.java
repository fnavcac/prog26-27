
package ejercicio22;

import java.util.Scanner;

/**
 * Ejercicio 22
 * 
 * @author 03_1DAW
 */

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        // Variables
        String palabraIntroducida;
        
        int longitud;
        
        char primeraLetra, ultimaLetra;
        
        boolean masDe10 = false;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una palabra: ");
        
        palabraIntroducida = entrada.nextLine();
        
        System.out.println("Palabra: " + palabraIntroducida);
        
        longitud = mostrarLongitud(palabraIntroducida);
        
        primeraLetra = primerCaracter(palabraIntroducida);
        
        ultimaLetra = ultimoCaracter(palabraIntroducida);
        
        System.out.println("La longitud de la palabra es: " + longitud);
        
        System.out.println("La primera letra de la palabra es: " + primeraLetra);
        
        System.out.println("La ultima letra de la palabra es: " + ultimaLetra);
        
        if(longitud > 10) masDe10 = true;
        
        System.out.println("¿Tiene más de 10 caracteres? " + masDe10);
        
    }
    
    public static int mostrarLongitud(String palabra) {
        
        int longitud = palabra.length();
        
        return longitud;
        
    }
    
    public static char primerCaracter(String palabra) {
        
        char letra = palabra.charAt(0);
        
        return letra;
        
    }
    
    public static char ultimoCaracter(String palabra) {
        
        char letra = palabra.charAt(palabra.length()-1);
        
        return letra;
        
    }
    
}
