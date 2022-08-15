package gui_gráficos;

import java.awt.Color;
import java.awt.Graphics;

public class MiLineaLogica {

    // MiLineaLogica
    // campos
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    // constructor para inicializar los valores
    public MiLineaLogica(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    // método para construir los gráficos y colores
    public void dibujar(Graphics g) {
        // establezco el color
        g.setColor(color);
        // establezco las coordenadas de punto a punto (A--B)
        g.drawLine(x1, y1, x2, y2);
    }

}
