package moneycalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moneycalculator.control.ExchangeOperation;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.file.CurrencySetLoader;
import moneycalculator.persistence.file.ExchangeRateLoader;
import moneycalculator.swing.ApplicationFrame;
import moneycalculator.swing.MoneyDisplay;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame applicationFrame = new ApplicationFrame(currencySet.toArray());
        applicationFrame.register("Calculate",new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Currency from = applicationFrame.getExchangeDialog().getExchange().getMoney().getCurrency();
                Currency to = applicationFrame.getExchangeDialog().getExchange().getCurrency();
                new ExchangeOperation(applicationFrame.getExchangeDialog(),
                        new MoneyDisplay(applicationFrame),
                        new ExchangeRateLoader().load(from,to)).execute();
            }
            
        });
    }
}
