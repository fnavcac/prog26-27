
package ejercicio25;

import java.util.Scanner;

/**
 * Ejercicio 25
 * 
 * @author fran
 */

public class Ejercicio25 {
    
    public static void main(String[] args) {
        
        // Variable
        String nombreUsuario;
        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un nombre de usuario:");
        
        nombreUsuario = entrada.nextLine();
        
        
        // Comprobaciones varias
        comprobarNombre(nombreUsuario);
        
    }
    
    public static void comprobarNombre(String nombre) {
        
        boolean vacio, masDe5, menosDe15, tieneEspacios;
        
        vacio = "".equals(nombre);
        
        masDe5 = nombre.length() > 5;
        
        menosDe15 = nombre.length() < 15;
        
        tieneEspacios = nombre.contains(" ");
        
        
        System.out.println("¿Esta vacio? " + vacio);
        
        System.out.println("¿Tiene mas de 5 caracteres? " + masDe5);
        
        System.out.println("¿Tiene menos de 15 caracteres? " + menosDe15);
        
        System.out.println("¿Contiene espacios? " + tieneEspacios);
        
    }
    
}
