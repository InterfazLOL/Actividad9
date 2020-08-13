package app.client.components.tarjetaSkin;

public class TarjetaSkinComponent {
    
    private TarjetaSkinTemplate tarjetaSkinTemplate;

    public TarjetaSkinComponent(String imagen, String texto, int x, int y, int valor) {

        tarjetaSkinTemplate = new TarjetaSkinTemplate(imagen, texto, x, y, valor);
    }

    public TarjetaSkinTemplate gTarjetaSkinTemplate() {
        
        return tarjetaSkinTemplate;
    }
}