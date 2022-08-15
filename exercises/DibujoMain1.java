package ejercicios;

import javax.swing.JFrame;

public class DibujoMain1 {
    
    public static void main(String[] args) {

        // Ejercicio 1
        DibujoBrain1 panel = new DibujoBrain1();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    
}
