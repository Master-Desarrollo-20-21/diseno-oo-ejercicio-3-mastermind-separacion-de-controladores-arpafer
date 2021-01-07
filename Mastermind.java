package mastermind_presentationmodel_dobledispaching;

import mastermind_presentationmodel_dobledispaching.controllers.Controller;
import mastermind_presentationmodel_dobledispaching.controllers.Logic;
import mastermind_presentationmodel_dobledispaching.views.View;

public abstract class Mastermind {

    private Logic logic;
    private View view;

    public Mastermind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    public void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
