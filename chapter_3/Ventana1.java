package chapter_3;
// Aquí importo la Clase 'JOptionPane' de la librería de Clases de Java para mostrar una o más ventanas.

import javax.swing.JOptionPane;

public class Ventana1 {

    public static void main(String[] args) {

        /*
        A continuación llamo a la Clase (JOptionPane), posteriormente, utilizo a su método estático
        (showMessageDialog), seguido de dos argumentos; el primero (null) para posicionar mi ventana
        en el centro de la pantalla y el segundo argumento para mostrar una literal de cadena.
         */
        JOptionPane.showMessageDialog(null, "Hola, Alexander me programó.");

    }
}
