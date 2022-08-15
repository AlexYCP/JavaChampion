package chapter_5;

public class InstruccionBreak {

    public static void main(String[] args) {

        // Intrucción break
        System.out.println("Utilizar la instrucción 'break' para detener el ciclo de ejecución en un determinado número.\n"
                + "Imprimir la secuencia numérica del uno al 10 con los tres tipos de ciclos repetitivos.\n");

        // ejemplo con while
        System.out.println("Ejemplo con \"while\", detener en el número siete:");

        int cuenta_1 = 0;

        while (cuenta_1 < 10) {
            ++cuenta_1;
            System.out.printf("%d, ", cuenta_1);

            if (cuenta_1 == 7) {
                break;
            }
        }

        // ejemplo con for
        System.out.println("\n\nEjemplo con \"for\", detener en el número cinco:");

        int cuenta_2;

        for (cuenta_2 = 1; cuenta_2 <= 10; cuenta_2++) {
            System.out.printf("%d, ", cuenta_2);

            if (cuenta_2 == 5) {
                break;
            }
        }

        // ejemplo con do-while
        System.out.println("\n\nEjemplo con \"do-while\", detener en el número dos:");

        int cuenta_3 = 0;

        do {
            ++cuenta_3;
            System.out.printf("%d, ", cuenta_3);

            if (cuenta_3 == 2) {
                break;
            }
        } while (cuenta_3 < 10);

    }
}
