package chapter_9;

public class EBMC_Ejecucion_2 {

    public static void main(String[] args) {

        // Demostración de la maravillosa funcionalidad de Herencia
        Herencia_EBMC_1 h_ebmc = new Herencia_EBMC_1("Alexander", "Pineda", "123456789-20", 47000, 87000, .57);
        System.out.printf("Nombre: %s %s%n", h_ebmc.obtenerNombre(), h_ebmc.obtenerApellido());
        System.out.printf("Número de seguro social: %s%n", h_ebmc.obtenerNumeroDeSeguroSocial());
        System.out.printf("Salario base: %.2f%n", h_ebmc.obtenerSalarioBase());
        System.out.printf("Monto de ventas brutas: %.2f%n", h_ebmc.obtenerMontoDeVentasBrutas());
        System.out.printf("Porcentaje de comisión: %.2f%n", h_ebmc.obtenerPorcentajeDeComision());
        System.out.printf("Total de ingresos: %.2f%n", h_ebmc.obtenerIngresos());

        // establezco nuevos valores
        h_ebmc.establecerMontoDeVentasBrutas(121000);
        h_ebmc.establecerPorcentajeDeComision(.72);
        h_ebmc.establecerSalarioBase(58000);

        // imprimo el resultado con el método sobrescrito 'toString'
        System.out.println(h_ebmc);

    }

}
