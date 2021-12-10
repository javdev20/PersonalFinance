package gui;

import gui.menu.MainMenu;
import gui.panel.LeftPanel;
import gui.panel.RightPanel;
import settings.Text;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainFrame extends JFrame {

    private final GridBagConstraints constraints;
    private final MainMenu mainMenu;
    private final LeftPanel leftPanel;
    private RightPanel rightPanel;

    public MainFrame() {
        super(Text.get("PROGRAMM_NAME"));

        mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        setLayout(new GridBagLayout());

        constraints = new GridBagConstraints();

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;

        leftPanel = new LeftPanel(this);
        add(leftPanel, constraints);

        rightPanel = new RightPanel(this);
        constraints.gridy = 1;
        constraints.gridx = 1;
        add(rightPanel, constraints);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);

    }
}
