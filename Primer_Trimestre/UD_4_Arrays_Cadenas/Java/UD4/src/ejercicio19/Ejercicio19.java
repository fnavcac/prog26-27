package ejercicio19;

import java.util.Scanner;

/**
 * Ejercicio 19
 *
 * @author 03_1DAW, fran
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        // Variable
        double[] notas = {4.5, 7.0, 8.5, 3.0, 6.5, 9.0};

        double media, notaMaxima, notaBuscar;

        int numeroAprobados;

        double[] aprobados;

        // Distintas operaciones
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota que quiere buscar:");

        notaBuscar = entrada.nextDouble();

        mostrar(notas);

        media = calcularMedia(notas);

        System.out.println("\nLa media es: " + media);

        numeroAprobados = contarAprobados(notas);

        System.out.println("El numero de aprobados es: " + numeroAprobados);

        notaMaxima = obtenerMaximo(notas);

        System.out.println("La nota maxima es: " + notaMaxima);

        buscarNumero(notas, notaBuscar);

        aprobados = arrayAprobados(notas);

        mostrar(aprobados);

    }

    public static void mostrar(double[] numeros) {

        for (double n : numeros) {

            System.out.print(n + " ");

        }

    }

    public static double sumar(double[] numeros) {

        if (numeros == null) {
            return 0;
        }

        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];

        }

        return suma;

    }

    public static double calcularMedia(double[] numeros) {

        if (numeros == null) {
            return 0;
        }

        double suma;

        double media;

        suma = sumar(numeros);

        media = suma / numeros.length;

        return media;

    }

    public static int contarAprobados(double[] numeros) {

        int numeroAprobados = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] >= 5) {
                numeroAprobados++;
            }

        }

        return numeroAprobados;

    }

    public static double obtenerMaximo(double[] numeros) {

        if (numeros == null) {
            return 0;
        }

        double maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (maximo <= numeros[i]) {
                maximo = numeros[i];
            }

        }

        return maximo;

    }

    public static void buscarNumero(double[] numeros, double numeroBuscar) {

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numeroBuscar) {

                encontrado = true;

                System.out.println("La nota " + numeroBuscar + " esta en la posicion " + i);

                break;
            }

        }

        if (!encontrado) {
            System.out.println("No esta la nota buscada");
        }

    }

    public static double[] arrayAprobados(double[] numeros) {

        int numeroAprobados = 0;
        
        int j = 0; // Indice de arrayAprobados

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] >= 5) {
                
                numeroAprobados++;
            
            }

        }

        double[] arrayAprobados = new double[numeroAprobados];
        
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] >= 5) {
                
                arrayAprobados[j] = numeros[i];
                
                j++;
            }
            
        }

        return arrayAprobados;

    }

}
