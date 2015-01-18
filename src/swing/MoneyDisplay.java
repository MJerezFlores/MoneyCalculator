
package swing;

import javax.swing.JLabel;
import moneycalculator.model.Money;

public class MoneyDisplay extends JLabel{

    public MoneyDisplay() {
        super();
    }
    
    public void showMoney(Money moneyIn, Money moneyOut){
        super.setText("Conversion --> "+ String.valueOf(moneyIn.getAmount())+" "
                +moneyIn.getCurrency().getCode()+ " = "+ String.valueOf(moneyOut.getAmount())+
                " "+moneyOut.getCurrency().getCode());
    } 
    
}
