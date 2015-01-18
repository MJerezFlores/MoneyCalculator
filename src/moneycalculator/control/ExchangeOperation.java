package moneycalculator.control;

import moneycalculator.UI.ExchangeDialog;
import moneycalculator.UI.MoneyDisplay;
import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.process.Exchanger;



public class ExchangeOperation {
    
    private final MoneyDisplay moneyDisplay;
    private final ExchangeDialog exchangeDialog;
    private Money moneyToChange;
    
    public ExchangeOperation(MoneyDisplay moneyDisplay, ExchangeDialog exchangeDialog) {
        this.moneyDisplay = moneyDisplay;
        this.exchangeDialog = exchangeDialog;
    }
    
    void execute(){
        Exchange exchange = exchangeDialog.getExchange();
        //ExchangeRateLoader exchangeRateLoader 
        //ExchangeRate exchangeRate = exchangeRateLoader.load(exchange.getCurrency(), exchange.getMoney().getCurrency());
        Exchanger exchanger = new Exchanger();
        //Money moneyChanged = exchanger.exchange(exchange.getMoney(), exchangeRate);
    }
}
