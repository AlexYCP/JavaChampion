package chapter_8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CalcularInteres {

    public static void main(String[] args) {

        // Uso de las clases BigDecimal y NumberFormat
        // ejemplo
        /*
        Resolver el sig. ejercicio:
        Una persona invierte $1,000.00 en una cuenta de ahorro que produce el 5% de interés. Suponiendo que todo el interés se deposita
        en la cuenta, calcule e imprima el monto de dinero en la cuenta al final de cada año, durante 10 años. Use la siguiente
        fórmula para determinar los montos:
        
        Fórmula: a = p * Math.pow(1 + r, n);
        
        en donde:
        'p' es el monto que se invirtió originalmente (es decir, el inicial)
        'r' es la tasa de interés anual (por ejemplo, use 0.05 para el 5%)
        'n' es el número de años
        'a' es la cantidad depositada al final del n-ésimo año.
         */
        // objetos de la clase BigDecimal
        BigDecimal depositoBancario = new BigDecimal(1000.0);
        BigDecimal tasaAnual = new BigDecimal(0.05);

        // imprimo el encabezado
        System.out.printf("%s%19s%n", "Año", "Monto en Depósito");

        // itero y muestro el resultado
        for (int año = 1; año <= 10; ++año) {
            // fórmula para calcular la tasa anual de un depósito bancario durante diez años
            BigDecimal monto = depositoBancario.multiply(tasaAnual.add(BigDecimal.ONE).pow(año));

            // imprimo los valores que compañarán al encabezado (año y monto por cada año)
            System.out.printf("%3d%19s%n", año, NumberFormat.getCurrencyInstance().format(monto));
        }

    }

}
