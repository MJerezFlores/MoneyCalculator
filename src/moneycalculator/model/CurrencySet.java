package moneycalculator.model;

import java.util.HashSet;

public class CurrencySet extends HashSet<Currency>{
    
    //private final String code;
    private static CurrencySet instance = null;

    public CurrencySet() {
        super();
    }
  
    //HashMap<String,Currency> currencySet = new HashMap<>();

    public CurrencySet getInstance() {
        if (instance == null) instance = new CurrencySet();   
        return instance;
    }
    
    public Currency getCurrency (String code){
        for (Currency currency : this) {
            if (code.equals(currency.getCode()))
                return currency;
            return null;
        }
    }
    
    
}
