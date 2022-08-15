package chapter_4;

import java.util.Scanner;

public class ER_Y_OU_Contador {

    public static void main(String[] args) {

        // Estructura de repetición controlada por un contador.
        // Operador unario de tipo de dato:
        // El operador unario sirve para hacer la conversión de un tipo de datos a otro de un determinado valor. Por ejemplo:
        // Objeto de la Clase Scanner
        Scanner entrada = new Scanner(System.in);
        // variables globales
        int contador = 1;
        double calificacion = 0.0;
        int total = 0;
        // mostrar mensaje por pantalla
        System.out.printf("Calcula tu promedio con ayuda del sig. programa.%n%n");
        // escribir nombre
        System.out.println("Hola, ¿cómo te llamas?:");
        String nombre = entrada.nextLine();
        // introducir la primera calificación
        System.out.println("\nMuy bien, " + nombre + ", introduce tu primera calificación:");
        calificacion = entrada.nextDouble();
        // asignar la primera calificación a la variable total
        total += calificacion;
        // estructura de control iterativa
        while (contador <= 3) {
            // introducir calificaciones posteriores
            System.out.println("Introduce la sig. calificación:");
            calificacion = entrada.nextDouble();
            total += calificacion;
            ++contador;
        }
        // introducir la última calificación
        System.out.println("Por último, " + nombre + ", introduce tu última calificación:");
        calificacion = entrada.nextDouble();
        // asignar la última calificación a la variable total
        total += calificacion;
        // incrementar a la última calificación en uno
        ++contador;
        // operador unario (tipo entre paréntesis) de conversión de datos, por ejemplo: de int a double (instrucción de abajo)
        double promedio = (double) total / contador;
        // estructura de control anidada
        if (promedio >= 6) {
            // mostrar resultado por pantalla
            System.out.printf("%nMuy bien, %s, el resultado de tu promedio es de %.1f de calificación,"
                    + " por lo tanto, aprobaste el curso.", nombre, promedio);
        } else {
            // mostrar resultado por pantalla
            System.out.printf("%nLo lamento, %s, el resultado de tu promedio es de %.1f de calificación,"
                    + " por lo tanto, reprobaste el curso.", nombre, promedio);
        }

    }
}
