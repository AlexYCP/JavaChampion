package chapter_9;

public class EC_Logica extends Object {

    // Esta clase representa a un empleado que recibe como sueldo un porcentaje de la ventas brutas de una empresa
    // campos
    private final String nombre;
    private final String apellido;
    private final String numeroDeSeguroSocial;
    private double montoDeVentasBrutas; // ventas totales por semana
    private double porcentajeDeComision; // comisión por las ventas

    // constructor con cinco parámetros
    public EC_Logica(String nombre, String apellido, String numeroDeSeguroSocial,
            double ventasBrutas, double porcentajeDeComision) {
        /*
        Aquí ocurre la llamada explícita del constructor de la superclase 'Object'
        */
        // valido los datos ingresados
        // si 'ventasBrutas' no es válida, lanzar la sig. excepción
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben de ser mayores a 0.0");
        }
        // si 'porcentajeDeComision' no es válido, lanzar la sig. excepción
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("El porcentaje de comisión debe de ser mayor a 0.0 y menor o igual a 1.0");
        }
        // al validar todos los datos, posteriormente, asigno los valores
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
        this.montoDeVentasBrutas = ventasBrutas;
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

    // establezco el monto de ventas brutas
    public void establecerMontoDeVentasBrutas(double montoDeVentasBrutas) {
        if (montoDeVentasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben de ser mayores a 0.0");
        }

        this.montoDeVentasBrutas = montoDeVentasBrutas;
    }

    // obtengo el monto de ventas brutas
    public double obtenerMontoDeVentasBrutas() {
        return montoDeVentasBrutas;
    }

    // establezco el porcentaje de ventas por comisión
    public void establecerPorcentajeDeComision(double porcentajeDeComision) {
        if (porcentajeDeComision < 0.0 || porcentajeDeComision > 1.0) {
            throw new IllegalArgumentException("El porcentaje de comisión debe de ser mayor a 0.0 y menor o igual a 1.0");
        }

        this.porcentajeDeComision = porcentajeDeComision;
    }

    // obtengo el porcentaje de ventas por comisión
    public double obtenerPorcentajeDeComision() {
        return porcentajeDeComision;
    }

    // calculo los ingresos
    public double obtenerIngresos() {
        return montoDeVentasBrutas * porcentajeDeComision;
    }

    // devuelvo la representación String del objeto 'EC_Logica'
    @Override // indico que éste método sobrescribe un método de una superclase
    public String toString() {
        return String.format("Empleado por comisión: %s %s%nNúmero de seguro social: %s"
                + "%nMonto de ventas brutas: $%.2f%nPorcentaje de comisión: %.2f"
                + "%nTotal de ingresos: $%.2f",
                nombre, apellido, numeroDeSeguroSocial, montoDeVentasBrutas, porcentajeDeComision,
                obtenerIngresos());
    }
}
