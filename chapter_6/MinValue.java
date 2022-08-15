package chapter_6;

import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {

        // Determinar el valor mínimo de cuatro números
        // ejercicio
        // creo un objeto Scanner para introducir datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        // muestro un mensaje por pantalla
        System.out.println("Escribe cuatro números de tipo int separados por un espacio:");

        // en las sig. instrucciones introduciré los cuatro números de tipo int
        int numero_1 = entrada.nextInt();
        int numero_2 = entrada.nextInt();
        int numero_3 = entrada.nextInt();
        int numero_4 = entrada.nextInt();

        // asigno el método estático 'minValue' junto con sus cuatro argumentos a la variable 'resultado' de tipo int
        int resultado = minValue(numero_1, numero_2, numero_3, numero_4);

        // muestro el resultado por pantalla
        System.out.printf("El valor mínimo es: %d", resultado);

    }

    // creo el método estático 'minValue' de tipo int con cuatro parámetros
    public static int minValue(int a, int b, int c, int d) {
        // creo la variable local 'valorMinimo' de tipo int y le asigno a la variable 'a' para definirlo como el valor mínimo
        int valorMinimo = a;

        // instrucciones de selección para determinar el valor mínimo
        if (b < valorMinimo) {
            valorMinimo = b;
        }
        if (c < valorMinimo) {
            valorMinimo = c;
        }
        if (d < valorMinimo) {
            valorMinimo = d;
        }
        
        return valorMinimo; // solicito el retorno de la variable junto con su nuevo valor

    }

}
