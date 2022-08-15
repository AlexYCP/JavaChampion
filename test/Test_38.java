package test;

import java.util.Scanner;

public class Test_38 {

    public static void main(String[] args) {

        // Test_38
        // ejemplo
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, escribe la primera línea de texto, por favor:");
        String literalDeCadena_1 = entrada.nextLine();

        System.out.println("Hola, escribe la segunda línea de texto, gracias:");
        String literalDeCadena_2 = entrada.nextLine();

        System.out.printf("Literal de cadena uno: %s%nLiteral de cadena dos: %s",
                literalDeCadena_1, literalDeCadena_2);

    }

}
