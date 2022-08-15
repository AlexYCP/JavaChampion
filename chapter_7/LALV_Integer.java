package chapter_7;

public class LALV_Integer {

    public static int calcularSuma(int... numeros) {
        int total = 0;

        for (int numero : numeros) {
            total += numero;
        }

        return total;
    }

    public static void main(String[] args) {

        // Lista de argumentos de longitud variable
        int numeroUno = 1,
                numeroDos = 2,
                numeroTres = 3,
                numeroCuatro = 4,
                numeroCinco = 5;

        System.out.printf("La lista de números es: %d, %d, %d, %d, %d.", numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco);

        System.out.printf("%nEl total de la suma de los números es: %d.",
                calcularSuma(numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco));

        System.out.printf("%nLa suma de uno, dos, y tres es: %d.", calcularSuma(numeroUno, numeroDos, numeroTres));
        System.out.printf("%nLa suma de cuatro y cinco es: %d.", calcularSuma(numeroCuatro, numeroCinco));

    }

}
