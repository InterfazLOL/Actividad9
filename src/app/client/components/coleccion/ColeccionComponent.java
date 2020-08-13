package app.client.components.coleccion;

public class ColeccionComponent {
    
    private ColeccionTemplate coleccionTemplate;

    public ColeccionComponent(){
        coleccionTemplate = new ColeccionTemplate();
    }

    public ColeccionTemplate gColeccionTemplate(){
        return coleccionTemplate;
    }
}