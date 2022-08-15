package chapter_5;

public class ER_For_Ejercicios_2 {

    public static void main(String[] args) {

        // ejemplos
        System.out.println("Sumar los enteros pares del 2 al 20:\n");

        // ejemplo 1
        // método recomendado
        System.out.println("Resultado del método recomendado:");

        int total_1 = 0;

        for (int i = 2; i <= 20; i += 2) {
            total_1 += i;
        }

        System.out.printf("R = %d%n%n", total_1);

        // ejemplo 2
        // método no recomendado
        System.out.println("Resultado del método no recomendado:");

        int total_2 = 0;

        for (int i = 2; i <= 20; total_2 += i, i += 2); // cuerpo de instrucción vacío

        System.out.printf("R = %d", total_2);

    }
}
