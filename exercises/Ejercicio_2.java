package ejercicios;

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Ejercicio 2:
        int suma = 0;
        int x = 1;

        suma = suma + x;

        System.out.printf("La suma es: %d%n%n", suma);

        System.out.println("Imprime la secuencia del uno al 10:");
        while (x < 11) {
            if (x <= 9) {
                System.out.printf("%d, ", x);
            } else {
                System.out.printf("%d.", x);
            }
            x++;
        }

    }

}
