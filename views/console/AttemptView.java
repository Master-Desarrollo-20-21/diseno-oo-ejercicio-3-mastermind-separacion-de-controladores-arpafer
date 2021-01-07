package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.controllers.AttemptController;

class AttemptView {

    void interact(AttemptController controller) {
        Console.getInstance().showAttemptCount(Message.ATTEMP.toString(), controller.getCountAttempt());
        this.showSecretCombination(controller);
        this.showResultAcumulated(controller);
        controller.next();        
    }

    private void showResultAcumulated(AttemptController controller) {
        for (int i = 0; i <= controller.getCountAttempt() - 1; i++) {
            Console.getInstance().showProposedCombination(controller.getCombination(i) + " " + Message.ARROW.toString());
            this.showMatchResult(i, controller);
        }
    }

    private void showSecretCombination(AttemptController controller) {
        String secretCode = "";
        for (int i = 0; i < controller.getMaxCombinationLength(); i++) {
            secretCode += Message.SECRET_COMBINATION_HIDDEN.toString();
        }
        Console.getInstance().showSecretCombinationEncoded(secretCode);
    }

    private void showMatchResult(int i, AttemptController controller) {
        int blacks = controller.countHits(i);
        int whites = controller.countMiddleHits(i);
        Console.getInstance().showMessageBlacksAndWhites(Message.BLACKS_AND_WHITES.toString(), blacks, whites);
    }  
}
