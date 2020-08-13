package app.client.components.juega;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import app.services.servicesGraphics.*;

public class JuegaTemplate extends JPanel {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JuegaComponent juegaComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo, lCancelar;
    private JButton bPVP, bCOOP, bEntrenamiento, bCPersonalizada, bUPersonalizada, bTorneo, bConfirmar;
    private JPanel pPestanas;
    
    private ImageIcon iTorneo, iCancelar;
    private Font fuente;

    public JuegaTemplate(JuegaComponent juegaComponent){
        this.juegaComponent = juegaComponent;
        this.setLocation(0, 0);
        this.setSize(1055, 638);

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjetosDecoradores();
        crearMenu();
        pPestanas = new JPanel();
        pPestanas.setBounds(0, 60, 1055, 528);
        pPestanas.setLayout(null);
        pPestanas.setBackground(Color.BLACK);
        pPestanas.setOpaque(false);
        this.add(pPestanas);

        lCancelar = sObjGraficos.construirJLabel(null, 425, 595, 34, 34, iCancelar, null, null, null, null, "c");
        this.add(lCancelar);

        bConfirmar = sObjGraficos.crearJButton(
            "CONFIRMAR", 460, 595, 168, 35, sRecursos.getcMano(), null, sRecursos.getFuenteBotonesPrincipales(), sRecursos.getColorFndoBotones(),
            Color.WHITE, sRecursos.getBordeBotonesPrincipales(), "c", true, false
            );
        this.add(bConfirmar);

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(sRecursos.gIFondoJuega());
        this.add(lFondo);
                
        this.setLayout(null);
        this.setBackground(null);
        this.setVisible(true);
    }
    
    private void crearObjetosDecoradores() {
        fuente = new Font("Cambria", Font.BOLD, 12);
        iTorneo = new ImageIcon("resources/img/juega/torneo.png");
        iCancelar = new ImageIcon("resources/img/juega/cancelar.png");
    }

    private void crearMenu() {

        bPVP = sObjGraficos.crearJButton(
            "PVP", 33, 5, 50, 20, sRecursos.getcMano(), null, fuente, null, Color.WHITE, sRecursos.getBordeFocus(), "c", false, false
            );
        bPVP.addActionListener(juegaComponent);
        bPVP.addMouseListener(juegaComponent);

        this.add(bPVP);
        bCOOP = sObjGraficos.crearJButton(
            "COOP. VS IA", 90, 5, 105, 20, sRecursos.getcMano(), null, fuente, null, sRecursos.getColorHerramietas(), null, "c", false, false
        );
        bCOOP.addActionListener(juegaComponent);
        bCOOP.addMouseListener(juegaComponent);
        this.add(bCOOP);

        bEntrenamiento = sObjGraficos.crearJButton(
            "ENTRENAMIENTO", 190, 5, 135, 20, sRecursos.getcMano(), null, fuente, null, sRecursos.getColorHerramietas(), null, "c", 
            false, false
        );
        bEntrenamiento.addActionListener(juegaComponent);
        bEntrenamiento.addMouseListener(juegaComponent);
        this.add(bEntrenamiento);

        bCPersonalizada = sObjGraficos.crearJButton(
            "CREAR PERSONALIZADA", 390, 5, 175, 20, sRecursos.getcMano(), null, fuente, null, sRecursos.getColorHerramietas(), null, "c", 
            false, false
        );
        bCPersonalizada.addActionListener(juegaComponent);
        bCPersonalizada.addMouseListener(juegaComponent);
        this.add(bCPersonalizada);

        bUPersonalizada = sObjGraficos.crearJButton(
            "UNIRSE A PERSONALIZADA", 565, 5, 195, 20, sRecursos.getcMano(), null, fuente, null, sRecursos.getColorHerramietas(), 
            null, "c", false, false
        );
        bUPersonalizada.addActionListener(juegaComponent);
        bUPersonalizada.addMouseListener(juegaComponent);
        this.add(bUPersonalizada);

        bTorneo = sObjGraficos.crearJButton(
            "", 982, 6, 38, 32, sRecursos.getcMano(), iTorneo, fuente, sRecursos.getColorFndoBotones(), null, 
            BorderFactory.createMatteBorder(1, 1, 1, 1, sRecursos.getColorBorderFondoDorado()), "c", true, false
        );
        bTorneo.addMouseListener(juegaComponent);
        this.add(bTorneo);
    }

    public JPanel gPPestanas(){
        return pPestanas;
    }

    public JButton getbPVP() {
        return bPVP;
    }

    public JButton getbCOOP() {
        return bCOOP;
    }

    public JButton getbEntrenamiento() {
        return bEntrenamiento;
    }

    public JButton getbCPersonalizada() {
        return bCPersonalizada;
    }

    public JButton getbUPersonalizada() {
        return bUPersonalizada;
    }

    public JButton getbTorneo() {
        return bTorneo;
    }
}