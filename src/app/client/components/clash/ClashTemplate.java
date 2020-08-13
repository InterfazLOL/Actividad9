package app.client.components.clash;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClashTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private JLabel lFondo;
    private ImageIcon iFondoClash;

    public ClashTemplate(){

        iFondoClash = new ImageIcon("resources/img/clash/fondoClash.jpg");
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondoClash);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }
}