package app.client.components.juega.personalizada;

import javax.swing.JButton;
import javax.swing.JPanel;

import app.services.servicesGraphics.*;

public class PersonalizadaTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private final ObjGraficosService objService;
    private final RecursosService recursosService;

    private JButton bGrieta, bAram;
    
    public PersonalizadaTemplate() {
        
        objService = ObjGraficosService.getService();
        recursosService = RecursosService.getService();
        this.setBounds(0, 0, 1055, 478);
        
        bGrieta = objService.crearJButton(null, 285, 0, 195, 230, recursosService.getcMano(), recursosService.gIGrieta(), null,
                null, null, null, "c", false, false);
        this.add(bGrieta);

        bAram = objService.crearJButton(null, 530, 0, 195, 230, recursosService.getcMano(), recursosService.gIAram(), null,
                null, null, null, "c", false, false);
        this.add(bAram);
        
        this.setLayout(null);
        this.setOpaque(false);
        this.setVisible(true);
    }
}