package gui.panel;

import gui.MainFrame;

import javax.swing.*;

abstract public class AbstractPanel extends JPanel {

    protected final MainFrame frame;

    public AbstractPanel(MainFrame frame) {
        this.frame = frame;
    }

    abstract protected void init();

}
