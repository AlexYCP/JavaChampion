package chapter_6;

import java.security.SecureRandom;

public class SR_LanzarDado_1 {

    public static void main(String[] args) {

        // La Clase Secure Random se utiliza para generar números aleatorios seguros
        // ejemplo
        // lanzar un dado 5 veces e imprimir el resultado
        // creo un objeto 'dado' para producir números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        // inicializo a la sig. variable local con un valor de cero
        int contador = 0;
        // muestro el título por pantalla
        System.out.println("El resultado de lanzar un dado cinco veces:");
        // estructura de repetición apoyada por un contador
        while (contador < 5) {
            ++contador;
            // produzco números enteros entre el uno y el seis
            /*
            Análisis más detallado:
            La sig. instrucción 
            'int rangoDeNumeros = numerosAleatorios.nextInt(6);'
            produce el sig. rango de números
            '0, 1, 2, 3, 4, 5'
            ahora bien, para crear el rango del uno al seis de mi juego de dados necesito la sig. instrucción
            'int rangoDeNumeros = 1 + numerosAleatorios.nextInt(6);'
            que ahora producirá la sig. secuencia de números
            '1, 2, 3, 4, 5, 6'
            ya que, sumar uno al método static nextInt() desplazará al número cero del rango de números, lo que podría resumirse en:
            el número uno inicializa el rango y el número seis determina hasta qué número se producirá la secuencia de valores
            */
            int rangoDeNumeros = 1 + numerosAleatorios.nextInt(6);
            System.out.printf("%d ", rangoDeNumeros);
            /*
            Una observación sobre el rendimiento:
            Usar SecureRandom en vez de Random para lograr mayores niveles de seguridad incurre en un considerable castigo para el
            rendimiento. Para las aplicaciones "casuales", tal vez sea más conveniente usar la clase Random del paquete java.util:
            simplemente reemplace SecureRandom con Random.
            */
        }

    }

}
