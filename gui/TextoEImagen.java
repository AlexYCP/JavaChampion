package gui_gráficos;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TextoEImagen {
    
    public static void main(String[] args) {

        //
        // creo una etiqueta con texto (número uno)
        JLabel etiquetaNorte = new JLabel("Etiqueta norte");

        // creo un ícono a partir de una imágen para poder colocarla en un objeto JLabel
        ImageIcon etiquetaConIcono = new ImageIcon("Alex.png");

        // creo una etiqueta con un ícono en vez de texto
        JLabel etiquetaCentro = new JLabel(etiquetaConIcono);

        // creo otra etiqueta con texto (número dos)
        JLabel etiquetaSur = new JLabel("Etiqueta sur");

        // creo el marco de la aplicación
        JFrame aplicacion = new JFrame();
        // añado la funcionalidad para cerrar la ventana al presionar equis o tache
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // añado las posiciones (norte, centro, sur) para cada etiqueta
        aplicacion.add(etiquetaNorte, BorderLayout.NORTH);
        aplicacion.add(etiquetaCentro, BorderLayout.CENTER);
        aplicacion.add(etiquetaSur, BorderLayout.SOUTH);
        // especifico el tamaño de la aplicación
        aplicacion.setSize(450, 450);
        // muestro la aplicacion
        aplicacion.setVisible(true);
        // especifico la posición de la aplicación al momento de aparecer
        aplicacion.setLocationRelativeTo(null);
        
    }
    
}
