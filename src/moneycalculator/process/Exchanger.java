
package moneycalculator.process;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;

public class Exchanger {

    public Money exchange( Money money, ExchangeRate exchangeRate){
        Money moneyExchange = new Money(money.getAmount()*exchangeRate.getValue(), exchangeRate.getFrom());
        return moneyExchange;
    }
    
}