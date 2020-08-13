package app.services.servicesGraphics;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import java.awt.Cursor;

public class RecursosService {

    private static RecursosService servicio;
    private Color colorFndoIzq, colorFndoCampos, colorFont, colorFontOp, colorBtnIngresar, colorAzulFondo, 
        colorAzulFondoLateral, colorFndoBotones, colorHerramientas, colorBorderFondoDorado, colorTransparente,
        colorBordeInferior, colorLetraDesenfocada, colorLetraEnfocada, colorDesopacoLogin, colorFocus, colorLetrasSocial;
    private Font fontPrincipal, fontSecundaria, fontPer, fuenteBotonesPrincipales, fuenteCambria12Bold, fontTypol15;
    private Cursor cMano;
    private Border bordeInferiorDelgado, bordeBotonesPrincipales, bordeTxtLogin, bordeFocus;
    private ImageIcon iRP, iGrieta, iAram, iTFT, iFondoJuega;
    
    private RecursosService() {
        colorFndoIzq = new Color(249, 249, 249);
        colorFndoCampos = new Color(237, 237, 237);
        colorFont = new Color(0, 0, 0);
        colorFontOp = new Color(0, 0, 0, 80);
        colorBtnIngresar = new Color(209, 54, 57);
        colorAzulFondo = new Color(2, 4, 7);
        colorAzulFondoLateral = new Color(1, 10, 19);
        colorFndoBotones = new Color(30, 35, 40);
        colorHerramientas = new Color(205, 190, 145);
        colorBorderFondoDorado = new Color(158, 102, 39);
        colorTransparente = new Color(0, 0, 0, 0);
        colorBordeInferior = new Color(80, 75, 66);
        colorLetraEnfocada = new Color(242, 234, 217);
        colorLetraDesenfocada = new Color(242, 234, 217, 1);
        colorDesopacoLogin = new Color(51, 51, 51);
        colorFocus = new Color(23, 21, 16);
        colorLetrasSocial = new Color(92, 91, 87);
        fontPrincipal = new Font("Typold Condensed Medium", Font.BOLD, 22);
        fontTypol15 = new Font("Typold Condensed Medium", Font.BOLD, 15);
        fontSecundaria = new Font("Typold Condensed Medium", Font.BOLD, 11);
        fontPer = new Font("Typold Condensed Medium", Font.BOLD, 13);
        fuenteBotonesPrincipales = new Font("Cambria", Font.BOLD, 16);
        fuenteCambria12Bold = new Font("Cambria", Font.BOLD, 12);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        bordeInferiorDelgado = BorderFactory.createMatteBorder(0, 0, 1, 0, colorBordeInferior);
        bordeBotonesPrincipales = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(5, 141, 164));
        bordeTxtLogin = BorderFactory.createLineBorder(new Color(51, 51, 51), 2, true);
        bordeFocus = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(197, 183, 140));
        iGrieta = new ImageIcon("resources/img/juega/grieta.png");
        iAram = new ImageIcon("resources/img/juega/aram.png");
        iTFT = new ImageIcon("resources/img/juega/tft.png");
        iFondoJuega = new ImageIcon("resources/img/juega/fondoJuega.jpg");
        iRP = new ImageIcon("resources/img/barraSuperior/rp.png");
    }

    public static RecursosService getService(){
        if(servicio==null)
            servicio = new RecursosService();
        return servicio;
    }

    public Color getColorFndoIzq() {
        return colorFndoIzq;
    }
    
    public Color getColorFocus() {
        return colorFocus;
    }

    public Color getColorFndoCampos() {
        return colorFndoCampos;
    }

    public Color getColorLetrasSocial() {
        return colorLetrasSocial;
    }

    public Color getColorDespacoLogin() {
        return colorDesopacoLogin;
    }

    public Color getColorFont() {
        return colorFont;
    }

    public Color getColorFontOp() {
        return colorFontOp;
    }

    public Color getColorAzulFondo() {
        return colorAzulFondo;
    }

    public Color getColorAzulFondoLateral() {
        return colorAzulFondoLateral;
    }

    public Font getFontPrincipal() {
        return fontPrincipal;
    }

    public Font getFontSecundaria() {
        return fontSecundaria;
    }

    public Font getFontPer() {
        return fontPer;
    }
    public Font getFontTypol15() {
        return fontTypol15;
    }

    public Font getFuenteBotonesPrincipales() {
        return fuenteBotonesPrincipales;
    }

    public Font getFuenteCambria12Bold() {
        return fuenteCambria12Bold;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public Color getColorBtnIngresar(){
        return colorBtnIngresar;
    }

    public Color getColorFndoBotones() {
        return colorFndoBotones;
    }

    public Color getColorHerramietas() {
        return colorHerramientas;
    }

    public Color getColorBorderFondoDorado() {
        return colorBorderFondoDorado;
    }

    public Color getColorTransparente() {
        return colorTransparente;
    }

    public Color getColorBordeInferior() {
        return colorBordeInferior;
    }

    public Color getColorFuenteEnfocada() {
        return colorLetraEnfocada;
    }

    public Color getColorFuenteDesenfocada() {
        return colorLetraDesenfocada;
    }

    public Border getBordeInferiorDelgado() {
        return bordeInferiorDelgado;
    }

    public Border getBordeBotonesPrincipales() {
        return bordeBotonesPrincipales;
    }

    public Border getBordeTxtLogin() {
        return bordeTxtLogin;
    }

    public Border getBordeFocus() {
        return bordeFocus;
    }

    public ImageIcon gIGrieta() {
        return iGrieta;
    }

    public ImageIcon gIAram() {
        return iAram;
    }

    public ImageIcon gITFT() {
        return iTFT;
    }

    public ImageIcon gIFondoJuega() {
        return iFondoJuega;
    }

    public ImageIcon gIRP() {
        return iRP;
    }
}