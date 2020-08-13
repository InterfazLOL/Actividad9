package app.client.components.juega;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

import app.client.components.juega.coop.CoopComponent;
import app.client.components.juega.entrenamiento.EntrenamientoComponent;
import app.client.components.juega.personalizada.PersonalizadaComponent;
import app.client.components.juega.pvp.PVPComponent;
import app.services.servicesGraphics.RecursosService;

public class JuegaComponent implements ActionListener, MouseListener {

    private JuegaTemplate juegaTemplate;
    private PVPComponent pvpComponent;
    private CoopComponent coopComponent;
    private EntrenamientoComponent entrenamientoComponent;
    private PersonalizadaComponent personalizadaComponent;

    private JButton bFocus;

    public JuegaComponent() {

        juegaTemplate = new JuegaTemplate(this);
        pvpComponent = new PVPComponent();
        juegaTemplate.gPPestanas().add(pvpComponent.gPvpTemplate());
        bFocus = juegaTemplate.getbPVP();
    }

    public JuegaTemplate gJuegaTemplate() {
        return juegaTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        juegaTemplate.gPPestanas().removeAll();
        String comando = e.getActionCommand();
        switch (comando) {
            case "PVP":
                if (pvpComponent == null)
                    pvpComponent = new PVPComponent();
                juegaTemplate.gPPestanas().add(pvpComponent.gPvpTemplate());
                break;
            case "COOP. VS IA":
                if (coopComponent == null)
                    coopComponent = new CoopComponent();
                juegaTemplate.gPPestanas().add(coopComponent.gCoopTemplate());
                break;
            case "ENTRENAMIENTO":
                if (entrenamientoComponent == null)
                    entrenamientoComponent = new EntrenamientoComponent();
                juegaTemplate.gPPestanas().add(entrenamientoComponent.gEntrenamientoTemplate());
                break;
            case "CREAR PERSONALIZADA":
                if (personalizadaComponent == null)
                    personalizadaComponent = new PersonalizadaComponent();
                juegaTemplate.gPPestanas().add(personalizadaComponent.gPersonalizadaTemplate());
                break;
            case "UNIRSE A PERSONALIZADA":

                break;
            default:
                break;
        }
        juegaTemplate.gPPestanas().repaint();

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