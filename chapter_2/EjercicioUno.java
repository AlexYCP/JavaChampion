package chapter_2;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        // Realiza una suma. Ingresa dos números enteros desde el teclado, súmalos e imprime el resultado.
        Scanner entrada = new Scanner(System.in);

        int numeroUno,
                numeroDos,
                resultado;

        System.out.println("Ingresa el primer número entero: "); // indicador
        numeroUno = entrada.nextInt(); // instrucción de asignación

        System.out.println("Ingresa el segundo número entero: "); // indicador
        numeroDos = entrada.nextInt(); // instrucción de asignación

        // resultado = numeroUno + numeroDos;
        // primera manera de imprimir el resultado
        // System.out.printf("El resultado de la suma es: %d", resultado);
        // segunda manera de imprimir el resultado
        System.out.printf("El resultado de la suma es: %d", (numeroUno + numeroDos));

    }
}
