package chapter_6;

import java.security.SecureRandom;

public class SR_LanzarDado_2 {

    public static void main(String[] args) {

        // La Clase Secure Random se utiliza para generar números aleatorios seguros
        // ejemplo
        // lanzar un dado 120 mil veces y ver con qué frecuencia se obtuvo una cierta cantidad de números para cada número del dado
        // creo un objeto de la Clase Secure Random para generar número aleatorios seguros
        SecureRandom dado = new SecureRandom();

        // inicializo con un valor de cero a las sig. variables locales
        int contador = 0;
        int frecuencia_1 = 0,
                frecuencia_2 = 0,
                frecuencia_3 = 0,
                frecuencia_4 = 0,
                frecuencia_5 = 0,
                frecuencia_6 = 0;

        // muestro el título por pantalla
        System.out.println("El resultado de lanzar un dado 120 mil veces y mostrar con qué frecuencia se obtuvo una cierta cantidad"
                + " de números para cada número del dado:");

        // creo una estructura de repetición apoyada por un contador
        while (contador <= 120000) {
            ++contador;

            // produzco números enteros entre el uno y el seis
            int carasDelDado = 1 + dado.nextInt(6);

            // instrucción de selección múltiple
            switch (carasDelDado) {
                case 1:
                    ++frecuencia_1;
                    break;
                case 2:
                    ++frecuencia_2;
                    break;
                case 3:
                    ++frecuencia_3;
                    break;
                case 4:
                    ++frecuencia_4;
                    break;
                case 5:
                    ++frecuencia_5;
                    break;
                case 6:
                    ++frecuencia_6;
                    break;
            }

        }

        // instrucción para obtener la frecuencia mayor
        int frecuenciaMayor = Math.max(Math.max(Math.max(frecuencia_1, frecuencia_2), Math.max(frecuencia_3, frecuencia_4)), Math.max(frecuencia_5, frecuencia_6));

        // instrucción para obtener la frecuencia menor
        int frecuenciaMenor = Math.min(Math.min(Math.min(frecuencia_1, frecuencia_2), Math.min(frecuencia_3, frecuencia_4)), Math.min(frecuencia_5, frecuencia_6));

        int sumaDeNumeros = frecuencia_1 + frecuencia_2 + frecuencia_3 + frecuencia_4 + frecuencia_5 + frecuencia_6;

        System.out.printf("%nNúmero\tFrecuencia%n1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d",
                frecuencia_1, frecuencia_2, frecuencia_3, frecuencia_4, frecuencia_5, frecuencia_6);

        System.out.printf("%n%nFrecuencia mayor: %d%nFrecuencia menor: %d", frecuenciaMayor, frecuenciaMenor);

        System.out.printf("%n%nTotal de números aleatorios obtenidos: %d", sumaDeNumeros);

    }

}
