
package Ejercicio28;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio28 {
    
    public static void main(String[] args) {
        
        // Variables
        
        String numIntroducidoString;
        
        double suma, promedio;
        
        int contador;
        
        
        // Inicializacion
        
        suma = 0;
        
        contador = 0;
        
        
        // Pedir datos al usuario, sumar los valores y calculos
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce numeros para calcular el promedio:\n(Tecla espacio para parar y mostrar el resultado)");
        
        while (true) {
        
            numIntroducidoString = entrada.nextLine(); // Se puede introducir el . en los numero porque lo recibe como String
            
            if (numIntroducidoString.equals(" ")) break; // Salimos del bucle infinito si se pulsa espacio
            
            suma += Double.parseDouble(numIntroducidoString); // Convertimos un String a double
            
            contador++;
        
        }
        
        promedio = suma / contador;
        
        
        // Mostrar los datos
        
        System.out.println("El promedio es: " + promedio);
        
    }
    
}
