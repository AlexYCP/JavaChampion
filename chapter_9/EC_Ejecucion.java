package chapter_9;

public class EC_Ejecucion {

    public static void main(String[] args) {

        // Demostración de las clases 'EC_Logica' y 'EC_Ejecucion'
        EC_Logica ec = new EC_Logica("Alexander", "Pineda", "12345", 70000, .70);

        System.out.println("Información del empleado obtenida por los métodos establecer:");
        System.out.printf("Su nombre es: %s%n", ec.obtenerNombre());
        System.out.printf("Su apellido es: %s%n", ec.obtenerApellido());
        System.out.printf("Su número del seguro social es: %s%n", ec.obtenerNumeroDeSeguroSocial());
        System.out.printf("El total de ventas brutas obtenidas es de: %.2f%n", ec.obtenerMontoDeVentasBrutas());
        System.out.printf("El porcentaje por comisión es de: %.2f%n", ec.obtenerPorcentajeDeComision());
        System.out.printf("Total de ingresos: %.2f%n", ec.obtenerIngresos());

        // actualización de información con los métodos establecer
        ec.establecerMontoDeVentasBrutas(140000);
        ec.establecerPorcentajeDeComision(.50);

        System.out.printf("%nInformación del empleado obtenida por el método sobrescrito 'toString':"
                + "%n%s", ec);

    }

}
