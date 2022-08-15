package chapter_2;

import java.util.Scanner;

public class Operadores_R_I_3 {

    public static void main(String[] args) {

        // Introduce dos números enteros y comparalos con los operadores de igualdad o relacionales
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número entero:");
        int numero_1 = entrada.nextInt();

        System.out.println("Introduce el segundo número entero:");
        int numero_2 = entrada.nextInt();

        if (numero_1 == numero_2) {
            System.out.printf("%d == %d%n", numero_1, numero_2);
        }

        if (numero_1 != numero_2) {
            System.out.printf("%d != %d%n", numero_1, numero_2);
        }

        if (numero_1 > numero_2) {
            System.out.printf("%d > %d%n", numero_1, numero_2);
        }

        if (numero_1 < numero_2) {
            System.out.printf("%d < %d%n", numero_1, numero_2);
        }

        if (numero_1 >= numero_2) {
            System.out.printf("%d >= %d%n", numero_1, numero_2);
        }

        if (numero_1 <= numero_2) {
            System.out.printf("%d <= %d", numero_1, numero_2);
        }

    }
}
