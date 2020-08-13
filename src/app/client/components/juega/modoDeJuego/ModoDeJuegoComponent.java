package app.client.components.juega.modoDeJuego;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;

public class ModoDeJuegoComponent implements MouseInputListener {

    private ModoDeJuegoTemplate modoDeJuegoTemplate;

    public ModoDeJuegoComponent(ImageIcon imagen, String texto, int x, int y) {

        modoDeJuegoTemplate = new ModoDeJuegoTemplate(imagen, texto, this, x, y);
    }

    public ModoDeJuegoTemplate gModoDeJuegoTemplate() {
        return modoDeJuegoTemplate;
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
        modoDeJuegoTemplate.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // 
        modoDeJuegoTemplate.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}