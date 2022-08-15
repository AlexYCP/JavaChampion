package chapter_8;

public class CS_LogicaDeTiempo {

    // Constructores sobrecargados
    private int hora;
    private int minuto;
    private int segundo;

    public CS_LogicaDeTiempo() {
        this(0, 0, 0);
    }

    public CS_LogicaDeTiempo(int hora) {
        this(hora, 0, 0);
    }

    public CS_LogicaDeTiempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public CS_LogicaDeTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe de establecerse entre cero y 23");
        }

        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("El minuto debe de establecerse entre cero y 59");
        }

        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("El segundo debe de establecerse entre cero y 59");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public CS_LogicaDeTiempo(CS_LogicaDeTiempo tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    public void establecerCS_LogicaDeTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe de establecerse entre cero y 23");
        }

        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("El minuto debe de establecerse entre cero y 59");
        }

        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("El segundo debe de establecerse entre cero y 59");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void establecerHora(int hora) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe de establecerse entre cero y 23");
        }

        this.hora = hora;
    }

    public void establecerMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("El minuto debe de establecerse entre cero y 59");
        }

        this.minuto = minuto;
    }

    public void establecerSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("El segundo debe de establecerse entre cero y 59");
        }
    }

    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    public String crearFormatoDeHora() {
        return String.format("%d:%02d:%02d %s", (obtenerHora() == 0 || obtenerHora() == 12 ? 12 : obtenerHora() % 12),
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }

    public String crearFormatoDeHoraUniversal() {
        return String.format("%02d:%02d:%02d %s", obtenerHora(), obtenerMinuto(), obtenerSegundo(),
                (obtenerHora() < 12 ? "AM" : "PM"));
    }

}
