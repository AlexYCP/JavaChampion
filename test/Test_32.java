package test;

import java.util.Scanner;

public class Test_32 {

    // Test 32
    // ejemplo
    private static Scanner entrada = new Scanner(System.in);

    private static String escribirEncabezado;
    private static String escribirNumero;

    public static void main(String[] args) {

        //
        ingresarDatos("Escribe el nombre de un número:", "");

        if (escribirNumero.equals("Uno") || escribirNumero.equals("uno") || escribirNumero.equals("UNO")) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("Los dos números no son iguales");
        }

    }

    private static void ingresarDatos(String encabezado, String numero) {
        escribirEncabezado = encabezado;
        escribirNumero = numero;

        System.out.println(encabezado);
        escribirNumero = entrada.nextLine();
    }

}
