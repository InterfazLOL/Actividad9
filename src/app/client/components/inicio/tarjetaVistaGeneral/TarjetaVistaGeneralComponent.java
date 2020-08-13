package app.client.components.inicio.tarjetaVistaGeneral;

public class TarjetaVistaGeneralComponent {
    
    private TarjetaVistaGeneralTemplate tarjetaVistaGeneralTemplate;

    public TarjetaVistaGeneralComponent(String imagen, String texto, int x, int y) {

        tarjetaVistaGeneralTemplate = new TarjetaVistaGeneralTemplate(imagen, texto, x, y);
    }

    public TarjetaVistaGeneralTemplate gTarjetaVistaGeneralTemplate() {

        return tarjetaVistaGeneralTemplate;
    }
}