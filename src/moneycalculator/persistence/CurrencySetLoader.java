package moneycalculator.persistence;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class CurrencySetLoader {

    CurrencySet currencySet = new CurrencySet();
    Currency currency = new Currency();

    public CurrencySet getCurrencySet() {
        currencySet.add(currency);
        return currencySet;
    }
    
    

}
