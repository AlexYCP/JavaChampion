package chapter_5;

public class ER_For_Ejercicios_1 {

    public static void main(String[] args) {

        // Realizar los sig. ejercicios con ayuda de la estructura de repetición 'for':
        
        // ejercicio 1
        System.out.println("a) Modificar la variable de control de 1 a 100 en incrementos de 1.");

        for (int i = 1; i < 101; i++) {
            if (i <= 99) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 2
        System.out.println("b) Modificar la variable de control de 100 a 1 en decrementos de 1:");

        for (int i = 100; i > 0; i--) {
            if (i >= 2) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 3
        System.out.println("c) Modificar la variable de control de 7 a 77 en incrementos de 7:");

        for (int i = 7; i < 78; i += 7) {
            if (i <= 76) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 4
        System.out.println("d) Modificar la variable de control de 20 a 2 en decrementos de 2:");

        for (int i = 20; i > 1; i -= 2) {
            if (i >= 3) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 5
        System.out.println("Modificar la variable de control con la siguiente secuencia de valores: 2, 5, 8, 11, 14, 17, 20:");

        for (int i = 2; i < 21; i += 3) {
            if (i <= 19) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 6
        System.out.println("Modificar la variable de control con la siguiente secuencia de valores:"
                + " 99, 88, 77, 66, 55, 44, 33, 22, 11, 0:");

        for (int i = 99; i >= -1; i -= 11) {
            if (i >= 1) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.%n%n", i);
            }
        }

        // ejercicio 7 propuesto por mí
        System.out.println("Imprimir la secuencia numérica desde el 14 hasta el 196:");

        for (int i = 14; i < 197; i += 14) {
            if (i <= 195) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.", i);
            }
        }

    }
}
