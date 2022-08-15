package chapter_6;

import java.util.Scanner;

public class Math_MaxMin {

    public static void main(String[] args) {

        // Determinar el valor máximo y mínimo de cuatro variables reutilizando el código de los métodos estáticos de la Clase Math
        // ejemplo
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, por favor introduce cuatro números enteros separados por espacios, gracias:");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();

        // determinar el valor máximo
        int valorMaximo = Math.max(Math.max(n1, n2), Math.max(n3, n4));

        // determinar el valor mínimo
        int valorMinimo = Math.min(Math.min(n1, n2), Math.min(n3, n4));

        System.out.printf("%nMuy bien, a continuación presentaré los sig. resultados:%n"
                + "Valor máximo: %d%nValor mínimo: %d", valorMaximo, valorMinimo);

    }

}
