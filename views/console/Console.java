package mastermind_presentationmodel_dobledispaching.views.console;

import mastermind_presentationmodel_dobledispaching.utils.GestorIO;
import mastermind_presentationmodel_dobledispaching.views.InputOutputDevice;

public class Console implements InputOutputDevice {

    private static Console renderDevice;
    private GestorIO console;

    public Console() {

    }

    public static Console getInstance() {
        if (renderDevice == null) {
            renderDevice = new Console();
            renderDevice.console = new GestorIO();
        }
        return renderDevice;
    }
   
    @Override
    public String read() {
        return this.console.inString();
    }

    public String readRespond(String message) {
        assert(message != null);
        this.console.out(message);
        return this.console.inString();
    }

    @Override
    public void showMainTitle(String title) {
        assert(title != null);
        this.console.out(title + "\n");
    }

    @Override
    public void showAttemptCount(String message, int count) {
        assert(message != null);
        this.console.out("\n" + count + " " + message + ":\n");
    }

    @Override
    public void showSecretCombinationEncoded(String secretCombination) {
        assert(secretCombination != null);
        this.console.out(secretCombination + "\n");
    }

    @Override
    public void showGameResult(String message, String result) {
        assert(message != null && result != null);
        this.console.out(message + result + "\n");
    }

    @Override
    public void showProposedCombination(String combination) {
        assert(combination != null);
        this.console.out(combination);
    }

    @Override
    public void showMessagePropose(String message) {
        assert(message != null);
        this.console.out(message);
    }

    @Override
    public void showMessageWrongColors(String message) {
        assert(message != null);
        this.console.out(message + "\n");
    }    

    @Override
    public void showMessageWrongLength(String message) {
        assert(message != null);
        this.console.out(message + "\n");
    }

    @Override
    public void showMessageBlacksAndWhites(String message, int blacks, int whites) {
        assert(message != null);
        this.console.out(blacks + " blacks and " + whites + " whites\n");
    }
}
