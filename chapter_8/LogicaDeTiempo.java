package chapter_8;

public class LogicaDeTiempo {

    // Lógica de la clase tiempo
    private int hora; // rango de 0 a 23
    private int minuto; // rango de 0 a 59
    private int segundo; // rango de 0 a 59

    public void establecerTiempo(int hora, int minuto, int segundo) {
        // si la hora establecida está fuera del rango establecido, imprime el sig. mensaje por pantalla
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("\nHora, minuto o segundo, se encuentran fuera del rango establecido\n");
        }

        // si el formato de hora se estableció correctamente, procedo a validar la hora, el minuto y el segundo
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // convierto a objeto de tipo String en formato universal de tiempo (HH:MM:SS)
    public String formatoUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // convierto a objeto de tipo String en formato de hora estándar de tiempo (H:MM:SS, AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

}
