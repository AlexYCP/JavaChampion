package gui_gráficos;

// Importo a la Clase 'JFrame' para posteriormente, utilizar sus métodos públicos.
import javax.swing.JFrame;

public class PruebaPanelDibujo {

    public static void main(String[] args) {

        // Creo el panel que contendrá al dibujo
        PanelDibujo panel = new PanelDibujo();

        // Creo el marco (frame) que contendrá al panel
        JFrame frame = new JFrame();
        // establezco cerrar el programa cuando haga click en cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // añado el panel dentro del marco (frame)
        frame.add(panel);
        // establezco la medida de la ventana: (ancho, alto)
        frame.setSize(350, 350);
        // establezco que debe mostrarse la ventana del programa
        frame.setVisible(true);
    
    }
}
