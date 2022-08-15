package chapter_7;

public class PasoDelArregloAlMetodo {

    public static void main(String[] args) {

        // Paso de un arreglo a un método y paso de un elemento del arreglo al método
        // ejemplo
        int[] arreglo = {1, 2, 3, 4, 5};

        // mostrar la lista de elementos del arreglo
        System.out.println("Lista de elementos del arreglo:");

        // instrucción for mejorada para imprimir los elementos del arreglo
        for (int listaDeNumeros : arreglo) {
            System.out.printf("%d ", listaDeNumeros);
        }

        // mostrar la nueva lista de elementos del arreglo modificado
        System.out.println("\nNueva lista de elementos del arreglo modificado:");

        // método estático del arreglo modificado
        modificarArreglo(arreglo);

        // arreglo modificado con una nueva lista de elementos iterados por un valor de dos
        for (int nuevaListaDeNumeros : arreglo) {
            System.out.printf("%d ", nuevaListaDeNumeros);
        }

        // valor del elemento del arreglo en la posición número tres (arreglo[3]) antes de ser modificado
        System.out.printf("%nValor del elemento del arreglo en la posición número tres (arreglo[3]) antes de ser modificado: %d",
                arreglo[3]);

        // modificar el elemento del arreglo en la posición número tres (arreglo[3])
        modificarElementoDelArreglo(arreglo[3]);

        // valor del elemento del arreglo en la posición número tres (arreglo[3]) después de ser modificado
        System.out.printf("%nValor del elemento del arreglo en la posición número tres (arreglo[3]) después de ser modificado: %d",
                arreglo[3]);

    }

    public static void modificarArreglo(int[] copiaDelArreglo) {
        for (int contador = 0; contador < copiaDelArreglo.length; contador++) {
            copiaDelArreglo[contador] *= 2;
        }
    }

    public static void modificarElementoDelArreglo(int elemento) {
        System.out.printf("%nNuevo valor del elemento del arreglo en la posición número tres (arreglo[3]): %d", elemento * 2);
    }

}
