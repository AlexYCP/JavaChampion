package chapter_7;

public class Arreglo_2 {

    public static void main(String[] args) {

        // Creación de un arreglo
        // segundo método de crear arreglos
        int numeros[];
        numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        System.out.printf("El número del índice o subíndice del arreglo es: %d%n", numeros[0]);
        System.out.printf("%nA continuación, imprimiré por pantalla a todos los números creados por el arreglo en forma vertical:%n"
                + "[%d]%n[%d]%n[%d]%n[%d]%n[%d]", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);

    }

}
