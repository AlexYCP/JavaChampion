package pseudocódigo;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {

        // Realiza el sig. ejercicio con ayuda del algoritmo en pseudocódigo y agregale interfaces gráficas al programa.
        /*
        Pseudocódigo:
        Algoritmo para tomar un vaso de agua.

        Crear la variable nombre, preguntarle al usuario su nombre y asignar el valor a la variable 
        
        Crear la variable decision, pedirle al usuario que escriba 1 si quiere un vaso de agua y asignar el valor a la variable
        
        Si decision es igual a 1
            Imprime por pantalla "Muy bien, *nombre del usuario*, toma y bebe tu vaso de agua."
        De no ser así
            Imprime por pantalla "Está bien, *nombre del usuario*, entiendo que no tienes sed, te recomiendo que guardes tu vaso de
            agua para después."
         */
        var nombre = JOptionPane.showInputDialog("Hola, ¿cómo te llamas?");
        var decision = Integer.parseInt(JOptionPane.showInputDialog("Escribe 1 si quieres que te sirva un vaso de agua o teclea otro número si"
                + "no quieres:"));

        if (decision == 1) {
            JOptionPane.showMessageDialog(null, "Muy bien, " + nombre + ", toma y bebe tu vaso de agua.");
        } else {
            JOptionPane.showMessageDialog(null, "Está bien, " + nombre + ", entiendo que no tienes sed, te recomiendo que guardes"
                    + " tu vaso de agua para después.");
        }

    }
}
