package test;

import java.util.Scanner;

public class Test_A {

    // Test_A
    private Scanner entrada = new Scanner(System.in);

    // campos
    private String nombre;
    private String paisDeOrigen;
    private int edad;
    private String pasion;

    public Test_A(String nombre, String paisDeOrigen, int edad, String pasion) {
        System.out.println("Hola, escribe lo que se te pide a continuación, gracias.");

        System.out.println("Nombre completo:");
        nombre = entrada.nextLine();

        System.out.println("País de origen:");
        paisDeOrigen = entrada.nextLine();

        System.out.println("Tu más grande pasión:");
        pasion = entrada.nextLine();

        System.out.println("Edad:");
        edad = entrada.nextInt();

        System.out.printf("Carta de presentación:%n"
                + "Hola, me llamo %s, mi país de origen es %s, tengo %d años y mi más grande pasión es %s",
                nombre, paisDeOrigen, edad, pasion);

        this.nombre = nombre;
        this.paisDeOrigen = paisDeOrigen;
        this.edad = edad;
        this.pasion = pasion;
    }

}
