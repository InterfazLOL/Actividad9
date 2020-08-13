package app.client.components.barraNavegacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesGraphics.RecursosService;

public class BarraSuperiorComponent implements ActionListener, MouseListener, MouseMotionListener {

    private BarraSuperiorTemplate barraSuperiorTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    private String ventanaFocus;
    private int x, y;
    private JButton botonFocusAnt;

    public BarraSuperiorComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.barraSuperiorTemplate = new BarraSuperiorTemplate(this);
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        ventanaFocus = "INICIO";
        botonFocusAnt = barraSuperiorTemplate.gBInicio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim(), e); // trim quita los espacios antes o
                                                                                   // despues del texto
    }

    public BarraSuperiorTemplate getBarraSuperiorTemplate() {
        return barraSuperiorTemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        JButton b = (JButton) e.getSource();

        if (b == barraSuperiorTemplate.gBJugar()) {
            b.setBorder(BorderFactory.createLineBorder(new Color(92, 91, 87), 2));
            b.setForeground(new Color(92, 91, 87));
            botonFocusAnt.setForeground(RecursosService.getService().getColorHerramietas());
        } else {
            if (botonFocusAnt == barraSuperiorTemplate.gBJugar())
                botonFocusAnt.setForeground(Color.WHITE);
            else
                botonFocusAnt.setForeground(RecursosService.getService().getColorHerramietas());
        }
        botonFocusAnt = b;
        ventanaFocus = b.getText();
    }

    @Override
    public void mousePressed(MouseEvent e) {

        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton b = (JButton) e.getSource();

            if (b == barraSuperiorTemplate.gBJugar()) {
                if (botonFocusAnt == b)
                    return;
                b.setBorder(BorderFactory.createLineBorder(new Color(39, 200, 226), 2));
            } else {

                b.setForeground(Color.WHITE);
                /*
                 * b.setContentAreaFilled(true); b.setBackground(new Color(131, 132, 130));
                 */
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton b = (JButton) e.getSource();
            if (!b.getText().equals(ventanaFocus)) {
                if (b == barraSuperiorTemplate.gBJugar()) {
                    b.setBorder(RecursosService.getService().getBordeBotonesPrincipales());
                } else {
                    b.setForeground(RecursosService.getService().getColorHerramietas());
                    b.setContentAreaFilled(false);
                }
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.vistaPrincipalComponent.moverVentana(e.getXOnScreen() - x, e.getYOnScreen() - y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}