package mastermind_presentationmodel_dobledispaching;

import mastermind_presentationmodel_dobledispaching.views.View;
import mastermind_presentationmodel_dobledispaching.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

    public ConsoleMastermind() {
        super();
    }

    @Override
    protected View createView() {
        return new ConsoleView();
    }
}
