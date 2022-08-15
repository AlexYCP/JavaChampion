package chapter_5;

public class PolizaAuto {

    // Ejemplo práctico de la clase PolizaAuto: objetos String en instrucciones switch
    // variables de instancia
    private int numeroDeCuenta; // número de cuenta de la póliza
    private String marcaYModelo; // marca y modelo del automóvil
    private String estado; // estado que se encuentra dentro de Estados Unidos

    // constructor
    public PolizaAuto(int numeroDeCuenta, String marcaYModelo, String estado) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    // establecer número de cuenta
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    // obtener número de cuenta
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    // establecer marca y modelo
    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    // obtener marca y modelo
    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    // establecer estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // obtener estado
    public String getEstado() {
        return estado;
    }

    /*
    Al observar el nombre del método: la convención de nomenclatura para un método obtener que devuelve un valor boolean es comenzar
    el nombre con "es" en vez de "obtener" (dicho método se conoce comúnmente como método predicado).
     */
    public boolean esEstadoSinCulpa() {
        boolean estadoSinCulpa;

        // determina si el estado tiene seguro de auto sin culpa
        // obtiene el estado del objeto PolizaAuto
        switch (getEstado()) {
            case "Massachusetts":
            case "Nueva Jersey":
            case "Nueva York":
            case "Pensilvania":
                estadoSinCulpa = true;
                break;

            default:
                estadoSinCulpa = false;
                break;
        }

        return estadoSinCulpa;
    }

}
