package app.client.components.clash;

public class ClashComponent {
    
    private ClashTemplate clashTemplate;

    public ClashComponent(){

        clashTemplate = new ClashTemplate();
    }

    public ClashTemplate gClashTemplate(){
        return clashTemplate;
    }
}