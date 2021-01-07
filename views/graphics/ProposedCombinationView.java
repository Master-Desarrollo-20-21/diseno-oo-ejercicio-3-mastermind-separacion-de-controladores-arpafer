package mastermind_presentationmodel_dobledispaching.views.graphics;

import mastermind_presentationmodel_dobledispaching.controllers.ProposedCombinationController;
import mastermind_presentationmodel_dobledispaching.models.ErrorCombination;

class ProposedCombinationView {

    void interact(ProposedCombinationController controller) {
        controller.createAttempt();
        boolean validPropose;
        do {
            validPropose = true;
            Graphics.getInstance().showMessagePropose(Message.PROPOSE.toString());
            ErrorCombination error = controller.validateProposedCombination(this.readInput());
            if (error == ErrorCombination.WRONG_COLORS) {
                Graphics.getInstance().showMessageWrongColors(Message.WRONG_COLORS.toString());
                validPropose = false;
            } else if (error == ErrorCombination.WRONG_LENGTH) {
                Graphics.getInstance().showMessageWrongLength(Message.WRONG_LENGTH.toString());
                validPropose = false;
            }
        } while (!validPropose);
        controller.incrementAttempt();
        if (controller.gameTerminated()) {
            controller.next();
        } else {
            controller.back();
        }
    }

    protected String readInput() {
        String combination = Graphics.getInstance().read();
        return combination;       
    }   
}
