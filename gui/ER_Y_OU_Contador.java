package gui_gráficos;

import javax.swing.JOptionPane;

public class ER_Y_OU_Contador {

    public static void main(String[] args) {

        // Estructura de repetición controlada por un contador.
        // Operador unario de tipo de dato:
        // El operador unario sirve para hacer la conversión de un tipo de datos a otro de un determinado valor. Por ejemplo:
        // variables globales
        int contador = 1;
        double calificacion = 0.0;
        int total = 0;
        // mostrar mensaje por pantalla
        JOptionPane.showMessageDialog(null, "Calcula tu promedio con ayuda del sig. programa. ");
        // escribir nombre
        var nombre = JOptionPane.showInputDialog("Hola, ¿cómo te llamas?: ");
        // introducir la primera calificación
        calificacion = Double.parseDouble(JOptionPane.showInputDialog("Muy bien, " + nombre + ", introduce tu primera calificación: "));
        // asignar la primera calificación a la variable total
        total += calificacion;
        // estructura de control iterativa
        while (contador <= 3) {
            // introducir calificaciones posteriores
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Introduce la sig. calificación: "));
            total += calificacion;
            ++contador;
        }
        // introducir la última calificación
        calificacion = Double.parseDouble(JOptionPane.showInputDialog("Por último, " + nombre + ", introduce tu última"
                + " calificación: "));
        // asignar la última calificación a la variable total
        total += calificacion;
        // incrementar a la última calificación en uno
        ++contador;
        // operador unario (tipo entre paréntesis) de conversión de datos, por ejemplo: de int a double (instrucción de abajo)
        double promedio = (double) total / contador;
        // estructura de control anidada
        if (promedio >= 6) {
            // mostrar resultado por pantalla
            JOptionPane.showMessageDialog(null, "Muy bien, " + nombre + ", el resultado de tu promedio es de " + promedio + " de calificación,"
                    + " por lo tanto, aprobaste el curso. ");
        } else {
            // mostrar resultado por pantalla
            JOptionPane.showMessageDialog(null, "Lo siento, " + nombre + ", el resultado de tu promedio es de " + promedio + " de calificación,"
                    + " por lo tanto, reprobaste el curso. ");
        }

    }

}
