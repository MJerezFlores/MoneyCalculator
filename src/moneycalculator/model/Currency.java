
package moneycalculator.model;

public class Currency {
    private final String name;
    private final String Symbol;
    private final String Code;

    private Currency(String name, String Symbol, String Code) {
        this.name = name;
        this.Symbol = Symbol;
        this.Code = Code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public String getCode() {
        return Code;
    }
}
