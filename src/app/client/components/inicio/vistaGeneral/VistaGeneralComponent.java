package app.client.components.inicio.vistaGeneral;

public class VistaGeneralComponent {
    
    private VistaGeneralTemplate vistaGeneralTemplate;

    public VistaGeneralComponent() {

        vistaGeneralTemplate = new VistaGeneralTemplate();
    }

    public VistaGeneralTemplate gVistaGeneralTemplate() {
        return vistaGeneralTemplate;
    }
}