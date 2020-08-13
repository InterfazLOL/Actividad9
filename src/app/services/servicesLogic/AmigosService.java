package app.services.servicesLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import models.Amigo;

public class AmigosService {
    
    private static AmigosService amigosService;
    private ArrayList<Amigo> amigos, amigosDesconectados;

    public AmigosService(){

        amigos = new ArrayList<Amigo>();
        amigosDesconectados = new ArrayList<Amigo>();

        cargarDatos();
        cargarAmigosDesconectados();
    }

    public void cargarDatos() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("src/archives/amigos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea=br.readLine()) != null) {

                String[] atributos = linea.split(",");

                Amigo amigo = new Amigo();
                amigo.setNombre(atributos[0]);                
                amigo.setEstado(atributos[1]);
                amigo.setIcono(new ImageIcon(atributos[2]));
                amigos.add(amigo);
            }
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarAmigosDesconectados() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("src/archives/amigosDesconectados.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea=br.readLine()) != null) {
                    
                String[] atributos = linea.split(",");

                Amigo amigo = new Amigo();
                amigo.setNombre(atributos[0]);                
                amigo.setEstado(atributos[1]);
                amigo.setIcono(new ImageIcon(atributos[2]));
                amigosDesconectados.add(amigo);
            }
            fr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Amigo obtenerAmigo(int posicion) {
        try {
            return amigos.get(posicion);
        } catch (Exception e) {
            return null;
        }
    }

    public Amigo obtenerAmigoDesconectado(int posicion) {
        try {
            return amigosDesconectados.get(posicion);
        } catch (Exception e) {
            return null;
        }
    }

    public static AmigosService getService() {
        if (amigosService == null)
            amigosService = new AmigosService();
        return amigosService;
    }
}