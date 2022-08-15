package pseudocódigo;

import javax.swing.JOptionPane;

public class Centinela_CP_Brain {

    /*
        Algoritmo en pseudocódigo:
        Desarrollo del algoritmo mediante el proceso de refinamiento de arriba a abajo, paso a paso.
        
        Calcular mi promedio escolar y verificar si aprobé o no.
        
        private contador = 0
        private total = 0
        
        constructor Contador_CP_Brain()
            Crear variable nombre, preguntar nombre y almacenar el valor en dicha variable
    
            Crear variable calificacion, ingresar calificación o el valor centinela y almacenar el valor en dicha variable
    
            Mientras que calificacion sea diferente de -1
                    Sumar calificacion a total
                    Sumar uno al contador
                    Ingresar calificación o el valor centinela y almacenarlo en dicha variable
    
            Si contador es diferente de 0
                var promedio = total / contador
                Si promedio es mayor o igual a 6
                    Imprimir por pantalla "aprobado", el nombre del alumno y su promedio
                De lo contrario
                    Imprimir por pantalla "reprobado", el nombre del alumno y su promedio
            De lo contrario
                Imprimir por pantalla "lo siento, no ingresaste ningún valor"
         
    Contador_CP_Brain promedioEscolar = new Contador_CP_Brain()
        
     */
    private int contador = 0;
    private double total = 0;

    public Centinela_CP_Brain() {
        // escribir nombre
        var nombre = JOptionPane.showInputDialog("Hola, ¿cómo te llamas?: ");
        // escribir calificación o el valor centinela
        var calificacion = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificación o escribe \"-1\" para"
                + " cerrar esta ventana: "));
        // algoritmo de repetición controlado por un centinela
        // iterar hasta recibir el valor centinela
        while (calificacion != -1) {
            total += calificacion;
            contador += 1;
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificación o escribe \"-1\" para"
                    + " cerrar esta ventana: "));
        }
        // estructura condicional 1
        if (contador != 0) {
            var promedio = total / contador;
            // estructura condicional 2
            if (promedio >= 6) {
                JOptionPane.showMessageDialog(null, "Hola, de nuevo, " + nombre
                        + ", aprobaste con un promedio de " + promedio + " de calificación.");
            } else {
                JOptionPane.showMessageDialog(null, "Hola, de nuevo, " + nombre
                        + ", reprobaste con un promedio de " + promedio + " de calificación.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, no ingresaste ningún valor válido.");
        }

    }

}
