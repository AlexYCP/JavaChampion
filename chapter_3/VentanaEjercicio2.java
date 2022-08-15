package chapter_3;

import javax.swing.JOptionPane;

public class VentanaEjercicio2 {

    public static void main(String[] args) {
        // Realiza un ejercicio de resta utilizando dos métodos estáticos de la Clase JOptionPane
        // creo las dos variables con sus dos métodos estáticos para intruducir los dos números
        String numero_1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String numero_2 = JOptionPane.showInputDialog("Introduce el segundo número:");

        // aquí parseo las dos variables anteriores y les cambio el tipo de String a Integer
        int parseoNumero_1 = Integer.parseInt(numero_1);
        int parseoNumero_2 = Integer.parseInt(numero_2);

        // ahora, realizo la resta
        int resta = parseoNumero_1 - parseoNumero_2;

        /* 
        construyo los dos argumentos de la instrucción de tipo String, les doy formato con la clase String
        y la asigno en la variable 'resultadoResta'
         */
        String resultadoResta = String.format("El resultado es: %d", resta);

        // muestro la ventana con el resultado
        JOptionPane.showMessageDialog(null, resultadoResta);

    }
}
