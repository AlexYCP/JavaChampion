package chapter_9;

public class Herencia_EBMC_2 extends EC_Logica {

    //
    // campo
    private double salarioBase;

    // constructor
    public Herencia_EBMC_2(String nombre, String apellido, String numeroDeSeguroSocial,
            double montoDeVentasBrutas, double porcentajeDeComision, double salarioBase) {
        // llamada explícita del constructor de la superclase 'EC_Logica'
        super(nombre, apellido, numeroDeSeguroSocial, montoDeVentasBrutas, porcentajeDeComision);
        // valido el salario base
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario debe de ser mayor a 0.0");
        }
        // una vez validado el valor, posteriormente lo asigno a la variable de instancia
        this.salarioBase = salarioBase;
    }

    // establezco el salario base
    public void establecerSalarioBase(double salarioBase) {
        // valido el salario base
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario debe de ser mayor a 0.0");
        }
        // una vez validado el valor, posteriormente lo asigno a la variable de instancia
        this.salarioBase = salarioBase;
    }

    // devuelvo el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // llamo al método 'obtenerSalario' de la superclase 'EC_Logica'
    @Override
    public double obtenerIngresos() {
        return super.obtenerIngresos() + obtenerSalarioBase();
    }

    // invoco al método sobrescrito de la superclase Object
    @Override
    public String toString() {
        return String.format("%s%nSalario base: %s", super.toString(), salarioBase);
    }

}
