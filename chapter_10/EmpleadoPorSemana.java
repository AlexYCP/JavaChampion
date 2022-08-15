package chapter_10;

public class EmpleadoPorSemana extends Empleado {

    // campo
    private double salarioPorSemana;

    // constructor
    public EmpleadoPorSemana(String nombre, String apellido, String numeroDeSeguroSocial,
            double salarioPorSemana) {
        super(nombre, apellido, numeroDeSeguroSocial);

        // verifico que el salario semanal sea mayor a $0.0
        if (salarioPorSemana <= 0.0) {
            throw new IllegalArgumentException("Error. El salario semanal debe de ser mayor a $0.0");
        }

        this.salarioPorSemana = salarioPorSemana;
    }

    // método para establecer el salario semanal
    public void establecerSalarioPorSemana(double salarioPorSemana) {
        // verifico que el salario semanal sea mayor a $0.0
        if (salarioPorSemana <= 0.0) {
            throw new IllegalArgumentException("Error. El salario semanal debe de ser mayor a $0.0");
        }

        this.salarioPorSemana = salarioPorSemana;
    }

    // método para obtener el salario semanal
    public double obtenerSalarioPorSemana() {
        return salarioPorSemana;
    }

    // método sobrescrito
    @Override
    public double obtenerElMontoDelPago() {
        return obtenerSalarioPorSemana() * 4;
    }

    // método sobrescrito
    @Override
    public String toString() {
        return String.format("Empleado:%n%s%nSalario por semana: $%.2f",
                super.toString(), obtenerSalarioPorSemana());
    }

}
