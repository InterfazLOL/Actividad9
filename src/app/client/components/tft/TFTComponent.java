package app.client.components.tft;

public class TFTComponent {
    
    private TFTTemplate tftTemplate;

    public TFTComponent(){
        tftTemplate = new TFTTemplate();
    }

    public TFTTemplate gTftTemplate(){
        return tftTemplate;
    }
}