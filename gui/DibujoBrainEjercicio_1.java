package gui_gráficos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujoBrainEjercicio_1 extends JPanel {

    // Ejercicio 1.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(0, 0, 420, 20); // línea superior 5
        g.drawLine(0, 0, 380, 60); // línea superior 4
        g.drawLine(0, 0, 340, 100); // línea superior 3
        g.drawLine(0, 0, 300, 140); // línea superior 2
        g.drawLine(0, 0, 260, 180); // línea superior 1
        g.drawLine(0, 0, 220, 220); // línea central
        g.drawLine(0, 0, 180, 260); // línea inferior 1
        g.drawLine(0, 0, 140, 300); // línea inferior 2
        g.drawLine(0, 0, 100, 340); // línea inferior 3
        g.drawLine(0, 0, 60, 380); // línea inferior 4
        g.drawLine(0, 0, 20, 420); // línea inferior 5

    }

}
