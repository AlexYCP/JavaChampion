package chapter_5;

public class PruebaPolizaAuto {

    public static void main(String[] args) {

        /*
        Dato excepcional: si declaro otro método dentro de una Clase que contiene el método main (método principal), de ser así,
        declaro éste nuevo método fuera del método principal.
        */
        // Ejemplo práctico de la clase PruebaPolizaAuto
        // creo dos objetos PolizaAuto
        PolizaAuto poliza1 = new PolizaAuto(11111, "Toyota Camry", "Nueva York");
        PolizaAuto poliza2 = new PolizaAuto(22222, "Ford Fusion", "Los Ángeles");

        // muestro por pantalla si cada poliza está en un estado sin culpa
        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);

    }

    // método que muestra en pantalla si una PolizaAuto se encuentra en un estado con seguro de auto sin culpa
    public static void polizaEnEstadoSinCulpa(PolizaAuto poliza) {
        System.out.println("La póliza de auto:");
        System.out.printf("Cuenta: %d%nAuto: %s%nEstado: %s, %s en un estado sin culpa%n%n",
                poliza.getNumeroDeCuenta(), poliza.getMarcaYModelo(), poliza.getEstado(),
                // '?': operador unario de decisión
                (poliza.esEstadoSinCulpa() ? "está" : "no está"));
    }

}
