package moneycalculator.model;

import java.util.ArrayList;
import java.util.HashSet;

public class CurrencySet extends HashSet<Currency>{
    
    private static CurrencySet instance = null;

    public CurrencySet() {
        super();
    }
  
    public CurrencySet getInstance() {
        if (instance == null) instance = new CurrencySet();   
        return instance;
    }
    
    public Currency getCurrency (String code){
        for (Currency currency : this)
            if (code.equals(currency.getCode())) return currency;
        return null;   
    }  
    
    public Currency[] search(String token){
        ArrayList<Currency> list = new ArrayList<>();
        for (Currency currency : list) {
            if(currency.getCode().equalsIgnoreCase(token)){
                list.add(currency);
            }else if(currency.getSymbol().equalsIgnoreCase(token)){
                list.add(currency);
            }else if(currency.getName().equalsIgnoreCase(token)){
                list.add(currency);
            }    
        }
        return list.toArray(new Currency[0]);
    }
}
