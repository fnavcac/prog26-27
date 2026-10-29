
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
        
        
        // Menu calculadora
        
        
        
        
    }
    
    public static double sumarNumeros(double num1, double num2) {
        
        double suma = num1 + num2;
        
        return suma;
        
    }
    
    public static double restarNumeros(double num1, double num2) {
        
        double resta;
        
        if(num1 > num2) {
            
            resta = num1 - num2;
            
            return resta;
            
        } else {
            
            resta = num2 -num1;
            
            return resta;
            
        }
        
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
