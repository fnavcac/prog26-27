package Ejercicio17;

/**
 * Nivel 2
 * @author 03_1DAW, Francisco Navarro
 */

import java.util.Scanner;

public class SimuladorCrono {
    
    public static void main(String[] args) {
        
        // Variables
        // También se puede poner int segundos, minutos, horas;
        int segundos;
        int minutos;
        int horas;
        
        int restoSegundos;
        int restoMinutos;
        
        
        // Pedir los datos
        System.out.println("Introduce un número de segundos: ");
        
        Scanner entrada = new Scanner(System.in);
        
        segundos = entrada.nextInt();
        
        
        // Cálculos
        minutos = segundos / 60; // Para obtener los minutos
        
        restoSegundos = segundos % 60; // Para obtener los segundos que sobran
        
        horas = minutos / 60; // Para obtener las horas
        
        restoMinutos = minutos % 60; // Para obtener los minutos que sobran
        
        
        // Mostrar los resultados
        System.out.println(segundos + " segundos equivalen a " + horas + 
                " hora/s, " + restoMinutos + " minuto/s, " + restoSegundos + 
                " segundo/s.");
        
        // Ejemplo resultado para 4723 segundos -> 1 hora, 18 min y 43 segundos
        
    }
    
}
