package chapter_10;

public class PYED_Pagar {

    public static void main(String[] args) {

        // Prueba y ejecución de la interfaz 'Pagar'
        Pagar[] objetoPorPagar = new Pagar[4];

        // creo el arreglo con objetos de la interfaz 'Pagar' y los relleno con objetos de subclases
        objetoPorPagar[0] = new Factura("1", "Memoria USB", 140.00, 10);
        objetoPorPagar[1] = new Factura("2", "Disco duro", 540.00, 5);
        objetoPorPagar[2] = new EmpleadoPorSemana("Alexander", "Pineda", "1234567-14", 7000.00);
        objetoPorPagar[3] = new EmpleadoPorSemana("Yosimar", "Pineda", "1234567-21", 7500.00);

        // muestro el encabezado
        System.out.println("Procesamiento de forma polimórfica de objetos 'Factura' y 'EmpleadoPorSemana'");

        // proceso en forma genérica cada elemento en el arreglo 'objetoPorPagar'
        for (Pagar objeto : objetoPorPagar) {
            System.out.printf("%n%s%nMonto a pagar: $%.2f%n", objeto.toString(), objeto.obtenerElMontoDelPago());
        }

    }

}
