package app.client.components.barraNotificaciones.amigos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AmigosComponent implements MouseListener {

    private AmigosTemplate amigosTemplate;

    public AmigosComponent(ImageIcon imagen, String nombreUsuario, String estadoAmigo) {
        amigosTemplate = new AmigosTemplate(imagen, nombreUsuario, estadoAmigo, this);
    }

    public AmigosTemplate gAmigosTemplate() {
        return amigosTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JPanel panel = (JPanel) e.getSource();
        panel.setOpaque(true);
        panel.setBackground(new Color(30, 35, 40));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JPanel panel = (JPanel) e.getSource();
        panel.setBackground(null);
        panel.setOpaque(false);
    }
}