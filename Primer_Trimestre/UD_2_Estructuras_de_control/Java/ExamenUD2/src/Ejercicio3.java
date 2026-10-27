
import java.util.Scanner;

/**
 * Control de Recarga e Inspección de Código (Dificultad: Alta)
 * 
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Variable
        
        int bateria;
        
        int energiaInyec;
        
        int numCiclos;
        
        // Inicialización
        
        bateria = 10;
        
        numCiclos = 0;
        
        // Pedir datos al usuario y bucle
        
        Scanner entrada = new Scanner(System.in);
        
        /*
        Usamos un while porque no sabemos cuantas iteraciones del bucle hacemos
        a priori
        */
        
        while(bateria < 100) {
            
            System.out.println("El nivel de bateria del robot explorador es: " + bateria + "%");
            
            System.out.println("Introduce el numero de puntos de energia que quiere inyectar:");
            
            energiaInyec = entrada.nextInt();
            
            if(energiaInyec > 30 || energiaInyec < 1) {
                
                System.out.println("Entrada invalida");
                
                continue;
                
            }
            
            bateria += energiaInyec;
            
            numCiclos++;
            
        }
        
        System.out.println("El robot se ha cargado al completo\nNumero de ciclos de recarga: " + numCiclos);
        
    }
    
}
