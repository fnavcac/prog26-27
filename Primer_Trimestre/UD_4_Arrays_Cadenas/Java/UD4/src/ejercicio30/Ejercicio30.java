
package ejercicio30;

import java.util.Scanner;

/**
 * Ejercicio 30
 * 
 * @author fran
 */

public class Ejercicio30 {
    
    public static void main(String[] args) {
        
        // Variable
        String nombreArchivo;
        
        boolean extensionCorrecta = false;
        
        // Pedir datos y operaciones
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del archivo:");
        
        nombreArchivo = entrada.nextLine();
        
        extensionCorrecta = comprobarExtension(nombreArchivo);
        
        //System.out.println("El archivo tiene una extension valida: (.pdf, .jpg, .png, .txt" + extensionCorrecta);
        
        if(extensionCorrecta) {
            
            System.out.println("El archivo tiene una extension valida (.pdf, .jpg, .png, .txt)");
        
        } else {
            
            System.out.println("El archivo no tiene una extension valida");
            
        }
        
    }
    
    public static boolean comprobarExtension(String archivo) {
        
        boolean correcto = false;
        
        if (archivo.toLowerCase().endsWith(".pdf") 
                || archivo.toLowerCase().endsWith(".jpg") 
                || archivo.toLowerCase().endsWith(".png") 
                || archivo.toLowerCase().endsWith(".txt")) {
            
            correcto = true;
            
        }
        
        return correcto;
        
    }
    
}
