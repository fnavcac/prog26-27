
package ejemplos;

/**
 * Ejemplo array
 * 
 * @author 03_1DAW
 */

public class EjemploArrays {
    
    public static void main(String[] args) {
        
        double[] temperaturas = {18.5, 21.0, 24.5, 19.0, 27.5};
        
        //temperaturas = new double[] {18.5, 21.0, 24.5, 19.0, 27.5};
        
        System.out.println("Temperaturas: " + temperaturas);
        
        for(int i=0; i < temperaturas.length; i++){
            
            System.out.println("Día " + (i+1) + " - " + temperaturas[i]);
            
        }
        
        temperaturas[1] = 22.0;
        
        //temperaturas[5] = 26.0; // Da Error
        
        System.out.println(temperaturas[1]);
        
    }
    
}
