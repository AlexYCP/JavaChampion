package chapter_5;

public class InstruccionContinue {

    public static void main(String[] args) {

        // Instrucción continue
        System.out.println("Imprime la secuencia numérica del uno al 10.\n");

        // ejemplo con while
        System.out.println("Ejemplo con \"while\": omite el número siete:");

        int contador_1 = 0;

        while (contador_1 < 10) {
            ++contador_1;

            if (contador_1 <= 9) {
                if (contador_1 == 7) {
                    continue;
                }
                System.out.printf("%d, ", contador_1);
            } else {
                System.out.printf("%d. ", contador_1);
            }

        }

        // ejemplo con for
        System.out.println("\n\nEjemplo con \"for\": omite el número 2:");

        int contador_2;

        for (contador_2 = 1; contador_2 <= 10; contador_2++) {

            if (contador_2 <= 9) {
                if (contador_2 == 2) {
                    continue;
                }
                System.out.printf("%d, ", contador_2);
            } else {
                System.out.printf("%d.", contador_2);
            }

        }

        // ejemplo con do-while
        System.out.println("\n\nEjemplo con \"do-while\": omite el número cinco:");
        int contador_3 = 0;

        do {
            ++contador_3;

            if (contador_3 <= 9) {
                if (contador_3 == 5) {
                    continue;
                }
                System.out.printf("%d, ", contador_3);
            } else {
                System.out.printf("%d.", contador_3);
            }

        } while (contador_3 < 10);

    }

}
