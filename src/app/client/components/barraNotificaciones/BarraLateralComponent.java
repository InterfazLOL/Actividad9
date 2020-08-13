package app.client.components.barraNotificaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.client.vistaPrincipal.VistaPrincipalComponent;
import app.services.servicesLogic.AmigosService;
import app.services.servicesLogic.UsuarioService;
import models.Amigo;
import models.Usuario;

public class BarraLateralComponent implements ActionListener {

    private BarraLateralTemplate barraLateralTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private AmigosService sAmigos;
    private UsuarioService sUsuario;
    private Usuario usuarioLogeado;

    public BarraLateralComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        sAmigos = AmigosService.getService();
        sUsuario = UsuarioService.gService();
        usuarioLogeado = sUsuario.getUsuarioLogeado();
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        barraLateralTemplate = new BarraLateralTemplate(this);
    }

    public Usuario usuarioLogeado() {
        return usuarioLogeado;
    }

    public BarraLateralTemplate getBarraLateralTemplate() {
        return barraLateralTemplate;
    }

    public Amigo obtenerAmigo(int posicion) {
        return sAmigos.obtenerAmigo(posicion);
    }

    public Amigo obtenerAmigoDesconectado(int posicion) {
        return sAmigos.obtenerAmigoDesconectado(posicion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == barraLateralTemplate.getbCerrar())
            System.exit(0);
        else if (e.getSource() == barraLateralTemplate.getbMinimizar())
            vistaPrincipalComponent.minimizar();
    }

}