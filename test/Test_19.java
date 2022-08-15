package test;

import java.security.SecureRandom;

public class Test_19 {

    public static void main(String[] args) {

        // Test 19
        // test
        SecureRandom numerosAleatorios = new SecureRandom();

        int contador = 0;

        int frecuencia_1 = 0,
                frecuencia_2 = 0;

        while (contador < 200) {
            ++contador;

            int rangoDeNumeros = 1 + numerosAleatorios.nextInt(2);

            switch (rangoDeNumeros) {
                case 1:
                    ++frecuencia_1;
                    break;
                case 2:
                    ++frecuencia_2;
                    break;
            }

        }

        int frecuenciaMaxima = Math.max(frecuencia_1, frecuencia_2);
        int frecuenciaMinima = Math.min(frecuencia_1, frecuencia_2);

        System.out.printf("Lancé una moneda 200 veces y obtuve los sig. datos:%nSol: %d%nÁguila: %d"
                + "%nFrecuencia máxima: %d%nFrecuencia mínima: %d",
                frecuencia_1, frecuencia_2, frecuenciaMaxima, frecuenciaMinima);

    }

}
