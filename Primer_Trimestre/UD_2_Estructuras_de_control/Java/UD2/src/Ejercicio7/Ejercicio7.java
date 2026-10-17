
package Ejercicio7;

import java.util.Scanner;

/**
 * Ejercicio 7
 * 
 * Determinar si un año ingresado por el usuario es bisiesto.
 * 
 * Un año es bisiesto si cumple las condiciones:
 * 
 * a. Un año es bisiesto si es divisible entre 4.
 * b. Excepto los años que son múltiplos de 100, que no son bisiestos.
 * c. Salvo que además sean divisibles entre 400, en cuyo caso sí lo son.
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        // Variables
        
        /* Decido usar el tipo primitivo int (4 bytes) en lugar de
        short (2 bytes) para dar más rango al usuario en el año 
        seleccionado, además, es más común utilizar int.
        */
        
        int anioIntroducido;
        
        
        // Pedimos los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el año para comprobar si es bisiesto:");
        
        anioIntroducido = entrada.nextInt();
        
        
        // Condiciones y mostrar por pantalla
        
        // No son necesarios los paréntesis pero los pongo por legibilidad.
        if ((anioIntroducido % 4) == 0 && !((anioIntroducido % 100) == 0)) {
            
            System.out.println("El año " + anioIntroducido + " es bisiesto.\nDivisible entre 4 y no es multiplo de 100.");
            
        } else if ((anioIntroducido % 400) == 0) {
            
            System.out.println("El año " + anioIntroducido + " es bisiesto.\nDivisible entre 400.");
            
        } else {
                        
            System.out.println("El año " + anioIntroducido + " no es bisiesto.");
            
        }
        
        
        // Otra forma usando solo if/else pero da menos informacion al usuario.
        
        if ((anioIntroducido % 400) == 0 || ((anioIntroducido % 4) == 0 && !((anioIntroducido % 100) == 0))) {
            
            System.out.println("\n\nEl año " + anioIntroducido + " es bisiesto.");
            
        } else {
                        
            System.out.println("\n\nEl año " + anioIntroducido + " no es bisiesto.");
            
        }
        
    }
    
}
