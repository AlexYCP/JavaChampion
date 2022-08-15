package chapter_4;

public class IS_Simple_1 {

    public static void main(String[] args) {

        // Instrucción de selección simple:
        /*
        realiza un ejercicio en el que calcules tu promedio escolar y muestraes por pantalla
        si aprobaste o no.
         */
        IS_Simple_Logica_1 resultado = new IS_Simple_Logica_1();
        // establezco 10 de calificación en la materia de matemáticas
        resultado.setC_matematicas(10);
        // establezco 8 de calificación en la materia de español
        resultado.setC_español(8);
        // establezco 6 de calificación en la materia de física
        resultado.setC_fisica(6);
        // establezco 9 de calificación en la materia de historia
        resultado.setC_historia(9);
        // calculo el promedio de todas las materias
        resultado.calcularPromedio();
        // imprimo el resultado por pantalla
        resultado.imprimirPromedio();

    }
}
