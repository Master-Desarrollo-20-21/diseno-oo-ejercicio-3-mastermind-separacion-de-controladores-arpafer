package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.controllers.ResumeController;

class ResumeView {

    void interact(ResumeController controller) {
        String result = "";
        if (controller.winner()) {
            result = Message.WON.toString();
        } else {
            result = Message.LOST + controller.getSecretCombination() + Message.EXCLAMATION;
        }
        Console.getInstance().showGameResult(Message.RESULT.toString(), result);         
        if (this.resume()) {
           controller.first();   
        } else {
            controller.exit();
        }       
    }
    
    private boolean resume() {
        RespondYesNoView respond = new RespondYesNoView();
        respond.interact(Message.RESUME.toString());
        return respond.affirmative();
    }
}
