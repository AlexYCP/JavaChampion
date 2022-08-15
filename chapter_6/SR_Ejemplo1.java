package chapter_6;

import java.security.SecureRandom;

public class SR_Ejemplo1 {

    public static void main(String[] args) {

        // La Clase Secure Random para generar números aleatorios seguros
        // ejercicio
        // Generar 10 números aleatorios de la sig. secuencia numérica '1, 3, 5, 7, 9'
        // ejemplo
        SecureRandom numerosAleatorios = new SecureRandom();

        int contador = 0;

        System.out.println("Genera 10 números aleatorios de la sig. secuencia numérica \"1, 3, 5, 7, 9\":");

        while (contador < 10) {
            ++contador;
            int rangoDeNumeros = 1 + 2 * numerosAleatorios.nextInt(5);
            System.out.printf("%d ", rangoDeNumeros);
        }

    }

}
