package test;

import java.util.Scanner;

public class Test_4 {

    public static void main(String[] args) {

        //
        Scanner entrada = new Scanner(System.in);
        Test_3 test = new Test_3();

        System.out.println("Introduce tu nombre:");
        String nombre = entrada.nextLine();
        test.setNombre(nombre);

        System.out.println("Ahora, introduce tu edad:");
        int edad = entrada.nextInt();
        test.setEdad(edad);

        System.out.printf("Mi nombre es %s y tengo %d años", test.getNombre(), test.getEdad());

    }
}
