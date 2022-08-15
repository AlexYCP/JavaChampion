package chapter_7;

public class EncuestaDePuntaje {

    public static void main(String[] args) {

        /*
        Realizar una encuesta en donde 20 estudiantes calificarán el servicio de la cafetería de la escuela del uno al cinco, en donde
        "uno" sig. "malo" y "cinco" "excelente".
         */
        // ejercicio
        int[] respuestasDeLosAlumnos = {10, 2, 3, 4, 5, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2};

        int[] frecuencia = new int[6];

        // creo a contador como índice de frecuencia para determinar el elemento a incrementar 
        for (int contador = 0; contador < respuestasDeLosAlumnos.length; contador++) {
            // mecanismo de manejo de excepciones 'try{catch{}}'
            try {
                ++frecuencia[respuestasDeLosAlumnos[contador]];
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e); // invoco al método toString
                System.out.printf("Indice de la lista inicializadora: [%d]%nValor fuera del rango de calificaciones: %d%n%n",
                        contador, respuestasDeLosAlumnos[contador]);
            }
        }

        System.out.printf("%s%15s%n", "Calificación", "Frecuencia");

        // creo el rango de números del uno al cinco para determinar la frecuencia de cada número
        for (int rangoDeCalificaciones = 1; rangoDeCalificaciones < frecuencia.length; rangoDeCalificaciones++) {
            System.out.printf("%d%17d%n", rangoDeCalificaciones, frecuencia[rangoDeCalificaciones]);
        }

    }

}
