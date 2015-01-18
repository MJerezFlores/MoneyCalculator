
package moneycalculator.persistence.mock;

import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.CurrencySetLoader;


public class MockCurrencySetLoader implements CurrencySetLoader{

    private final CurrencySet currencySet;

    public MockCurrencySetLoader(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public MockCurrencySetLoader() {
        currencySet = new CurrencySet();
    }
    
    @Override
    public CurrencySet load() {
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("USD", "Dollar", "$"));
        currencySet.add(new Currency("GBP", "Pound", "£"));
        return currencySet;
    }
}
