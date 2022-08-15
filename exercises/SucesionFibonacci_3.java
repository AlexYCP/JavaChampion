package ejercicios;

import java.util.Scanner;

public class SucesionFibonacci_3 {

    public static void main(String[] args) {

        // Sucesion Fibonacci
        // ejemplo
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int b = 1,
                c;

        System.out.println("-Sucesión Fibonacci-\n");

        System.out.println("Hola, introduce un número, gracias:");
        int a = entrada.nextInt();

        System.out.println("\nIndicador\tNúmero");

        do {
            System.out.printf("%d\t\t%d%n", contador, a);
            
            c = a + b;
            a = b;
            b = c;

            contador++;
        } while (contador < 5);

    }

}
