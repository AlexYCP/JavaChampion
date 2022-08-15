package test;

public class Test_23 {

    public static void main(String[] args) {

        // Test 23
        // ejemplo
        int[] arreglo = {1, 2, 3, 4, 5};

        // imprimir la lista de elementos de las sig. forma: 1, 2, 3, 4, 5
        for (int elemento : arreglo) {
            if (elemento <= arreglo[3]) {
                System.out.printf("%d, ", elemento);
            } else {
                System.out.printf("%d", elemento);
            }
        }

    }

}
