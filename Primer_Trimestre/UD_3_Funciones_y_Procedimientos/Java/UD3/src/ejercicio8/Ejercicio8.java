
package ejercicio8;

/**
 * Ejercicio 8
 * 
 * @author 03_1DAW
 */

public class Ejercicio8 {
     public static void main(String[] args) {

        // Variables
        double minimo, maximo;
        
        double aleatorio;
        
        // Inicializacion
        
        minimo = 1.0;
        
        maximo = 10.0;
        
        // Calcular el numero aleatorio, movemos el rango al numero de pasos y lo desplazamos el minimo
        aleatorio = (Math.random() * (maximo - minimo)) + minimo;
        
        // Mostrar el numero
        System.out.println("\nEl numero aleatorio entre 1 y 10 es: " + aleatorio);

    }
}
