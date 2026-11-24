
package ejercicio31;

import java.util.Scanner;

/**
 * Ejercicio 31
 * 
 * @author fran
 */

public class Ejercicio31 {
    
    public static void main(String[] args) {
        
        String correo;
        
        boolean tieneArroba = false, tienePunto = false, tieneEspacios = false;
        
        int posicionArroba = -1;
        
        String nombreUsuario, dominio;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la direccion de correos:");
        
        correo = entrada.nextLine();
        
        
        System.out.println("\nCorreo original: " + correo);
        
        correo = correo.strip();
        
        System.out.println("Correo sin espacios: " + correo);
        
        
        correo = correo.toLowerCase();
        
        System.out.println("Correo en minusculas: " + correo);
        
        for (int i=0; i<correo.length();i++) {
                
            if(correo.charAt(i) == '@') {
            
                tieneArroba= true;
                
                posicionArroba = i;
                      
            }
            
            if(posicionArroba != -1 && i > posicionArroba && correo.charAt(i) == '.') {
                
                tienePunto = true;
                
            }
            
            if(correo.charAt(i) == ' ') {
                
                tieneEspacios = true;
                
            }
                
        }
        
        
        System.out.println("Correo tiene @? " + tieneArroba);
        
        System.out.println("Correo tiene . despues de @? " + tienePunto);
        
        System.out.println("Correo tiene espacios? " + tieneEspacios);
        
        
        nombreUsuario = correo.substring(0, posicionArroba);
        
        dominio = correo.substring(posicionArroba + 1, correo.length());
        
        System.out.println("\nNombre usuario: " + nombreUsuario);
        
        System.out.println("Dominio: " + dominio);
        
    }
    
}
