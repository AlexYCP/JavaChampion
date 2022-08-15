package chapter_2;

import java.util.Scanner;

public class Operadores_R_I_2 {

    public static void main(String[] args) {

        // Calcula el promedio del estudiante Alexander.
        Scanner entrada = new Scanner(System.in);

        int matematicas,
                fisica,
                quimica,
                ingles,
                calificacionMinima,
                promedio;

        System.out.println("Introduce la calificación mínima para aprobar el curso:");
        calificacionMinima = entrada.nextInt();

        System.out.println("Introduce tu calificación de matemáticas:");
        matematicas = entrada.nextInt();

        System.out.println("Introduce tu calificación de física:");
        fisica = entrada.nextInt();

        System.out.println("Introduce tu calificación de química:");
        quimica = entrada.nextInt();

        System.out.println("Introduce tu calificación de inglés:");
        ingles = entrada.nextInt();

        promedio = (matematicas + fisica + quimica + ingles) / 4;

        if (promedio >= calificacionMinima) {
            System.out.printf("Alexander aprobó el curso con %d de calificación", promedio);
        } else {
            System.out.printf("Alexander no aprobó el curso por calificar el curso con %d de calificación",
                    promedio);
        }

    }
}
