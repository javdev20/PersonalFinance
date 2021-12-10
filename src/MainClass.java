import gui.MainFrame;
import settings.Text;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    public static void main(String[] args) {
        init();
        new MainFrame();
    }

    private static void init() {
        try {
            Text.init();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
