
package moneycalculator.model;

import java.util.Date;


public class Exchange {
    
    private final Money money;
    private final Currency[] currencyList;
    private final int value;
    private final Date date;

    public Exchange(Money money, Currency[] currencyList, int value, Date date) {
        this.money = money;
        this.currencyList = currencyList;
        this.value = value;
        this.date = date;
    }

    public Money getMoney() {
        return money;
    }

    public Currency[] getCurrencyList() {
        return currencyList;
    }

    public int getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
}
