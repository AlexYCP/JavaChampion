package test;

import java.util.Arrays;

public class Test_25 {

    public static void main(String[] args) {

        // Test 25
        // ejemplo
        int[] listaDeElementos = {1, 4, 2, 5, 3, 6, 9, 8, 10, 7};

        int encontrarElemento = Arrays.binarySearch(listaDeElementos, 1);

        if (encontrarElemento >= 0) {
            System.out.println("Se encontró el número uno en el arreglo");
        } else {
            System.out.println("No se encontró el número uno en el arreglo");
        }

    }

}
