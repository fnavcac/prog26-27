

/**
 * El Generador de Frecuencias de Radio (Dificultad: Media)
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        // Bucle
        
        /*
        Usamos un bucle for porque sabemos el rango definido
        */
        
        for(int i = 100; i<=150; i++) {
            
            if(i % 5 == 0) continue; // Es una frecuencia saturada
            
            if(i == 137) { // Es la frecuencia de socorro
                
                System.out.println("¡Frecuencia de socorro 137 hallada! Deteniendo el escaneo");
                
                break;
            }
            
            System.out.println("Sintonizando frecuencia: " + i);
            
        }
        
    }
    
}
