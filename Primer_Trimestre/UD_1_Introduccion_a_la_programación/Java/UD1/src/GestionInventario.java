/**
 * Ejercicio 15
 * @author 03_1DAW, Francisco Navarro
 */
public class GestionInventario {
    public static void main(String[] args) {
        
        // Declaración de variables y su tipo
        int cantidadPociones;
        double precioUnitario;
        boolean mochilaLlena;
        
        double oroGuardado; // Oro inicial que tenemos
        
        // Datos iniciales
        oroGuardado = 100.0;
        precioUnitario = 10.0;
        cantidadPociones = 0;
        
        mochilaLlena = false;
        
        // Mostramos los datos iniciales
        System.out.println("\nDatos iniciales");
        System.out.println("\nOro restante: " + oroGuardado);
        System.out.println("Nº pociones en la mochila: " + cantidadPociones);
        System.out.println("Mochila llena: " + mochilaLlena);
        
        // Cálculos
        cantidadPociones = 3;
        
        double precioTotal = precioUnitario * cantidadPociones;
        double oroGuardadoRestante = oroGuardado - precioTotal;
        
        mochilaLlena = cantidadPociones >= 3;
        
        // Mostrar por pantalla el resultado
        System.out.println("\nDatos finales (Se compran 3 pociones)");
        System.out.println("\nOro restante: " + oroGuardadoRestante);
        System.out.println("Nº pociones en la mochila: " + cantidadPociones);
        System.out.println("Mochila llena: " + mochilaLlena);
        
    }
}
