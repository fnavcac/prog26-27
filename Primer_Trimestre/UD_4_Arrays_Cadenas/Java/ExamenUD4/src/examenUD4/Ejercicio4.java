
package examenUD4;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        String palabra;
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<5; i++) {
            
            System.out.print("\nIntroduce una palabra: ");
            
            palabra = entrada.next();
            
            if(palabra.matches("[a-z]{3,8}")) {
                
                System.out.println("La palabra cumple el patron");
                
            } else {
                
                System.out.println("La palabra no cumple el patron");
                
            }
            
        }
        
    }
    
}
