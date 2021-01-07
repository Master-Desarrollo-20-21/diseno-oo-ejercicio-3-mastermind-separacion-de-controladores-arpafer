package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;
import mastermind_presentationmodel_dobledispaching.models.StateValue;

public abstract class Controller {

    private Game game;
    private State state;

    public Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public State state() {
        return this.state;
    }

    protected Game game() {
        return this.game;
    }

    public void next() {
        this.state().next();
    }

    public void back() {
        this.state().back();
    }
    
    public int getMaxCombinationLength() {
        return this.game().getMaxCombinationLength();
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
}
