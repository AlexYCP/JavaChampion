package chapter_7;

public class Arreglo_3 {

    public static void main(String[] args) {

        // Creación de un arreglo apoyado por una instrucción de repetición for
        // ejemplo
        int[] arreglo = new int[10];

        System.out.printf("%s%10s%n", "Indice", "Valor");

        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%d%10d%n", contador, arreglo[contador]);
        }

    }

}
