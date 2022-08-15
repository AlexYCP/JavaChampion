package chapter_7;

public class IFM {

    public static void main(String[] args) {

        // Instrucción for mejorada
        // ejemplo
        int[] listaDeNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        System.out.println("Lista de elementos del arreglo:");

        // instrucción for mejorada
        for (int numeros : listaDeNumeros) {
            // mostrar los elementos de la lista inicializadora
            System.out.printf("%d ", numeros);
            total += numeros;
        }

        // imprimir el resultado de la suma de los elementos de la lista inicializadora
        System.out.printf("%nEl total de la suma de los valores de la lista inicializadora es:%n%d", total);

    }

}
