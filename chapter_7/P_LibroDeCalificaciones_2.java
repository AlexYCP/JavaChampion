package chapter_7;

public class P_LibroDeCalificaciones_2 {

    public static void main(String[] args) {

        // Demostrar las capacidades de la clase 'LibroDeCalificaciones_2'
        int[][] listaDeCalificaciones = {{81, 82, 83}, {44, 45, 46}, {95, 96, 97}, {22, 23, 24}, {55, 56, 57},
        {10, 11, 12}, {10, 10, 10}, {97, 98, 99}, {15, 16, 17}, {76, 77, 78}};

        LibroDeCalificaciones_2 ldc = new LibroDeCalificaciones_2("CS101 Introducción a la Programación en Java.",
                listaDeCalificaciones);

        System.out.printf("Bienvenido al libro de calificaciones.%n%s%n", ldc.getNombreDelCurso());

        ldc.procesarInformacion();

    }

}
