package ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 5 Calculadora
 *
 * @author 03_1DAW
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        // Variable
        double num1, num2;

        int seleccionarMenu;

        // Pedir los datos al usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");

        num1 = entrada.nextDouble();

        System.out.println("Introduce el segundo numero:");

        num2 = entrada.nextDouble();

        // Todas las operaciones se hacen en el mismo orden num1 "operacion" num2
        System.out.println("Introduce la operacion que quiere realizar:\n 1-Suma(numero 1 + numero 2)\n 2-Resta(numero1 - numero 2)\n 3-Multiplicacion(numero 1 * numero 2)\n 4-Division(numero 1 / numero 2)\n 5-Principal(3 Multiplicaciones)");

        seleccionarMenu = entrada.nextInt();

        // Comprobamos si el divisor es 0
        if (num2 == 0 && seleccionarMenu == 4) {
            System.out.println("No se puede dividir entre 0\n");
        } else {
            // Menu calculadora
            switch (seleccionarMenu) {

                case 1:

                    System.out.println("Has seleccionado la suma");

                    double suma = sumarNumeros(num1, num2);

                    System.out.println(num1 + " + " + num2 + " : " + suma);

                    break;

                case 2:

                    System.out.println("Has seleccionado la resta");

                    double resta = restarNumeros(num1, num2);

                    System.out.println(num1 + " - " + num2 + " : " + resta);

                    break;

                case 3:

                    System.out.println("Has seleccionado la multiplicacion");

                    double multiplicacion = multiplicarNumeros(num1, num2);

                    System.out.println(num1 + " + " + num2 + " : " + multiplicacion);

                    break;

                case 4:

                    System.out.println("Has seleccionado la division");

                    double division = dividirNumeros(num1, num2);

                    System.out.println(num1 + " / " + num2 + " : " + division);

                    break;

                case 5:

                    // Tambien se puede hacer con un switch para que me seleccione la multiplicacion que quieres hacer
                    /*
                    System.out.println("Has seleccionado las 3 multiplicaciones");
                    
                    System.out.println("Introduce el tercer numero:");
                    
                    int num3 = entrada.nextInt();
                    
                    double multi1 = multiplicarNumeros(num1, num2);
                    
                    int multi2 = multiplicarNumeros((int)num1, (int)num2);
                    
                    int multi3 = multiplicarNumeros((int)num1, (int)num2, (int)num3);
                    
                    System.out.println("multiplicarNumeros(double num1, double num2): " + multi1);
                    
                    System.out.println("multiplicarNumeros(int num1, int num2): " + multi2);
                    
                    System.out.println("multiplicarNumeros(int num1, int num2, int num3): " + multi3);
                     */
                    
                    System.out.println("\nSelecciona la multiplicacion que quiere hacer:\n 1- 2 parametros\n 2- 2 parametros enteros\n 3- 3 parametros");

                    int opcionMultiplicacion = entrada.nextInt();

                    switch (opcionMultiplicacion) {

                        case 1:
                            System.out.println("Has seleccionado la primera multiplicarNumeros(double num1, double num2):");
                            
                            System.out.println(multiplicarNumeros(num1, num2));
                            
                            break;
                        case 2:
                            System.out.println("Has seleccionado la segunda multiplicarNumeros(int num1, int num2):");
                            
                            System.out.println(multiplicarNumeros((int) num1, (int) num2));
                            
                            break;
                        case 3:
                            System.out.println("Has seleccionado la tercera multiplicarNumeros(int num1, int num2, int num3):");

                            System.out.println("Introduce el tercer numero:");

                            int num3 = entrada.nextInt();

                            System.out.println(multiplicarNumeros((int) num1, (int) num2, (int) num3));
                            
                            break;
                        default:
                            System.out.println("No es una multiplicacion valida");
                            
                            break;

                    }

                    break;

                default:

                    System.out.println("No has seleccionado una operacion valida");

                    break;

            }
        }

    }

    public static double sumarNumeros(double num1, double num2) {

        double suma = num1 + num2;

        return suma;

    }

    public static double restarNumeros(double num1, double num2) {

        double resta = num1 - num2;

        return resta;

    }

    // Metodos sobrecargados
    public static double multiplicarNumeros(double num1, double num2) {

        double multiplicacion = num1 * num2;

        return multiplicacion;

    }

    public static int multiplicarNumeros(int num1, int num2) {

        int multiplicacion = num1 * num2;

        return multiplicacion;

    }

    public static int multiplicarNumeros(int num1, int num2, int num3) {

        int multiplicacion = num1 * num2 * num3;

        return multiplicacion;

    }

    public static double dividirNumeros(double num1, double num2) {

        double division = num1 / num2;

        return division;

    }

}
