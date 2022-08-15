package gui_gráficos;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DibujoDelPanel extends JPanel {
    
    // DibujoDelPanel
    // creo la ventana del programa
    // creo un objeto de tipo SecureRandom
    SecureRandom sr = new SecureRandom();
    // creo un arreglo de lineas
    private MiLineaLogica[] lineas;

    // creo el constructor
    public DibujoDelPanel() {
        // defino al color blanco como color de fondo en el panel
        setBackground(Color.WHITE);
        // creo la longitud de cada línea
        lineas = new MiLineaLogica[5 + sr.nextInt(5)];

        // creo la composición de las líneas
        for (int i = 0; i < lineas.length; i++) {
            // genero coordenadas aleatorias
            int x1 = sr.nextInt(300);
            int y1 = sr.nextInt(300);
            int x2 = sr.nextInt(300);
            int y2 = sr.nextInt(300);

            // genero un color aleatorio siguiendo la sintaxis RGB
            Color color = new Color(sr.nextInt(256), sr.nextInt(256), sr.nextInt(256));

            // añado las líneas y el color ya creados al constructor correspondiente
            lineas[i] = new MiLineaLogica(x1, y1, x2, y2, color);
        }
    }

    // dibujo las líneas
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // para cada arreglo de figuras, dibujo las figuras individuales
        for (MiLineaLogica lineas : lineas) {
            lineas.dibujar(g);
        }
    }

}
