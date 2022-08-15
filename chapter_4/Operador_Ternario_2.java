package chapter_4;

import java.util.Scanner;

public class Operador_Ternario_2 {

    public static void main(String[] args) {

        // Operador Ternario, ejercicio.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, ¿cómo te llamas?");
        var nombre = entrada.nextLine();

        System.out.printf("Muy bien, %s, ahora introduce los siguientes datos, gracias.%n", nombre);

        System.out.println("Introduce tu calificación de matemáticas:");
        var c1 = entrada.nextInt();

        System.out.println("Introduce tu calificación de español:");
        var c2 = entrada.nextInt();

        System.out.println("Introduce tu calificación de física:");
        var c3 = entrada.nextInt();

        System.out.println("Por último, introduce tu calificación de psicología:");
        var c4 = entrada.nextInt();

        var promedio = (c1 + c2 + c3 + c4) / 4;

        var operadorTernario = (promedio >= 6 ? "aprobaste" : "reprobaste");

        System.out.printf("Hola de nuevo, %s, %s con %d de calificación.", nombre, operadorTernario, promedio);

    }
}
