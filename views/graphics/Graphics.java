package mastermind_presentationmodel_dobledispaching.views.graphics;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mastermind_presentationmodel_dobledispaching.views.InputOutputDevice;

public class Graphics implements InputOutputDevice {
    
    private static Graphics renderDevice;    
    private JFrame frame;
    private JTextField textField;
    private int row;

    public Graphics() {

    }
    public static Graphics getInstance() {
        if (Graphics.renderDevice == null) {
            Graphics.renderDevice = new Graphics();
            Graphics.renderDevice.frame = new JFrame();
            Graphics.renderDevice.configFrame();                         
            Graphics.renderDevice.row = 0;
        }
        return Graphics.renderDevice;
    }
    
    private void configFrame() {
        Container container = this.renderDevice.frame.getContentPane();
        container.setLayout(new GridBagLayout());
        renderDevice.frame.setSize(400, 500);
        renderDevice.frame.setLocationRelativeTo(null);
        renderDevice.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        renderDevice.frame.setVisible(true);
    }
              
   // public void refresh() {        
   //     this.renderDevice.frame.setVisible(true);
   // }
                  
    private Container getContentPane() {
        return renderDevice.frame.getContentPane();
    }
    
    private GridBagConstraints getPosition() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = this.row;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        return constraints;
    }
    private GridBagConstraints setPositionX(int posX) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = posX;
        constraints.gridy = this.row;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        return constraints;
    }
           
    @Override
    public String read() {                
        this.getContentPane().add(new JTextField());        
        return "";
    } 
   
    @Override
    public void showMainTitle(String title) {
        assert(title != null);               
        this.getContentPane().add(new JLabel(title), this.getPosition());
        this.row = this.row + 2;
        this.getContentPane().setVisible(true);
    }

    @Override
    public void showAttemptCount(String message, int count) {        
        assert(message != null);        
        this.row = this.row + 1;
        String text = "" + count + " " + message + ":";
        this.getContentPane().add(new JLabel(text), this.getPosition());        
        this.row = this.row + 1;
        this.getContentPane().setVisible(true);
    }

    @Override
    public void showSecretCombinationEncoded(String secretCombination) {
        assert(secretCombination != null);               
        this.getContentPane().add(new JLabel(secretCombination), this.getPosition());
        this.row = this.row + 1;
        this.getContentPane().setVisible(true);

    }

    @Override
    public void showGameResult(String message, String result) {
        // pendiente de implementar
    }

    @Override
    public void showProposedCombination(String combination) {
        // pendiente de implementar
    }

    @Override
    public void showMessagePropose(String message) {
        assert(message != null);                   
        this.getContentPane().add(new JLabel(message), this.getPosition());        
        this.getContentPane().setVisible(true);
    }

    @Override
    public void showMessageWrongColors(String message) {
        // pendiente de implementar
    }

    @Override
    public void showMessageWrongLength(String message) {
        // pendiente de implementar
    }

    @Override
    public void showMessageBlacksAndWhites(String message, int blacks, int whites) {
        // pendiente de implementar
    }

    String readRespond(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
