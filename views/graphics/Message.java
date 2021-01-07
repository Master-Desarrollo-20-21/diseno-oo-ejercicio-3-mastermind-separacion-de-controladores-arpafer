package mastermind_presentationmodel_dobledispaching.views.graphics;

public enum Message {
   MAIN_TITLE("----- M A S T E R M I N D -----\n\n"),
   WON("won!!!"),
   LOST("lost. The combination is "),
   RESULT("You've "),
   RESUME("¿RESUME? S/n"),
   ATTEMP("Attempt(s)"),
   PROPOSE("Propose a combination: "),
   WRONG_LENGTH("Wrong proposed combination length"),
   WRONG_COLORS("Wrong colors, they must be: rbygop"),
   VALID_COLORS("rbygop"),
   SECRET_COMBINATION_HIDDEN("x"),
   EXCLAMATION(" !!!"),
   ARROW(" --> "),
   BLACKS_AND_WHITES("");

   private String message;
   
   Message(String message) {
       this.message = message;
   }   
                   
   @Override
   public String toString() {
      return this.message;  
   }
}
