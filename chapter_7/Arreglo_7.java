package chapter_7;

public class Arreglo_7 {

    public static void main(String[] args) {

        // Creo un arreglo que contenga una lista inicializadora e imprima una o más estrellas por cada número específico de la lista
        // ejemplo
        int[] listaDeCalificaciones = {0, 1, 0, 2, 3, 0, 1, 0, 4, 0, 5};

        //
        System.out.println("Cantidad de calificaciones obtenidas por cada rango de cero a 100 representadas por una estrella:\n");

        //
        for (int contador = 0; contador < listaDeCalificaciones.length; contador++) {

            if (contador == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
            }

            for (int estrella = 0; estrella < listaDeCalificaciones[contador]; estrella++) {
                System.out.print("*");
            }

            System.out.println("");

        }

    }

}
