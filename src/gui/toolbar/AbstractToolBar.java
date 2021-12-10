package gui.toolbar;

import gui.MainButton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Admin
 */
abstract public class AbstractToolBar extends JPanel {

    public AbstractToolBar(EmptyBorder border) {
        super();
        setBorder(border);
    }
    
    abstract protected void init();
    
    protected MainButton addButton(String title, ImageIcon icon) {
        MainButton button = new MainButton(title, icon);
        add(button);
        return button;
    }

}