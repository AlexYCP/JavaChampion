package chapter_9;

public class Herencia_EBMC_1 extends EC_Logica {

    // Demostración de las super propiedades de la Herencia para el óptimo desarrollo de programas y aplicaciones
    /*
    Demostración de las propiedades de Herencia para mejorar el desarrollo de una superclase sin tener que copiar y pegar todo el código
    de la misma.
     */
    // campo
    private double salarioBase;

    // constructor
    public Herencia_EBMC_1(String nombre, String apellido, String numeroDeSeguroSocial,
            double salarioBase, double montoDeVentasBrutas, double porcentajeDeComision) {
        // llamada explícita al constructor de la superclase 'EC_Logica'
        super(nombre, apellido, numeroDeSeguroSocial, montoDeVentasBrutas, porcentajeDeComision);
        // valido el salario base, en caso de ingresar un valor inválido lanzar ecepción
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario base debe de ser mayor a 0.0");
        }
        // una vez validado el dato, posteriormente agrego el valor a la variable de instancia
        this.salarioBase = salarioBase;
    }

    // establezco el salario base
    public void establecerSalarioBase(double salarioBase) {
        // valido el salario base, en caso de ingresar un valor inválido lanzar ecepción
        if (salarioBase <= 0.0) {
            throw new IllegalArgumentException("Error, el salario base debe de ser mayor a 0.0");
        }
        // una vez validado el dato, posteriormente agrego el valor a la variable de instancia
        this.salarioBase = salarioBase;
    }

    // devuelvo el salario base
    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // llamo al método 'obtenerIngresos' de la superclase 'EC_Logica'
    @Override
    public double obtenerIngresos() {
        return (montoDeVentasBrutas * porcentajeDeComision) + salarioBase;
    }
    
    // imprimo la representación String del objeto 'Herencia_EBMC_1'
    // llamo al método sobrescrito 'toString' de la superclase Object
    @Override
    public String toString() {
        return String.format("Nombre: %s %s%nNúmero de seguro social: %s"
                + "%nSalario base: %.2f%nMonto de ventas brutas: %.2f%nPorcentaje de comisión: %.2f"
                + "%nTotal de ingresos: %.2f",
                nombre, apellido, numeroDeSeguroSocial, salarioBase, montoDeVentasBrutas, porcentajeDeComision,
                obtenerIngresos());
    }

}
