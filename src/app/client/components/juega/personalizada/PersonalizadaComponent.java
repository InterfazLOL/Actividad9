package app.client.components.juega.personalizada;

public class PersonalizadaComponent {
    
    private PersonalizadaTemplate personalizadaTemplate;

    public PersonalizadaComponent() {

        personalizadaTemplate = new PersonalizadaTemplate();
    }

    public PersonalizadaTemplate gPersonalizadaTemplate() {
        return personalizadaTemplate;
    }
}