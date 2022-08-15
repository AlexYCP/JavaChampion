package test;

import java.util.Scanner;

public class Test_31 {

    // Test _31
    // ejemplo
    static Scanner entrada = new Scanner(System.in);

    private String mensaje;

    public void imprimirMensaje(String encabezadoDelMensaje, String escribirElMensaje) {
        this.mensaje = escribirElMensaje;

        System.out.println(encabezadoDelMensaje);
        escribirElMensaje = entrada.nextLine();

        System.out.printf("%nMuy bien, el mensaje es:%n%s", escribirElMensaje);
    }

}
