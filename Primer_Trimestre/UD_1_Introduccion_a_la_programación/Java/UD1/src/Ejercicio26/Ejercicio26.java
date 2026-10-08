package Ejercicio26;

/**
 * Ejercicio 26
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio26 {
    
    public static void main(String[] args) {
        
        // Expresiones a evaluar
        
        boolean  expresion1 = 10 + 5 * 2 > 20 && 4 == 4;
        
        boolean expresion2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        
        boolean expresion3 = 10 / 2 + 3 * 5 == 19 && true;
        
        int x = 5;
        x += 3 * 2;
        
        boolean b = false; b = !b || 7 % 2 == 1;
        
        // Mostrar los resultados de cada expresion
        
        System.out.println("10 + 5 * 2 > 20 && 4 == 4 daria un resultado de " + expresion1);
        System.out.println("Se evaluaria primero la multiplicacion *, despues la suma +, despues la comparacion == y por ultimo el AND &&\n");
        
        System.out.println("!(7 + 3 > 10) || 3 * 2 <= 6 daria un resultado de " + expresion2);
        System.out.println("Se evalua primero la multiplicion *, luego suma +, luego la comparacion <= y > y !, luego el OR ||\n");
        
        System.out.println("10 / 2 + 3 * 5 == 19 && true daria un resultado de " + expresion3);
        System.out.println("Se evalua primero la multiplicacion y division * /, luego la comparacion ==, luego el AND &&\n");
        
        System.out.println("x = 5; x += 3 * 2 daria un resultado de " + x);
        System.out.println("Se evalua primero la multiplicacion *, luego el incremento +=\n");
        
        System.out.println("b = false; b = !b || 7 % 2 == 1 daria un resultado de " + b);
        System.out.println("Se evalua primero el modulo %, luego la comparacion == y !, luego el OR || y luego la asignacion");
        
    }
    
}
