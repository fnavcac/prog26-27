
package ejercicio9;

import java.util.Scanner;

/**
 * Ejercicio 9
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] notasAlumnos = new double[10];
        
        int contador, contadorSuspensos;
        
        double porcentaje;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<notasAlumnos.length; i++) {
            
            System.out.println("Introduce el valor:");
            
            notasAlumnos[i] = entrada.nextDouble();
            
        }
        
        // Calcular el numero de suspenso
        contadorSuspensos = arrayEntreValores(notasAlumnos, 0.0, 5.0);
        
        System.out.println("El numero de alumnos suspensos es: " + contadorSuspensos);
        
        // Calcular el numero de aprobados
        contador = arrayEntreValores(notasAlumnos, 5.0, 7.0);
        
        System.out.println("El numero de alumnos aprobados es: " + contador);
        
        // Calcular el numero de notables
        contador = arrayEntreValores(notasAlumnos, 7.0, 9.0);
        
        System.out.println("El numero de alumnos notables es: " + contador);
        
        // Calcular el numero de sibresalientes
        contador = arrayEntreValores(notasAlumnos, 9.0, 10.0);
        
        System.out.println("El numero de alumnos sobresalientes es: " + contador);
        
        // Porcentaje de aprobados
        porcentaje = ((notasAlumnos.length - contadorSuspensos) * 100) / notasAlumnos.length;
        
        System.out.println("El porcentaje de alumnos aprobados es: " + porcentaje + "%");
        
    }
    
    // El valor minimo esta incluido, el maximo no
    public static int arrayEntreValores(double[] numerosArray, double valorMinimo, double valorMaximo) {
        
      int contador = 0;
      
      for (int i=0; i<numerosArray.length; i++) {
          
          if(numerosArray[i] >= valorMinimo && numerosArray[i] < valorMaximo) contador++;
          
      }
      
      return contador;
        
    }
    
}
