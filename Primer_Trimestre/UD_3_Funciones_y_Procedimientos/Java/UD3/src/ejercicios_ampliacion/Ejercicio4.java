package ejercicios_ampliacion;

import java.util.Scanner;

/**
 * Ejercicio 4 Ampliacion
 *
 * @author 03_1DAW, Fran
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        // Variables
        int numIntroducido;

        int contador;

        int numPrimo;

        boolean esPrimo;

        
        // Inicializacion
        contador = 0;

        numPrimo = 2;

        esPrimo = true;

        
        // Pedir datos al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cuantos numero primos quiere que se muestren por pantalla:");

        numIntroducido = entrada.nextInt();

        
        // Calculos y mostrar por pantalla
        while (contador < numIntroducido) {

            for (int i = 1; i <= numPrimo; i++) {

                // Condicion que me dice que no es primo (Distinto de 1 y de si mismo, y divisible entre otro numero)
                if (i != 1 && i != numPrimo && numPrimo % i == 0) {

                    esPrimo = false;

                }

            }

            if (esPrimo) {

                contador++;

                System.out.println("Numero Primo: " + numPrimo);

            }

            numPrimo++;

            esPrimo = true;

        }

    }

}
