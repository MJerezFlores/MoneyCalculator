
package moneycalculator.model;

import java.util.Date;


public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final double value;

    public ExchangeRate(Currency from, Currency to, double value) {
        this.from = from;
        this.to= to;
        this.value = value;
    }

    public Currency getIn() {
        return from;
    }

    public Currency getOut() {
        return to;
    }

    public double getValue() {
        return value;
    }

    
}
