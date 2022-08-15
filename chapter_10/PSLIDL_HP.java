package chapter_10;

import chapter_9.EC_Logica;
import chapter_9.EBMC_Logica;

public class PSLIDL_HP {

    public static void main(String[] args) {

        // Prueba sin la implementación de la Herencia y el Polimorfismo
        // Ejemplo y prueba de la no utilización de la Herencia y el Polimorfismo
        // asigno la referencia a una variable de la superclase
        EC_Logica empleadoPorComision = new EC_Logica("Alexandro", "Pineda", "12345_7", 50000, .50);
        // invoco a 'toString' en un objeto de la superclase, usando una variable de la superclase
        System.out.printf("Llamada a 'toString' de 'EC_Logica' con referencia de superclase"
                + " a un objeto de la superclase:%n%s%n", empleadoPorComision.toString());

        // asigno la referencia a una variable de la subclase
        EBMC_Logica empleadoBaseMasComision = new EBMC_Logica("Alexandré", "Pineda", "12345_14", 20000, 25000, .25);
        // invoco a 'toString' en un objeto de la subclase, usando una variable de la subclase
        System.out.printf("%nLlamada a 'toString' de 'EBMC_Logica' con referencia de subclase"
                + " a un objeto de la subclase:%n%s", empleadoBaseMasComision.toString());

        // EC_Logica empleadoPorComision_2 = empleadoBaseMasComision;
    }

}
