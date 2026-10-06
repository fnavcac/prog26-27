package Ejercicio17;

/**
 * Nivel 1
 * @author 03_1DAW, Francisco Navarro
 */
public class CalculoDescuento {
    
    public static void main(String[] args) {
        
        // Constantes, declaradas e inicializadas
        final double DESCUENTO = 0.15; // 15%
        
        // Variables, declaradas e inicializadas
        double precioInicial = 120;
        
        // Mostrar por pantalla el precio inicial
        System.out.println("Precio Inicial de la armadura: " + precioInicial);
        
        // Cálculos
        double precioFinal = precioInicial - (precioInicial * DESCUENTO);
        
        
        // Mostrar por pantalla el precio final
        System.out.println("Precio Final de la armadura (Descuento 15%): " + precioFinal);
        
        
    }
    
}
