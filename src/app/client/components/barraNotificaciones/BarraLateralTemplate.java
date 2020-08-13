package app.client.components.barraNotificaciones;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.client.components.barraNotificaciones.amigos.AmigosComponent;
import app.client.components.barraNotificaciones.amigos.AmigosTemplate;
import app.services.servicesGraphics.*;
import models.Amigo;

public class BarraLateralTemplate extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private BarraLateralComponent barraLateralComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JPanel pHerramientasVentana, pSocialMedia;
    private JButton bAyuda, bMinimizar, bConfiguracion, bCerrar, bNotificaciones, bEstado, bGrupo1, bGrupo2, 
                    bMensajes, bMisiones, bMicrofono, bErrores;
    private JLabel lImgUsuario, lNomUsuario, lSocial, lAnadirAmigo, lOpciones, lFiltro, lLol, lDesconectados, lVersion;

    private ImageIcon iAyuda, iMinimizar, iConfiguracion, iCerrar, iNotificaciones, iUsuario, iEstado, iAnadirAmigo, iMensaje, iMisiones,
                        iError, iMicrofono, iOpciones, iFiltro, iGrupo1, iGrupo2;

    public BarraLateralTemplate(BarraLateralComponent barraLateralComponent){
        this.barraLateralComponent = barraLateralComponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();

        crearObjetosDecoradores();
        crearJPaneles();
        crearJButtons();
        crearInfoUsuario();
        crearSocialMedia();
        crearAmigos();
        
        this.setSize(223, 720);
        this.setBackground(new Color(1, 10, 19));
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearAmigos() {

        int numeroAmigos = 0, y = 154;
        Amigo amigo = barraLateralComponent.obtenerAmigo(numeroAmigos);

        while (amigo != null) {
            AmigosTemplate pAmigo = new AmigosComponent(amigo.getIcono(), amigo.getNombre(), amigo.getEstado()).gAmigosTemplate();
            pAmigo.setLocation(4, y);
            pSocialMedia.add(pAmigo);
            y += 48;
            numeroAmigos ++;
            amigo = barraLateralComponent.obtenerAmigo(numeroAmigos);
        }
        numeroAmigos = 0;
        y = 428;
        amigo = barraLateralComponent.obtenerAmigoDesconectado(numeroAmigos);
        while (amigo != null) {
            AmigosTemplate pAmigo = new AmigosComponent(amigo.getIcono(), amigo.getNombre(), amigo.getEstado()).gAmigosTemplate();
            pAmigo.setLocation(4, y);
            pSocialMedia.add(pAmigo);
            y += 48;
            numeroAmigos ++;
            amigo = barraLateralComponent.obtenerAmigoDesconectado(numeroAmigos);
        }
        
    }

    private void crearSocialMedia() {

        lSocial = sObjGraficos.construirJLabel(
            "SOCIAL", 7, 0, 60, 30, null, sRecursos.getFuenteCambria12Bold(), null, sRecursos.getColorLetrasSocial(), null, "l"
            );
        pSocialMedia.add(lSocial);

        lAnadirAmigo = sObjGraficos.construirJLabel("", 136, 5, 32, 20, iAnadirAmigo, null, null, null, null, "c");
        lAnadirAmigo.setCursor(sRecursos.getcMano());
        pSocialMedia.add(lAnadirAmigo);

        lOpciones = sObjGraficos.construirJLabel("", 168, 5, 32, 20, iOpciones, null, null, null, null, "c");
        lOpciones.setCursor(sRecursos.getcMano());
        pSocialMedia.add(lOpciones);

        lFiltro = sObjGraficos.construirJLabel("", 195, 5, 32, 20, iFiltro, null, null, null, null, "c");
        lFiltro.setCursor(sRecursos.getcMano());
        pSocialMedia.add(lFiltro);

        bGrupo1 = sObjGraficos.crearJButton(
            "  -Geek-", 10, 31, 203, 47, sRecursos.getcMano(), iGrupo1, new Font("Cambria", Font.BOLD, 14), null, Color.WHITE, null, "l",
             false, false
            );
        pSocialMedia.add(bGrupo1);

        bGrupo2 = sObjGraficos.crearJButton(
            "  xIArmyKingIx", 10, 78, 203, 47, sRecursos.getcMano(), iGrupo2, new Font("Cambria", Font.BOLD, 14), null, Color.WHITE, 
            null, "l", false, false
            );
        pSocialMedia.add(bGrupo2);

        lLol = sObjGraficos.construirJLabel("   LOL", 10, 125, 203, 24, null, sRecursos.getFuenteCambria12Bold(), null, sRecursos.getColorLetrasSocial(), null, "l");
        lLol.setCursor(sRecursos.getcMano());
        pSocialMedia.add(lLol);

        lDesconectados = sObjGraficos.construirJLabel(
            "   DESCONECTADOS", 10, 397, 203, 24, null, sRecursos.getFuenteCambria12Bold(), null, sRecursos.getColorLetrasSocial(), null, "l"
            );
        lDesconectados.setCursor(sRecursos.getcMano());
        pSocialMedia.add(lDesconectados);

        bMensajes = sObjGraficos.crearJButton(
            "", 0, 607, 37, 32, sRecursos.getcMano(), iMensaje, null, sRecursos.getColorFndoBotones(), null, 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorBorderFondoDorado()), "c", true, false
            );
        pSocialMedia.add(bMensajes);

        bMisiones = sObjGraficos.crearJButton(
            "", 42, 607, 37, 32, sRecursos.getcMano(), iMisiones, null, sRecursos.getColorFndoBotones(), null, 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorBorderFondoDorado()), "c", true, false
            );
        pSocialMedia.add(bMisiones);

        bMicrofono = sObjGraficos.crearJButton(
            "", 84, 607, 37, 32, null, iMicrofono, null, sRecursos.getColorFndoBotones(), null, 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorLetrasSocial()), "c", true, false
            );
        pSocialMedia.add(bMicrofono);

        lVersion = sObjGraficos.construirJLabel(
            "   V10.16", 121, 607, 100, 32, null, new Font("Cambria", Font.BOLD, 12), null, sRecursos.getColorLetrasSocial(), 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorLetrasSocial()), "l"
            );
        pSocialMedia.add(lVersion);

        bErrores = sObjGraficos.crearJButton(
            "", 192, 609, 27, 28, null, iError, null, sRecursos.getColorFndoBotones(), null, 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorBorderFondoDorado()), "c", true, false
            );
        bErrores.setCursor(sRecursos.getcMano());
        pSocialMedia.add(bErrores);
    }

    private void crearInfoUsuario() {

        iUsuario = new ImageIcon(barraLateralComponent.usuarioLogeado().getIcono().getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        lImgUsuario = sObjGraficos.construirJLabel("", 8, 10, 60, 60, iUsuario, null, null, null, null, "c");
        pHerramientasVentana.add(lImgUsuario);

        lNomUsuario = sObjGraficos.construirJLabel(
            barraLateralComponent.usuarioLogeado().getNombre(), 75, 20, 80, 25, null, sRecursos.getFuenteBotonesPrincipales(), null,
            Color.WHITE, null, "c"
            );
        pHerramientasVentana.add(lNomUsuario);
        iEstado = new ImageIcon(iEstado.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));
        bEstado = sObjGraficos.crearJButton(
            "Conectado", 75, 45, 100, 12, sRecursos.getcMano(), iEstado, new Font("Cambria", Font.PLAIN, 12), null, 
            sRecursos.getColorLetrasSocial(), null, "l", false, false
            );
        pHerramientasVentana.add(bEstado);
    }

    private void crearObjetosDecoradores() {

        iAyuda = new ImageIcon("resources/img/barraLateral/ayuda.png");
        iMinimizar = new ImageIcon("resources/img/barraLateral/minimizar.png");
        iConfiguracion = new ImageIcon("resources/img/barraLateral/configuracion.png");
        iCerrar = new ImageIcon("resources/img/barraLateral/cerrar.png");
        iNotificaciones = new ImageIcon("resources/img/barraLateral/notificaciones.png");
        iEstado = new ImageIcon("resources/img/barraLateral/estadoConectado.png");
        iAnadirAmigo = new ImageIcon("resources/img/barraLateral/anadirAmigos.png");
        iOpciones = new ImageIcon("resources/img/barraLateral/opciones.png");
        iFiltro = new ImageIcon("resources/img/barraLateral/filtro.png");
        iGrupo1 = new ImageIcon("resources/img/barraLateral/grupo1.png");
        iGrupo2 = new ImageIcon("resources/img/barraLateral/grupo2.png");
        iMensaje = new ImageIcon("resources/img/barraLateral/mensajes.png");
        iMisiones = new ImageIcon("resources/img/barraLateral/misiones.png");
        iMicrofono = new ImageIcon("resources/img/barraLateral/microfono.png");
        iError = new ImageIcon("resources/img/barraLateral/errores.png");
        
    }

    private void crearJPaneles(){
        pHerramientasVentana = sObjGraficos.construirJPanel(0, 0, 223, 80, null, sRecursos.getBordeInferiorDelgado(), null);
        pHerramientasVentana.setOpaque(false);
        this.add(pHerramientasVentana);

        pSocialMedia = sObjGraficos.construirJPanel(0, 80, 223, 640, null, null, null);
        pSocialMedia.setOpaque(false);
        this.add(pSocialMedia);
    }
    
    private void crearJButtons(){

        bAyuda = sObjGraficos.crearJButton("", 98, 8, 12, 12, sRecursos.getcMano(), iAyuda, null, null, null, null, "c", false, false);
        pHerramientasVentana.add(bAyuda);
        bMinimizar = sObjGraficos.crearJButton(
            "", 131, 8, 12, 12, sRecursos.getcMano(), iMinimizar, null, null, null, null, "c", false, false);
        bMinimizar.addActionListener(barraLateralComponent);
        pHerramientasVentana.add(bMinimizar);
        bConfiguracion = sObjGraficos.crearJButton(
            "", 165, 8, 12, 12, sRecursos.getcMano(), iConfiguracion, null, null, null, null, "c", false, false);
        pHerramientasVentana.add(bConfiguracion);
        bCerrar = sObjGraficos.crearJButton("", 199, 10, 10, 10, sRecursos.getcMano(), iCerrar, null, null, null, null, "c", false, false);
        bCerrar.addActionListener(barraLateralComponent);
        pHerramientasVentana.add(bCerrar);

        bNotificaciones = sObjGraficos.crearJButton(
            "", 195, 50, 12, 16, sRecursos.getcMano(), iNotificaciones, null, null, null, null, "c", false, false
            );
        pHerramientasVentana.add(bNotificaciones);
    }

    public JButton getbAyuda() {
        return bAyuda;
    }

    public JButton getbMinimizar() {
        return bMinimizar;
    }

    public JButton getbConfiguracion() {
        return bConfiguracion;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }
}
