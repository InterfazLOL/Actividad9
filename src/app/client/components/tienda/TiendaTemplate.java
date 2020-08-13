package app.client.components.tienda;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class TiendaTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public TiendaTemplate(){

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/tienda/fondoTienda.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
    }
}