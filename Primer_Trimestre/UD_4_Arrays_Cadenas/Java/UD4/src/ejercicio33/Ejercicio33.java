package ejercicio33;

import java.util.Scanner;

/**
 * Ejercicio 33
 *
 * @author 03_1DAW
 */
public class Ejercicio33 {

    public static void main(String[] args) {

        // Variable
        String frase;
        
        int numLetras=0, numDigitos=0, numEspacios=0;
        
        int numLetrasMinusculas=0, numLetrasMayusculas=0;

        // Pedir la frase al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la frase:");
        
        frase = entrada.nextLine();
        
        // Operaciones varias
        for (int i=0; i<frase.length(); i++) {
            
            char caracter = frase.charAt(i);
            
            if (Character.isLetter(caracter)) {
                
                numLetras++;
                
                if (Character.isLowerCase(caracter)) numLetrasMinusculas++;
                else if (Character.isUpperCase(caracter)) numLetrasMayusculas++;
            
            }
            else if (Character.isDigit(caracter)) numDigitos++;
            
            else if (Character.isWhitespace(caracter)) numEspacios++;
            
            //else
            
        }
        
        System.out.println("\nLetras: " + numLetras);
        
        System.out.println("Digitos: " + numDigitos);
        
        //System.out.println("Espacios: " + );

    }

}
