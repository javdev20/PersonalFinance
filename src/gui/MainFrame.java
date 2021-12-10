package gui;

import gui.menu.MainMenu;

import javax.swing.*;

public class MainFrame extends JFrame {

    private final MainMenu mainMenu;

    public MainFrame() {
        super("Personal Finance");

        mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);

    }
}
