
package moneycalculator.persistence.mock;

import java.util.ArrayList;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;
import moneycalculator.persistence.ExchangeRateLoader;


public class MockExchangeRateLoader implements ExchangeRateLoader {
    
    ArrayList<Double> rateList;
    ArrayList<String> currencyList;
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        addCurrency();
        addRate();
        return new ExchangeRate(from, to, calculateRate(from,to));
    }

    private double calculateRate(Currency from, Currency to) {
        return (1/rateList.get(currencyList.indexOf(from.getCode())) *
                rateList.get(currencyList.indexOf(to.getCode()))); 
    }

    private void addCurrency() {
        currencyList = new ArrayList<>();
        currencyList.add("EUR");
        currencyList.add("USD");
        currencyList.add("GBP");
    }

    private void addRate() {
        rateList= new ArrayList<>();
        rateList.add(1.0);
        rateList.add(1.1561);
        rateList.add(0.762969);
    }

}
