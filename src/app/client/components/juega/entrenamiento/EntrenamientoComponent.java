package app.client.components.juega.entrenamiento;

public class EntrenamientoComponent {
    
    private EntrenamientoTemplate entrenamientoTemplate;

    public EntrenamientoComponent() {
        entrenamientoTemplate = new EntrenamientoTemplate();
    }

    public EntrenamientoTemplate gEntrenamientoTemplate() {
        return entrenamientoTemplate;
    }
    
}