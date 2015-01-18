
package swing;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import moneycalculator.model.Money;


public class MoneyDisplay extends JLabel implements moneycalculator.UI.MoneyDisplay{

    public MoneyDisplay() {
        super();
    }
    
    @Override
    public void display(Money money) {
        JOptionPane.showMessageDialog(null,money.getAmount() + " "+ money.getCurrency());
    }
    
}
