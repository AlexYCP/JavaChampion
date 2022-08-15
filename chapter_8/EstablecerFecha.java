package chapter_8;

public class EstablecerFecha {

    // Establecer
    private int dia;
    private int mes;
    private int anio;

    private static final int[] ultimoDiaPorCadaMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //
    EstablecerFecha(int dia, int mes, int anio) {
        // verifico si el número de mes está dentro del rango válido (uno-12)
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("Mes " + mes + ", el número del mes se encuentra fuera del rango estándar (uno-12)");
        }

        // verifico si el número de día está dentro del rango válido para cada mes y año
        if (dia <= 0 || (dia > ultimoDiaPorCadaMes[mes] && !(mes == 2 && dia == 29))) {
            throw new IllegalArgumentException("Día " + dia + ", el número de día se encuentra fuera del rango estándar para el mes y"
                    + " año");
        }

        // verifico si es año bisiesto para el número de mes dos y el número de día 29
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            throw new IllegalArgumentException("Día " + dia + ", el número de día se encuentra fuera del rango estándar para el mes y"
                    + " año");
        }

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
        System.out.printf("Constructor de objeto \"EstablecerFecha\" para la fecha %s%n", this);
    }
    
    // devuelve un objeto String de la sig. forma: día/mes/año
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }

}
