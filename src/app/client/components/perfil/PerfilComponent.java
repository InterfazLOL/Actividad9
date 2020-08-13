package app.client.components.perfil;

public class PerfilComponent {
    
    private PerfilTemplate perfilTemplate;

    public PerfilComponent(){
        perfilTemplate = new PerfilTemplate();
    }

    public PerfilTemplate gPerfilTemplate(){
        return perfilTemplate;
    }
}