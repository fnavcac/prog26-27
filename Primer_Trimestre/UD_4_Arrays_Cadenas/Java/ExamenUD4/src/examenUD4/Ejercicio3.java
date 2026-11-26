
package examenUD4;

import java.util.Scanner;

/**
 *
 * @author 03_1DAW
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Variables
        
        double[][] temperaturas = new double[3][4];
        
        double mediaLocalidad, sumaLocalidad=0, maxima;
        
        double sumaDia=0, mediaDia;
        
        // Las inicializo en -1 pero realmente no van a tener este valor despues de recorrer la matriz
        int posicionIMaxima=-1, posicionJMaxima=-1;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<temperaturas.length; i++) {
            
            for (int j=0; j<temperaturas[i].length; j++) {
                
                System.out.println("Introduce la temperatura de la localidad " + (i+1) + " dia " + (j+1) + ":");
                
                double temperatura = entrada.nextDouble();
                
                temperaturas[i][j] = temperatura;
                
            }
            
        }
        
        
        // Mostrar la matriz y operaciones varias
        
        System.out.println("\t\tTemperaturas");
        
        maxima = temperaturas[0][0];
        
        for (int i=0; i<temperaturas.length; i++) {
            
            System.out.print("\nLocalidad " + (i+1));
            
            // Calculo la media de cada localidad en este bucle
            sumaLocalidad = 0;
            
            for (int j=0; j<temperaturas[i].length; j++) {
                
                System.out.print(" " + temperaturas[i][j]);
                
                sumaLocalidad += temperaturas[i][j];
                
                // Calculo y muestro la maxima
                if (temperaturas[i][j] > maxima) {
                    
                    maxima = temperaturas[i][j];
                    
                    posicionIMaxima = i;
                    
                    posicionJMaxima = j;
                
                }
                
            }
            
            mediaLocalidad = sumaLocalidad/temperaturas[i].length;
            
            System.out.println("\nLa temperatura media de la localidad " + (i+1) + " es: " + mediaLocalidad);
            
        }
        
        System.out.println("\nLa temperatura maxima es: " + maxima + " y se consiguio en la localidad " + (posicionIMaxima+1) + " dia " + (posicionJMaxima+1));
     
        
        // Temperatura media en cada dia
        for (int j=0; j<temperaturas[0].length; j++) {
            
            for(int i=0; i<temperaturas.length; i++) {
                
                sumaDia += temperaturas[i][j];
                
            }
            
            mediaDia = sumaDia/temperaturas.length;
            
            System.out.println("\nLa temperatura media del dia " + (j+1) + " es " + mediaDia);
            
        }
        
    }
      
}
