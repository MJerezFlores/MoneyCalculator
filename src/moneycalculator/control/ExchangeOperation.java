package moneycalculator.control;

import moneycalculator.UI.ExchangeDialog;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.process.Exchanger;

public class ExchangeOperation {
    
    private CurrencySet currencySet;

    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    ExchangeDialog exchangeDialog = new ExchangeDialog();
    ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
    Exchanger exchanger = new Exchanger();
    
}
