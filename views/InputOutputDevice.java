package mastermind_presentationmodel_dobledispaching.views;

public interface InputOutputDevice {

   public void showMainTitle(String title);
   public void showAttemptCount(String message, int count);
   public void showSecretCombinationEncoded(String secretCombination);
   public void showGameResult(String message, String result);   
   public void showProposedCombination(String combination);
   public void showMessagePropose(String message);
   public void showMessageWrongColors(String message);
   public void showMessageWrongLength(String message);
   public void showMessageBlacksAndWhites(String message, int blacks, int whites);
   public String read();
}
