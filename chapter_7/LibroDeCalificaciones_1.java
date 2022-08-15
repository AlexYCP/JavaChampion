package chapter_7;

public class LibroDeCalificaciones_1 {

    private String nombreDelCurso;
    private int[] calificaciones;

    public LibroDeCalificaciones_1(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void procesarCalificaciones() {
        // imprimir el arreglo de calificaciones
        imprimirCalificaciones();

        // imprimir el promedio de la clase
        System.out.printf("%nEl promedio de la clase es: %.2f", getPromedio());

        // imprimir la calificación mínima de la clase
        System.out.printf("%nLa calificación mínima de la clase es: %d", getCalificacionMinima());

        // imprimir la calificación máxima de la clase
        System.out.printf("%nLa calificación máxima de la clase es: %d%n", getCalificacionMaxima());

        // imprimir el gráfico de barras con su distribución de calificaciones
        imprimirGraficoDeBarras();

    }

    public int getCalificacionMinima() {

        int calificacionMasBaja = calificaciones[0];

        for (int calificacion : calificaciones) {
            if (calificacion < calificacionMasBaja) {
                calificacionMasBaja = calificacion;
            }
        }

        return calificacionMasBaja;

    }

    public int getCalificacionMaxima() {

        int calificacionMasAlta = calificaciones[0];

        for (int calificacion : calificaciones) {
            if (calificacion > calificacionMasAlta) {
                calificacionMasAlta = calificacion;
            }
        }

        return calificacionMasAlta;

    }

    public double getPromedio() {

        int total = 0;

        for (int calificacion : calificaciones) {
            total += calificacion;
        }

        return (double) total / calificaciones.length;

    }

    public void imprimirGraficoDeBarras() {

        System.out.println("\nDistribución de calificaciones:");

        int[] frecuencia = new int[11];

        // se incrementará la frecuencia en uno para cada calificación
        for (int calificacion : calificaciones) {
            ++frecuencia[calificacion / 10];
        }

        // para cada frecuencia de las calificaciones, imprime un asterisco en el gráfico
        for (int contador = 0; contador < frecuencia.length; contador++) {

            // imprime una etiqueta de barra para las calificaciones
            if (contador == 10) {
                System.out.printf("%5d", 100);
            } else {
                System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
            }

            // imprime un asterisco para cada rango de calificaciones
            for (int asterisco = 0; asterisco < frecuencia[contador]; asterisco++) {
                System.out.print("*");
            }
            
            System.out.println("");

        }

    }

    // imprime el contenido del arreglo de calificaciones
    public void imprimirCalificaciones() {

        System.out.println("Las calificaciones son:");

        // imprime la calificación de cada estudiante
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);
        }

    }

}
