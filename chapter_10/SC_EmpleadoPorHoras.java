package chapter_10;

public class SC_EmpleadoPorHoras extends SA_Empleado {

    // Subclase Concreta Directa (SC_EmpleadoPorHoras)
    // campos
    private double sueldoPorHora;
    private double horasPorSemana;

    // constructor
    public SC_EmpleadoPorHoras(double sueldoPorHora, double horasPorSemana,
            String primerNombre, String primerApellido, String numeroDeSeguroSocial) {
        // invoco de manera explícita el constructor de la superclase abstracta
        super(primerNombre, primerApellido, numeroDeSeguroSocial);
        // verifico si el sueldo por hora es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (sueldoPorHora < 0.0) {
            throw new IllegalArgumentException("¡Error!, el sueldo por hora debe de ser mayor a $0.0");
        }
        // verifico si las horas por semana son mayores a 0.0 o menores a 168.0, de no ser así, lanzo la sig. excepción
        if (horasPorSemana < 0.0 || horasPorSemana > 168.0) {
            throw new IllegalArgumentException("¡Error!, las horas por semana deben de ser mayores a 0.0 o menores a 168.0");
        }
        // una vez verificado el sueldo por hora y las horas por semana, asigno los valores a las variables correspondientes
        this.sueldoPorHora = sueldoPorHora;
        this.horasPorSemana = horasPorSemana;
    }

    // método para establecer el sueldo por hora
    public void establecerSueldoPorHora(double sueldoPorHora) {
        // verifico si el sueldo por hora es mayor a $0.0, de no ser así, lanzo la sig. excepción
        if (sueldoPorHora < 0.0) {
            throw new IllegalArgumentException("¡Error!, el sueldo por hora debe de ser mayor a $0.0");
        }
        // una vez verificado el sueldo por hora, asigno el valor a la variable correspondiente
        this.sueldoPorHora = sueldoPorHora;
    }

    // método para obtener el sueldo por hora
    public double obtenerSueldoPorHora() {
        return sueldoPorHora;
    }

    // método para establecer las horas por semana
    public void establecerHorasPorSemana(double horasPorSemana) {
        // verifico si las horas por semana son mayores a 0.0 o menores a 168.0, de no ser así, lanzo la sig. excepción
        if (horasPorSemana < 0.0 || horasPorSemana > 168.0) {
            throw new IllegalArgumentException("¡Error!, las horas por semana deben de ser mayores a 0.0 o menores a 168.0");
        }
        // una vez verificadas las horas por semana, asigno el valor a la variable correspondiente
        this.horasPorSemana = horasPorSemana;
    }

    // método para obtener las horas por semana
    public double obtenerHorasPorSemana() {
        return horasPorSemana;
    }

    // sobrescribo el método abstracto 'calcularIngresos' de la superclase abstracta 'SA_Empleado'
    @Override
    public double calcularIngresos() {
        if (obtenerHorasPorSemana() <= 40) {
            return obtenerSueldoPorHora() * obtenerHorasPorSemana() * 4;
        } else {
            return 40 * obtenerSueldoPorHora() + (obtenerHorasPorSemana() - 40) * obtenerSueldoPorHora() * 1.5;
        }
    }

    // método sobrescrito para devolver representación String del objeto 'SC_EmpleadoPorHoras'
    @Override
    public String toString() {
        return String.format("%s%nSueldo por horas: $%.2f%nCantidad de horas trabajadas por semana: %.2f%nTotal de ingresos: $%.2f",
                super.toString(), obtenerSueldoPorHora(), obtenerHorasPorSemana(), calcularIngresos());
    }

}
