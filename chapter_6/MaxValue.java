package chapter_6;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {

        // Determinar el valor máximo de tres números
        // ejercicio
        // creo un objeto Scanner para introducir datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        // muestro un mensaje por pantalla
        System.out.println("Hola, introduce tres números de tipo double separados por espacios:");

        // en las sig. instrucciones introduciré los tres números de tipo double
        double numeroUno = entrada.nextDouble();
        double numeroDos = entrada.nextDouble();
        double numeroTres = entrada.nextDouble();

        // asigno el método estático 'maxValue' junto con sus argumentos a la variable 'resultado' de tipo double
        double resultado = maxValue(numeroUno, numeroDos, numeroTres);

        // muestro el resultado por pantalla
        System.out.printf("El valor máximo es: %.2f", resultado);

    }

    // creo el método estático 'maxValue' de tipo double con tres parámetros
    public static double maxValue(double x, double y, double z) {
        // creo la variable local 'valorMaximo' de tipo double y le asigno a 'x' para definirlo como el valor máximo
        double valorMaximo = x;

        // instrucciones de selcción para determinar el valor máximo
        if (y > valorMaximo) {
            valorMaximo = y;
        }

        if (z > valorMaximo) {
            valorMaximo = z;
        }

        return valorMaximo; // solicito el retorno de la variable junto con su nuevo valor

    }

}
