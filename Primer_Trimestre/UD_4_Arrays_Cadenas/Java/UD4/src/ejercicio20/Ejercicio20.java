
package ejercicio20;

/**
 *
 * @author 03_1DAW, fran
 */

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        // Variables
        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };
        
        // Comienzan en 0 la posicion del array
        int fila = 1, columna = 2; // Segunda fila, tercera columna
        
        int filaModificar = 0, columnaModificar = 0; // Primera fila y columna
        
        int valor = 99;
        
        int suma;
        
        int[] sumaFila;
        
        // Mostrar los calculos en array
        mostrarMatriz(numeros);
        
        
        mostrarFilasColumnas(numeros);
        
        
        mostrarElementoFilaColumna(numeros, fila, columna);
        
        
        modificarElementoFilaColumna(numeros, filaModificar, columnaModificar, valor);
        
        
        mostrarMatriz(numeros);
        
        
        suma = sumarMatriz(numeros);
        
        System.out.println("La suma de todos los valores de la matriz es: " + suma);
        
        
        sumaFila = sumarMatrizFilas(numeros);
        
        mostrarArray(sumaFila);
        
    }
    
    public static void mostrarArray(int[] numeros) {
        
        System.out.println("\nArray:");
        
        for (int n: numeros) {
            
            System.out.print(n + " ");
            
        }
        
    }
    
    public static void mostrarMatriz(int[][] numeros) {
        
        System.out.println("\nMatriz: ");
        
        for(int i=0; i<numeros.length; i++) {
            
            for(int j=0; j<numeros[i].length; j++) {
                
                System.out.print(numeros[i][j] + " ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
    }
    
    public static void mostrarFilasColumnas(int[][] numeros) {
        
        System.out.println("\nFilas: ");
        
        System.out.println(numeros.length);
        
        System.out.println("\nColumnas: ");
        
        for(int i=0; i<numeros.length; i++) {
            
            System.out.println(numeros[i].length);
            
        }
        
    }
    
    public static void mostrarElementoFilaColumna(int[][] numeros, int fila, int columna) {
        
        // Se le suma 1 a la fila y columna porque el array empieza en 0
        System.out.println("\nEl elemento de la fila " + (fila+1) + " y columna " + (columna+1) + " es: " + numeros[fila][columna]);
        
    }
    
    public static void modificarElementoFilaColumna(int[][] numeros, int fila, int columna, int nuevoValor) {
        
        numeros[fila][columna] = nuevoValor;
        
    }
    
    public static int sumarMatriz(int[][] numeros) {
        
        int suma = 0;
        
        for (int i=0; i<numeros.length; i++) {
            
            for (int j=0; j<numeros[i].length; j++) {
                
                suma += numeros[i][j];
                
            }
            
        }
        
        return suma;
        
    }
    
    public static int[] sumarMatrizFilas(int[][] numeros) {
        
        int[] suma = new int[numeros.length];
        
        for (int i=0; i<numeros.length; i++) {
            
            for (int j=0; j<numeros[i].length; j++) {
                
                suma[i] += numeros[i][j];
                
            }
            
        }
        
        return suma;
        
    }
    
}
