package chapter_3;

import javax.swing.JOptionPane;

public class Ventana2 {

    public static void main(String[] args) {
        /*
        Aquí utlizo un nuevo método estático (showInputDialog) que sirve para escribir texto desde el teclado 
        en la ventana y lo asigno a la variable 'nombre'
         */
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
        /*
        A continuación, utilizo el método static String llamado format para devolver un objeto String que
        contiene un saludo con el nombre del usuario. El método format es similar al método System.out.printf,
        excepto que format devuelve el objeto String con formato, en vez de mostrarlo en una ventana de 
        comandos
         */
        String mensaje = String.format("¡Bienvenido, %s, a la programación en Java!", nombre);
        // Por último acomodo la variable 'mensaje' como segundo argumento en la siguiente instrucción
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
