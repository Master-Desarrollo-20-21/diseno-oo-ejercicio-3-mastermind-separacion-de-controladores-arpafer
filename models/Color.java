package mastermind_presentationmodel_dobledispaching.models;

public enum Color {
    RED("r"),
    BLUE("b"),
    YELLOW("y"),
    GREEN("g"),
    ORANGE("o"),
    PURPLE("p");
    
    private String color;
    
    Color(String color) {
       this.color = color;
    }       
    
    @Override
    public String toString() {
        return this.color;
    }
}
