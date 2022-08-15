package chapter_5;

public class ER_ForContador {

    public static void main(String[] args) {

        // Estructura de repetición 'for'.
        // Imprime la secuencia numérica del uno al 10.
        // al contenido de la palabra reservada 'for' que está entre paréntesis se le conoce como 'encabezado de la instrucción for'
        for (int i = 1; i <= 10; i++) {
            if (i <= 9) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d.", i);
            }
        }

    }
}
