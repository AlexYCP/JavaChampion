package gui_gráficos;

import javax.swing.JFrame;

public class DibujoDelFrame {
    
    public static void main(String[] args) {

        // DibujoDelFrame
        // creo el marco del programa
        // creo un objeto de tipo JFrame
        JFrame frame = new JFrame();
        // creo un objeto de tipo DibujoDelPanel
        DibujoDelPanel panel = new DibujoDelPanel();
        
        // creo las propiedades del programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
    
}
