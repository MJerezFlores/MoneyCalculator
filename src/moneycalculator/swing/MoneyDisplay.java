package moneycalculator.swing;

import java.text.DecimalFormat;
import moneycalculator.model.Money;

public class MoneyDisplay implements moneycalculator.UI.MoneyDisplay {

    private final ApplicationFrame applicationFrame;
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public MoneyDisplay(ApplicationFrame applicationFrame) {
        this.applicationFrame = applicationFrame;
    }

    @Override
    public void display(Money money) {
        applicationFrame.getPanel().getTextArea().setText("Calculated : " + 
                decimalFormat.format(money.getAmount()) + " " + money.getCurrency().getSymbol());
    }

}
