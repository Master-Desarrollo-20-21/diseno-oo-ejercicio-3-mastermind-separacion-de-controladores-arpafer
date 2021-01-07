/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.ErrorCombination;
import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;

/**
 *
 * @author Antonio
 */
public class ProposedCombinationController extends Controller {

    public ProposedCombinationController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public void createAttempt() {
        this.game().createAttempt();
    }

    public void setProposedCombinationAsValid() {
        this.game().setProposedCombinationAsNotValid();
    }

    public int getProposedCombinationLength() {
        return this.game().getProposedCombinationLength();
    }

    public String getCurrentCombination() {
        return this.game().getCurrentCombination();
    }

    public void setProposedCombinationAsNotValid() {
        this.game().setProposedCombinationAsNotValid();
    }

    public void incrementAttempt() {
        this.game().incrementAttempt();
    }

    public void setProposedCombination(String combination) {
        this.game().setProposedCombination(combination);
    }

    public boolean gameTerminated() {
        return this.game().terminated();
    }

    public ErrorCombination validateProposedCombination(String combination) {        
        this.game().setProposedCombination(combination);
        this.game().setProposedCombinationAsValid();
        if (this.game().getProposedCombinationLength() == this.game().getMaxCombinationLength()) {
            for (int i = 0; i < this.game().getMaxCombinationLength(); i++) {
                String currentCombination = this.game().getCurrentCombination().substring(i, i + 1);
                if (!this.game().validColors(currentCombination)) {                    
                    this.game().setProposedCombinationAsNotValid();
                    return ErrorCombination.WRONG_COLORS;                 
                }
            }
        } else {            
            this.game().setProposedCombinationAsNotValid();
            return ErrorCombination.WRONG_LENGTH;
        }
        return ErrorCombination.NULL;
    }   
}
