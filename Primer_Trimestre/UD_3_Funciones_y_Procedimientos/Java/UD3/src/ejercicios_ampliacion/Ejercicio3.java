
package ejercicios_ampliacion;

import java.util.Scanner;

/**
 * Ejercicio 3 Ampliacion
 *
 * @author 03_1DAW, Fran
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        // Variables
        double minimo, maximo;
        
        double aleatorio;

        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor minimo del rango: ");
        
        minimo = entrada.nextDouble();
        
        System.out.println("Introduce el valor maximo del rango: ");
        
        maximo = entrada.nextDouble();
        
        // Calcular el numero aleatorio, movemos el rango al numero de pasos y lo desplazamos el minimo
        aleatorio = (Math.random() * (maximo - minimo)) + minimo;
        
        // Mostrar el numero
        System.out.println("\nEl numero aleatorio es: " + aleatorio);

    }

}
