package chapter_4;

import java.util.Scanner;

public class IS_Doble_Logica_2 {

    private int Cmatematicas;
    private int Cingles;
    private int Cbiologia;
    private int Ccomputacion;
    private int promedioUniversitario;

    Scanner entrada = new Scanner(System.in);

    public IS_Doble_Logica_2() {
        System.out.println("Hola, introduce tus calificaciones, gracias.\n");

        System.out.println("Introduce tu calificación en matemáticas:");
        Cmatematicas = entrada.nextInt();

        System.out.println("Introduce tu calificación en inglés:");
        Cingles = entrada.nextInt();

        System.out.println("Introduce tu calificación en biología:");
        Cbiologia = entrada.nextInt();

        System.out.println("Introduce tu calificación en computación:");
        Ccomputacion = entrada.nextInt();

        promedioUniversitario = (Cmatematicas + Cingles + Cbiologia + Ccomputacion) / 4;

        if (promedioUniversitario >= 6) {
            System.out.printf("%nAprobaste con %d de calificación.", promedioUniversitario);
        } else {
            System.out.printf("%nLo sentimos, reprobaste con %d de calificación.", promedioUniversitario);
        }

    }

}
