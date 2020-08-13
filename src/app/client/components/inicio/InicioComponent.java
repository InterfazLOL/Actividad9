package app.client.components.inicio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import app.client.components.inicio.vistaGeneral.VistaGeneralComponent;
import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesGraphics.RecursosService;

public class InicioComponent implements ActionListener, MouseListener {

    private InicioTemplate inicioTemplate;
    private VistaGeneralComponent vistaGeneralComponent;

    private JButton bFocus;

    public InicioComponent(VistaPrincipalComponent vistaPrincipalComponent) {

        inicioTemplate = new InicioTemplate(this);
        vistaGeneralComponent = new VistaGeneralComponent();
        
        inicioTemplate.gPPestanas().add(vistaGeneralComponent.gVistaGeneralTemplate());
        inicioTemplate.gPPestanas().repaint();
        bFocus = inicioTemplate.getbVistaGeneral();
    }

    public InicioTemplate gInicioTemplate() {
        return inicioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inicioTemplate.gPPestanas().removeAll();
        String comando = e.getActionCommand();
        switch (comando) {
            case "VISTA GENERAL":
                inicioTemplate.gPPestanas().add(vistaGeneralComponent.gVistaGeneralTemplate());
                break;
            case "NOTICIAS":

                break;
            case "NOTAS DE VERSIÓN":

                break;
            default:
                break;
        }
        inicioTemplate.gPPestanas().repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        bFocus.setForeground(RecursosService.getService().getColorHerramietas());
        bFocus.setBorder(null);
        bFocus = (JButton) e.getSource();
        bFocus.setForeground(Color.WHITE);
        bFocus.setBorder(RecursosService.getService().getBordeFocus());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        JButton b = (JButton) e.getSource();
        b.setForeground(Color.WHITE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        JButton b = (JButton) e.getSource();
        if (b != bFocus) {            
            b.setForeground(RecursosService.getService().getColorHerramietas());
        }
    }
}