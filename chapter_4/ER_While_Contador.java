package chapter_4;

import java.util.Scanner;

public class ER_While_Contador {

    public static void main(String[] args) {

        // Estructura de repetición While.
        /*
        Algoritmo de pseudocódigo con repetición controlada por un contador:
        
        Asignar a total el valor de cero
        Asignar al contador de calificaciones el valor de uno
 
        Mientras que el contador de calificaciones sea menor o igual que diez
        Pedir al usuario que introduzca la siguiente calificación
        Obtener como entrada la siguiente calificación
        Sumar la calificación al total
        Sumar uno al contador de calificaciones

        Asignar al promedio de la clase el total dividido entre diez
        Imprimir el promedio de la clase
         */

        Scanner entrada = new Scanner(System.in);

        int total = 0;
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Introduce la sig. calificación:");
            var calificacion = entrada.nextInt();
            total = total + calificacion;
            contador = contador + 1;
        }

        var promedio = total / 10;

        System.out.printf("%nEl promedio de la clase es de: %d de calificación.", promedio);

    }

}
