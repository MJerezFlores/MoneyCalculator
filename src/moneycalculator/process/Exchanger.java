
package moneycalculator.process;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;

public class Exchanger {

    private Money exchange( Money money, ExchangeRate exchangeRate){
        Money moneyExchange = new Money(money.getAmount()*exchangeRate.getValue(), exchangeRate.getIn());
        return moneyExchange;
    }
    
}