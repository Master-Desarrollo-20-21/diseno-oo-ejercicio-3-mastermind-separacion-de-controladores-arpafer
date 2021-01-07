package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.controllers.AttemptController;
import mastermind_presentationmodel_dobledispaching.controllers.ProposedCombinationController;
import mastermind_presentationmodel_dobledispaching.controllers.ResumeController;
import mastermind_presentationmodel_dobledispaching.controllers.StartController;
import mastermind_presentationmodel_dobledispaching.views.View;

public class ConsoleView extends View {

    private StartView startView;
    private AttemptView attemptView;
    private ProposedCombinationView proposedCombinationView;
    private ResumeView resumeView;
    
    public ConsoleView() {
        this.startView = new StartView();
        this.attemptView = new AttemptView();
        this.proposedCombinationView = new ProposedCombinationView();
        this.resumeView = new ResumeView();
    }
    
    @Override
    public void visit(StartController controller) {
        this.startView.interact(controller);
    }
    public void visit(AttemptController controller) {
        this.attemptView.interact(controller);
    }
    public void visit(ProposedCombinationController controller) {
        this.proposedCombinationView.interact(controller);
    }
    public void visit(ResumeController controller) {
        this.resumeView.interact(controller);
    }
}
