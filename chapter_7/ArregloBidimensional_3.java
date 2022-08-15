package chapter_7;

public class ArregloBidimensional_3 {
    
    public static void main(String[] args) {

        // Arreglo bidimensional
        // ejemplo
        int[][] arreglo_1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arreglo_2 = {{7, 12}, {8, 9}, {10, 11, 14}};

        // imprimir el arreglo uno
        System.out.println("Arreglo uno:");
        imprimirArreglo(arreglo_1);

        // imprimir el arreglo dos
        System.out.println("Arreglo dos:");
        imprimirArreglo(arreglo_2);
        
    }

    // método estático para iterar a través de las filas y columnas del arreglo
    public static void imprimirArreglo(int[][] arreglo) {
        // iterar a través de las filas del arreglo
        for (int fila = 0; fila < arreglo.length; fila++) {
            // iterar a través de las columnas del arreglo
            for (int columna = 0; columna < arreglo[fila].length; columna++) {
                System.out.printf("[%d]", arreglo[fila][columna]);
            }
            System.out.println("");
        }
    }
    
}
