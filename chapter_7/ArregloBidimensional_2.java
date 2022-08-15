package chapter_7;

public class ArregloBidimensional_2 {

    public static void main(String[] args) {

        // Arreglo bidimensional mediante expresión de creación de arreglo
        // ejemplo
        int[][] arreglo = new int[2][2];

        arreglo[0][0] = 0;
        arreglo[0][1] = 1;
        arreglo[1][0] = 1;
        arreglo[1][1] = 0;

        System.out.println("Columna 0, Columna 1:");
        System.out.printf("Fila 0: [%d][%d]", arreglo[0][0], arreglo[0][1]);
        System.out.printf("%nFila 1: [%d][%d]", arreglo[1][0], arreglo[1][1]);

    }

}
