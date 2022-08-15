package chapter_4;

import java.util.Scanner;

public class IS_Simple_Logica_2 {

    // materias escolares
    private int cMatematicas;
    private int cEspañol;
    private int cFisica;
    private int cHistoria;
    private int promedioEscolar;

    // llamo al método 'System.in' de la clase Scanner
    Scanner entrada = new Scanner(System.in);

    // creo el constructor
    public IS_Simple_Logica_2() {
        // mensaje de bienvenida
        System.out.println("Hola, introduce las calificaciones de tus materias.\n");
        // introduce tu calificación de matemáticas 
        System.out.println("Introduce tu calificación de matemáticas:");
        cMatematicas = entrada.nextInt();
        // introduce tu calificación de español
        System.out.println("Introduce tu calificación de español:");
        cEspañol = entrada.nextInt();
        // introduce tu calificación de física
        System.out.println("Introduce tu calificación de física:");
        cFisica = entrada.nextInt();
        // introduce tu calificación de historia
        System.out.println("Introduce tu calificación de historia:");
        cHistoria = entrada.nextInt();
        // calculo de mi promedio escolar
        promedioEscolar = (cMatematicas + cEspañol + cFisica + cHistoria) / 4;
        /*
        creo la instrucción de selección simple para verificar si aprobé o no y
        muestro mi resultado por pantalla.
         */
        if (promedioEscolar >= 6) {
            System.out.printf("%nMuy bien, aprobaste con %s de calificación.", promedioEscolar);
        }
    }

}
