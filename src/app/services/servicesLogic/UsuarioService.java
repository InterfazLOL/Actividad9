package app.services.servicesLogic;

import logic.ControlUsuario;
import models.Usuario;

public class UsuarioService {

    private static UsuarioService usuarioService;
    private ControlUsuario cUsuario;
    private String usuarioLogeado;

    public UsuarioService() {

        cUsuario = new ControlUsuario();
    }

    public static UsuarioService gService() {
        if (usuarioService == null)
            usuarioService = new UsuarioService();
        return usuarioService;
    }

    public boolean verificarUsuario(String nombre, String clave) {
        if (cUsuario.verificarUsuario(nombre, clave)) {
            this.usuarioLogeado = nombre;
            return true;
        }
        return false;
    }

    public Usuario getUsuarioLogeado() {
        return cUsuario.devolverUsuario(usuarioLogeado);
    }
    
}