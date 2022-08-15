package pseudocódigo;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {

        // Repetición controlada por un centinela.
        // Calcula el promedio de tus calificaciones, verifica si aprobaste o no y muestralo por pantalla con interfaces gráficas:
        /*
        Pseudocódigo:
        Algoritmo para calcular mi promedio escolar.
        
        Crea la variable nombre, pregunta mi nombre y asignalo a la variable
        
        Crea la variable calificacion e inicializala con valor de cero
        Crea la variable contador e inicializala con valor de uno
        Crea la variable total e inicializala con valor de cero
        
        Preguntar calificación y asignar el valor a calificacion
        
        Mientras que calificacion sea diferente que -1
            Asignar calificacion a total
            Sumar uno al contador
            Preguntar calificación y asignar el valor a calificacion
            
        Crea la variable promedio, calcula el promedio escolar y asigna el valor a la variable
        
        Si mi promedio es mayor o igual a seis
            Mostraré "aprobado" con mi nombre y promedio escolar
        De no ser así
            Mostraré "reprobado" con mi nombre y promedio escolar
         */
        var nombre = JOptionPane.showInputDialog(null, "Hola, ¿cómo te llamas?");

        int calificacion = 0,
                contador = 0,
                total = 0;

        calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu calificación o teclea -1 para terminar:"));

        while (calificacion != -1) {
            total += calificacion;
            contador += 1;
            calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe tu calificación o teclea -1 para terminar:"));
        }

        var promedio = total / contador;

        if (promedio >= 6) {
            JOptionPane.showMessageDialog(null, "Muy bien, " + nombre + ", aprobaste con un promedio de "
                    + promedio + " de calificación.");
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, " + nombre + ", reprobaste con un promedio de "
                    + promedio + " de calificación.");
        }

    }
}
