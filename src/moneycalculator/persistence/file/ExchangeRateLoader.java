package moneycalculator.persistence.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public class ExchangeRateLoader implements moneycalculator.persistence.ExchangeRateLoader{
    private FileReader reader;
    private String line = "";
    private String[] aux = new String[2];
    private double inRate;
    private double outRate;
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        try {
            reader = new FileReader("");
            BufferedReader br = new BufferedReader(reader);
            line = br.readLine();
            while(line != null){
                aux = line.split(";");
                
                if(aux[0].equals(from.getName())){
                    inRate = Double.parseDouble(aux[1]);
                }
                if(aux[0].equals(to.getName())){
                    outRate = Double.parseDouble(aux[1]);
                }
                line = br.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ExchangeRate(from, to, inRate/outRate);
    }   
}