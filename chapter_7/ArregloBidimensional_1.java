package chapter_7;

public class ArregloBidimensional_1 {

    public static void main(String[] args) {

        // Arreglo bidimensional por una lista de números de inicializadores de arreglos anidados
        // ejemplo
        int[][] arreglo = {{0, 1}, {1, 0}};

        // imprimir arreglo bidimensional
        System.out.println("Columna 0, Columna 1:");
        System.out.printf("Fila 0: [%d][%d]", arreglo[0][0], arreglo[0][1]);
        System.out.printf("%nFila 1: [%d][%d]", arreglo[1][0], arreglo[1][1]);

    }

}
