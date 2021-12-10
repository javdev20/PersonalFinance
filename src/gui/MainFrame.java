package gui;

import gui.menu.MainMenu;
import settings.Text;

import javax.swing.*;

public class MainFrame extends JFrame {

    private final MainMenu mainMenu;

    public MainFrame() {
        super(Text.get("PROGRAMM_NAME"));

        mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);

    }
}
