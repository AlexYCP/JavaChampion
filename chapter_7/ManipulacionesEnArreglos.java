package chapter_7;

import java.util.Arrays;

public class ManipulacionesEnArreglos {

    public static void main(String[] args) {

        // La clase Arrays para realizar manipulaciones en arreglos
        double[] listaDeValoresDouble = {1.7, 1.4, 1.2, 1.5, 1.3, 1.6, 1.1};
        // invoco al método estático sort de la clase Arrays para ordenar los elementos de la lista de forma ascendente
        Arrays.sort(listaDeValoresDouble);
        System.out.print("listaDeValoresDouble: ");
        // imprimo la lista de valores del arreglo
        for (double valor : listaDeValoresDouble) {
            System.out.printf("%.1f ", valor);
        }

        // creo un arreglo con espacio para 10 elementos
        int[] rellenarListaDeValoresInt = new int[10];
        // invoco al método estático fill de la clase Arrays para llenar un arreglo con un valor entero único
        Arrays.fill(rellenarListaDeValoresInt, 7);
        mostrarArreglo(rellenarListaDeValoresInt, "rellenarListaDeValoresInt");

        // creo la lista inicializadora a copiar con seis elementos
        int[] listaDeValoresInt = {1, 2, 3, 4, 5, 6, 7};
        // creo la lista inicializadora que copiará los valores de la lista anterior
        int[] copiaDeListaDeValoresInt = new int[listaDeValoresInt.length];
        /*
        invoco al método estático arraycopy de la clase System para copiar los valores de la variable 'listaDeValoresInt' a la variable
        'copiaListaDeValoresInt', siguiendo la sig. sintaxis: (arreglo, índice del elemento a copiar, copiaDelArreglo, índice del
        elemento a copiar, cantidad de valores que deben copiarse)
         */
        System.arraycopy(listaDeValoresInt, 0, copiaDeListaDeValoresInt, 0, listaDeValoresInt.length);
        mostrarArreglo(listaDeValoresInt, "listaDeValoresInt");
        mostrarArreglo(copiaDeListaDeValoresInt, "copiaDeListaDeValoresInt");

        /*
        invoco al método estático equals de la clase Arrays para comparar el contenido de valores de las dos listas inicializadoras
        creadas anteriormente.
         */
        boolean compararListasDeValores = Arrays.equals(listaDeValoresInt, copiaDeListaDeValoresInt);
        // en el contenido de la clase System utilizo al operador ternario condicional (?:)
        System.out.printf("%nlistaDeValoresInt %s copiaDeListaDeValoresInt", compararListasDeValores ? "==" : "!=");

        // aquí comparo el contenido de elementos de dos arreglos creados anteriormente con ayuda del operador ternario condicional
        compararListasDeValores = Arrays.equals(rellenarListaDeValoresInt, listaDeValoresInt);
        System.out.printf("%nrellenarListaDeValoresInt %s listaDeValoresInt", compararListasDeValores ? "==" : "!=");

        /*
        en ésta instrucción utilicé el método estático binarySearch de la clase Arrays para buscar un elemento del arreglo
        'listaDeValoresInt' utilizando la sig. sintaxis: (arreglo, número a buscar en la lista de elementos)
         */
        int buscarElemento_1 = Arrays.binarySearch(listaDeValoresInt, 5);

        if (buscarElemento_1 >= 0) {
            System.out.println("\nSe encontró el número cinco en el arreglo 'listaDeValoresInt'");
        } else {
            System.out.println("Lo siento, no encontré el número cinco en el arreglo 'listaDeValoresInt'");
        }

        // en ésta instrucción utilicé el método estático binarySearch de la clase Arrays para buscar un número en específico
        int buscarElemento_2 = Arrays.binarySearch(listaDeValoresInt, 10);

        if (buscarElemento_2 >= 0) {
            System.out.println("Se encontró el número diez en el arreglo 'listaDeValoresInt'");
        } else {
            System.out.println("Lo siento, no encontré el número diez en el arreglo 'listaDeValoresInt'");
        }

    }

    // método para insertar argumentos (una variable de tipo arreglo entera y una variable de literal de cadena)
    public static void mostrarArreglo(int[] arreglo, String descripcion) {
        System.out.printf("%n%s: ", descripcion);

        for (int valor : arreglo) {
            System.out.printf("%d ", valor);
        }

    }

}
