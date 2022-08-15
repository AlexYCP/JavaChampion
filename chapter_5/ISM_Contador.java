package chapter_5;

import java.util.Scanner;

public class ISM_Contador {

    public static void main(String[] args) {

        // Instrucción de selección múltiple 'switch'.
        // ejemplo:
        Scanner entrada = new Scanner(System.in);

        // variables globales
        int contador = 0;
        int aCuenta = 0,
                bCuenta = 0,
                cCuenta = 0,
                dCuenta = 0,
                fCuenta = 0;
        int total = 0;

        System.out.printf("Introduce las calificaciones en el rango de \"0-10\":%n");

        // iterar cinco veces para terminar el ingreso de las calificaciones
        while (contador < 5) {
            int calificacion = entrada.nextInt();
            total += calificacion;
            contador++;

            // incrementar el contador de letra de calificación apropiado
            switch (calificacion) {
                case 9: // calificación entre 9 y 10
                case 10: // calificación entre 10 y 9
                    ++aCuenta;
                    break;

                case 8: // calificación entre 8 y 8.9
                    ++bCuenta;
                    break;

                case 7: // calificación entre 7 y 7.9
                    ++cCuenta;
                    break;

                case 6: // calificación entre 6 y 6.9
                    ++dCuenta;
                    break;

                default: // calificación menor a 6
                    ++fCuenta;
                    break;
            }

        }

        // mostrar el reporte de las calificaciones
        System.out.printf("%nReporte de las calificaciones:%n");

        // verifico si ingresé al menos una calificación
        if (contador != 0) {
            // calculo el promedio y cambio el tipo de identificador de 'total' ('int' a 'double') para un resultado en números reales
            double promedio = (double) total / contador;

            // muestro el resumen del número total de calificaciones introducidas y su total en un número entero
            System.out.printf("El total de las %d calificaciones introducidas es de %d puntos.%n", contador, total);
            // muestro el promedio
            System.out.printf("El promedio final es de %.2f puntos.%n", promedio);

            // imprimir por pantalla el resultado final
            System.out.printf("%nNúmero de calificaciones que se asignaron con cada letra:%n");
            System.out.printf("A: %d%nB: %d%nC: %d%nD: %d%nF: %d", aCuenta, bCuenta, cCuenta, dCuenta, fCuenta);
        } else {
            System.out.println("\nLo siento, no se introdujeron calificaciones.");
        }

    }

}
