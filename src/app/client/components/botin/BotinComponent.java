package app.client.components.botin;

public class BotinComponent {

    private BotinTemplate botinTemplate;

    public BotinComponent(){

        botinTemplate = new BotinTemplate();
    }

    public BotinTemplate gBotinTemplate(){
        return botinTemplate;
    }
    
}