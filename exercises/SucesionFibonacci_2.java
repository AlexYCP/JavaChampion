package ejercicios;

import java.util.Scanner;

public class SucesionFibonacci_2 {

    public static void main(String[] args) {

        // Sucesión Fibonacci
        // ejemplo
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int b = 1,
                c;

        System.out.println("-Sucesión Fibonacci-\n");

        System.out.println("Hola, introduce un número, gracias:");
        int a = entrada.nextInt();

        System.out.println("\nIndicador\tNúmero");

        while (contador < 5) {
            System.out.printf("%d\t\t%d%n", contador, a);

            c = a + b;
            a = b;
            b = c;

            contador++;
        }

    }

}
