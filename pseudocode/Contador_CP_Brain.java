package pseudocódigo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Contador_CP_Brain {

    /*
        Algoritmo en pseudocódigo:
        Desarrollo del algoritmo mediante el proceso de refinamiento de arriba a abajo, paso a paso.
        
        Calcular mi promedio escolar.
        
        private contador = 1
        private total = 0
        
        constructor Contador_CP_Brain()
            Crear variable nombre, preguntar nombre y almacenar el valor en dicha variable
    
            Mientras que contador sea menor o igual a cinco
                    Crear variable calificacion, preguntar calificación y almacenar el valor en dicha variable
                    Sumar calificacion a total
                    Sumar uno al contador
    
            var promedio = total / contador
    
            Si promedio es mayor o igual a 6
                Imprimir por pantalla "aprobado", el nombre del alumno y su promedio
            De lo contrario
                Imprimir por pantalla "reprobado", el nombre del alumno y su promedio

        Contador_CP_Brain promedioEscolar = new Contador_CP_Brain()
        
     */
    Scanner entrada = new Scanner(System.in);

    private int contador = 1;
    private int total = 0;

    // constructor
    public Contador_CP_Brain() {
        // escribir nombre
        var nombre = JOptionPane.showInputDialog("Hola, ¿cómo te llamas?:");
        // algoritmo controlado por un contador
        // iterar hasta recibir el número total de valores ingresados permitido
        while (contador <= 5) {
            var calificacion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu calificación?:"));
            total += calificacion;
            contador += 1;
        }
        // calcular promedio
        var promedio = total / contador;
        // estructura condicional
        if (promedio >= 6) {
            // mostrar resultado aprobatorio
            JOptionPane.showMessageDialog(null, "Hola, de nuevo, " + nombre
                    + ", aprobaste con un promedio de " + promedio + " de calificación.");
        } else {
            // mostrar resultado reprobatorio
            JOptionPane.showMessageDialog(null, "Hola, de nuevo, " + nombre
                    + ", reprobaste con un promedio de " + promedio + " de calificación.");
        }

    }

}
