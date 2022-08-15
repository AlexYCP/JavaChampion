package test;

import java.util.Scanner;

public class Test_21 {

    public static void main(String[] args) {

        // Test 21
        Scanner entrada = new Scanner(System.in);

        int longitudDelArreglo = Integer.parseInt(args[0]);
        int[] arreglo = new int[3];

        System.out.printf("Hola, escribe tres argumentos (1, 2, 3) en el sig. orden:%n"
                + "1. Argumento para crear la longitud del arreglo.%n"
                + "2. Argumento para inicializar el elemento del índice.%n"
                + "3. Argumento para determinar el incremento de los elementos.%n");

        int valorInicial = Integer.parseInt(args[1]);
        int incrementoDelValor = Integer.parseInt(args[2]);

        int argumentos = Integer.parseInt(args[0]);
        int escribirArgumentos = argumentos;

        System.out.println("Muy bien, escribe tus argumentos:");
        escribirArgumentos = entrada.nextInt();

        if (escribirArgumentos == 3) {
            for (int contador = 0; contador < arreglo.length; contador++) {
                arreglo[contador] = valorInicial + incrementoDelValor * contador;
            }

            System.out.printf("%n%s%10s%n", "INDICE", "VALOR");

            for (int contador = 0; contador < arreglo.length; contador++) {
                System.out.printf("%5d%10d", contador, arreglo[contador]);
            }
        } else {
            System.out.printf("%Error!, escribe los argumentos en el sig. orden, gracias:%n"
                    + "Longitud del arreglo, valor inicial e incremento del valor.");
        }

    }

}
