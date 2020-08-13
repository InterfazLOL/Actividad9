package app.client.components.juega.entrenamiento;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import app.client.components.juega.modoDeJuego.ModoDeJuegoComponent;
import app.services.servicesGraphics.RecursosService;

public class EntrenamientoTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private RecursosService recursosService;
    private ImageIcon iEntrenamiento, iTutorial;
    
    public EntrenamientoTemplate() {
        
        recursosService = RecursosService.getService();
        this.setBounds(0, 0, 1055, 478);

        cargarImagenes();
        
        this.add(new ModoDeJuegoComponent(
            iTutorial,
            "Aprende lo esencial en la secuencia instructiva de tutorial.",
            280, 35
            ).gModoDeJuegoTemplate()
        );

        this.add(new ModoDeJuegoComponent(
            iEntrenamiento,
            "Practica con tu campeon favorito en el gimnasio de entrenamiento individual de la Grieta del Invocador.",
            530, 35
            ).gModoDeJuegoTemplate()
        );
        
        this.setLayout(null);
        this.setBackground(recursosService.getColorTransparente());
        this.setVisible(true);
    }

    private void cargarImagenes() {

        iTutorial = new ImageIcon("resources/img/juega/tutorial.png");
        iEntrenamiento = new ImageIcon("resources/img/juega/practica.png");
    }
}