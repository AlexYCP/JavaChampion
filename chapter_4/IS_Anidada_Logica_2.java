package chapter_4;

import java.util.Scanner;

public class IS_Anidada_Logica_2 {

    private String nombre;
    private int c_1;
    private int c_2;
    private int c_3;
    private int c_4;
    private int promedioFinal;

    Scanner entrada = new Scanner(System.in);

    public IS_Anidada_Logica_2() {
        System.out.println("Hola, introduce tu nombre:");
        nombre = entrada.nextLine();
        System.out.println("Introduce tu primera calificación:");
        c_1 = entrada.nextInt();
        System.out.println("Introduce tu segunda calificación:");
        c_2 = entrada.nextInt();
        System.out.println("Introduce tu tercera calificación:");
        c_3 = entrada.nextInt();
        System.out.println("Introduce tu cuarta calificación:");
        c_4 = entrada.nextInt();

        promedioFinal = (c_1 + c_2 + c_3 + c_4) / 4;

        if (promedioFinal <= 10) {
            if (promedioFinal >= 9) {
                System.out.printf("Hola, %s, aprobaste el curso con A de calificación.",
                        nombre);
            } else if (promedioFinal >= 8) {
                System.out.printf("Hola, %s, aprobaste el curso con B de calificación.",
                        nombre);
            } else if (promedioFinal >= 7) {
                System.out.printf("Hola, %s, aprobaste el curso con C de calificación.",
                        nombre);
            } else if (promedioFinal >= 6) {
                System.out.printf("Hola, %s, aprobaste el curso con D de calificación.",
                        nombre);
            } else {
                System.out.printf("Hola, %s. Lo sentimos, reprobaste el curso con F de calificación.",
                        nombre);
            }
        }

    }
}
