package chapter_7;

public class Arreglo_5 {

    public static void main(String[] args) {

        // Creo un arreglo y le asigno como parámetro una variable que contiene un valor constante
        // ejemplo
        final int LONGITUD_DEL_ARREGLO = 10; // declaro un valor constante o inmutable
        int[] arreglo = new int[LONGITUD_DEL_ARREGLO]; // creo el arreglo

        // inicializo el valor del arreglo y creo una separación, todo con ayuda del número dos
        for (int contador = 0; contador < arreglo.length; contador++) {
            // creo una separación de dos e inicializo el valor del arreglo con el número dos
            arreglo[contador] = 2 + 2 * contador;
        }

        System.out.printf("%s%10s%n", "Indice", "Valor");

        // muestro los datos
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.println(contador + "\t" + "[" + arreglo[contador] + "]");
        }

    }

}
