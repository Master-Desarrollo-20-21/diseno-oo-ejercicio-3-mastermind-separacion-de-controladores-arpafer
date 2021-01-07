package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;

public class StartController extends Controller {

    public StartController(Game game, State state) {
        super(game, state);
    }
    
    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
    
    public void initGame() {
        this.game().init();
    }
}
