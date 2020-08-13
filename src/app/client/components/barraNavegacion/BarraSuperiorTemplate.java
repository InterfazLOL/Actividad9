package app.client.components.barraNavegacion;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.services.servicesGraphics.*;

public class BarraSuperiorTemplate extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private BarraSuperiorComponent barraSuperiorComponent;
    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JButton bInicio, bPerfil, bColeccion, bTFT, bClash, bTienda, bBotin, bJugar;
    private JLabel lRP, lEsenciaAzul, lFondo, lJugar;

    private ImageIcon iAux, iPerfil, iColeccion, iBotin, iTienda, iEsenciaAzul, iFondoInicio, iFondoTFT,
            iFondoPerfil, iFondoColeccion, iFondoClash, iFondoJugar, iFondoTienda, iFondoBotin, iJuega;

    public BarraSuperiorTemplate(BarraSuperiorComponent barraSuperiorComponent) {
        this.barraSuperiorComponent = barraSuperiorComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjDecoradores();
        crearJButtons();
        crearJLabels();

        lFondo = new JLabel();
        lFondo.setSize(1055, 79);
        lFondo.setIcon(iFondoInicio);
        this.add(lFondo);

        this.setSize(1055, 80);
        this.setLayout(null);
        this.setBackground(null);
        this.setBorder(sRecursos.getBordeInferiorDelgado());
        this.addMouseMotionListener(barraSuperiorComponent);
        this.addMouseListener(barraSuperiorComponent);
        this.setVisible(true);
    }

    private void crearObjDecoradores() {

        iPerfil = new ImageIcon("resources/img/barraSuperior/perfil.png");
        iColeccion = new ImageIcon("resources/img/barraSuperior/coleccion.png");
        iBotin = new ImageIcon("resources/img/barraSuperior/botin.png");
        iTienda = new ImageIcon("resources/img/barraSuperior/tienda.png");
        
        iEsenciaAzul = new ImageIcon("resources/img/barraSuperior/esenciaAzul.png");
        iFondoInicio = new ImageIcon("resources/img/barraSuperior/fondoInicio.png");
        iFondoTFT = new ImageIcon("resources/img/barraSuperior/fondoTFT.jpg");
        iFondoJugar = new ImageIcon("resources/img/barraSuperior/fondoJugar.jpg");
        iFondoClash = new ImageIcon("resources/img/barraSuperior/fondoClash.jpg");
        iFondoPerfil = new ImageIcon("resources/img/barraSuperior/fondoPerfil.jpg");
        iFondoColeccion = new ImageIcon("resources/img/barraSuperior/fondoColeccion.jpg");
        iFondoBotin = new ImageIcon("resources/img/barraSuperior/fondoBotin.jpg");
        iFondoTienda = new ImageIcon("resources/img/barraSuperior/fondoTienda.jpg");
        iJuega = new ImageIcon("resources/img/barraSuperior/Juega.png");
    }

    private void crearJLabels() {

        lJugar = new JLabel();
        lJugar.setBounds(25, 20, 40, 40);
        lJugar.setIcon(iJuega);
        this.add(lJugar);
        lRP = new JLabel(" 45");
        lRP.setBounds(960, 20, 80, 20);
        iAux = new ImageIcon(sRecursos.gIRP().getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        lRP.setFont(sRecursos.getFuenteBotonesPrincipales());
        lRP.setForeground(Color.WHITE);
        lRP.setIcon(iAux);
        this.add(lRP);
        lEsenciaAzul = new JLabel(" 6271");
        lEsenciaAzul.setBounds(962, 42, 80, 20);
        iAux = new ImageIcon(iEsenciaAzul.getImage().getScaledInstance(12, 17, Image.SCALE_AREA_AVERAGING));
        lEsenciaAzul.setIcon(iAux);
        lEsenciaAzul.setFont(sRecursos.getFuenteBotonesPrincipales());
        lEsenciaAzul.setForeground(Color.WHITE);
        this.add(lEsenciaAzul);
    }

    private void crearJButtons() {
        /*
         * bJugar = sObjGraficos.crearJButton("Juega", 60, 20, 130, 40,
         * sRecursos.getcMano(), null, null, sRecursos.getColorFndoJuega(), Color.WHITE,
         * null, "c", false, false);
         */
        bJugar = new JButton("JUEGA");
        bJugar.setBounds(64, 25, 130, 30);
        bJugar.setBackground(sRecursos.getColorFndoBotones());
        bJugar.addActionListener(barraSuperiorComponent);
        bJugar.setFont(sRecursos.getFuenteBotonesPrincipales());
        bJugar.setForeground(Color.WHITE);
        bJugar.setFocusable(false);
        bJugar.setBorder(sRecursos.getBordeBotonesPrincipales());
        bJugar.setCursor(sRecursos.getcMano());
        bJugar.addMouseListener(barraSuperiorComponent);
        this.add(bJugar);
        bInicio = sObjGraficos.crearJButton("INICIO", 215, 0, 80, 80, sRecursos.getcMano(), null, null,
                null, Color.WHITE, null, "c", false, false);
        bInicio.addActionListener(barraSuperiorComponent);
        bInicio.setForeground(Color.WHITE);
        bInicio.setFont(sRecursos.getFuenteBotonesPrincipales());
        bInicio.addMouseListener(barraSuperiorComponent);
        this.add(bInicio);
        bTFT = sObjGraficos.crearJButton("TFT", 295, 0, 60, 80, sRecursos.getcMano(), null, null, null, null,
                null, "c", false, false);
        bTFT.addActionListener(barraSuperiorComponent);
        bTFT.setFont(sRecursos.getFuenteBotonesPrincipales());
        bTFT.setForeground(sRecursos.getColorHerramietas());
        bTFT.addMouseListener(barraSuperiorComponent);
        this.add(bTFT);
        bClash = sObjGraficos.crearJButton("CLASH", 355, 0, 80, 80, sRecursos.getcMano(), null, null, null,
                null, null, "c", false, false);
        bClash.addActionListener(barraSuperiorComponent);
        bClash.setFont(sRecursos.getFuenteBotonesPrincipales());
        bClash.setForeground(sRecursos.getColorHerramietas());
        bClash.addMouseListener(barraSuperiorComponent);
        this.add(bClash);
        iAux = new ImageIcon(iPerfil.getImage().getScaledInstance(25, 23, Image.SCALE_AREA_AVERAGING));
        bPerfil = sObjGraficos.crearJButton("", 710, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bPerfil.addActionListener(barraSuperiorComponent);
        bPerfil.addMouseListener(barraSuperiorComponent);
        this.add(bPerfil);
        iAux = new ImageIcon(iColeccion.getImage().getScaledInstance(26, 24, Image.SCALE_AREA_AVERAGING));
        bColeccion = sObjGraficos.crearJButton("", 765, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null,
                "c", false, false);
        bColeccion.addActionListener(barraSuperiorComponent);
        bColeccion.addMouseListener(barraSuperiorComponent);
        this.add(bColeccion);
        iAux = new ImageIcon(iBotin.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        bBotin = sObjGraficos.crearJButton("", 820, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bBotin.addActionListener(barraSuperiorComponent);
        bBotin.addMouseListener(barraSuperiorComponent);
        this.add(bBotin);
        iAux = new ImageIcon(iTienda.getImage().getScaledInstance(25, 24, Image.SCALE_AREA_AVERAGING));
        bTienda = sObjGraficos.crearJButton("", 875, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bTienda.addActionListener(barraSuperiorComponent);
        bTienda.addMouseListener(barraSuperiorComponent);        
        this.add(bTienda);
    }

    public JButton gBInicio() {
        return bInicio;
    }

    public JButton gBJugar() {
        return bJugar;
    }

    public JButton gBPerfil() {
        return bPerfil;
    }

    public JButton gBBotin() {
        return bBotin;
    }

    public JButton gBColeccion() {
        return bColeccion;
    }

    public JButton gBTienda() {
        return bTienda;
    }

    public JLabel getLFondo() {
        return lFondo;
    }

    public void fondo(String fondo) {
        switch (fondo) {
            case "J":
                lFondo.setIcon(iFondoJugar);
                break;
            case "I":
                lFondo.setIcon(iFondoInicio);
                break;
            case "T":
                lFondo.setIcon(iFondoTFT);
                break;
            case "CL":
                lFondo.setIcon(iFondoClash);
                break;
            case "P":
                lFondo.setIcon(iFondoPerfil);
                break;
            case "TI":
                lFondo.setIcon(iFondoTienda);
                break;
            case "B":
                lFondo.setIcon(iFondoBotin);
                break;
            case "CO":
                lFondo.setIcon(iFondoColeccion);
                break;           
            default:
                break;
        }
    }

}
