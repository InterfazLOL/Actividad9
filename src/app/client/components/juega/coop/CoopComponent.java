package app.client.components.juega.coop;

public class CoopComponent {
    
    private CoopTemplate coopTemplate;

    public CoopComponent() {
        coopTemplate = new CoopTemplate();
    }

    public CoopTemplate gCoopTemplate() {
        return coopTemplate;
    }
}