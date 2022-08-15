package chapter_8;

public class TiempoConDosClases {

    public static void main(String[] args) {

        // Ejemplo de creación de dos clases
        Tiempo tiempo = new Tiempo(1, 28, 57);
        System.out.println(tiempo.crearFormatoDeHora());

    }

}

class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String crearFormatoDeHora() {
        return String.format("this.crearFormatoDeHoraUniversal = %s%ncrearFormatoDeHora = %s",
                this.crearFormatoDeHoraUniversal(), crearFormatoDeHoraUniversal());
    }

    public String crearFormatoDeHoraUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

}
