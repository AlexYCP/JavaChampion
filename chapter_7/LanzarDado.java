package chapter_7;

import java.security.SecureRandom;

public class LanzarDado {

    public static void main(String[] args) {

        // Lanzar un dado 120 mil veces y mostrar con qué frecuencia se obtuvo una cierta cantidad de números para cada cara del dado
        // ejemplo
        SecureRandom numerosAleatorios = new SecureRandom();

        int[] frecuenciaDeTiros = new int[7];

        int totalDeLanzamientos = 120000;

        System.out.println("Lanzar un dado 120 mil veces y mostrar con qué frecuencia se obtuvo una cierta cantidad de números para cada"
                + " cara del dado:");

        // genero el total de lanzamientos propuestos y uso el rango de números del uno al seis para determinar la frecuencia de éstos 
        for (int lanzamiento = 1; lanzamiento <= totalDeLanzamientos; lanzamiento++) {
            ++frecuenciaDeTiros[1 + numerosAleatorios.nextInt(6)];
        }

        System.out.printf("%s\t%s%n", "Número", "Frecuencia");

        // imprimo por pantalla la frecuencia de cada número del dado
        for (int tipoDeNumero = 1; tipoDeNumero < frecuenciaDeTiros.length; tipoDeNumero++) {
            System.out.printf("%d\t%d%n", tipoDeNumero, frecuenciaDeTiros[tipoDeNumero]);
        }

    }

}
