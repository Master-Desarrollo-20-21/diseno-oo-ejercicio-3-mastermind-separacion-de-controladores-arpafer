package mastermind_presentationmodel_dobledispaching.controllers;

public interface ControllersVisitor {
    
    void visit(StartController controller);
    void visit(AttemptController controller);
    void visit(ProposedCombinationController controller);
    void visit(ResumeController controller);
}
