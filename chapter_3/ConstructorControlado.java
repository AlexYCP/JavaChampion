package chapter_3;

import java.util.Scanner;

public class ConstructorControlado {

    private String nombres;
    private String apellidos;

    public ConstructorControlado(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, ¿cuáles son tus nombres?:");
        nombres = entrada.nextLine();

        System.out.println("Y ahora, escribe tus apellidos:");
        apellidos = entrada.nextLine();

        System.out.printf("Muy bien, tu nombre completo es %s %s", nombres, apellidos);

    }

}
