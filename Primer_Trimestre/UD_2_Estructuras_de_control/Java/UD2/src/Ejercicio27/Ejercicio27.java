
package Ejercicio27;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio27 {

    public static void main(String[] args) {
        
        // Variables
        
        int numIntroducido;
        
        boolean esPrimo;
        
        
        // Inicializacion
        
        esPrimo = true;
        
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce un numero entero para comprobar si es primo:\n(Divisible solo por si mismo y la unidad)");
        
        numIntroducido = entrada.nextInt();
        
        
        // Calculos y comprobacion
        
        for(int i=1; i<=numIntroducido; i++) {
            
            // Para la comprobacion perezosa
            if (i != 1 && i != numIntroducido && numIntroducido % i == 0) {
                
                esPrimo = false;
                
            }
            
        }
        
        
        // Mostrar los resultados
        
        if(esPrimo) System.out.println("El numero " + numIntroducido + " es primo.");
        
        else System.out.println("El numero " + numIntroducido + " no es primo.");
          
    }
    
}
