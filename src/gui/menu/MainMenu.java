package gui.menu;

import gui.MainFrame;
import settings.Text;

import javax.swing.*;

public class MainMenu extends JMenuBar {
    
    private final MainFrame frame;
    
    public MainMenu(MainFrame frame) {
        super();
        this.frame = frame;
        init();
    }

    private void init() {
        JMenu file = new JMenu(Text.get("MENU_FILE"));
        JMenu edit = new JMenu(Text.get("MENU_EDIT"));
        JMenu view = new JMenu(Text.get("MENU_VIEW"));
        JMenu settings = new JMenu(Text.get("MENU_SETTINGS"));
        JMenu help = new JMenu(Text.get("MENU_HELP"));

        add(file);
        add(edit);
        add(view);
        add(settings);
        add(help);
    }
}
