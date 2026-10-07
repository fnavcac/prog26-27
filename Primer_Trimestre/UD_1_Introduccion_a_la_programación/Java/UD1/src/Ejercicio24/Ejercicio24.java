package Ejercicio24;

import java.util.Scanner;

/**
 * Ejercicio 24
 * 
 * Diseñar un algoritmo que nos indique si podemos salir a la calle.
 * 
 * Existen aspectos que influyen en esta decisión: si está lloviendo y si hemos
 * terminado nuestra tareas.
 * 
 * Solo podremos salir a la calle si no está lloviendo y hemos finalizado
 * nuestra tareas. Existe una opción en la que, indistintamente de lo anterior,
 * podremos salir a la calle: el hecho de que tengamos que ir a la biblioteca
 * (para realizar algún trabajo, entregar un libro, etc.).
 * 
 * Solicitar al usuario (meidante un booleano) ...
 * 
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio24 {
    
    public static void main(String[] args) {
        
        // Variables
        boolean llueve, tareaTerminada, biblioteca;
        
        // Pedir los datos al usuario en String
        /*
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo?");
        llueve = (entrada.nextLine().equals("si"));
        
        System.out.println("¿Has terminado tarea?");
        tarea = (entrada.nextLine().equals("si"));
        
        System.out.println("¿Tienes que ir a la biblioteca?");
        biblioteca = (entrada.nextLine().equals("si"));
        */
        
        
        // Otra forma (Hay que teclear true o false)
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo?");
        llueve = (entrada.nextBoolean());
        
        System.out.println("¿Has terminado tarea?");
        tareaTerminada = (entrada.nextBoolean());
        
        System.out.println("¿Tienes que ir a la biblioteca?");
        biblioteca = (entrada.nextBoolean());
        
        boolean salir = (!llueve && tareaTerminada) || biblioteca;
        
        // Mostrar los datos al usuario
        System.out.println("¿Puedes salir? " + salir);
        
        
    }
    
}
