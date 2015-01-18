package moneycalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moneycalculator.control.ExchangeOperation;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.mock.MockCurrencySetLoader;
import swing.ApplicationFrame;
import swing.MoneyDisplay;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet currencySet = new MockCurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register("Calculate",new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new ExchangeOperation(new MoneyDisplay(),frame.getExchangeDialog()).execute();
            }
            
        });
    }
}
