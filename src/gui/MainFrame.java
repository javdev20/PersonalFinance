package gui;

import gui.menu.MainMenu;
import gui.panel.LeftPanel;
import settings.Text;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private final GridBagConstraints constraints;
    private final MainMenu mainMenu;
    private final LeftPanel leftPanel;

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

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);

    }
}
