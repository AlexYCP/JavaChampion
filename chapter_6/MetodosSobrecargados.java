package chapter_6;

public class MetodosSobrecargados {

    public static void main(String[] args) {

        // Sobrecarga de métodos
        // llamar al método int
        System.out.printf("El cuadrado del número 7 de tipo int es: %d", elCuadradoDeUnNumero(7));
        // llamar al método double
        System.out.printf("El cuadrado del número 7.5 de tipo double es: %.2f", elCuadradoDeUnNumero(7.5));

    }

    public static int elCuadradoDeUnNumero(int numeroInt) {
        System.out.printf("Se llamó al método \"elCuadradoDeUnNumero\" con un argumento int: %d%n", numeroInt);

        return numeroInt * numeroInt;
    }

    public static double elCuadradoDeUnNumero(double numeroDouble) {
        /*
        si no especifico la precisión en el especificador de formato para valores de punto flotante, éstos siempre se mostrarán de
        manera predeterminada con seis dígitos de precisión
        */
        System.out.printf("%nSe llamó al método \"elCuadradoDeUnNumero\" con un argumento double: %.1f%n", numeroDouble);

        return numeroDouble * numeroDouble;
    }

}
