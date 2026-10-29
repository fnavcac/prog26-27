
package ejercicio3;

import java.util.Scanner;

/**
 * Ejercicio 3
 * 
 * @author 03_1DAW
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Constantes
        
        final double IVA = 21;
        
        
        // Variables
        
        double precio, precioTotal;
        
        double descuento;
        
        //double porcentajeImpuestos;
        
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el precio del articulo:");
        
        precio = entrada.nextDouble();
        
        
        System.out.println("Introduce el descuento del articulo:");
        
        descuento = entrada.nextDouble();
        
        
        //System.out.println("Introduce el porcentaje de impuestos:");
        
        //porcentajeImpuestos = entrada.nextDouble;
        
        
        // Llamar al metodo
        
        precioTotal = calcularDescuento(precio, descuento, IVA);
        
        
        // Mostar datos al usuario
        
        mostrarDatos(precio, descuento, precioTotal, IVA);
        
    }
    
    public static double calcularDescuento(double precio, double descuento, double IVA) {
        
        double precioDescuento = precio * (1 - (descuento/100));
        
        double precioTotal = (precioDescuento * (1 + (IVA/100)));
        
        return precioTotal;
        
    }
    
    public static void mostrarDatos(double precio, double descuento, double precioTotal, double IVA) {
        
        System.out.println("Ticket");
        System.out.println("==============");
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio Total sin IVA: " + precio * (1 - (descuento/100)));
        System.out.println("IVA: " + IVA + "%");
        System.out.println("Precio Total con IVA: " + precioTotal);
        
    }
    
}
