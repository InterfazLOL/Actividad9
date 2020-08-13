package app.client.components.tft;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TFTTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public TFTTemplate(){

        crearObjetosDecoradores();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondo);
        this.add(lFondo);
        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(null);
    }

    public void crearObjetosDecoradores(){
        iFondo = new ImageIcon("resources/img/tft/fondoTFT.jpg");
    }
}