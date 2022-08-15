package pseudocódigo;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Realiza el sig. ejercicio con ayuda del algoritmo en pseudocódigo.
        /*
        Pseudocódigo:
        Algoritmo para tomar un vaso de agua.

        Crear variable nombre para almacenar el nombre del usuario
        Crear variable decisión para almacenar un valor

        Preguntarle su nombre al usuario
        Almacenar nombre del usuario en variable nombre

        Pedirle al usuario que escriba 1 si quiere un vaso de agua
        Almacenar el valor en la variable decision

        Si decision es igual a 1
            Imprime por pantalla "Muy bien, *nombre del usuario*, toma y bebe tu vaso de agua."
        De no ser así
            Imprime por pantalla "Está bien, *nombre del usuario*, entiendo que no tienes sed, te recomiendo que guardes tu vaso de
            agua para después."
         */
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int decision;

        System.out.println("Hola, ¿cuál es tu nombre?:");
        nombre = entrada.nextLine();

        System.out.println("Escribe 1 si quieres que te sirva un vaso de agua o teclea otro número si no quieres:");
        decision = entrada.nextInt();

        if (decision == 1) {
            System.out.printf("Muy bien, %s, toma y bebe tu vaso de agua.", nombre);
        } else {
            System.out.printf("Está bien, %s, entiendo que no tienes sed, te recomiendo que guardes tu vaso de agua para después.",
                    nombre);
        }

    }
}
