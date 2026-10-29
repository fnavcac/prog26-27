
package ejercicio1;

/**
 * Ejercicio 1 Detectives del código
 * @author 03_1DAW, Francisco Navarro
 */

public class Ejercicio1 {
    
    public static void main(String[] args) {
        // Cálculo 1: Salón
        int base1 = 5;
        int altura1 = 4;
        //int area1 = base1 * altura1;
        
        // Llamada al area con la funcion estatica
        int area1 = calcularAreaRectangulo(base1, altura1);
        
        System.out.println("--- Salón ---");
        
        // Muestra por pantalla mediante el metodo estatico
        mostrarPantalla(base1, altura1, area1);
        
        /*
        System.out.println("Base: " + base1);
        System.out.println("Altura: " + altura1);
        System.out.println("El área es: " + area1 + " m²");
        */

        // Cálculo 2: Cocina
        int base2 = 3;
        int altura2 = 3;
        //int area2 = base2 * altura2;
        
        int area2 = calcularAreaRectangulo(base2, altura2);
        
        System.out.println("--- Cocina ---");
        
        mostrarPantalla(base2, altura2, area2);
        
        /*
        System.out.println("Base: " + base2);
        System.out.println("Altura: " + altura2);
        System.out.println("El área es: " + area2 + " m²");
        */

        // Cálculo 3: Jardín
        int base3 = 10;
        int altura3 = 6;
        //int area3 = base3 * altura3;
        
        int area3 = calcularAreaRectangulo(base3, altura3);
        
        System.out.println("--- Jardín ---");
        
        mostrarPantalla(base3, altura3, area3);
        
        /*
        System.out.println("Base: " + base3);
        System.out.println("Altura: " + altura3);
        System.out.println("El área es: " + area3 + " m²");
        */
    }
    
    /*
    Observamos que se repite tanto el calculo del area como la impresion por
    pantalla, dichas instrucciones repetidas realizan estan en las lineas 15,
    24 y 33, que calculan el area dad por la base y la altura, y la impresion
    por pantalla unicamente varia la base, altura y el area de cada sala.
    */
    
    // Metodo estatico para calcular el area de la sala
    public static int calcularAreaRectangulo(int base, int altura) {
        
        return base * altura;
        
    }
    
    // Metodo estatico para mostrar por pantalla
    public static void mostrarPantalla(int base, int altura, int area) {
        
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("El área es: " + area + " m²");
        
    }
    
}

