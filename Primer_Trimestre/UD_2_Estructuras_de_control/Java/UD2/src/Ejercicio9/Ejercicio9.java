
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

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int seleccion;
        
        double numero1, numero2;
        
        double resultadoOperacion;
        
        
        // Pedir numeros y operacion al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        
        numero1 = entrada.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        
        numero2 = entrada.nextDouble();
        
        
        System.out.println("\nIntroduce la operación que quiere realizar:");
        
        System.out.println("(suma=1, resta=2, multiplicacion=3, division=4");
        
        
        seleccion = entrada.nextInt();
        
        
        // Seleccionar operacion con el switch usando un int
        
        switch (seleccion) {
            
            case 1:
                System.out.println("\nHas seleccionado la suma.\n");
                
                resultadoOperacion = numero1 + numero2;
                
                System.out.println(numero1 + " + " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case 2:
                System.out.println("\nHas seleccionado la resta.\n");
                
                resultadoOperacion = numero1 - numero2;
                
                System.out.println(numero1 + " - " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case 3:
                System.out.println("\nHas seleccionado la multiplicacion.\n");
                
                resultadoOperacion = numero1 * numero2;
                
                System.out.println(numero1 + " * " + numero2 + " = " + resultadoOperacion);
                
                break;
                
            case 4:
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
