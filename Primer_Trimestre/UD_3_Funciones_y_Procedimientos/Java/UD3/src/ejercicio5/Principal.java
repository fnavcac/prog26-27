
package ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 5 parte 2
 * 
 * @author 03_1DAW, Francisco Navarro
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Variables
        
        double num1, num2, num3;
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Este programa va a hacer las 3 multiplicaciones:");
        
        System.out.println("Introduce el primer numero:");
        
        num1 = entrada.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        
        num2 = entrada.nextDouble();
        
        System.out.println("Introduce el tercer numero:");
        
        num3 = entrada.nextDouble();
        
        
        // Se invocan los tres metodos y se muestran por pantalla
        
        System.out.println("Se va a realizar la primera multiplicacion\n (multiplicarNumeros(double num1, double num2))");
        
        System.out.println(Ejercicio5.multiplicarNumeros(num1, num2));
        
        System.out.println("\nSe va a realizar la segunda multiplicacion\n (multiplicarNumeros(int num1, int num2))");
        
        System.out.println(Ejercicio5.multiplicarNumeros((int)num1, (int)num2));
        
        System.out.println("\nSe va a realizar la tercera multiplicacion\n (multiplicarNumeros(int num1, int num2, int num3))");
        
        System.out.println(Ejercicio5.multiplicarNumeros((int)num1, (int)num2, (int)num3));
        
        /*
        
        1. ¿Qué tienen en común los tres métodos?
        Los tres metodos tienen el mismo nombre pero distintos parametros.
        
        2. ¿En qué se diferencian sus listas de parámetros?
        En los tipos que son y en la multiplicacion que tiene tres en lugar de 2.
        
        3. ¿Cómo decide Java qué método debe ejecutar?
        En funcion de los argumentos que recibe, su tipo y numero
        
        4. ¿Qué sucedería si intentáramos declarar dos métodos multiplicar(int, int) con tipos de retorno diferentes?
        Que nos daria error porque ya existe ese metodo.
        
        5. ¿Qué ventajas ofrece utilizar el mismo nombre para estas operaciones?
        Que asi no creamos para cada metodo un nombre distinto.
        
        */
    }
    
}
