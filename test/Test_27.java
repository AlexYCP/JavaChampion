package test;

public class Test_27 {

    public static void main(String[] args) {

        // Test 27
        // ejemplo
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};

        imprimirResultado(arreglo, "Indice\tElemento\n");

    }

    public static void imprimirResultado(int[] arreglo, String encabezado) {
        System.out.print(encabezado);

        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%d\t%d%n", contador, arreglo[contador]);
        }
    }

}
