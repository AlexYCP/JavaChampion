package chapter_3;

import java.util.Scanner;

public class ClaseSecundaria {

    public static void main(String[] args) {

        // A la variable 'cp' se le atribuye el nombre 'referencia'
        ClasePrincipal cp = new ClasePrincipal();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el primer número entero:");
        int numero_1 = entrada.nextInt();
        cp.establecerNumeroUno(numero_1);

        System.out.println("Escribe el segundo número entero:");
        int numero_2 = entrada.nextInt();
        cp.establecerNumeroDos(numero_2);

        /*
        Esta es otra forma de mostrar el resultado, sumando los dos números en la misma instrucción.
        System.out.printf("El resultado de la suma es: %d",
                (cp.obtenerNumeroUno() + cp.obtenerNumeroDos()));
         */
        System.out.printf("El resultado de la suma es: %d", cp.imprimirSuma());

    }
}
