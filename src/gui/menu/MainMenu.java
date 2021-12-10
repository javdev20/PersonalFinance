package gui.menu;

import gui.MainFrame;
import javax.swing.*;

public class MainMenu extends JMenuBar {
    
    private final MainFrame frame;
    
    public MainMenu(MainFrame frame) {
        super();
        this.frame = frame;
        init();
    }

    private void init() {
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        JMenu settings = new JMenu("Settings");
        JMenu help = new JMenu("Help");

        add(file);
        add(edit);
        add(view);
        add(settings);
        add(help);
    }
}
