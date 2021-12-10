package gui.panel;

import gui.MainFrame;
import settings.Text;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LeftPanel extends AbstractPanel{

    public LeftPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(new EmptyBorder(0, 10, 10, 10));
        JLabel headerBC = new JLabel(Text.get("BALANCE_CURRENCIES"));
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        add(headerBC);

    }
}
