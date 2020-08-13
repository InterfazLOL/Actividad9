package app.client.components.perfil;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PerfilTemplate extends JPanel{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lFondo;
    private ImageIcon iFondoPerfil;

    public PerfilTemplate() {

        iFondoPerfil = new ImageIcon("resources/img/perfil/fondoPerfil.jpg");
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondoPerfil);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.BLUE);
    }
}