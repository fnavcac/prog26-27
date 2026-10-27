
import java.util.Scanner;

/**
 * El Escáner de Seguridad (Dificultad: Baja)
 * 
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */
public class Ejercicio1 {
    
    /**
     * Clase principal del ejercicio 1 del examen de la unidad 2
     * Nos pide que introduzcamos el tipo de nave con el que queremos
     * acceder.
     */
    
    public static void main(String[] args) {
        
        // Variables
        
        int numIntroducido;
        
        int tonelaje;
        
        
        // Pedir datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el codigo de la nave:\n(1:Nave Aliada, 2:Nave Comercial, 3:Nave Desconocida, 4:Nave Hostil)");
        
        numIntroducido = entrada.nextInt();
        
        
        // Seleccionador y condicionales
        
        switch(numIntroducido) {
            /*
            Nos permite seleccionar la impresion que sale por pantalla en
            funcion de la nave seleccionada, evaluando cada caso.
            */
            
            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;
            case 2:
                System.out.println("Acceso concedido: Hangar de Carga");
                
                /*
                Si se ha elegido una nave comercial se pide el tonelaje al
                usuario para ver si requiere inspeccion aduanera
                */
                
                System.out.println("Introduce el tonelaje de carga:");
                
                tonelaje = entrada.nextInt();
                
                if(tonelaje>500) System.out.println("Requiere inspeccion aduanera");
                
                break;
            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;
            case 4:
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;
            default:
                System.out.println("Codigo no valido");
                break;
            
        }
        
    }
    
}
