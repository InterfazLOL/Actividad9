package app.client.vistaPrincipal;

import javax.swing.JFrame;
import javax.swing.JPanel;

import app.services.servicesGraphics.*;

public class VistaPrincipalTemplate extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JPanel pSuperior, pCentral, pLateral;

    private ObjGraficosService sObjGraficos;


    public VistaPrincipalTemplate(){

        sObjGraficos = ObjGraficosService.getService();

        crearJPanels();
        //super("Vista principal");
        this.setTitle("Vista principal");
        this.setSize(1278, 720);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true); //Se quitan los barra superior con todas sus herramientas
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearJPanels(){
        pSuperior = sObjGraficos.construirJPanel(0, 0, 1055, 80, null, null, null);
        this.add(pSuperior);
        pCentral = sObjGraficos.construirJPanel(0, 80, 1055, 640, null, null, null);
        this.add(pCentral);
        pLateral = sObjGraficos.construirJPanel(1055, 0, 223, 720, null, null, null);
        this.add(pLateral);
    }

    public JPanel getPSuperior(){
        return pSuperior;
    }

    public JPanel getPCentral(){
        return pCentral;
    }

    public JPanel getPLateral(){
        return pLateral;
    }

	public void setPCentral(final JPanel panel) {
        this.pCentral = panel;
	}
}