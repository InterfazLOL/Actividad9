package app.client.components.tienda;

public class TiendaComponent {
    
    private TiendaTemplate tiendaTemplate;

    public TiendaComponent(){
        tiendaTemplate = new TiendaTemplate();
    }

    public TiendaTemplate gTiendaTemplate(){
        return tiendaTemplate;
    }
}