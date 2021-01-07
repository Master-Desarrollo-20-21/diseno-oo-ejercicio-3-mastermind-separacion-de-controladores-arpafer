package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.controllers.StartController;

public class StartView {

    void interact(StartController controller) {
        controller.initGame();
        Console.getInstance().showMainTitle(Message.MAIN_TITLE.toString());        
        controller.next();
    }    
}
