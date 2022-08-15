package chapter_3;

public class Cuenta {

    private String nombre; // variable de instancia
    private double saldo; // variable de instancia
    private String imprimirSaldo;

    // Creo a mi constructor y le añado dos parámetros (nombre y saldo)
    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;

        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    /*
    Establezco el saldo primero desde la variable local, después lo asigno a la variable de instancia
    y verifico que sea mayor a 0.0.
     */
    public void establecerDeposito(double montoDeposito) {
        if (montoDeposito > 0.0) {
            saldo = saldo + montoDeposito;
        }
    }

    /*
    Creo el método que me permitirá retirar dinero y establezco la condición para que no pueda retirar
    más dinero del que ya poseo, o sea que mi retiro no exceda la cantidad de mi saldo total.
     */
    public void retirarDinero(double retiroMonetario) {
        if (retiroMonetario < saldo) {
            saldo = saldo - retiroMonetario;
        } else {
            System.out.println("\nLo sentimos, ha excedido la cantidad de retiro de tu saldo total.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String imprimirSaldo() {
        imprimirSaldo = String.format("Saldo de %s: $%.2f",
                obtenerNombre(), obtenerSaldo());
        System.out.println(imprimirSaldo);
        return imprimirSaldo;
    }

}
