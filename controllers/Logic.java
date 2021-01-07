package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.StateValue;
import java.util.HashMap;
import java.util.Map;
import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;

public class Logic {

    private final Game game;
    private final State state;
    private final Map<StateValue, Controller> controllers;
    
    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.START, new StartController(this.game, this.state));
        this.controllers.put(StateValue.ATTEMPT, new AttemptController(this.game, this.state));
        this.controllers.put(StateValue.PROPOSED, new ProposedCombinationController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.NULL, null);
    }
    public Controller getController() {
       return this.controllers.get(this.state.stateValue());
    }
    
}
