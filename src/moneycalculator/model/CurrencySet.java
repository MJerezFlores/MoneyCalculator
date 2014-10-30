package moneycalculator.model;

import java.util.ArrayList;

public class CurrencySet {
    ArrayList<Currency> currencyList = new ArrayList<>();

    public void add(Currency currency){
        currencyList.add(currency);
    }

}
