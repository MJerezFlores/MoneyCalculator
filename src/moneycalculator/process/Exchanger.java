
package moneycalculator.process;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;

public class Exchanger {
    private final Money money;
    private final ExchangeRate exchangeRate;

    public Exchanger(Money money, ExchangeRate exchangeRate) {
        this.money = money;
        this.exchangeRate = exchangeRate;
    }

    public Money getMoney() {
        return money;
    }

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }
    
    private Money exchange( Money money, ExchangeRate exchangeRate){
        
    }
    
}
