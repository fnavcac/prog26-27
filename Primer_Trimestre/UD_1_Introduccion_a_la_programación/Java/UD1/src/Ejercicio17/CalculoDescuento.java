package Ejercicio17;

/**
 * Nivel 1
 * @author 03_1DAW, Francisco Navarro
 */
public class CalculoDescuento {
    
    public static void main(String[] args) {
        
        // Constantes
        final double DESCUENTO = 0.15;
        
        // Variables
        double precioInicial = 120;
        
        System.out.println("Precio Inicial de la armadura: " + precioInicial);
        
        // Cálculos
        double precioFinal = precioInicial - (precioInicial * DESCUENTO);
        
        System.out.println("Precio Final de la armadura (Descuento 15%): " + precioFinal);
        
        
    }
    
}
