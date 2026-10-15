
package Ejercicio3;

import java.util.Scanner;

/**
 * Ejercicio 3
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Constantes
        
        final String nombreUsuario = "Fran"; // El literal que queremos comparar
        
        
        // Variables
        
        String nombreIntroducido;
        
        
        // Pedir los datos al usuario
        
        /*
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre para acceder (Fran):");
        
        nombreIntroducido = entrada.nextLine();
        */
        
        nombreIntroducido = "Fran";
        
        /*
        Estructura selectiva, si el usuario introducido coincide con
        el usuario correcto (nombreUsuario) le damos la bienvenida, 
        en otro caso continuo el programa.
        */
        
        // Me compara el nombre introducido al literal
        if (nombreIntroducido.equals(nombreUsuario)) {
            
            System.out.println("¡Bienvenido " + nombreIntroducido + "!");
            
        } /*else {
            
            
            
        }*/
        
        
        // No compara bien los Strings porque asigna 2 espacios distintos de memoria
        if (nombreIntroducido == nombreUsuario) {
            
            System.out.println("Sale sólo con el literal en (nombreIntroducido) para comparar");
            
        }
        
        System.out.println("Fin");
        
    }
    
}
