package gui_gráficos;

/*
Importo a la clase 'Graphics' para posteriormente, utilizar sus métodos públicos, como es el caso del método público 'Drawline',
aunque también proporciona varios métodos más para dibujar texto y figuras en la pantalla.
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    // dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g) {
        // llama a 'paintComponent' para asegurar que el panel se muestre correctamente
        super.paintComponent(g);

        // llama al método público de la Clase Graphics y lo almacena en una variable local definida como anchura
        int anchura = getWidth();
        // llama al método público de la Clase Graphics y lo almacena en una variable local definida como altura
        int altura = getHeight();

        // dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
        g.drawLine(0, 0, anchura, altura);
        // dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0, altura, anchura, 0);

    }

}
