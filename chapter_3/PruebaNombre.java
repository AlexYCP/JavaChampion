package chapter_3;

import java.util.Scanner;

public class PruebaNombre {

    public static void main(String[] args) {

        /*
        Al nombre de la variable 'miCuenta' se le atribuye el término 'referencia', ya que con ayuda de el
        puedo llamar a métodos que están escritos en otras clases.
         */
        Nombre miCuenta = new Nombre();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo:");
        String miNombreCompleto = entrada.nextLine();
        miCuenta.establecerNombre(miNombreCompleto);

        System.out.printf("Mi nombre es: %s", miCuenta.obtenerNombre());

    }
}
