package moneycalculator.UI;

import moneycalculator.model.CurrencySet;
import moneycalculator.model.Exchange;

public class ExchangeDialog {

    private final CurrencySet currencySet;
    private final Exchange exchange;

    public ExchangeDialog(CurrencySet currencySet, Exchange exchange) {
        this.currencySet = currencySet;
        this.exchange = exchange;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }

    public Exchange getExchange() {
        return exchange;
    }

}
