package test;

import java.util.Arrays;

public class Test_22 {

    public static void main(String[] args) {

        // Test 22
        // ejemplo
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int buscarElemento_1 = Arrays.binarySearch(arreglo, 1);

        if (buscarElemento_1 >= 0) {
            System.out.println("Se encontró el número");
        } else {
            System.out.println("No se encontró el elemento");
        }

    }

}
