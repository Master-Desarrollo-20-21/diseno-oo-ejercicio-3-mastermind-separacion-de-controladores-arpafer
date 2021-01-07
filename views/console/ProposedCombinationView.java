package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.controllers.ProposedCombinationController;
import mastermind_presentationmodel_dobledispaching.models.ErrorCombination;

class ProposedCombinationView {

    void interact(ProposedCombinationController controller) {
        controller.createAttempt();
        boolean validPropose;
        do {
            validPropose = true;
            Console.getInstance().showMessagePropose(Message.PROPOSE.toString());
            ErrorCombination error = controller.validateProposedCombination(this.readInput());
            if (error == ErrorCombination.WRONG_COLORS) {
                Console.getInstance().showMessageWrongColors(Message.WRONG_COLORS.toString());
                validPropose = false;
            } else if (error == ErrorCombination.WRONG_LENGTH) {
                Console.getInstance().showMessageWrongLength(Message.WRONG_LENGTH.toString());
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
        String combination = Console.getInstance().read();
        return combination;       
    }   
}
