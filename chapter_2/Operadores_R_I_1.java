package chapter_2;

import java.util.Scanner;

public class Operadores_R_I_1 {

    public static void main(String[] args) {

        // Operadores Relacionales y de Igualdad
        /*
        Existen seis tipos y son los siguientes: ==, !=, >, <, >= y <= 
         */
        // utilizaré la clase Scanner para ingresar datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        var numeroUno = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        var numeroDos = entrada.nextInt();

        // Operador Relacional: == (igual que)
        if (numeroUno == numeroDos) {
            System.out.println("Los dos números son iguales" + "\n");
        }

        // Operador Relacional: != (diferente que)
        if (numeroUno != numeroDos) {
            System.out.printf("Los dos números no son iguales" + "\n");
        }

        // Operador Relacional: > (mayor que)
        if (numeroUno > numeroDos) {
            System.out.printf("El número %d es mayor que el número %d%n", numeroUno, numeroDos);
        }

        // Operador Relacional: < (menor que)
        if (numeroUno < numeroDos) {
            System.out.printf("El número %d es menor que el número %d%n", numeroUno, numeroDos);
        }

        // Operador Relacional: >= (mayor igual que)
        if (numeroUno >= numeroDos) {
            System.out.printf("El número %d es mayor igual que el número %d%n", numeroUno, numeroDos);
        }

        // Operador Relacional: <= (menor igual que)
        if (numeroUno <= numeroDos) {
            System.out.printf("El número %d es menor igual que el número %d%n", numeroUno, numeroDos);
        }

    }

}
