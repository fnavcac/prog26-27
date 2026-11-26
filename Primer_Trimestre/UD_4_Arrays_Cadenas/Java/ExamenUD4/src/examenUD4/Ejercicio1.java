
package examenUD4;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        
        // Ejericicio 1
        
        
        // Variables
        String[] nombre =  new String[2];
        
        int[] edad = new int[2];
        
        
        // Entrada de datos
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i < nombre.length; i++)  {
            
            System.out.println("Introduce el nombre:");
            
            /* 
            Uso next para que en la siguiente iteracion no se "coma"
            el espacio como nombre.
            */
            nombre[i] = entrada.next();
            
            System.out.println("Introduce la edad:");
            
            edad[i] = entrada.nextInt();
            
        }
        
        // Mostrar los datos
        
        for (int i=0; i<nombre.length;i++) {
            
            // Para ahorrarnos un bucle calculamos cual es mayor de edad dentro de este
            
            System.out.println("\nNombre: " + nombre[i] + "\nEdad: " + edad[i]);
            
            if (18 <= edad[i]) {
                
                System.out.println(nombre[i] + " es mayor de edad");
            
            }
            
        }
        
    }
}
