/**
 * Ejercicio 16
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número:");
        // Usamos la clase Scanner para pedir por linea de comando el dato
        Scanner entrada = new Scanner(System.in);
        
        // Leemos los datos
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        
        System.out.println("El número es: " + a);
        System.out.println("El segundo número es: " + b);
        
    }
}
