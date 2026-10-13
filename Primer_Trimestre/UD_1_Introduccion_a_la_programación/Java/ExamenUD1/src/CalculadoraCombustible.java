
/**
 * ================================================================================
 *
 *                   EVALUACIÓN PRÁCTICA INDIVIDUAL - UD1
 *
 *          SISTEMA DE CÁLCULO DE COMBUSTIBLE "MISIÓN ARTEMIS-X"
 *
 * ================================================================================
 * @author 03_1DAW, Francisco Navarro
 * @version 1.0
 */

public class CalculadoraCombustible {
    
    /* Contexto del problema
    Eres el/la responsable del software de vuelo de la agencia espacial. Debes programar
    un módulo en Java que calcule el combustible exacto necesario para el lanzamiento 
    del cohete Artemis-X, aplique los márgenes de seguridad y convierta los importes
    finales a presupuestos enteros para el departamento de contabilidad
    */
    
    public static void main(String[] args) {
        
        /*
        El problema se va a realizar suponiendo que ya se tienen los datos, no hace falta introducirlos por pantalla.
        En este caso la distancia será de 4803 y el precio por litro será de 2.35 para que se aprecie el truncado.
        */
        
        // Inicialización y Declaración de Constantes (Valores que no van a cambiar durante la ejecución)
        
        final double CONSUMO_POR_KM = 14.75; // litros por kilómetro
        
        final int RESERVA_SEGURIDAD = 500; // litros extras
        
        
        // Inicialización y Declaración de Variables iniciales
        
        int distanciaKm = 4803; // La distancia a la estación espacial que suponemos, uso el del enunciado + 3 km
        
        double precioLitro = 2.35; // Precio del combustible estelar que suponemos, uso el del enunciado
        
        double litrosTotalesExactos, costeTotalExacto; // Valores que obtenemos con los cálculos
        
        int litrosOficialesComprar, costePresupuestado;  // Valores truncados
        
        
        // Cálculos
        
        //Nos daría un resultado en decimal
        litrosTotalesExactos = (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;
        
        costeTotalExacto = litrosTotalesExactos * precioLitro;
        
        
        // Casting explícito (En este caso hay pérdida de información por pasar de decimal a entero)
        
        litrosOficialesComprar = (int) litrosTotalesExactos;
        
        costePresupuestado = (int) costeTotalExacto;
        
        
        // Mostrar los resultados por pantalla
        
        System.out.println("Informe de costes");
        System.out.println("----------------------------------");
        System.out.println("Distancia a la estación espacial: " + distanciaKm);
        System.out.println("Precio del combustible estelar: " + precioLitro);
        System.out.println("----------------------------------");
        System.out.println("Valores exactos");
        System.out.println("Litros exactos necesarios: "  + litrosTotalesExactos);
        System.out.println("Coste total exacto: " + costeTotalExacto);
        System.out.println("----------------------------------");
        System.out.println("Valores truncados");
        System.out.println("Litros totales para comprar: " + litrosOficialesComprar);
        System.out.println("Coste total: " + costePresupuestado);
        System.out.println("----------------------------------");
        
    }
    
}
