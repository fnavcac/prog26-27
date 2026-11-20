
package ejercicio26;

import java.util.Scanner;

/**
 * Ejercicio 26
 * 
 * @author fran
 */

public class Ejercicio26 {
    
    public static void main(String[] args) {
        
        // Variables
        String nombre, primerApellido, segundoApellido, iniciales;
        
        char letraNombre, letraPrimerApellido, letraSegundoApellido;
        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce el nombre completo: (Separado por espacios)");
        
        nombre = entrada.next();
        
        primerApellido = entrada.next();
        
        segundoApellido = entrada.next();
        
        
        letraNombre = devolverPrimerCaracter(nombre.toUpperCase());
        
        letraPrimerApellido = devolverPrimerCaracter(primerApellido.toUpperCase());
        
        letraSegundoApellido = devolverPrimerCaracter(segundoApellido.toUpperCase());
        
        
        iniciales = devolverIniciales(letraNombre, letraPrimerApellido, letraSegundoApellido);
        
        System.out.println("\nNombre (Introducido): " + nombre.toLowerCase());
        
        System.out.println("Primer apellido (Introducido): " + primerApellido.toLowerCase());
        
        System.out.println("Segundo apellido (Introducido): " + segundoApellido.toLowerCase());
        
        System.out.println("\nIniciales: " + iniciales);
        
    }
    
    public static char devolverPrimerCaracter(String palabra) {
        
        char caracter = palabra.charAt(0);
        
        return caracter;
        
    }
    
    public static String devolverIniciales(char a, char b, char c) {
        
        char[] caracteres = {a, b, c};
        
        String iniciales = new String(caracteres);
        
        return iniciales;
        
    }
    
}
