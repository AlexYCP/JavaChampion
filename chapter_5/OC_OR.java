package chapter_5;

import java.util.Scanner;

public class OC_OR {

    public static void main(String[] args) {

        // Operador condicional OR (||) para evaluar dos condiciones
        // ejemplo
        /*
        Tabla de verdad de todas las posibles combinaciones:
        
        Expresión 1     Expresión 2     Expresión 1 && Expresión 2
        ----------------------------------------------------------
        true            false           true
        ----------------------------------------------------------
        true            true            true
        ----------------------------------------------------------
        false           true            true
        ----------------------------------------------------------
        false           false           false
        
        Dato excepcional:
        El operador condicional AND (&&) tiene mayor prescedencia que el operador condicional OR (||).
        
        Dato excepcional:
        Se produce una evaluación en 'corto circuito de condiciones complejas' si se presenta el sig. caso, por ejemplo:
        
        Primera condición:
        if (expresion_1 && expresion_2)
        Segunda condición:
        if (expresion_3 || expresion_4)
        
        En donde, si expresion_1 se evalúa como false, en automático se produce el 'corto circuito de condiciones complejas',
        aunque la segunda condición retorne un valor true.
         */
 /*
        Ejercicio:
        El programa escolar de la Universidad me solicita para elaborar un programa que ayude a la institución a calcular el promedio de
        los alumnos y mediante su examen final, dichos estudiantes aprobarán si obtienen un promedio final con calificación de siete
        o mayor, y/o una calificación en su exámen final de nueve o mayor.
         */
        Scanner entrada = new Scanner(System.in);

        String nombre = "";
        int promedioFinal = 0;
        int calificacionDelExamenFinal = 0;

        System.out.println("¡Hola, bienvenid@ al programa escolar de la Universidad!\n");

        System.out.println("Escribe tu nombre aquí, por favor:");
        nombre = entrada.nextLine();

        System.out.println("\nAhora introduce la calificación de tu promedio final:");
        promedioFinal = entrada.nextInt();

        System.out.println("\nPor último, introduce la calificación de tu exámen final:");
        calificacionDelExamenFinal = entrada.nextInt();

        if (promedioFinal >= 7 || calificacionDelExamenFinal >= 9) {
            System.out.printf("%n¡Muy bien, %s, aprobaste el curso!%nResultado de calificaciones:%n"
                    + "Promedio escolar: %d%nCalificación del exámen final: %d",
                    nombre, promedioFinal, calificacionDelExamenFinal);
        } else {
            System.out.printf("%n¡Lo siento mucho, %s, reprobaste el curso!%nResultado de calificaciones:%n"
                    + "Promedio escolar: %d%nCalificación del exámen final: %d",
                    nombre, promedioFinal, calificacionDelExamenFinal);
        }

    }

}
