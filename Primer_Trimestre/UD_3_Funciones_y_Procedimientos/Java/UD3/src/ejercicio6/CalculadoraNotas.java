package ejercicio6;

import java.util.Scanner;

/**
 * Ejercicio 6
 *
 * @author 03_1DAW, Fran
 */
public class CalculadoraNotas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Introducir las notas
        System.out.print("Introduce la primera nota: ");
        double nota1 = leerNota(teclado);

        System.out.print("Introduce la segunda nota: ");
        double nota2 = leerNota(teclado);

        System.out.print("Introduce la tercera nota: ");
        double nota3 = leerNota(teclado);

        // Calcular la media
        double media = calcularMedia(nota1, nota2, nota3);

        // Obtener la nota máxima
        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);

        // Comprobar si está aprobado
        boolean aprobado = estaAprobado(media);

        // Mostrar resultados
        mostrarResultados(media, maxima, aprobado);
        
        teclado.close();

    }

    // Leer las notas por teclado
    public static double leerNota(Scanner teclado) {

        //Scanner teclado = new Scanner(System.in);

        double nota = teclado.nextDouble();

        return nota;

    }

    // Calcular la media
    public static double calcularMedia(double nota1, double nota2, double nota3) {

        return ((nota1 + nota2 + nota3) / 3);

    }

    // Obtener la maxima
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {

        double maxima = nota1;

        if (nota2 > maxima) {
            maxima = nota2;
        }

        if (nota3 > maxima) {
            maxima = nota3;
        }

        return maxima;

    }

    // Comprobar si esta aprobado
    public static boolean estaAprobado(double media) {

        return media >= 5;

    }

    // Mostrar los resultados
    public static void mostrarResultados(double media, double maxima, boolean aprobado) {

        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota máxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }

    }

}

/*
¿Qué partes del programa podrían convertirse en métodos independientes?
Todas las instrucciones que se repitan o que se quieran tener para reutilizar en el futuro.
 */


 /* 
    Programa monolito del ejercicio para comparar

    Scanner teclado = new Scanner(System.in);

        // Introducir las notas
        System.out.print("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = teclado.nextDouble();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3;

        // Obtener la nota máxima
        double maxima = nota1;

        if (nota2 > maxima) {
            maxima = nota2;
        }

        if (nota3 > maxima) {
            maxima = nota3;
        }

        // Comprobar si está aprobado
        boolean aprobado = media >= 5;

        // Mostrar resultados
        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota máxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }

        teclado.close();
 */
