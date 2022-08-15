package ejercicios;

public class Ejercicio_1 {

    public static void main(String[] args) {

        // Ejercicio 1:
        /*
        Escriba cuatro instrucciones distintas en Java, en donde cada una sume 1 a la variable entera x.
        Escriba instrucciones en Java para realizar cada una de las siguientes tareas:
         */
        System.out.println("Resuelve los sig. ejercicios del capítulo 4 del libro, gracias.\n");
        System.out.println("a) Usar una instrucción para asignar la suma de 'x' y 'y' a 'z', e incrementar 'x' en 1 después del"
                + " cálculo.");
        int x = 5;
        int y = 10;

        int z = x + y;

        ++x;

        System.out.printf("Resultado: x = %d, y = %d, z = %d, x ahora vale %d.%n%n", x, y, z, x);

        System.out.println("b) Evaluar si la variable cuenta es mayor que 10. De ser así, imprimir \"Cuenta es mayor que 10\".");

        int cuenta = 7;

        if (cuenta > 10) {
            System.out.println("Cuenta es mayor que 10.\n");
        } else {
            System.out.println("Cuenta no es mayor que 10.\n");
        }

        System.out.println("c) Usar una instrucción para decrementar la variable 'x' en 1, luego restarla a la variable total y"
                + " almacenar el resultado en la variable total.");

        int total = 20;

        --x;

        total = total - x;

        System.out.printf("El resultado es: %d%n%n", total);

        System.out.println("d) Calcular el residuo después de dividir 'q' entre divisor, y asignar el resultado a 'q'. Escriba esta"
                + " instrucción de dos maneras distintas.");

        int q = 90;
        int divisor = 8;

        int resto = q - (divisor * (q / divisor));

        q = q % divisor;

        System.out.printf("Resultado de la primera instrucción: %d.%nResultado de la segunda instrucción: %d.", resto, q);

    }
}
