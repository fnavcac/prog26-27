
package ejercicio3;

import java.util.Scanner;

/**
 * Ejercicio 3
 * 
 * @author 03_1DAW
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Variable
        double[] precios = new double[5];
        
        int indiceModificar;
        
        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println("Introduce el precio del producto:");
            
            precios[i] = entrada.nextDouble();
            
        }
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
        System.out.println("Introduce el valor que quieres modificar (0-4):");

        indiceModificar = entrada.nextInt();
        
        if(indiceModificar > precios.length || indiceModificar < 0) {
            
            System.out.println("Esta fuera de rango\n");
            
        } else{
            
            System.out.println("Introduce el nuevo precio:");
        
            precios[indiceModificar] = entrada.nextDouble();
            
        }
        
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
        // Para aplicarle el IVA (Ampliacion)
        for (int i=0; i<precios.length; i++) {
            
            precios[i] = precios[i] * 1.21;
            
        }
        
        for (int i=0; i<precios.length; i++) {
            
            System.out.println(precios[i]);
            
        }
        
    }
    
}
