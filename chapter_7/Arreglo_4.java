package chapter_7;

public class Arreglo_4 {

    public static void main(String[] args) {

        // Creación de un arreglo por una lista inicializadora entre llaves
        // ejemplo
        int[] listaInicializadora = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.printf("%s%10s%n", "Indice", "Valor");

        for (int contador = 0; contador < listaInicializadora.length; contador++) {
            System.out.printf("%d%11d%n", contador, listaInicializadora[contador]);
        }

    }

}
