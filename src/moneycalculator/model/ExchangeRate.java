package moneycalculator.model;

public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final double value;

    public ExchangeRate(Currency from, Currency to, double value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getValue() {
        return value;
    }

}
