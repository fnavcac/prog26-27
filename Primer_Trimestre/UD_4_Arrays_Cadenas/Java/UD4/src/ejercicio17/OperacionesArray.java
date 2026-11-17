
package ejercicio17;

/**
 * Ejercicio 17
 * 
 * @author 03_1DAW
 */

public class OperacionesArray {
    
    public static void main(String[] args) {
        
        // Variables
        int[] arrayPrueba = {1, 2, 3, 4, 5};
        
        double suma, media;
        
        int maximo, numeroPares;
        
        int valorBuscar, posicion;
        
        // Calculos
        mostrar(arrayPrueba);
        
        suma = sumar(arrayPrueba);
        
        media = calcularMedia(arrayPrueba);
        
        maximo = obtenerMaximo(arrayPrueba);
        
        numeroPares = contarPares(arrayPrueba);
        
        
        valorBuscar = 4;
        
        posicion = primeraPosicion(arrayPrueba, valorBuscar);
        
        // Mostrar los resultados
        System.out.println("\nLa suma es: " + suma);
        
        System.out.println("La media es: " + media);
        
        System.out.println("El maximo es: " + maximo);
        
        System.out.println("El numero de pares es: " + numeroPares);
        
        System.out.println("El numero " + valorBuscar + " esta en la posicion " + posicion);
        
    }
    
    // Metodos estaticos para las distintas operaciones
    
    public static void mostrar(int[] numeros) {
        
        for (int n: numeros) {
            
            System.out.print(n + " ");
            
        }
        
    }
    
    public static double sumar(int[] numeros) {
        
        if (numeros == null) return 0;
        
        double suma = 0;
        
        for (int i=0; i<numeros.length; i++) {
            
            suma += numeros[i];
            
        }
        
        return suma;
        
    }
    
    public static double calcularMedia(int[] numeros) {
        
        if (numeros == null) return 0;
        
        double suma = 0;
        
        double media;
        
        int contador = 0;
        
        for (int i=0; i<numeros.length; i++) {
            
            suma = sumar(numeros);
            
            contador++;
            
        }
        
        media = suma/contador;
        
        return media;
        
    }
    
    public static int obtenerMaximo(int[] numeros) {
        
        if (numeros == null) return 0;
        
        int maximo = numeros[0];
        
        for (int i=0; i<numeros.length; i++) {
            
            if (maximo <= numeros[i]) maximo = numeros[i];
            
        }
        
        return maximo;
        
    }
    
    public static int contarPares(int[] numeros) {
        
        if (numeros == null) return 0;
        
        int contadorPares = 0;
        
        for (int n: numeros) {
            
            if (n % 2 == 0) contadorPares++;
            
        }
        
        return contadorPares;
        
    }
    
    public static int primeraPosicion(int[] numeros, int valorBuscado) {
        
        if (numeros == null) return -1;
        
        int posicion = -1;
        
        for (int i=0; i<numeros.length; i++) {
            
            if (valorBuscado == numeros[i]) {
                
                posicion = i;
                
                break;
                
            }
            
        }
        
        return posicion;
        
    }
    
}
