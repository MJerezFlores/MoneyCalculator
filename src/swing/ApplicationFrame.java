
package swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.UI.ExchangeDialog;
import moneycalculator.model.CurrencySet;

public class ApplicationFrame extends JFrame{

    private final Map<String, ActionListener> mapListeners = new HashMap<>();
    private MoneyDisplay moneyDisplay;
    private ExchangeDialog exchangeDialog;
    private CurrencySet currencySet;

    public ApplicationFrame(CurrencySet currencySet) {
        super();
        this.currencySet = currencySet;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 300));
        setTitle("MoneyCalculator");
        createWidgets();
        add(createMoneyDisplay(),NORMAL);
        setVisible(true);
    }

    private void createWidgets() {
        ExchangeDialogPanel exchangeDialogPanel = new ExchangeDialogPanel(currencySet);
        this.add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton ("Calculate");
        button.addActionListener(new ActionListener(){  

            @Override
            public void actionPerformed(ActionEvent ae) {
                mapListeners.get("Calculate").actionPerformed(ae);
            }
        });
        return button;    
    }

    private JButton createCloseButton() {
        JButton button = new JButton ("Close");
        button.addActionListener(new ActionListener(){  

            @Override
            public void actionPerformed(ActionEvent ae) {
                ApplicationFrame.this.dispose();
            }
        });
        return button;
    }

    private void createMoneyDisplay() {
        
    }
}
