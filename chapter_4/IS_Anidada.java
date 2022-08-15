package chapter_4;

import java.util.Scanner;

public class IS_Anidada {

    public static void main(String[] args) {

        // Instrucción de selección anidada
        Scanner entrada = new Scanner(System.in);

        int calificacion_1,
                calificacion_2,
                calificacion_3,
                calificacion_4;

        var promedioEscolar = 0;

        System.out.println("Introduce tu primera calificación:");
        calificacion_1 = entrada.nextInt();

        System.out.println("Introduce tu segunda calificación:");
        calificacion_2 = entrada.nextInt();

        System.out.println("Introduce tu tercera calificación:");
        calificacion_3 = entrada.nextInt();

        System.out.println("Introduce tu cuarta calificación:");
        calificacion_4 = entrada.nextInt();

        promedioEscolar = (calificacion_1 + calificacion_2 + calificacion_3 + calificacion_4) / 4;

        if (promedioEscolar >= 9) {
            System.out.println("Aprobaste el curso con A.");
        } else if (promedioEscolar >= 8) {
            System.out.println("Aprobaste el curso con B.");
        } else if (promedioEscolar >= 7) {
            System.out.println("Aprobaste el curso con C.");
        } else if (promedioEscolar >= 6) {
            System.out.println("Aprobaste el curso con D.");
        } else {
            System.out.println("Reprobaste el curso con F.");
        }

    }
}
