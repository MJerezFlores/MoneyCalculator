package moneycalculator.swing;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DialogPanel extends JPanel {

    public JTextArea textArea;

    public DialogPanel() {
        createTextArea();
    }

    private void createTextArea() {
        textArea = new JTextArea(1, 10);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        add(textArea);
    }

    public JTextArea getTextArea() {
        return textArea;
    }

}
