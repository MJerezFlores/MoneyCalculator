package moneycalculator.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import moneycalculator.UI.ExchangeDialog;
import moneycalculator.model.Currency;

public class ApplicationFrame extends JFrame {

    private ExchangeDialogPanel dialogPanel;
    final Currency[] currencies;
    ActionListener actionListener;
    private DialogPanel panel;
    private ExchangeDialog exchangeDialog;

    public ApplicationFrame(Currency[] currencies) {
        this.currencies = currencies;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 150));
        setTitle("Money Calculator");
        createWidgets();
        setVisible(true);
    }

    private void createWidgets() {
        add(createCalculateButton(), BorderLayout.EAST);
        add(createCloseButton(), BorderLayout.SOUTH);
        add(createExchangeDialog(), BorderLayout.PAGE_START);
        add(createTextDialog(), BorderLayout.CENTER);
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                actionListener.actionPerformed(ae);
            }
        });
        return button;
    }

    private JButton createCloseButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ApplicationFrame.this.dispose();
            }
        });
        return button;
    }

    public ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }

    public void register(String calculate, ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    private Component createTextDialog() {
        DialogPanel panel = new DialogPanel();
        this.panel = panel;
        return panel;
    }

    private Component createExchangeDialog() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencies);
        this.exchangeDialog = panel;
        return panel;
    }

    public DialogPanel getPanel() {
        return panel;
    }

}
