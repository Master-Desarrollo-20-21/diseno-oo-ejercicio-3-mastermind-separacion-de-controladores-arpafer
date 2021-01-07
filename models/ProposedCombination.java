package mastermind_presentationmodel_dobledispaching.models;

public class ProposedCombination extends Combination {

    private boolean valid;

    public ProposedCombination() {
        this.valid = false;
    }

    public ProposedCombination(String combination) {
        this.setAs(combination);
    }

    public void set(String combination) {
        assert (combination != null);
        this.setAs(combination);
    }

    public String ToString() {
        return this.getCombination();
    }

    public boolean isValid() {
        return this.valid;
    }

    public void setAsValid() {
        this.valid = true;
    }

    public void setAsNotValid() {
        this.valid = false;
    }

    public boolean validColors() {
        String listColors = "" + Color.BLUE + Color.GREEN + Color.ORANGE + Color.PURPLE + Color.RED + Color.YELLOW;
        return listColors.contains(this.getCombination());
    }
}
