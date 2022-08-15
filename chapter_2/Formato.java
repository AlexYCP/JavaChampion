package chapter_2;

/**
 *
 * @author Alexander
 */
public class Formato {

    public static void main(String[] args) {

        // Formato en cadenas de texto con "printf"
        // El método System.out.printf (“f” significa “formato”) muestra datos con formato.
        String nombres = "Alexander Yosimar",
                apellidos = "Cervantes Pineda";
        var edad = 23;

        // "%s" sustituye a un String y "%d" sustituye a un valor numérico
        // "%n" da un salto de línea
        System.out.printf("Mis nombres son %s %s y tengo %d años", nombres, apellidos, edad);

    }

}
