package gui;

import gui.menu.MainMenu;
import gui.panel.LeftPanel;
import gui.panel.RightPanel;
import gui.toolbar.MainToolBar;
import settings.Style;
import settings.Text;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Refresh{

    private final GridBagConstraints constraints;
    private final MainMenu mainMenu;
    private final LeftPanel leftPanel;
    private RightPanel rightPanel;
    private final MainToolBar toolBar;

    public MainFrame() {
        super(Text.get("PROGRAMM_NAME"));

        mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        setLayout(new GridBagLayout());

        constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        toolBar = new MainToolBar();
        add(toolBar, constraints);

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
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);

    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        pack();
    }
}
