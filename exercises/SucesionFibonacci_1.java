package ejercicios;

import java.util.Scanner;

public class SucesionFibonacci_1 {

    public static void main(String[] args) {

        // Sucesión Fibonacci
        // ejercicio
        Scanner entrada = new Scanner(System.in);

        int b = 1,
                c;

        System.out.println("-Sucesión fibonacci-\n");

        System.out.println("Hola, introduce un número, gracias:");
        int a = entrada.nextInt();

        System.out.println("\nIndicador\tNúmero:");

        for (int contador = 0; contador < 10; contador++) {
            System.out.printf("%d\t\t%d%n", contador, a);

            c = a + b;
            a = b;
            b = c;
        }

    }

}
