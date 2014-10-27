
package moneycalculator.model;

import java.util.Date;


public class ExchangeRate {

    private final Currency in;
    private final Currency out;
    private final int value;
    private final Date date;

    public ExchangeRate(Currency in, Currency out, int value, Date date) {
        this.in = in;
        this.out = out;
        this.value = value;
        this.date = date;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public int getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
    
    
}
