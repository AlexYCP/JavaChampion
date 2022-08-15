package gui_gráficos;

import javax.swing.JFrame;

public class MainClass {

    public static void main(String[] args) {

        // Test
        BrainClass panel = new BrainClass();

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(140, 140);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
