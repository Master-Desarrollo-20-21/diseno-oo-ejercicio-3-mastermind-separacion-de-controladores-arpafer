package mastermind_presentationmodel_dobledispaching.views;

import mastermind_presentationmodel_dobledispaching.controllers.Controller;
import mastermind_presentationmodel_dobledispaching.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }       
}
