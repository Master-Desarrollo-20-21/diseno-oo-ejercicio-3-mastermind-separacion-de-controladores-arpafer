package mastermind_presentationmodel_dobledispaching.views.console;

public class RespondYesNoView {
              
    private boolean respondYes;
    
    public RespondYesNoView() {
        this.respondYes = false;
    }
    public boolean affirmative() {
        return this.respondYes;
    }
    public void interact(String message) {     
        String respond = Console.getInstance().readRespond(message);
        this.respondYes = respond.equals("S") || respond.equals("s");            
    }
}
