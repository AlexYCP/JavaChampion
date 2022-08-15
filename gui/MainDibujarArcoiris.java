package gui_gráficos;

import javax.swing.JFrame;

public class MainDibujarArcoiris {

    public static void main(String[] args) {

        //
        JFrame aplicacion = new JFrame();
        DibujarArcoiris panel = new DibujarArcoiris();

        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setLocationRelativeTo(null);

    }

}
