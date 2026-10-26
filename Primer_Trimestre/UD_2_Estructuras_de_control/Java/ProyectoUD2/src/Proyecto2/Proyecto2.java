
package Proyecto2;

import java.util.Scanner;

/**
 * Un malware ha bloqueado el servidor central del centro. Para desbloquearlo y
 * escapar de la terminal, tendréis que programar por parejas un minijuego
 * interactivo en consola. Pero cuidado: el sistema tiene fallos que solo
 * podréis corregir usando las herramientas de inspección del entorno
 * (NetBeans Debugger).
 * 
 * @author 03_1DAW, 20_1DAW
 */

public class Proyecto2 {
    
    public static void main(String[] args) {
        
        // Variables
        
        int seleccionador;
        
        int seleccionSala, seleccionInventario;
        
        boolean estaMenu; // Para ver si esta dentro del menu
        
        boolean tenerLlave; // Tener llave
        
        boolean primerHackeo; // El primer hackeo falla
        
        boolean estaHackeado; // Condicion final de hackeo compleatado
        
        
        // Inicializamos
        
        estaMenu = true;
        
        tenerLlave = false; // No tenemos la llave
        
        primerHackeo = true; // Es el primer hackeo
        
        estaHackeado = false; // No esta hackeado
        
        
        // Pedir los datos al usuario y bucles, condicionales
        
        Scanner entrada = new Scanner(System.in);
        
        while(estaMenu) {
            
            System.out.println("\nIntroduce la selección del menú principal:\n(1.Explorar sala, 2.Inventario, 3.Hackear puerta, 0.Salir del menú)");
            
            seleccionador = entrada.nextInt();
        
            switch (seleccionador) {
            
                case 1:
                
                    System.out.println("Se ha seleccionado 1.Explorar sala");
                
                    System.out.println("¿Qué quiere hacer?\n(1.Investiga sala, 2.Buscar objetos)");
                
                    seleccionSala = entrada.nextInt();
                
                    if(seleccionSala == 1) {
                    
                        System.out.println("Ves una sala grande con varios objetos en el suelo y una puerta.");
                    
                    } else if (seleccionSala == 2) {
                    
                        System.out.println("Coges una llave reluciente.");
                        
                        tenerLlave = true;
                    
                    } else {
                    
                        System.out.println("Has salido de la sala.");
                    
                    }
                
                    break;
                
                case 2:

                    System.out.println("Se ha seleccionado 2.Inventario");
                    
                    System.out.println("¿Qué quiere hacer?\n(1.Abrir inventario, 2.Sacar llave)");
                    
                    seleccionInventario = entrada.nextInt();
                    
                    if(seleccionInventario == 1) {
                    
                        System.out.println("(Ves tu inventario) Tienes un cuchillo y  Llave: " + tenerLlave);
                    
                    } else if (seleccionInventario == 2) {
                    
                        System.out.println("Sacas la llave.");
                    
                    } else {
                    
                        System.out.println("Ha salido del inventario.");
                    
                    }

                    break;
            
                case 3:

                    System.out.println("Se ha seleccionado 3.Hackear puerta");
                    
                    if (tenerLlave) {
                        
                        System.out.println("Inicio del hackeo.\nProgreso:");
                        
                        for (int i = 0; i <= 100; i += 10){
                            
                            if (i == 10) continue;
                            
                            System.out.println(i + "%");
                            
                            if (primerHackeo) {
                                
                                System.out.println("Ha fallado el hackeo.\nVuelve a intentarlo.");
                                
                                primerHackeo = false;
                                
                                break;
                                
                            }
                            
                            estaHackeado = true;
                            
                        }
                        
                        if(estaHackeado) System.out.println("Hackeo completado.\nHas podido escapar.");
                        
                    } else {
                        
                        System.out.println("No ves forma de hackear la puerta sin una llave.");
                        
                    }

                    break;
                    
                case 0:

                    System.out.println("Se ha seleccionado 0.Salir del menú (Juego)");
                    
                    estaMenu = false;

                    break;

                default:

                    System.out.println("No se ha seleccionado un valor válido.");

                    break;
            }
            
        }
            
            
        
    }
    
}
