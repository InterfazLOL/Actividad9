package app.client.components.barraNotificaciones.amigos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.services.servicesGraphics.ObjGraficosService;
import app.services.servicesGraphics.RecursosService;

public class AmigosTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lImgAmigo, lNombre, lEstado;
    private ObjGraficosService objGraficosService;
    private RecursosService sRecursosService;

    public AmigosTemplate(ImageIcon imagen, String nombreUsuario, String estadoAmigo, AmigosComponent amigosComponent) {

        objGraficosService = ObjGraficosService.getService();
        sRecursosService = RecursosService.getService();

        imagen = new ImageIcon(imagen.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lImgAmigo = objGraficosService.construirJLabel("", 5, 8, 30, 30, imagen, null, null, null, null, "c");
        this.add(lImgAmigo);

        lNombre = objGraficosService.construirJLabel(
            nombreUsuario, 40, 8, 100, 15, null, sRecursosService.getFuenteCambria12Bold(), null, new Color(160, 155, 140), null, "l"
            );
        this.add(lNombre);
    
        lEstado = objGraficosService.construirJLabel(
            estadoAmigo, 40, 23, 100, 15, null, new Font("Cambria", Font.PLAIN, 11), null, sRecursosService.getColorLetrasSocial(), null, "l"
            );
        this.add(lEstado);

        this.setSize(214, 48);
        this.setCursor(sRecursosService.getcMano());
        this.addMouseListener(amigosComponent);
        this.setOpaque(false);
        this.setLayout(null);
    }
}