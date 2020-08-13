package app.client.components.tarjetaSkin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.services.servicesGraphics.RecursosService;

public class TarjetaSkinTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lImagen, lRP;
    private JButton boton;
    private ImageIcon iImagen;
    
    public TarjetaSkinTemplate(String imagen, String texto, int x, int y, int valor) {

        this.setSize(115, 180);
        this.setLocation(x, y);

        lRP = new JLabel(" "+valor);
        lRP.setBounds(8, 104, 80, 20);
        lRP.setFont(RecursosService.getService().getFuenteBotonesPrincipales());
        lRP.setForeground(Color.WHITE);
        lRP.setIcon(new ImageIcon(RecursosService.getService().gIRP().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)));
        this.add(lRP);

        lImagen = new JLabel();
        lImagen.setBounds(0, 0, 115, 133);
        iImagen = new ImageIcon(imagen);
        iImagen = new ImageIcon(iImagen.getImage().getScaledInstance(115, 133, Image.SCALE_AREA_AVERAGING));
        lImagen.setIcon(iImagen);
        lImagen.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(40, 40, 43)));
        lImagen.setCursor(RecursosService.getService().getcMano());
        this.add(lImagen);

        boton = new JButton("<html><div align='left'>"+texto+"</div></html>");
        boton.setBounds(0, 140, 115, 40);
        boton.setFocusable(false);
        boton.setContentAreaFilled(false);
        boton.setCursor(RecursosService.getService().getcMano());
        boton.setFont(new Font("Cambria", Font.BOLD, 16));
        boton.setForeground(RecursosService.getService().getColorHerramietas());
        boton.setBorder(null);
        this.add(boton);

        this.setLayout(null);
        this.setOpaque(false);
    }
}