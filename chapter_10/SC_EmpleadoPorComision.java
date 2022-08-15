package chapter_10;

public class SC_EmpleadoPorComision extends SA_Empleado {

    // Sublcase Concreta Directa (SC_EmpleadoPorComision)
    // campos
    private double montoDeVentasBrutas;
    private double porcentajeDeComision;

    // constructor
    public SC_EmpleadoPorComision(double montoDeVentasBrutas, double porcentajeDeComision,
            String primerNombre, String primerApellido, String numeroDeSeguroSocial) {
        // invoco de manera explícita el constructor de la superclase abstracta
        super(primerNombre, primerApellido, numeroDeSeguroSocial);
        // verifico si el monto de ventas brutas es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("¡Error!, el monto de ventas brutas debe de ser mayor a $0.0");
        }
        // verifico si el porcentaje de comisión es mayor a %0.0 y menor a %1.0, de no ser así, lanzo la sig. excepción
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("¡Error!, el porcentaje de comisión debe de ser mayor a %0.0 y menor a %1.0");
        }
        // una vez verificado el monto de ventas brutas y el porcentaje de comisión, asigno los valores a las variables correspondientes
        this.montoDeVentasBrutas = montoDeVentasBrutas;
        this.porcentajeDeComision = porcentajeDeComision;
    }

    // método para establecer el monto de ventas brutas
    public void establecerMontoDeVentasBrutas(double montoDeVentasBrutas) {
        // verifico si el monto de ventas brutas es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("¡Error!, el monto de ventas brutas debe de ser mayor a %0.0");
        }
        // una vez verificado el monto de ventas brutas, asigno el valor a la variable correspondiente
        this.montoDeVentasBrutas = montoDeVentasBrutas;
    }

    // método para obtener el monto de ventas brutas
    public double obtenerMontoDeVentasBrutas() {
        return montoDeVentasBrutas;
    }

    // método para establecer el porcentaje de comisión
    public void establecerPorcentajeDeComision(double porcentajeDeComision) {
        // verifico si el porcentaje de comisión es mayor a %0.0 y menor a %1.0, de no ser así, lanzo la sig. excepción
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("¡Error!, el porcentaje de comisión debe de ser mayor a %0.0 y menor a %1.0");
        }
        // una vez verificado el porcentaje de comisión, asigno el valor a la variable correspondiente
        this.porcentajeDeComision = porcentajeDeComision;
    }

    // método para obtener el porcentaje de comisión
    public double obtenerPorcentajeDeComision() {
        return porcentajeDeComision;
    }

    // sobrescribo el método abstracto 'calcularIngresos' de la superclase abstracta 'SA_Empleado'
    @Override
    public double calcularIngresos() {
        return obtenerMontoDeVentasBrutas() * obtenerPorcentajeDeComision();
    }

    // método sobrescrito para devolver representación String del objeto 'SC_EmpleadoPorComision'
    @Override
    public String toString() {
        return String.format("%s%nMonto de ventas brutas: $%.2f%nPorcentaje de comisión: %.2f"
                + "%nTotal de ingresos: $%.2f",
                super.toString(), obtenerMontoDeVentasBrutas(), obtenerPorcentajeDeComision(),
                calcularIngresos());
    }

}
