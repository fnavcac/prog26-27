
package Ejercicio9;

import java.util.Scanner;

/**
 * Ejercicio 9
 * 
 * Crear un programa que realice las cuatro operaciones básicas (suma, resta,
 * multiplicación y división) según la opción que seleccine el usuario.
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class Ejercicio9UsandoString {
    
    /*
    En este caso completamos el ejercicio 9 usando en el switch un String
    en lugar de un numero entero.
    */
    
    public static void main(String[] args) {
        
        // Variables
        
        String seleccion, seleccionNormalizada;
        
        double numero1, numero2;
        
        double resultadoOperacion;
        
        
        // Pedir numeros y operacion al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        
        numero1 = entrada.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        
        numero2 = entrada.nextDouble();
        
        
        System.out.println("\nIntroduce la operación que quiere realizar:");
        
        System.out.println("(suma, resta, multiplicacion, division");
        
        /* 
        Usamos .next() para que no acepte el salto de linea (\n) anterior
        al pulsar Enter como la seleccion que hemos hecho.
        */
        seleccion = entrada.next();
        
        //seleccion = entrada.nextLine(); // Selecciona automaticamente "" como lo escrito.
        
        
        /*
        Normalizamos (De forma basica) la expresion quitandole los espacios
        en blanco antes y despues del texto y lo ponemos en minuscula.
        */
        
        seleccionNormalizada = seleccion.strip().toLowerCase();
        
        
        /*
        Seleccionar operacion con el switch usando un String, en este caso
        el switch funciona como un .equals("opcion")
        */
        
        switch (seleccionNormalizada) {
            
            case "suma":
                System.out.println("\nHas seleccionado la suma.\n");
                
                resultadoOperacion = numero1 + numero2;
                
                System.out.println(numero1 + " + " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case "resta":
                System.out.println("\nHas seleccionado la resta.\n");
                
                resultadoOperacion = numero1 - numero2;
                
                System.out.println(numero1 + " - " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case "multiplicacion":
                System.out.println("\nHas seleccionado la multiplicacion.\n");
                
                resultadoOperacion = numero1 * numero2;
                
                System.out.println(numero1 + " * " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case "division":
                System.out.println("\nHas seleccionado la division.\n");
                
                resultadoOperacion = numero1 / numero2;
                
                System.out.println(numero1 + " / " + numero2 + " = " + resultadoOperacion);
                
                break;
            
            default:
                System.out.println("\nOpcion no valida");
                
                break;
            
        }
                       
    }
    
}
