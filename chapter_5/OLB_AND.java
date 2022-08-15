package chapter_5;

import java.util.Scanner;

public class OLB_AND {

    public static void main(String[] args) {

        // Operador AND lógico booleano (&)
        /*
        Funciona de la misma manera que el operador AND condicional (&&), con la carterística extra de evaluar a las dos condiciones,
        aunque la primera expresión se evalúe como false (es decir, no realiza una evaluación en corto circuito). Por ejemplo:
         */
 /*
        Ejercicio:
        El MIT me solicita para desarrollar un programa que estableza la calificación de mi promedio final y la calificación de mi
        exámen final, y por el simple hecho de haber estudiado en tan prestigiosa Universidad y por haber presentado el examen
        final, me regalaran un punto adicional en mis dos calificaciones.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Universidad del Mit:\n");

        System.out.println("Hola, introduce tu nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ahora, introduce tu promedio final:");
        int promedioFinal_Mit = entrada.nextInt();

        System.out.println("Por último, introduce la calificación de tu exámen final:");
        int calificacionDelExamenFinal_Mit = entrada.nextInt();

        if (++promedioFinal_Mit >= 7 | ++calificacionDelExamenFinal_Mit >= 10) {
            System.out.printf("%n¡Muy bien, %s, obtuviste los sig. puntajes:%nPromedio final: %d%nCalificación del exámen final: %d",
                    nombre, promedioFinal_Mit, calificacionDelExamenFinal_Mit);
        }

    }

}
