package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import models.Usuario;

public class ControlUsuario {
    
    private ArrayList<Usuario> usuarios;

    public ControlUsuario() {

        usuarios = new ArrayList<>();
        cargarDatos();
    }

    public void cargarDatos() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("src/archives/usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea=br.readLine()) != null) {

                String[] atributos = linea.split(",");

                Usuario usuario = new Usuario();
                usuario.setNombre(atributos[0]);  
                usuario.setClave(atributos[1]);
                usuario.setIcono(new ImageIcon(atributos[2]));
                usuarios.add(usuario);
            }
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean verificarUsuario(String nombre, String clave) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre))
                if (usuario.getClave().equals(clave))
                    return true;
                else
                    return false;
        }
        return false;
    }

    public Usuario devolverUsuario(String nombre) {

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre))
                return usuario;
        }
        return null;
    }
}