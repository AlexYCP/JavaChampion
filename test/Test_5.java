package test;

import java.util.Scanner;

public class Test_5 {

    private String nombre;
    private int c_1;
    private int c_2;
    private int promedio;

    Scanner entrada = new Scanner(System.in);

    public Test_5() {
        System.out.println("Introduce tu nombre:");
        nombre = entrada.nextLine();

        System.out.println("Introduce tu primera calificación:");
        c_1 = entrada.nextInt();

        System.out.println("Introduce tu segunda calificación:");
        c_2 = entrada.nextInt();

        promedio = (c_1 + c_2) / 2;

        if (promedio <= 10) {
            if (promedio >= 9) {
                System.out.printf("Muy bien, %s, aprobaste con A de calificación", nombre);
            } else if (promedio >= 8) {
                System.out.printf("Muy bien, %s, aprobaste con B de calificación", nombre);
            } else {
                System.out.printf("Lo sentimos, %s, reprobaste con F de calificación");
            }
        }

    }

}
