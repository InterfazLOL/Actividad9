package app.client.components.inicio.vistaGeneral;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.client.components.inicio.tarjetaVistaGeneral.TarjetaVistaGeneralComponent;
import app.client.components.tarjetaSkin.TarjetaSkinComponent;
import app.services.servicesGraphics.*;

public class VistaGeneralTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel lRecompensas, lBotin, lTwitch;
    private JButton bMasInfo;
    
    private Color colorLetraClara;

    private ObjGraficosService sObjGraficosService;
    private RecursosService sRecursosService;

    public VistaGeneralTemplate() {

        this.setSize(1055, 578);
        sObjGraficosService = ObjGraficosService.getService();
        sRecursosService = RecursosService.getService();        

        colorLetraClara = new Color(7, 239, 233);

        lRecompensas = sObjGraficosService.construirJLabel(
            "RECOMPENSAS DEL 28/07 AL 28/09", 32, 85, 225, 20, null, sRecursosService.getFuenteCambria12Bold(), null, colorLetraClara, null, "l"
        );  
        this.add(lRecompensas);

        lTwitch = sObjGraficosService.construirJLabel(
            "<html><div>TWITCH PRIME - LOL</div></html>", 32, 110, 350, 80, null, new Font("Bodoni MT Black", Font.PLAIN, 36), null, 
            Color.WHITE, null, "l"
            );
        this.add(lTwitch);

        lBotin = sObjGraficosService.construirJLabel(
            "Botín gratis con Twitch Prime", 32, 205, 208, 25, null, new Font("Cambria", Font.PLAIN, 16), null, colorLetraClara, null, "l"
            );
        this.add(lBotin);

        bMasInfo = sObjGraficosService.crearJButton(
            "MÁS INFORMACIÓN", 32, 250, 186, 32, sRecursosService.getcMano(), null, sRecursosService.getFuenteBotonesPrincipales(),
            sRecursosService.getColorFndoBotones(), sRecursosService.getColorHerramietas(), 
            BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(200, 169, 108)), "c", true, false
            );
        this.add(bMasInfo);

        construirTarjetas();
        construirSkins();

        this.setLayout(null);
        this.setOpaque(false);
    }

    private void construirTarjetas() {

        //Tarjeta de esporst
        this.add(
            new TarjetaVistaGeneralComponent("resources/img/inicio/esports.jpg", "¡Se define todo en la LLA!", 36, 378).
            gTarjetaVistaGeneralTemplate()
        );

        //Tarjeta de sistema de comportamiento
        this.add(
            new TarjetaVistaGeneralComponent("resources/img/inicio/comportamiento.jpg", "Sistemas de comportamiento: agosto 2020", 283, 378).
            gTarjetaVistaGeneralTemplate()
        );

        //Tarjeta de twitch prime
        this.add(
            new TarjetaVistaGeneralComponent("resources/img/inicio/twitchPrime.jpg", "Twitch Prime - LoL", 530, 378).
            gTarjetaVistaGeneralTemplate()
        );
    }

    private void construirSkins() {

        // Skin Thresh
        this.add(
            new TarjetaSkinComponent("resources/img/skins/threshFlorEspiritual.jpg", "Thresh Flor Espiritual", 777, 378, 1820).gTarjetaSkinTemplate()
        );

        //Skin Lillia
        this.add(
            new TarjetaSkinComponent("resources/img/skins/lilliaFlorEspiritual.jpg", "Lillia Flor Espiritual", 899, 378, 1350).gTarjetaSkinTemplate()
        );
    }
}