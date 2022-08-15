package gui_gráficos;

import javax.swing.JFrame;

public class DibujoMainEjercicio_1 {
    
    public static void main(String[] args) {

        // Ejercicio 1.
        DibujoBrainEjercicio_1 panel = new DibujoBrainEjercicio_1();
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(470, 470);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
