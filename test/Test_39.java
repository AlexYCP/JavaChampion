package test;

public class Test_39 {

    public static void main(String[] args) {

        // Test 8
        // Imprime una secuencia del uno al 10.
        // variables globales
        int a = 1;

        // mostrar mensaje por pantalla
        System.out.println("Secuencia del uno al 10:");

        // ciclo iterativo
        while (a < 11) {
            // instrucción de selección anidada
            if (a <= 9) {
                System.out.printf("%d, ", a);
            } else {
                System.out.printf("%d.", a);
            }
            a++;
        }

    }
}
