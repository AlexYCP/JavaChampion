package chapter_4;

public class Incremento {

    public static void main(String[] args) {

        // Incremento, ejemplos de incrementar a una variable
        var a = 1;

        // Postincremento
        System.out.println("Ejemplo de \"postincrementar\":");
        System.out.printf("\"a\" antes del postincremento: %d%n", a);
        System.out.printf("postincremento de \"a\": %d%n", a++);
        System.out.printf("\"a\" después del postincremento: %d%n%n", a);

        a = 1;

        // Preincremento
        System.out.println("Ejemplo de \"preincrementar\":");
        System.out.printf("\"a\" antes del preincremento: %d%n", a);
        System.out.printf("preincremento de \"a\": %d%n", ++a);
        System.out.printf("\"a\" después del preincremento: %d", a);

    }
}
