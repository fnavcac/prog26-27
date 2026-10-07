package Ejercicio21;

import java.util.Scanner;

/**
 * Nivel 2
 * @author 03_1DAW, Francisco Navarro
 */

public class LongitudYAreaNivel2 {
    public static void main(String[] args) {
        
        // Variables
        double radio, longitud, area;
        
        // Pedir variable al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor del radio:");
        radio = entrada.nextDouble();
        
        // Cálculos, Math.PI usa la clase Math de Java
        longitud = (2 * Math.PI * radio);
        area = (Math.PI * radio * radio);
        
        // Mostrar resultados
        System.out.println("\nPara un radio de " + radio +
                " tenemos una longitud de " + longitud + 
                " y un área de " + area + " de la circunferencia");
    }
}
