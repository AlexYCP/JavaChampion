package chapter_10;

public class PESN {

    public static void main(String[] args) {

        // Prueba y ejecución del sistema de nómina
        // creo cuatro objetos de las subclases (tres directas y una indirecta)
        // objeto de subclase directa
        SC_EmpleadoPorSemana eps = new SC_EmpleadoPorSemana(7000, "Alexander", "Pineda", "12345-7");
        // objeto de subclase directa
        SC_EmpleadoPorHoras eph = new SC_EmpleadoPorHoras(200, 35, "Alessandro", "Pineda", "12345-14");
        // objeto de subclase directa
        SC_EmpleadoPorComision epc = new SC_EmpleadoPorComision(50000, .50, "Alexandré", "Pineda", "12345-21");
        // objeto de subclase indirecta
        SC_E_PorSalarioBaseMasComision epsbmc = new SC_E_PorSalarioBaseMasComision(14000, 28000, .50, "Alexandro", "Pineda", "12345-28");

        System.out.println("Lista del personal de la empresa (impresa y procesada de forma separada):\n");

        System.out.printf("Empleado por semana:%n%s%n", eps);
        System.out.printf("%nEmpleado por horas:%n%s%n", eph);
        System.out.printf("%nEmpleado por comisión:%n%s%n", epc);
        System.out.printf("%nEmpleado por salario base más comisión:%n%s%n", epsbmc);

        // creo un arreglo 'SA_Empleado' con cuatro elementos
        SA_Empleado[] personal = new SA_Empleado[4];

        // inicializo el arreglo con objetos 'SA_Empleado'
        personal[0] = eps;
        personal[1] = eph;
        personal[2] = epc;
        personal[3] = epsbmc;

        System.out.println("\nLista del personal de la empresa (impresa y procesada de forma polimórfica):");

        // proceso en forma genérica a cada elemento de la superclase abstracta 'SA_Empleado'
        for (SA_Empleado objeto : personal) {
            // invoco al método sobrescrito 'toString'
            System.out.printf("%n%s%n", objeto);

            // verifico si objeto es un 'SC_E_PorSalarioBaseMasComision'
            if (objeto instanceof SC_E_PorSalarioBaseMasComision) {
                // conversión descendente de la referencia de 'SA_Empleado' a una referencia de 'SC_E_PorSalarioBaseMasComision'
                SC_E_PorSalarioBaseMasComision e_psbmc = (SC_E_PorSalarioBaseMasComision) objeto;
                // establezco y devuelvo un aumento al salario base del %1.10
                e_psbmc.establecerSalarioBase(1.10 * e_psbmc.obtenerSalarioBase());
                // muestro el salario base actualizado por el aumento del %1.10
                System.out.printf("Se ha añadido un aumento salarial, salario base actualizado: $%.2f%n", e_psbmc.obtenerSalarioBase());
            }
            // total de ingresos actualizados
            System.out.printf("Total de ingresos actualizados: $%.2f%n", objeto.calcularIngresos());
        }

        // obtengo el nombre del tipo de cada objeto en el arreglo del 'personal'
        for (int i = 0; i < personal.length; i++) {
            System.out.printf("%nEl empleado %d es un %s%n", i, personal[i].getClass().getName());
        }

    }

}
