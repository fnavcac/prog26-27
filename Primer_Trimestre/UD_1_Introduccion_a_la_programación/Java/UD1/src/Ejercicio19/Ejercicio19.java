package Ejercicio19;

/**
 * Ejercicio 19
 * @author 03_1DAW, Francisco Navarro
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        // Variable
        short a; // El tipo short va desde -32768 a 32767
        
        // Valor inicial y cálculos
        a = 32767;
        
        System.out.println("El valor inicial de a es " + a);
        
        //a = (short)(a + 1);
        a++;
        
        // Mostrar resultados
        System.out.println("El valor final de a es " + a);
        
        System.out.println("El rango de valores se comporta de forma cíclica");
        
    }
    
}
