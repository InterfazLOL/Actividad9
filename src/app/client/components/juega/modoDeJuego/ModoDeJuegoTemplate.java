package app.client.components.juega.modoDeJuego;

import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.services.servicesGraphics.*;

public class ModoDeJuegoTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private ObjGraficosService objGraficosService;
    private RecursosService recursosService;

    private JButton bSeleccion;
    private JLabel lDesc, lFondo;
    private ImageIcon iFondo;

    private Font fuente;

    public ModoDeJuegoTemplate(ImageIcon imagen, String texto, ModoDeJuegoComponent modoDeJuegoComponent, int x, int y) {

        this.setLocation(x, y);
        this.setSize(240, 360);

        objGraficosService = ObjGraficosService.getService();
        recursosService = RecursosService.getService();
        fuente = new Font("Calibri (Cuerpo)", Font.BOLD, 13);
        bSeleccion = objGraficosService.crearJButton(null, 0, 0, 182, 230, recursosService.getcMano(), imagen, null,
                null, null, null, "c", false, false);
        this.add(bSeleccion);
        //bSeleccion.addMouseListener(modoDeJuegoComponent);
        lDesc = objGraficosService.construirJLabel("<html><div >" + texto + "</div></html>", 0, 230, 240, 130, null,
                fuente, null, recursosService.getColorFuenteDesenfocada(), recursosService.getBordeInferiorDelgado(),
                "c");

        iFondo = new ImageIcon(crearFondo(recursosService.gIFondoJuega().getImage()));
        lFondo = objGraficosService.construirJLabel("", 0, 0, 240, 360, iFondo, null, null, null, null, "c");
        this.add(lDesc);

        this.add(lFondo);
        this.setLayout(null);
        this.setBackground(recursosService.getColorTransparente());
        this.setVisible(true);
        
    }

    private BufferedImage crearFondo(Image imagen) {
        BufferedImage bufferedImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        g.drawImage(
            imagen, 
            0, 0, 
            imagen.getWidth(null), imagen.getHeight(null),
            this.getX(), this.getY() + 60, 
            imagen.getWidth(null) + this.getX(), imagen.getHeight(null) + this.getY() + 60,
            this
        );
        return bufferedImage;
    }
}