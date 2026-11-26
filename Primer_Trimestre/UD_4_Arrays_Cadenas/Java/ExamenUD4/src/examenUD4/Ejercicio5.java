
package examenUD4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 03_1DAW
 */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        String palabra;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero de palabras que quiere introducir:");
        
        int tamanioArray = entrada.nextInt();
        
        String[] coleccionPalabras = new String[tamanioArray];
        
        int[] longitudPalabras = new int[tamanioArray];
        
        int[] arrayVocales = new int[tamanioArray];
        
        int numeroVocales = 0;
        
        // Apartado A
        for (int i=0; i < tamanioArray; i++) {
            
            numeroVocales = 0;
            
            palabra = entrada.next();
            
            coleccionPalabras[i] = palabra;
            
            longitudPalabras[i] = palabra.length();
            
            for(int j=0; j<palabra.length(); j++) {
                
                if (palabra.charAt(j) == 'a' || palabra.charAt(j) == 'e' ||
                        palabra.charAt(j) == 'i' || palabra.charAt(j) == 'o'
                        || palabra.charAt(j) == 'u') {
                   
                    numeroVocales++; 
                
                }
                
            }
            
            arrayVocales[i] = numeroVocales;
            
        }
        
        System.out.println(Arrays.toString(coleccionPalabras));
        
        System.out.println(Arrays.toString(longitudPalabras));
        
        
        // Apartado B
        String[] palabrasOrdenadas = new String[tamanioArray];
        
        int vocalesMaxima = arrayVocales[0];
                
        int longitudMaxima = longitudPalabras[0];
        
        int posicionVocalesMaxima = -1;
        
        double longitudMedia;
        
        double suma = 0;
        
        for (int i=0; i<tamanioArray; i++) {
            
            if (vocalesMaxima < arrayVocales[i]) {
                
                vocalesMaxima = arrayVocales[i];
                
                posicionVocalesMaxima = i;
            
            }
            
            if (longitudMaxima < longitudPalabras[i]) longitudMaxima = longitudPalabras[i];
            
            for (int j=0; j<coleccionPalabras[i].length() ; j++) {
                
                suma += coleccionPalabras[i].charAt(i);
                
            }
            
            longitudMedia = suma/coleccionPalabras.length;
            
            if(coleccionPalabras[i].charAt(0) == coleccionPalabras[i].charAt(coleccionPalabras[i].length()-1)){
                
                System.out.println(coleccionPalabras[i] + " empieza y termina por la misma letra");
                
            }
            
        }
        
        System.out.println("\nLa palabra con mas vocales es: " + coleccionPalabras[posicionVocalesMaxima]);
        
        
        // Apartado C
        System.out.println("Introduce una expresion regular:");
        
        Scanner entrada2 = new Scanner(System.in);
        
        String expresion = entrada2.nextLine();
        
        int contador = 0;
        
        for(int i=0; i<coleccionPalabras.length; i++) {
            
            if(coleccionPalabras[i].matches(expresion)) {
                
                System.out.println("La palabra " + coleccionPalabras[i] + " coincide con la expresion regular");
                
                contador++;
                
            }
            
        }
        
        System.out.println("Han coincidido " + contador + " palabras");
        
        
        // Apartado D
        Scanner entrada3 = new Scanner(System.in);
        
        String expresion2 = ".*[aeiouAEIOU]{2}.*";
        
        String expresion3 = "[a-zA-Z]+";
        
        
        System.out.println("Introduce la letra que se quiere comprobar:");
        
        // Para tener la primera letra del string
        char letra = entrada3.nextLine().charAt(0);
        
        for(int i=0; i<coleccionPalabras.length; i++) {
            
            if(coleccionPalabras[i].matches(expresion2)) {
                
                System.out.println("La palabra " + coleccionPalabras[i] + " coincide con la secuencia de 2 vocales");
                
            }
            
            if(coleccionPalabras[i].matches(expresion3)) {
                
                System.out.println("La palabra " + coleccionPalabras[i] + " coincide con la secuencia de solo letras");
                
            }
            
        }
        
    }
    
}
