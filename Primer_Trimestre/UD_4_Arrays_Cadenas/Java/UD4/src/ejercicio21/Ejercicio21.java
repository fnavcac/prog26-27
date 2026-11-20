
package ejercicio21;

/**
 * Ejercicio21
 * 
 * @author 03_1DAW
 */

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        // Variables
        double[][] notas = {
            {7.0, 8.0, 6.0},
            {4.0, 5.0, 6.0},
            {9.0, 8.5, 10.0},
            {5.0, 6.0, 7.0}
        };
        
        double[] sumasColumna;
        
        double[] sumasFilas;
        
        int numeroAlumno;
        
        double mediaAlumno;
        
        // Operaciones varias
        mostrarMatrizAlumno(notas);
        
        for (int i=0; i< notas.length; i++) {
            
            System.out.println("\nAlumno " + (i+1));
            
            System.out.println("Media: " + mediaArray(notas[i]));
            
        }
        
        sumasColumna = sumarMatrizColumnasRectangular(notas);
        
        for (int i=0; i<sumasColumna.length; i++) {
            
            System.out.println("\nMedia evaliacion " + (i+1));
            
            System.out.println(sumasColumna[i]/notas.length);
            
        }
        
        numeroMasAltoMatriz(notas);
        
        
        numeroAlumno = 1; // Selecciono este alumno de forma arbitraria, lo puedo pedir por teclado tambien
        
        sumasFilas = sumarMatrizFilas(notas);
        
        mediaAlumno = sumasFilas[numeroAlumno]/notas[numeroAlumno].length;
        
        System.out.println("\nLa media del alumno " + (numeroAlumno+1) + " es: " + mediaAlumno);
        
    }
    
    public static void mostrarMatrizAlumno(double[][] numeros) {
        
        System.out.println("\nMatriz: ");
        
        for(int i=0; i<numeros.length; i++) {
            
            System.out.println("Alumno " + (i+1));
            
            for(int j=0; j<numeros[i].length; j++) {
                
                System.out.println("Evaluacion " + (j+1));
                
                System.out.println(numeros[i][j]);
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
    }
            
    public static double[] sumarMatrizFilas(double[][] numeros) {
        
        double[] suma = new double[numeros.length];
        
        for (int i=0; i<numeros.length; i++) {
            
            for (int j=0; j<numeros[i].length; j++) {
                
                suma[i] += numeros[i][j];
                
            }
            
        }
        
        return suma;
        
    }
    
    public static double[] sumarMatrizColumnasRectangular(double[][] numeros) {
        
        double[] suma = new double[numeros[0].length];
        
        for (int j=0; j<numeros[0].length; j++) {
            
            for (int i=0; i<numeros.length; i++) {
                
                suma[j] += numeros[i][j];
                
            }
            
        }
        
        return suma;
        
    }
    
    public static double mediaArray(double[] numeros) {
        
        double media;
        
        double suma = 0;
        
        for (int i=0; i<numeros.length; i++) {
            
            suma += numeros[i];
            
        }
        
        media = suma / numeros.length;
        
        return media;
        
    }
    
    public static void numeroMasAltoMatriz(double[][] numeros) {
        
        double maximo = numeros[0][0];
        
        for (int i=0; i<numeros.length; i++) {
            
            for (int j=0; j<numeros[i].length; j++) {
                
                if (maximo < numeros[i][j]) maximo = numeros[i][j];
                
            }
            
        }
        
        System.out.println("\nEl numero maximo es: " + maximo);
        
    }
    
}
