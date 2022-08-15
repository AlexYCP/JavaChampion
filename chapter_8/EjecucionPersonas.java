package chapter_8;

public class EjecucionPersonas {

    public static void main(String[] args) {

        // demuestro las capacidades de las clases 'LogicaPersonas' y 'EjecucionLogica'
        // muestro que la cuenta es cero antes de crear 'LogicaPersonas'
        System.out.printf("'LogicaPersonas' antes de instanciar: %d%n", LogicaPersonas.obtenerCuenta());

        // creo dos objetos de la clase 'LogicaPersonas', la cuenta debe de ser dos
        LogicaPersonas lp_1 = new LogicaPersonas("Alexander", "Pineda");
        LogicaPersonas lp_2 = new LogicaPersonas("Alfredo", "Smith");

        // muestro que la cuenta debe de ser dos después de crear los dos objetos anteriores
        System.out.println("\n'LogicaPersonas' después de instanciar:");
        System.out.printf("...mediante 'lp_1.obtenerCuenta()': %d%n", lp_1.obtenerCuenta());
        System.out.printf("...mediante 'lp_2.obtenerCuenta()': %d%n", lp_2.obtenerCuenta());
        System.out.printf("...mediante 'LogicaPersonas.obtenercuenta()': %d%n", LogicaPersonas.obtenerCuenta());

        // imprimo los nombres de los objetos ya creados
        System.out.printf("%n'LogicaPersonas' 1: %s %s%n'LogicaPersonas' 2: %s %s",
                lp_1.obtenerNombre(), lp_1.obtenerApellido(), lp_2.obtenerNombre(), lp_2.obtenerApellido());

    }

}
