package chapter_4;

public class Operador_Ternario_1 {

    public static void main(String[] args) {
        // Operador ternario (?:)
        /*
        Es el único en su clase o tipo que utiliza a tres operandos.
        puede sustituir a una instrucción if-else.
         */

        // ejemplo
        int c1 = 7,
                c2 = 5,
                c3 = 6,
                c4 = 2,
                promedioFinal;

        String operadorTernario;

        promedioFinal = (c1 + c2 + c3 + c4) / 4;

        operadorTernario = (promedioFinal >= 6 ? "Aprobado" : "Reprobado");

        System.out.printf("%s con %d de calificación.", operadorTernario, promedioFinal);

    }
}
