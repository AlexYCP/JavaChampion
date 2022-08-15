package chapter_9;

public class EBMC_Ejecucion_1 {

    public static void main(String[] args) {

        // Demostración de las clases 'EBMC_Logica' y 'EBMC_Ejecucion_1'  
        // resultado a base del constructor 'EBMC_Logica'
        EBMC_Logica ebmc = new EBMC_Logica("Alexander", "Pineda", "123456789-10", 17000, 5000, .05);
        System.out.println("Resultado a base del constructor 'EBMC_Logica':");
        System.out.printf("Nombre: %s %s%nNúmero de seguro social: %s"
                + "%nSalario base: %.2f%nMonto de ventas brutas: %.2f%nPorcentaje de comisión: %.2f"
                + "%nTotal de ingresos: %.2f%n",
                ebmc.obtenerNombre(), ebmc.obtenerApellido(), ebmc.obtenerNumeroDeSeguroSocial(),
                ebmc.obtenerSalarioBase(), ebmc.obtenerMontoDeVentasBrutas(), ebmc.obtenerPorcentajeDeComision(),
                ebmc.obtenerIngresos());

        // establezco nuevos valores
        ebmc.establecerSalarioBase(22000);
        ebmc.establecerMontoDeVentasBrutas(10000);
        ebmc.establecerPorcentajeDeComision(.10);
        
        // resultado a base del método sobrescrito 'toString'
        System.out.println("\nResultado a base del método sobrescrito 'toString':\n" + ebmc);

    }

}
