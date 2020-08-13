package app.client.components.juega.coop;

import javax.swing.JPanel;

import app.client.components.juega.modoDeJuego.ModoDeJuegoComponent;
import app.services.servicesGraphics.RecursosService;

public class CoopTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private RecursosService recursosService;
    
    public CoopTemplate() {

        recursosService = RecursosService.getService();
        this.setBounds(0, 0, 1055, 478);

        this.add(new ModoDeJuegoComponent(
            recursosService.gIGrieta(),
            "Forma un equipo con otros jugadores para luchar contra un equipo de bots y destruir el nexo enemigo.",
            405, 35
            ).gModoDeJuegoTemplate()
        );
        
        this.setLayout(null);
        this.setBackground(recursosService.getColorTransparente());
        this.setVisible(true);
    }
}