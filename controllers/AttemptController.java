package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;

public class AttemptController extends Controller {

    public AttemptController(Game game, State state) {
        super(game, state);
    }
    
    @Override 
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public int getCountAttempt() {
        return this.game().getCountAttempt();
    }

    public String getCombination(int countAttempt) {
        return this.game().getCombination(countAttempt);
    }

    public int countHits(int countAttempt) {
        return this.game().countHits(countAttempt);
    }

    public int countMiddleHits(int countAttempt) {
        return this.game().countMiddleHits(countAttempt);
    }
}
