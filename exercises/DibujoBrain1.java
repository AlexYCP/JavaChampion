package ejercicios;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujoBrain1 extends JPanel {

    // Ejercicio 1
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int anchura = getWidth();
        int altura = getHeight();

        g.drawLine(0, 0, anchura, altura);  // (x, y, x, y)
        g.drawLine(0, altura, anchura, 0);  // (x, y, x, y)

    }

}
