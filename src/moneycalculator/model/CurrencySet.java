package moneycalculator.model;

import java.util.List;
import java.util.ArrayList;

public class CurrencySet {

    private final List<Currency> currencyList = new ArrayList<>();

    public boolean add(Currency currency) {
        return currencyList.add(currency);
    }

    public Currency get(int index) {
        return currencyList.get(index);
    }

    public Currency[] toArray() {
        return currencyList.toArray(new Currency[currencyList.size()]);
    }

}
