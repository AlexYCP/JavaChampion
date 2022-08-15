package chapter_2;

public class Operadores {

    public static void main(String[] args) {

        // Operadores
        /*
        Existen cinco tipos de Operadores en Java y son: suma, resta, multiplicación, división y residuo
         */
        // Ejemplo
        int operadorSuma1 = 7, operadorSuma2 = 7,
                operadorResta1 = 14, operadorResta2 = 7,
                operadorMultiplicacion1 = 7, operadorMultiplicacion2 = 2,
                operadorDivision1 = 21, operadorDivision2 = 3,
                operadorResiduo1 = 31, operadorResiduo2 = 8;

        // las variables siempre se inicializan con la palabra reservada: 'var'
        int operacion_1,
                operacion_2,
                operacion_3,
                operacion_4,
                operacion_5;

        operacion_1 = operadorSuma1 + operadorSuma2;
        operacion_2 = operadorResta1 - operadorResta2;
        operacion_3 = operadorMultiplicacion1 * operadorMultiplicacion2;
        operacion_4 = operadorDivision1 / operadorDivision2;
        operacion_5 = operadorResiduo1 % operadorResiduo2;

        System.out.println("Operadores:");
        System.out.printf("Suma: %d %n", operacion_1);
        System.out.printf("Resta: %d %n", operacion_2);
        System.out.printf("Multiplicación: %d %n", operacion_3);
        System.out.printf("División: %d %n", operacion_4);
        System.out.printf("Residuo: %d %n", operacion_5);

    }

}
