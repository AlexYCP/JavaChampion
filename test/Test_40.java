package test;

public class Test_40 {

    public static void main(String[] args) {

        // Test 9
        // Nueva manera de realizar el sig. algoritmo para imprimir una secuencia numérica del uno al 10.
        // variables globales
        int b = 0;

        // nueva forma de iterar datos con el ciclo repetitivo while
        /*
        En este ciclo while, preincrementé a la variable 'b' en automático para que de inmediato tome el valor de uno, ya que,
        actualmente vale cero. Cabe recalcar también, que esta nueva forma redució en una línea al código de mi programa.
         */
        while (++b <= 10) {
            // estructura de selección anidada
            if (b <= 9) {
                System.out.printf("%d, ", b);
            } else {
                System.out.printf("%d.", b);
            }
        }

    }

}
