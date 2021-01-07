package mastermind_presentationmodel_dobledispaching.views.graphics;

import mastermind_presentationmodel_dobledispaching.controllers.StartController;

public class StartView {

    void interact(StartController controller) {
        controller.initGame();
        Graphics.getInstance().showMainTitle(Message.MAIN_TITLE.toString());        
        controller.next();
    }    
}
