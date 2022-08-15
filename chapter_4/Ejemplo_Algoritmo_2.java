package chapter_4;

import javax.swing.JOptionPane;

public class Ejemplo_Algoritmo_2 {

    public static void main(String[] args) {

        // Ejemplo Algoritmo 2
        /*
        Este programa implementa el mismo algoritmo de "Ejemplo_Algoritmo_1", con la característica añadida de implementarle
        interfaces gráficas.
         */
        // variables locales
        int notaAprobatoria = 0;
        int contador = 0;
        int notaReprobatoria = 0;

        // mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Hola, alumnos, bienvenidos al Sistema Universitario,"
                + " completen los datos que se les solicitarán, gracias.");
        // solicitar calificaciones
        JOptionPane.showMessageDialog(null, "Hola de nuevo, escribe \"1\" si aprobaste o \"2\" si reprobaste.");

        while (contador < 10) {
            var calificacion = Integer.parseInt(JOptionPane.showInputDialog("Escribe \"1\" si aprobaste o \"2\" si reprobaste: "));
            contador += 1;

            if (calificacion == 1) {
                notaAprobatoria += 1;
            } else {
                notaReprobatoria += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Recopilamos la sig. información:\n"
                + "Alumnos aprobados: " + notaAprobatoria + "\n"
                + "Alumnos reprobados: " + notaReprobatoria);

        if (notaAprobatoria >= 8) {
            JOptionPane.showMessageDialog(null, "¡Muy bien hecho, alumnos, se le dará un bono al Instructor!.");
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos mucho, no habrá un bono para el instructor.");
        }

    }
}
