package app.services.servicesGraphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.LayoutManager;
import javax.swing.border.Border;

public class ObjGraficosService {

    private static ObjGraficosService servicio;
    private JPanel pPanel;

    private ObjGraficosService() {

    }

    public JPanel construirJPanel(int x, int y, int ancho, int alto, Color cFondo, Border border,
            LayoutManager layout) {
        pPanel = new JPanel();
        pPanel.setSize(ancho, alto);
        pPanel.setLocation(x, y);
        pPanel.setLayout(layout);
        pPanel.setBackground(cFondo);
        pPanel.setBorder(border);
        return pPanel;
    }

    public JButton crearJButton(String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen,
            Font fuente, Color colorFondo, Color colorFuente, Border border, String alineacion, boolean esSolido,
            boolean focusable) {
        JButton bBoton = new JButton(texto);
        bBoton.setSize(ancho, alto);
        bBoton.setLocation(x, y);
        bBoton.setFocusable(focusable);
        bBoton.setContentAreaFilled(esSolido);
        bBoton.setCursor(cursor);
        bBoton.setIcon(imagen);
        bBoton.setFont(fuente);
        bBoton.setBorder(border);
        bBoton.setBackground(colorFondo);
        bBoton.setForeground(colorFuente);
        switch (alineacion) {
            case "l":
            bBoton.setHorizontalAlignment(SwingConstants.LEFT);
            break;
            case "r":
            bBoton.setHorizontalAlignment(SwingConstants.RIGHT);
            break;
            default:
            break;
        }
        return bBoton;
    }

    public JLabel construirJLabel(String texto, int x, int y, int ancho, int alto, ImageIcon imagen, Font fuente,
            Color colorFondo, Color colorFuente, Border border, String alineacion) {
        JLabel label = new JLabel(texto);
        label.setSize(ancho, alto);
        label.setLocation(x, y);
        label.setIcon(imagen);
        label.setFont(fuente);
        label.setBackground(colorFondo);
        label.setForeground(colorFuente);
        label.setBorder(border);
        switch (alineacion) {
            case "r":
                label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                label.setHorizontalAlignment(SwingConstants.LEFT);
                ;
            default:
                break;
        }
        return label;
    }

    public JTextField construirTextField(String texto, int ancho, int alto, int x, int y, Font fuente, Color cLetra,
            Color cFondo, Color cCaret, Border border, String alineacion) {
        JTextField t = new JTextField(texto);
        t.setSize(ancho, alto);
        t.setLocation(x, y);
        t.setFont(fuente);
        t.setForeground(cLetra);
        t.setBackground(cFondo);
        t.setCaretColor(cCaret);
        t.setBorder(border);
        switch (alineacion) {
            case "r":
                t.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "l":
                t.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "c":
                t.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
        }
        return t;
    }

    public static ObjGraficosService getService() {
        if (servicio == null)
            servicio = new ObjGraficosService();
        return servicio;
    }
}