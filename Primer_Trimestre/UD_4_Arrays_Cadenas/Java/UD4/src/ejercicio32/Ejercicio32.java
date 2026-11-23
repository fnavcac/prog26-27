
package ejercicio32;

import java.util.Scanner;

/**
 * Ejercicio 32
 * 
 * @author 03_1DAW
 */

public class Ejercicio32 {
    
    public static void main(String[] args) {
        
        // Variable
        String frase;
        
        int contador = 0, contadorA = 0, contadorE = 0, contadorI = 0,
                contadorO = 0, contadorU = 0;
        
        // Pedir los datos
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la frase:");
        
        frase = entrada.nextLine();
        
        // Operaciones varias
        frase = frase.toLowerCase();
        
        for (int i=0; i < frase.length(); i++) {
            
            char caracter = frase.charAt(i);
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' 
                    || caracter == 'o' || caracter == 'u') {
                
                contador++;
                
            } 
            if (caracter == 'a') contadorA++;
            
            if (caracter == 'e') contadorE++;
            
            if (caracter == 'i') contadorI++;
            
            if (caracter == 'o') contadorO++;
            
            if (caracter == 'u') contadorU++;
            
        }
        
        System.out.println("Numeros vocales: " + contador);
            
        System.out.println("Numeros vocal a: " + contadorA);
            
        System.out.println("Numeros vocal e: " + contadorE);
            
        System.out.println("Numeros vocal i: " + contadorI);
            
        System.out.println("Numeros vocal o: " + contadorO);
            
        System.out.println("Numeros vocal u: " + contadorU);
        
    }
            
    
}
