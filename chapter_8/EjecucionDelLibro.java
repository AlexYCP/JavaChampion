package chapter_8;

import java.util.EnumSet;

public class EjecucionDelLibro {

    public static void main(String[] args) {

        // imprimo el primer título del programa
        System.out.println("---------------------------------\n"
                + "Todos los libros de programación:\n"
                + "---------------------------------");

        // imprimo todos los libros con su respectiva información
        for (LogicaDelLibro libros : LogicaDelLibro.values()) {
            System.out.printf("%-10s%-39s%s%n", libros, libros.obtenerTitulo(), libros.obtenerAnioDelCopyright());
        }

        // imprimo el segundo título del programa
        System.out.println("\n------------------------------------------\n"
                + "Libros de programación: JHTP, CHTP, IW3HTP\n"
                + "------------------------------------------");

        // imprimo los sig. libros: JHTP, CHTP, IW3HTP
        for (LogicaDelLibro libros : EnumSet.range(LogicaDelLibro.JHTP, LogicaDelLibro.IW3HTP)) {
            System.out.printf("%-10s%-39s%s%n", libros, libros.obtenerTitulo(), libros.obtenerAnioDelCopyright());
        }

    }

}
