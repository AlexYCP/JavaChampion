package chapter_10;

public class SC_E_PorSalarioBaseMasComision extends SC_EmpleadoPorComision {

    // Subclase Concreta Indirecta (SC_E_PorSalarioBaseMasComision)
    // campos
    private double salarioBase;

    // constructor
    public SC_E_PorSalarioBaseMasComision(double salarioBase, double montoDeVentasBrutas, double porcentajeDeComision,
            String primerNombre, String primerApellido, String numeroDeSeguroSocial) {
        // invoco de manera explícita el constructor de la subclase concreta directa
        super(montoDeVentasBrutas, porcentajeDeComision, primerNombre, primerApellido, numeroDeSeguroSocial);
        // verifico si el salario base es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("¡Error!, el salario base debe de ser mayor a $0.0");
        }
        // una vez verificado el salario base, asigno los valores a las variables correspondientes
        this.salarioBase = salarioBase;
    }

    // método para establecer el salario base
    public void establecerSalarioBase(double salarioBase) {
        // verifico si el salario base es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("¡Error!, el salario base debe de ser mayor a $0.0");
        }
        // una vez verificado el salario base, asigno los valores a las variables correspondientes
        this.salarioBase = salarioBase;
    }

    // método para obtener el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // sobrescribo el método abstracto 'calcularIngresos' de la superclase abstracta 'SA_Empleado'
    @Override
    public double calcularIngresos() {
        return obtenerSalarioBase() + super.calcularIngresos();
    }

    // método sobrescrito para devolver representación String del objeto 'SC_E_PorSalarioBaseMasComision'
    @Override
    public String toString() {
        return String.format("%s%nSalario base: $%.2f%nTotal de ingresos: $%.2f",
                super.toString(), obtenerSalarioBase(), calcularIngresos());
    }

}
