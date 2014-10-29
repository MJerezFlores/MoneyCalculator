
package moneycalculator.model;

import java.util.Date;


public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final int value;
    private final Date date;

    public ExchangeRate(Currency from, Currency to, int value, Date date) {
        this.from = from;
        this.to= to;
        this.value = value;
        this.date = date;
    }

    public Currency getIn() {
        return from;
    }

    public Currency getOut() {
        return to;
    }

    public int getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
    
    
}
