package gui.panel;

import gui.MainFrame;
import settings.Style;
import settings.Text;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RightPanel extends AbstractPanel{

    public RightPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_PANEL);
        JLabel headerBC = new JLabel(Text.get("LAST_TRANSACTIONS"));
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        add(headerBC);

    }
}
