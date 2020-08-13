package app.client.components.inicio.tarjetaVistaGeneral;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.services.servicesGraphics.RecursosService;

public class TarjetaVistaGeneralTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lImagen;
    private JButton boton;
    private ImageIcon iImagen;
    
    public TarjetaVistaGeneralTemplate(String imagen, String texto, int x, int y) {

        this.setSize(237, 180);
        this.setLocation(x, y);

        lImagen = new JLabel();
        lImagen.setBounds(0, 0, 237, 133);
        iImagen = new ImageIcon(imagen);
        iImagen = new ImageIcon(iImagen.getImage().getScaledInstance(237, 133, Image.SCALE_AREA_AVERAGING));
        lImagen.setIcon(iImagen);
        lImagen.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(40, 40, 43)));
        lImagen.setCursor(RecursosService.getService().getcMano());
        this.add(lImagen);

        boton = new JButton("<html><div align='left'>"+texto+"</div></html>");
        boton.setBounds(0, 140, 237, 40);
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