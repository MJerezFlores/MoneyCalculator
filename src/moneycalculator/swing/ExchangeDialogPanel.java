package moneycalculator.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.UI.ExchangeDialog;
import moneycalculator.model.Currency;
import moneycalculator.model.Exchange;
import moneycalculator.model.Money;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private JTextField amount;
    private JComboBox<Currency> currencyFrom;
    private JComboBox<Currency> currencyTo;
    private final Currency[] currencies;

    public ExchangeDialogPanel(Currency[] currencies) {
        this.currencies = currencies;
        setLayout(new FlowLayout());
        createWidgets();
    }

    private void createWidgets() {
        add(createTextField());
        add(createToCurrency());
        add(createFromCurrency());
    }

    private JComponent createTextField() {
        amount = new JTextField(12);
        return amount;
    }

    private Component createToCurrency() {
        currencyTo = new JComboBox<>(currencies);
        return currencyTo;
    }

    private Component createFromCurrency() {
        currencyFrom = new JComboBox<>(currencies);
        return currencyFrom;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(), getCurrency(currencyTo));
    }

    private Money getMoney() {
        return new Money(getAmount(), getCurrency(currencyFrom));
    }

    private Currency getCurrency(JComboBox<Currency> comboBox) {
        return comboBox.getItemAt(comboBox.getSelectedIndex());
    }

    private double getAmount() {
        return Double.parseDouble(amount.getText());
    }
}
