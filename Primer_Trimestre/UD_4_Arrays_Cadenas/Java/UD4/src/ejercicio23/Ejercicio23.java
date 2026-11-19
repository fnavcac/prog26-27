
package ejercicio23;

import java.util.Scanner;

/**
 * Ejercicio 23
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        // Varibles
        String nombre, primerApellido, segundoApellido;
        
        String nombreCompleto;
        
        int longitud;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre:");
        
        nombre = entrada.nextLine();
        
        System.out.println("Introduce el primer apellido:");
        
        primerApellido = entrada.nextLine();
        
        System.out.println("Introduce el segundo apellido:");
        
        segundoApellido = entrada.nextLine();
        
        
        /*
        System.out.println("Introduce el nombre completo:");
        nombre = entrada.next();
        primerApellido = entrada.next();
        segundoApellido = entrada.next();
        */
        
        nombreCompleto = devolverNombre(nombre, primerApellido, segundoApellido);
        
        longitud = numeroCaracteres(nombreCompleto);
        
        System.out.println("El nombre completo: " + nombreCompleto);
        
        System.out.println("La longitud de lo caracteres: " + longitud);
        
        
        System.out.println("Nombre en mayusculas: " +  ponerMayuscula(nombreCompleto));
        
        System.out.println("Nombre en minuscula: " +  ponerMinuscula(nombreCompleto));
        
        System.out.println("Nombre original: " +  nombreCompleto);
        
    }
    
    public static String devolverNombre(String nombre, String apellido1, String apellido2) {
        
        String nombreCompleto;
        
        nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
        
        return nombreCompleto;
        
    }
    
    public static int numeroCaracteres(String nombre) {
        
        int longitud;
        
        longitud = nombre.length();
        
        return longitud;
        
    }
    
    public static String ponerMayuscula(String nombre) {
        
        return nombre.toUpperCase();
        
    }
    
    public static String ponerMinuscula(String nombre) {
        
        return nombre.toLowerCase();
        
    }
    
}
