
package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public interface ExchangeRateLoader {
    
    public ExchangeRate load(Currency from, Currency to);
    
    }

   