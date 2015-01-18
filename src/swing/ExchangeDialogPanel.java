
package swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.UI.ExchangeDialog;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;
import moneycalculator.model.Exchange;
import moneycalculator.model.Money;


public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{

    private JTextField amount;
    private JComboBox<Currency> currencyFrom;
    private JComboBox<Currency> currencyTo;
    private CurrencySet currencySet;

    public ExchangeDialogPanel(CurrencySet currencySet) {
        this.currencySet = currencySet;
        setLayout(new FlowLayout());
        createWidgets();
        
    }

    private void createWidgets() {
        this.add(createAmountWidget());
        this.add(createFromCurrencyWidget());
        this.add(createToCurrencyWidget());
    }

    private JComboBox createToCurrencyWidget() {
        JComboBox<Currency> comboBox = new JComboBox<>();
        this.currencyTo = comboBox;
        return comboBox;
    }

    private JComboBox createFromCurrencyWidget() {
        JComboBox<Currency> comboBox = new JComboBox<>();
        this.currencyFrom = comboBox;
        return comboBox;
    }

    private JTextField createAmountWidget() {
        JTextField textField = new JTextField(20);
        amount = textField;
        return amount;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(getAmount(), getFromCurrency()), getToCurrency());
    }
    
    private double getAmount(){
        return Double.parseDouble(amount.getText());
    }
    
    private Currency getToCurrency(){
        return currencyTo.getItemAt(currencyTo.getSelectedIndex());
    }
    
    private Currency getFromCurrency(){
        return currencyFrom.getItemAt(currencyTo.getSelectedIndex());
    }

}
