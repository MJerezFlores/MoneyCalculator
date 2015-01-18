package moneycalculator.control;

import moneycalculator.UI.ExchangeDialog;
import moneycalculator.UI.MoneyDisplay;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.process.Exchanger;

public class ExchangeOperation {

    private final MoneyDisplay moneyDisplay;
    private final ExchangeDialog exchangeDialog;
    private final ExchangeRate exchangeRate;
    private final Exchanger exchanger;

    public ExchangeOperation(ExchangeDialog exchangeDialog,MoneyDisplay moneyDisplay, ExchangeRate exchangeRate) {
        this.moneyDisplay = moneyDisplay;
        this.exchangeDialog = exchangeDialog;
        this.exchangeRate = exchangeRate;
        this.exchanger = new Exchanger();
    }

    public void execute() {
        Money money = exchanger.exchange(exchangeDialog.getExchange().getMoney(), exchangeRate);
        moneyDisplay.display(money);
    }
}
