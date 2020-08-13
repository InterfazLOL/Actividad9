package app.client.vistaPrincipal;

import app.client.components.barraNavegacion.BarraSuperiorComponent;
import app.client.components.barraNotificaciones.BarraLateralComponent;
import app.client.components.botin.BotinComponent;
import app.client.components.clash.ClashComponent;
import app.client.components.coleccion.ColeccionComponent;
import app.client.components.inicio.InicioComponent;
import app.client.components.juega.JuegaComponent;
import app.client.components.perfil.PerfilComponent;
import app.client.components.tft.TFTComponent;
import app.client.components.tienda.TiendaComponent;
import java.awt.Frame;

import java.awt.event.ActionEvent;

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraSuperiorComponent barraSuperiorComponent;
    private BarraLateralComponent barraLateralComponent;
    private JuegaComponent juegaComponent;
    private InicioComponent inicioComponent;
    private PerfilComponent perfilComponent;
    private ColeccionComponent coleccionComponent;
    private TFTComponent tftComponent;
    private ClashComponent clashComponent;
    private BotinComponent botinComponent;
    private TiendaComponent tiendaComponent;

    public VistaPrincipalComponent() {
        vistaPrincipalTemplate = new VistaPrincipalTemplate();
        barraSuperiorComponent = new BarraSuperiorComponent(this);
        vistaPrincipalTemplate.getPSuperior().add(barraSuperiorComponent.getBarraSuperiorTemplate());
        inicioComponent = new InicioComponent(this);
        vistaPrincipalTemplate.getPCentral().add(inicioComponent.gInicioTemplate());
        barraLateralComponent = new BarraLateralComponent(this);
        vistaPrincipalTemplate.getPLateral().add(barraLateralComponent.getBarraLateralTemplate());
        vistaPrincipalTemplate.repaint();
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    public void mostrarComponente(String componente, ActionEvent e) {
        vistaPrincipalTemplate.getPCentral().removeAll();
        switch (componente) {
            case "JUEGA":
                if (juegaComponent == null)
                    juegaComponent = new JuegaComponent();
                vistaPrincipalTemplate.getPCentral().add(juegaComponent.gJuegaTemplate());
                barraSuperiorComponent.getBarraSuperiorTemplate().fondo("J");
                break;
            case "INICIO":
                vistaPrincipalTemplate.getPCentral().add(inicioComponent.gInicioTemplate());
                barraSuperiorComponent.getBarraSuperiorTemplate().fondo("I");
                break;
            case "TFT":
                if (tftComponent == null)
                    tftComponent = new TFTComponent();
                vistaPrincipalTemplate.getPCentral().add(tftComponent.gTftTemplate());
                barraSuperiorComponent.getBarraSuperiorTemplate().fondo("T");
                break;
            case "CLASH":
                if (clashComponent == null)
                    clashComponent = new ClashComponent();
                vistaPrincipalTemplate.getPCentral().add(clashComponent.gClashTemplate());
                barraSuperiorComponent.getBarraSuperiorTemplate().fondo("CL");
                break;
            case "":
                if (e.getSource() == barraSuperiorComponent.getBarraSuperiorTemplate().gBBotin()) {
                    if (botinComponent == null)
                        botinComponent = new BotinComponent();
                    // La forma vista en clase
                    vistaPrincipalTemplate.getPCentral().add(botinComponent.gBotinTemplate());
                    // La otra forma
                    barraSuperiorComponent.getBarraSuperiorTemplate().fondo("B");
                } else if (e.getSource() == barraSuperiorComponent.getBarraSuperiorTemplate().gBPerfil()){
                    if (perfilComponent == null)
                        perfilComponent = new PerfilComponent();
                    vistaPrincipalTemplate.getPCentral().add(perfilComponent.gPerfilTemplate());
                    barraSuperiorComponent.getBarraSuperiorTemplate().fondo("P");
                } else if (e.getSource() == barraSuperiorComponent.getBarraSuperiorTemplate().gBColeccion()){
                    if (coleccionComponent == null)
                        coleccionComponent = new ColeccionComponent();
                    vistaPrincipalTemplate.getPCentral().add(coleccionComponent.gColeccionTemplate());
                    barraSuperiorComponent.getBarraSuperiorTemplate().fondo("CO");
                } else if (e.getSource() == barraSuperiorComponent.getBarraSuperiorTemplate().gBTienda()){
                    if (tiendaComponent == null)
                        tiendaComponent = new TiendaComponent();
                    vistaPrincipalTemplate.getPCentral().add(tiendaComponent.gTiendaTemplate());
                    barraSuperiorComponent.getBarraSuperiorTemplate().fondo("TI");
                }
                break;
            default:
                break;
        }
        vistaPrincipalTemplate.getPCentral().repaint();
    }

    public void moverVentana(int x, int y) {
        vistaPrincipalTemplate.setLocation(x, y);
    }

    public void minimizar() {
        vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
}