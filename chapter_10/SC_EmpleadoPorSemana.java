package chapter_10;

public class SC_EmpleadoPorSemana extends SA_Empleado {

    // Subclase Concreta Directa (SC_EmpleadoPorSemana)
    // campo
    private double salarioSemanal;

    // constructor
    public SC_EmpleadoPorSemana(double salarioSemanal, String primerNombre, String primerApellido, String numeroDeSeguroSocial) {
        // invoco de manera explícita el constructor de la superclase abstracta
        super(primerNombre, primerApellido, numeroDeSeguroSocial);
        // verifico si el salario semanal es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("¡Error!, el salario semanal debe de ser mayor a $0.0");
        }
        // una vez verificado el salario semanal, asigno el valor a la variable correspondiente
        this.salarioSemanal = salarioSemanal;
    }

    // método para establecer el salario semanal
    public void establecerSalarioSemanal(double salarioSemanal) {
        // verifico si el salario semanal es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("¡Error!, el salario semanal debe de ser mayor a $0.0");
        }
        // una vez verificado el salario semanal, asigno el valor a la variable correspondiente
        this.salarioSemanal = salarioSemanal;
    }

    // método para obtener el salario semanal
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    // sobrescribo el método abstracto 'calcularIngresos' de la superclase abstracta 'SA_Empleado'
    @Override
    public double calcularIngresos() {
        return obtenerSalarioSemanal() * 4;
    }

    // método sobrescrito para devolver representación String del objeto 'SC_EmpleadoPorSemana'
    @Override
    public String toString() {
        return String.format("%s%nSalario semanal: $%.2f%nTotal de ingresos: $%.2f",
                super.toString(), obtenerSalarioSemanal(), calcularIngresos());
    }

}
