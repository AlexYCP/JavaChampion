package chapter_3;

import javax.swing.JOptionPane;

public class VentanaEjercicio1 {

    public static void main(String[] args) {
        // Realiza un ejercicio de suma utilizando dos métodos estáticos de la Clase JOptionPane
        // creo las dos variables con sus dos métodos estáticos para intruducir los dos números
        String numeroUno = JOptionPane.showInputDialog("Escribe el primer número:");
        String numeroDos = JOptionPane.showInputDialog("Escribe el segundo número:");

        // aquí parseo las dos variables anteriores y les cambio el tipo de String a Integer
        int parseoNumeroUno = Integer.parseInt(numeroUno);
        int parseoNumeroDos = Integer.parseInt(numeroDos);

        // ahora, realizo la suma
        int suma = parseoNumeroUno + parseoNumeroDos;

        /* 
        construyo los dos argumentos de la instrucción de tipo String, les doy formato con la clase String
        y la asigno en la variable 'resultadoSuma'
         */
        String resultadoSuma = String.format("El resultado es: %d", suma);

        // muestro la ventana con su resultado
        JOptionPane.showMessageDialog(null, resultadoSuma);
    }
}
