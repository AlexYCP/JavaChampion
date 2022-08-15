package chapter_5;

import java.util.Scanner;

public class OILB_OR {

    public static void main(String[] args) {

        // Operador OR inclusivo lógico booleano (|)
        // Funciona de la misma manera que el operador OR condicional (||).
        /*  
        Ejercicio:
        La Prestigiosa Universidad de Oxford me solicita para desarrollar un programa que estableza la calificación de mi promedio
        final y la calificación de mi exámen final, y por el simple hecho de haber estudiado en tan prestigiosa Universidad y por
        haber presentado el examen final, el consejo directivo y escolar me regalaran un punto adicional en mis dos calificaciones.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Universidad de Oxford:\n");
        
        System.out.println("Hola, introduce tu nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ahora, introduce tu promedio final:");
        int promedioFinal_Oxford = entrada.nextInt();

        System.out.println("Por último, introduce la calificación de tu exámen final:");
        int calificacionDelExamenFinal_Oxford = entrada.nextInt();

        if (++promedioFinal_Oxford >= 7 | ++calificacionDelExamenFinal_Oxford >= 9) {
            System.out.printf("%n¡Muy bien, %s, obtuviste los sig. puntajes!%nPromedio final: %d%nCalificación del exámen final: %d",
                    nombre, promedioFinal_Oxford, calificacionDelExamenFinal_Oxford);
        }

    }

}
