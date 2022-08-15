package chapter_9;

public class EBMC_Logica {

    // Clase: empleado base más comisión
    // campos
    private final String nombre;
    private final String apellido;
    private final String numeroDeSeguroSocial;
    private double salarioBase;
    private double montoDeVentasBrutas;
    private double porcentajeDeComision;

    // constructor
    public EBMC_Logica(String nombre, String apellido, String numeroDeSeguroSocial,
            double salarioBase, double montoDeVentasBrutas, double porcentajeDeComision) {
        /*
        Aquí ocurre la llamada implícita del constructor de la super clase 'Object'
        */
        // valido los valores
        // valido el salario base
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario base debe de ser mayor a 0.0");
        }
        // valido el monto de ventas brutas
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("Error, el monto de ventas brutas debe de ser mayor a 0.0");
        }
        // valido el porcentaje de comisión
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("Error, el porcentaje de comisión debe de ser mayor a 0.0 y menor o igual a 1.0");
        }
        // una vez validados los parámetros, posteriormente los asigno a las variables de instancia
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
        this.salarioBase = salarioBase;
        this.montoDeVentasBrutas = montoDeVentasBrutas;
        this.porcentajeDeComision = porcentajeDeComision;
    }

    // devuelvo mi nombre
    public String obtenerNombre() {
        return nombre;
    }

    // devuelvo mi apellido
    public String obtenerApellido() {
        return apellido;
    }

    // devuelvo el número de seguridad social
    public String obtenerNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    // establezco el salario base
    public void establecerSalarioBase(double salarioBase) {
        // valido el salario base
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario base debe de ser mayor o igual a 0.0");
        }
        // añado el valor a la variable de instancia
        this.salarioBase = salarioBase;
    }

    // devuelvo el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // establezco el monto de ventas brutas
    public void establecerMontoDeVentasBrutas(double montoDeVentasBrutas) {
        // valido el monto de ventas brutas
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("Error, el monto de ventas brutas debe de ser mayor a 0.0");
        }
        // añado el valor a la variable de instancia
        this.montoDeVentasBrutas = montoDeVentasBrutas;
    }

    // devuelvo el monto de ventas brutas
    public double obtenerMontoDeVentasBrutas() {
        return montoDeVentasBrutas;
    }

    // establezo el porcentaje de comisión
    public void establecerPorcentajeDeComision(double porcentajeDeComision) {
        // valido el porcentaje de comisión
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("Error, el porcentaje de comisión debe de ser mayor a 0.0 y menor o igual a 1.0");
        }
        // añado el valor a la variable de instancia
        this.porcentajeDeComision = porcentajeDeComision;
    }

    // devuelvo el porcentaje de comisión
    public double obtenerPorcentajeDeComision() {
        return porcentajeDeComision;
    }

    // calculo los ingresos
    public double obtenerIngresos() {
        return (montoDeVentasBrutas * porcentajeDeComision) + salarioBase;
    }

    // devuelvo la representación String del objeto 'EBMC_Logica'
    // método sobrescrito de la superclase Object
    @Override
    public String toString() {
        return String.format("Nombre: %s %s%nNúmero de seguro social: %s"
                + "%nSalario base: $%.2f%nMonto de ventas brutas: $%.2f%nPorcentaje de comisión: %.2f"
                + "%nTotal de ingresos: $%.2f",
                nombre, apellido, numeroDeSeguroSocial, salarioBase, montoDeVentasBrutas, porcentajeDeComision,
                obtenerIngresos());
    }

}
