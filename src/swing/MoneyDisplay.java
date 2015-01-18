
package swing;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import moneycalculator.model.Money;


public class MoneyDisplay implements moneycalculator.UI.MoneyDisplay{

    private final ApplicationFrame applicationFrame;

    public MoneyDisplay(ApplicationFrame applicationFrame) {
        this.applicationFrame = applicationFrame;
    }

    @Override
    public void display(Money money) {
        applicationFrame.getPanel().getTextArea().setText("Calculated : "+(money.getAmount()+" "+money.getCurrency()));
    }
 
    
    
  
    
}
