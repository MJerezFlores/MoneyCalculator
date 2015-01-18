package moneycalculator.model;

public class Currency {

    private final String name;
    private final String symbol;
    private final String code;

    public Currency(String name, String code, String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }

}
