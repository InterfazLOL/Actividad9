package app.client.components.botin;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class BotinTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public BotinTemplate(){

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/botin/fondoBotin.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GREEN);
    }
}