package Ejercicio21;

import java.util.Scanner;

/**
 * Nivel 1
 * @author 03_1DAW, Francisco Navarro
 */

public class LongitudYAreaNivel1 {
    
    public static void main(String[] args) {
        
        // Constantes
        final double PI = 3.141592;
        
        // Variables
        double radio, longitud, area;
        
        // Pedir variable al usuario
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor del radio:");
        radio = entrada.nextDouble();
        
        // Cálculos
        longitud = (2 * PI * radio);
        area = (PI * radio * radio);
        
        // Mostrar resultados
        System.out.println("\nPara un radio de " + radio +
                " tenemos una longitud de " + longitud + 
                " y un área de " + area + " de la circunferencia");
    }
    
}
