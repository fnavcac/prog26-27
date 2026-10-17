
package Ejercicio10;

import java.util.Scanner;

/**
 * Ejercicio 10
 * 
 * Dado tres lados, determinar si pueden formar un triangulo y en caso
 * afirmativo, indicar si es equilater, isosceles o escaleno.
 * 
 * Tres lados forman un triangulo si la suma de las longitudes de dos
 * cualesquiera es mayor que la longitud del tercero.
 * 
 * Equilatero: todos los lados iguales
 * Isosceles: dos lados iguales
 * Escaleno: ningun lado igual
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        // Variables
        
        double ladoA, ladoB, ladoC;
        
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce la longitud del lado a del triangulo:");
        
        ladoA = entrada.nextDouble();
               
        System.out.println("Introduce la longitud del lado b del triangulo:");
        
        ladoB = entrada.nextDouble();
                
        System.out.println("Introduce la longitud del lado c del triangulo:");
        
        ladoC = entrada.nextDouble();
        
        
        /*
        Comprobar si forman un triangulo, tengo en cuenta que los triangulos
        pueden estar girados, es decir, los lados no tienen un orden
        especifico (lado c en la izquierda en lugar de abajo por ejemplo)
        */
        
        if (((ladoA + ladoB) > ladoC) || ((ladoB + ladoC) > ladoA) || ((ladoC + ladoA) > ladoB)) {
            
            if (ladoA == ladoB && ladoA == ladoC) {
                
                System.out.println("\nLos lados introducidos:\na: " + ladoA + "\nb: " + ladoB + "\nc: " + ladoC);
                
                System.out.println("Forman un triangulo Equilatero");
                
            } else if ((ladoA == ladoB && ladoA != ladoC) || (ladoB == ladoC && ladoB != ladoA) || (ladoC == ladoA && ladoC != ladoB)) {
                
                System.out.println("\nLos lados introducidos:\na: " + ladoA + "\nb: " + ladoB + "\nc: " + ladoC);
                
                System.out.println("Forman un triangulo Isosceles");
                
            } else {
                
                System.out.println("\nLos lados introducidos:\na: " + ladoA + "\nb: " + ladoB + "\nc: " + ladoC);
                
                System.out.println("Forman un triangulo Escaleno");
                
            }
            
        } else {
            
            System.out.println("Los lados introducidos:\nA: " + ladoA + "\nB: " + ladoB + "\nC: " + ladoC + "\nNo forman un triangulo");
            
        }
        
    }
    
}
