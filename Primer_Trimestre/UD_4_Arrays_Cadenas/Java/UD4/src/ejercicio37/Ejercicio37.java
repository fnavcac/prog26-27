package ejercicio37;

import java.util.Scanner;

/**
 * Ejercicio 37
 *
 * @author 03_1DAW
 */
public class Ejercicio37 {

    public static void main(String[] args) {

        // Variable
        String codigo;

        boolean cumpleFormato;
        
        boolean bucle = true;

        // Pedir codigo
        Scanner entrada = new Scanner(System.in);

        while (bucle) {
            
            System.out.println("Introduce el codigo:");
            
            codigo = entrada.nextLine();

            if (codigo.matches("[A-Z]{2}[0-9]{4}")) { // \\d

                System.out.println("Cumple el formato");

            } else if (!codigo.matches("SALIR")) {
                
                System.out.println("Codigo no valido");
                
            }
            
            if (codigo.matches("SALIR")) bucle = false;

        }

    }

}
