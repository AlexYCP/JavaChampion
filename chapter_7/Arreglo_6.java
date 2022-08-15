package chapter_7;

public class Arreglo_6 {

    public static void main(String[] args) {

        // Creo un arreglo con una lista inicializadora y sumo sus valores
        // ejemplo
        int[] listaDeValores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        // muestro los valores de la lista inicializadora a sumar
        System.out.printf("Lista de valores:%n%n%s\t%s%n", "Indice", "Valor");

        for (int contador = 0; contador < listaDeValores.length; contador++) {
            System.out.print(contador + "\t[" + listaDeValores[contador] + "]\n");
        }

        // sumo los valores de la lista inicializadora
        for (int contador = 0; contador < listaDeValores.length; contador++) {
            total += listaDeValores[contador];
        }

        // muestro el resultado de la suma
        System.out.print("\nEl resultado de la suma de los valores de la lista inicializadora es: " + total);

    }

}
