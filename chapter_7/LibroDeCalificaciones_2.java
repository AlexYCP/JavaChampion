package chapter_7;

public class LibroDeCalificaciones_2 {

    private String nombreDelCurso;
    private int[][] calificaciones;

    // constructor para inicializar el nombre del curso y las calificaciones de los alumnos
    public LibroDeCalificaciones_2(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    // método para establecer el nombre del curso
    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    // método para obtener el nombre del curso
    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    // método para realizar varios procesos en los datos
    public void procesarInformacion() {
        // imprimir el arreglo con todas sus calificaciones
        imprimirCalificaciones();

        // mostrar la calificación mínima
        System.out.printf("%nLa calificación más baja en el libro es %d."
                + "%nLa calificación más alta en el libro es %d.%n",
                getCalificacionMinima(), getCalificacionMaxima());

        // mostrar el gráfico de distribución de todas las calificaciones para todas las pruebas
        imprimirGraficoDeBarras();
    }

    // determinar la calificación mínima
    public int getCalificacionMinima() {
        // asumir que 'calificacionMinima' es la calificación más baja
        int calificacionMinima = calificaciones[0][0];

        // iterar a través de las filas del arreglo
        for (int[] calificacionDeFila : calificaciones) {
            // iterar a través de las columnas del arreglo
            for (int calificacionDeColumna : calificacionDeFila) {
                // si 'calificacionDeColumna' es menor a 'calificacionMinima', añadir 'calificacionDeColumna' a 'calificacionMinima'
                if (calificacionDeColumna < calificacionMinima) {
                    calificacionMinima = calificacionDeColumna;
                }
            }
        }

        return calificacionMinima;
    }

    // determinar la calificación máxima
    public int getCalificacionMaxima() {
        // asumir que 'calificacionMaxima' es la calificación más alta
        int calificacionMaxima = calificaciones[0][0];

        // iterar a través de las filas del arreglo
        for (int[] calificacionDeFila : calificaciones) {
            // iterar a través de las columnas del arreglo
            for (int calificacionDeColumna : calificacionDeFila) {
                // si 'calificacionDeColumna' es mayor a 'calificacionMaxima', añadir 'calificacionDeColumna' a 'calificacionMaxima'
                if (calificacionDeColumna > calificacionMaxima) {
                    calificacionMaxima = calificacionDeColumna;
                }
            }
        }

        return calificacionMaxima;
    }

    // método para determinar el promedio de un conjunto específico de calificaciones
    public double calcularPromedio(int[] conjuntoDeCalificaicones) {
        int total = 0;

        for (int calificacion : conjuntoDeCalificaicones) {
            total += calificacion;
        }

        return (double) total / conjuntoDeCalificaicones.length;
    }

    // método para imprimir el gráfico de barras que muestra la distribución de calificaciones
    public void imprimirGraficoDeBarras() {
        System.out.println("\nDistribución de calificaciones:");

        // almacena la frecuencia de cada calificación en un rango de 10 calificaciones
        int[] frecuencia = new int[11];

        // para cada calificación de la lista total, preincrementar en uno la nota apropiada
        // iterar a través de las filas del arreglo
        for (int[] calificacionDeFila : calificaciones) {
            // iterar a través de las columnas del arreglo
            for (int calificacionDeColumna : calificacionDeFila) {
                ++frecuencia[calificacionDeColumna / 10];
            }
        }

        // para cada frecuencia preincrementada en las calificaciones, imprimir un asterisco
        for (int contador = 0; contador < frecuencia.length; contador++) {
            if (contador == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%2d-%2d: ", contador * 10, contador * 10 + 9);
            }

            for (int asterisco = 0; asterisco < frecuencia[contador]; asterisco++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    // método para imprimir las calificaciones
    public void imprimirCalificaciones() {
        System.out.println("\nLas calificaciones son:");
        System.out.print("                ");
        
        // encabezado iterado para cada número de prueba
        for (int contador = 0; contador < calificaciones[0].length; contador++) {
            System.out.printf("Prueba %d   ", contador + 1);
        }
        
        // encabezado de columna para cada prueba de un determinado estudiante
        System.out.println("Promedio");
        
        // crea filas/columnas de texto que representan al arreglo 'calificaciones'
        for (int contador = 0; contador < calificaciones.length; contador++) {
            System.out.printf("Estudiante %2d", contador + 1);

            // imprime las calificaciones de los estudiantes
            for (int calificacion : calificaciones[contador]) {
                System.out.printf("%11d", calificacion);
            }

            // llamo al método 'calcularPromedio' para calcular la calificación de cada estudiante
            // coloco la fila de 'calificaciones' como argumento para obtener el promedio de los alumnos
            double promedio = calcularPromedio(calificaciones[contador]);
            System.out.printf("%11.2f%n", promedio);
        }
    }

}
