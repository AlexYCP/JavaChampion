package test;

import java.util.Scanner;

public class Test_29 {

    public static void main(String[] args) {

        // Test 29
        // ejemplo
        Scanner entrada = new Scanner(System.in);

        String nombreDeColor_1 = "Negro",
                nombreDeColor_2 = "negro",
                nombreDeColor_3 = "NEGRO";

        System.out.println("Escribe el nombre del color que tienes en mente:");
        String escribirNombreDeColor = entrada.nextLine();

        if (nombreDeColor_1.equals(escribirNombreDeColor) || nombreDeColor_2.equals(escribirNombreDeColor)
                || nombreDeColor_3.equals(escribirNombreDeColor)) {
            System.out.println("Los nombres de colores son idénticos");
        } else {
            System.out.println("Los nombres de colores no son idénticos");
        }

    }

}
