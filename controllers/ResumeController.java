/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_presentationmodel_dobledispaching.controllers;

import mastermind_presentationmodel_dobledispaching.models.Game;
import mastermind_presentationmodel_dobledispaching.models.State;
import mastermind_presentationmodel_dobledispaching.views.console.Message;

/**
 *
 * @author Antonio
 */
public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }
    
    @Override 
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public String getSecretCombination() {
        return this.game().getSecretCombination();
    }

    public boolean winner() {
        return this.game().isWinnerAttempt(this.game().getCountAttempt() - 1);
    }
   
    public void first() {
        this.state().first();
    }

    public void exit() {
        this.state().exit();
    }
}
