
package ejercicio8;

import ejercicio7.Ejercicio7;

/**
 * Ejercicio 8
 * 
 * @author 03_1DAW, fran
 */

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        
        double incremento = 0.05;
        
        double media, contador;
        
        double valorASuperar = 15;
        
        // Mostrar el array
        Ejercicio7.mostrarArray(precios);
        
        // Incrementar los precios
        incrementarArray(precios, incremento);
        
        // Mostar el array
        Ejercicio7.mostrarArray(precios);
        
        // Calcular la media
        media = Ejercicio7.mediaArray(precios);
        
        System.out.println("\nLa media es: " + media);
        
        // Valores a superar 15 euros
        contador = Ejercicio7.arraySuperaValor(precios, valorASuperar);
        
        System.out.println("\nHay " + contador + " valores que superan " + valorASuperar);
    }
    
    public static double[] incrementarArray(double[] numerosArray, double valorIncrementar) {
        
        for (int i=0; i<numerosArray.length; i++) {
            
            numerosArray[i] = numerosArray[i] + (numerosArray[i] * valorIncrementar);
            
        }
        
        return numerosArray;
        
    }
    
}
