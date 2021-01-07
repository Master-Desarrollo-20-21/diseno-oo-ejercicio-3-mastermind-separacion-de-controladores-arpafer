package mastermind_presentationmodel_dobledispaching.models;

public class State {
 
    private StateValue stateValue;
    
    public State() {
        this.reset();
    }

    private void reset() {
        this.stateValue = StateValue.START;
    }
    
    public void next() {
       this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }
    
    public StateValue stateValue() {
        return this.stateValue;
    }

    public void back() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() - 1];
    }

    public void first() {
        this.stateValue = StateValue.values()[0];
    }
    
    public void exit() {
        this.stateValue = StateValue.NULL;
    }
    
    public boolean isNull() {
        return this.stateValue == StateValue.NULL;
    }
}
