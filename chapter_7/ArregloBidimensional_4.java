package chapter_7;

public class ArregloBidimensional_4 {
    
    public static void main(String[] args) {

        // Arreglo bidimensional
        // ejemplo
        int[][] arregloBidimensional = {{1, 2}, {3, 4}};

        // imprimir arreglo bidimensional de dos filas y dos columnas
        System.out.println("Arreglo bidimensional de dos filas y dos columnas:");
        imprimirArreglo(arregloBidimensional);
        
    }
    
    public static void imprimirArreglo(int[][] arreglo) {
        // iterar a través del arreglo mediante sus filas
        for (int fila = 0; fila < arreglo.length; fila++) {
            // iterar a través del arreglo mediante sus columnas
            for (int columna = 0; columna < arreglo[fila].length; columna++) {
                System.out.printf("[%d]", arreglo[fila][columna]);
            }
            System.out.println("");
        }
    }
    
}
