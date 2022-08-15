package test;

public enum Test_34
{

    //
    UNO("Número uno", "1"),
    DOS("Número dos", "2"),
    TRES("Número tres", "3"),
    CUATRO("Número cuatro", "4"),
    CINCO("Número cinco", "5"),
    SEIS("Número seis", "6"),
    SIETE("Número siete", "7"),
    OCHO("Número ocho", "8"),
    NUEVE("Número nueve", "9"),
    DIEZ("Número diez", "10");

    //
    private final String descripcion;
    private final String representacion;

    //
    Test_34(String descripcion, String representacion) {
        this.descripcion = descripcion;
        this.representacion = representacion;
    }

    //
    public String obtenerDescripcion() {
        return descripcion;
    }

    //
    public String obtenerRepresentacion() {
        return representacion;
    }

    //
    public static void main(String[] args) {

        //
        System.out.println("Lista de números del uno al diez junto con su descripción y representación:");

        //
        for (Test_34 numeros : Test_34.values()) {
            System.out.printf("%s %s", numeros.obtenerDescripcion(), numeros.obtenerRepresentacion());
        }

    }

}
