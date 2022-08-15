package chapter_5;

public class Ejercicio_1 {

    public static void main(String[] args) {

        /*
        Resolver el sig. ejercicio:
        Una persona invierte $1,000.00 en una cuenta de ahorro que produce el 5% de interés. Suponiendo que todo el interés se deposita
        en la cuenta, calcule e imprima el monto de dinero en la cuenta al final de cada año, durante 10 años. Use la siguiente
        fórmula para determinar los montos:
        
        Fórmula: a = p(1 + r, n);
        
        en donde:
        'p' es el monto que se invirtió originalmente (es decir, el inicial)
        'r' es la tasa de interés anual (por ejemplo, use 0.05 para el 5%)
        'n' es el número de años
        'a' es la cantidad depositada al final del n-ésimo año.
         */
        // mostrar ejercicio por pantalla
        System.out.println("Una persona invierte $1,000.00 en una cuenta de ahorro que produce el 5% de interés. Suponiendo que todo"
                + " el interés se deposita en la cuenta,\ncalcule e imprima el monto de dinero en la cuenta al final de cada año,"
                + " durante 10 años:\n");

        // variables globales
        double inversionInicial = 1000;
        double interesAnual = 0.05;
        double capitalPorAnio;

        // mostrar encabezado por pantalla del año y el capital por año
        System.out.println("Año\tCapital incrementado por año");

        // ciclo iterativo muestra por pantalla el año y el capital por año
        for (int anio = 1; anio <= 10; ++anio) {
            capitalPorAnio = inversionInicial * Math.pow(1.0 + interesAnual, anio);
            System.out.printf("%d\t$%,.2f%n", anio, capitalPorAnio);
        }

    }

}
