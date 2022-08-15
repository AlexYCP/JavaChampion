package gui_gráficos;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DibujarArcoiris extends JPanel {

    // defino dos colores que no están en la clase Color
    private final static Color INDIGO = new Color(75, 0, 130);
    private final static Color VIOLETA = new Color(128, 0, 128);

    // creo una lista de colores
    private Color[] colores
            = {Color.WHITE, Color.BLUE, Color.ORANGE, VIOLETA, Color.GREEN, INDIGO, Color.YELLOW, Color.RED, Color.WHITE};

    // defino el fondo de color blanco
    public DibujarArcoiris() {
        setBackground(Color.WHITE);
    }

    // dibujo un arcoiris, usando arcos concéntricos
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radio = 20;

        // dibujo el arcoiris cerca de la parte central inferior
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;

        // dibujo arcos rellenos, empezando por el más exterior
        for (int contador = colores.length; contador > 0; contador--) {
            // establezco el color para el arco actual
            g.setColor(colores[contador - 1]);
            // relleno el arco desde cero hasta 180 grados
            g.fillArc(centroX - contador * radio, centroY - contador * radio, contador * radio * 2, contador * radio * 2, 0, 180);
        }

    }

}
