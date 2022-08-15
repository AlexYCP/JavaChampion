package chapter_4;

public class Decremento {

    public static void main(String[] args) {

        // Decremento, ejemplos de decrementar a una variable
        var a = 2;

        // Postdecremento
        System.out.println("Ejemplo de \"postdecrementar\":");
        System.out.printf("\"a\" antes del postdecremento: %d%n", a);
        System.out.printf("postdecremento de \"a\": %d%n", a--);
        System.out.printf("\"a\" después del postdecremento: %d%n%n", a);

        a = 2;

        // Predecremento
        System.out.println("Ejemplo de \"predecrementar\":");
        System.out.printf("\"a\" antes del predecremento: %d%n", a);
        System.out.printf("predecremento de \"a\": %d%n", --a);
        System.out.printf("\"a\" después del predecremento: %d", a);

    }
}
