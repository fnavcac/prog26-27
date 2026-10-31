
package ejercicio4;

import java.util.Scanner;

/**
 * Ejercicio 4
 * 
 * @author 03_1DAW
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        // Variable
        
        double num1, num2;
        
        int seleccionarMenu;
        
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        
        num1 = entrada.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        
        num2 = entrada.nextDouble();
        
        
        // Todas las operaciones se hacen en el mismo orden num1 "operacion" num2
        System.out.println("Introduce la operacion que quiere realizar:\n 1-Suma(numero 1 + numero 2)\n 2-Resta(numero1 - numero 2)\n 3-Multiplicacion(numero 1 * numero 2)\n 4-Division(numero 1 / numero 2)");
        
        seleccionarMenu = entrada.nextInt();
        
        
        // Menu calculadora
        
        switch (seleccionarMenu) {
            
            case 1:
                
                System.out.println("Has seleccionado la suma");
                
                double suma = sumarNumeros(num1, num2);
                
                System.out.println(num1 + " + " + num2 + " : " + suma);
                
                break;
                
            case 2:
                
                System.out.println("Has seleccionado la resta");
                
                double resta = restarNumeros(num1, num2);
                
                System.out.println(num1 + " - " + num2 + " : " + resta);
                
                break;
                
            case 3:
                
                System.out.println("Has seleccionado la multiplicacion");
                
                double multiplicacion = multiplicarNumeros(num1, num2);
                
                System.out.println(num1 + " + " + num2 + " : " + multiplicacion);
                
                break;
                
            case 4:
                
                System.out.println("Has seleccionado la division");
                
                double division = dividirNumeros(num1, num2);
                
                if (division == 0) {
                    
                    System.out.println("No es posible dividir entre 0");
                
                } else {
                    
                    System.out.println(num1 + " / " + num2 + " : " + division);
                
                }
                
                break;
                
            default:
                
                System.out.println("No has seleccionado una operacion valida");
                
                break;
                
              
        }
        
        
    }
    
    public static double sumarNumeros(double num1, double num2) {
        
        double suma = num1 + num2;
        
        return suma;
        
    }
    
    public static double restarNumeros(double num1, double num2) {
        
        double resta = num1 - num2;
            
        return resta;
        
    }
    
    public static double multiplicarNumeros(double num1, double num2) {
        
        double multiplicacion = num1 * num2;
        
        return multiplicacion;
        
    }
    
    public static double dividirNumeros(double num1, double num2) {
        
        if (num2 == 0)  return 0;
        
        double division = num1 / num2;
        
        return division;
        
    }
    
}
