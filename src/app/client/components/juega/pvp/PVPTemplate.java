package app.client.components.juega.pvp;

import javax.swing.JPanel;

import app.client.components.juega.modoDeJuego.ModoDeJuegoComponent;
import app.services.servicesGraphics.*;

public class PVPTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private RecursosService recursosService;

    public PVPTemplate(){

        recursosService = RecursosService.getService();
        crearModoGrieta();
        crearModoAram();
        crearModoTFT();
        this.setBounds(0, 0, 1055, 478);
        this.setLayout(null);
        this.setBackground(recursosService.getColorTransparente());
        this.setVisible(true);
    }

    private void crearModoTFT() {
        this.add(new ModoDeJuegoComponent(
            recursosService.gITFT(), 
            "Reune un escuadron de campeones para que peleen por ti. Sobrevive a tus siete oponentes y conviertete en el ultimo en quedar en pie.",
            656, 35
            ).gModoDeJuegoTemplate()
        );

    }

    private void crearModoAram() {
        this.add(new ModoDeJuegoComponent(
            recursosService.gIAram(), 
            "Diez campeones seleccionados al azar aparecen en un puente estrecho en una tierra helada. Cruza al otro lado y destruye todo a tu paso.",
            407, 35
            ).gModoDeJuegoTemplate()
        );
    }

    private void crearModoGrieta() {
        this.add(new ModoDeJuegoComponent(
            recursosService.gIGrieta(),
            "Arrasa tu carril, sumérgete en peleas de equipo de cinco contra cinco y destruye el nexo del enemigo en el modo competitivo más importante de LoL.",
            158, 35
            ).gModoDeJuegoTemplate()
        ); 
    }
    
}