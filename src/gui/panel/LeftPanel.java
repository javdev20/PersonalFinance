package gui.panel;

import gui.MainFrame;
import settings.Style;
import settings.Text;
import javax.swing.*;
import java.awt.*;

public class LeftPanel extends AbstractPanel{

    public LeftPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_LEFT_PANEL);
        JLabel headerBC = new JLabel(Text.get("BALANCE_CURRENCIES"));
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        headerBC.setIcon(Style.ICON_LEFT_PANEL_BALANCE_CURRENCIES);

        add(headerBC);

        add(Box.createVerticalStrut(3));
        add(new PanelBalanceCurrency("USD", "5000"));
        add(Box.createVerticalStrut(3));
        add(new PanelBalanceCurrency("RUB", "105000"));
        add(Box.createVerticalStrut(3));
        add(new PanelBalanceCurrency("EUR", "507000"));

        JLabel headerB = new JLabel(Text.get("BALANCE"));
        headerB.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerB);
        add(Box.createVerticalStrut(3));
        add(new PanelBalanceCurrency("currency", "balance"));
        add(new PanelBalanceCurrency("currency", "balance"));
    }

    private class PanelBalanceCurrency extends JPanel {

        public PanelBalanceCurrency(String currency, String amount) {
            super();
            setLayout(new BorderLayout());
            setBorder(Style.BORDER_PANEL);

            JLabel currencyLabel = new JLabel(currency);
            JLabel amountLabel = new JLabel(amount);

            add(currencyLabel, BorderLayout.WEST);
            add(Box.createRigidArea(Style.DIMENSION_PADDING_BALANCE));
            add(amountLabel, BorderLayout.EAST);

        }
    }
}
