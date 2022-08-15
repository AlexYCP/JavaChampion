package chapter_7;

public class P_LibroDeCalificaciones_1 {

    public static void main(String[] args) {

        // Demostrar las capacidades de la Clase 'LibroDeCalificaciones_1'
        // lista de calificaciones para entrar como argumento en el objeto 'LibroDeCalificaciones_1'
        int[] listaDeCalificaciones = {97, 88, 65, 79, 91, 82, 75, 92, 99, 70};

        /*
        nuevo objeto 'LibroDeCalificaciones_1' con sus dos argumentos (nombre del curso y lista de calificaciones) asignado a la variable
        'ldc'
         */
        LibroDeCalificaciones_1 ldc = new LibroDeCalificaciones_1("CS101 Introducción a la Programación en Java", listaDeCalificaciones);

        // imprimir mensaje de bienvenida junto con el nombre del curso
        System.out.printf("¡Bienvenido al libro de calificaciones!%n%s%n%n",
                ldc.getNombreDelCurso());

        // procesar a todas las calificaciones
        ldc.procesarCalificaciones();

    }

}
