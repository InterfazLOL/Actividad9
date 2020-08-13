package app.client.components.coleccion;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class ColeccionTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public ColeccionTemplate(){

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/coleccion/fondoColeccion.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.CYAN);
    }
    
}