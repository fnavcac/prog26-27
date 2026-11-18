
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW
 */

public class EjemploString {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println(nombre.equals("Fran"));
        System.out.println(nombre == "Fran");
        System.out.println("Fran".equals(nombre)); // nombre puede venir como nulo
        
        String a = "Fran";
        String b = "Fran";
        System.out.println(a == b); // Lo pilla del mismo pool por lo que da true
        
        System.out.println("Introduce tu ciudad: ");
        String ciudad = teclado.nextLine();
        
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("\n--- Ficha de usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " +  ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Caracteres del nombre: " + nombre.length());
        
    }

}
