package gui.menu;

import gui.MainFrame;
import settings.Style;
import settings.Text;

import javax.swing.*;

public class MainMenu extends JMenuBar {

    private JMenuItem menuEdit;
    private JMenuItem menuDelete;
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
        JMenu language = new JMenu(Text.get("MENU_SETTINGS_LANGUAGE"));

        file.setIcon(Style.ICON_MENU_FILE);
        edit.setIcon(Style.ICON_MENU_EDIT);
        view.setIcon(Style.ICON_MENU_VIEW);
        settings.setIcon(Style.ICON_MENU_SETTINGS);
        help.setIcon(Style.ICON_MENU_HELP);

        add(file);
        add(edit);
        add(view);
        add(settings);
        add(help);

        addMenuItem(file, Text.get("MENU_FILE_NEW"), Style.ICON_MENU_FILE_NEW);
        addMenuItem(file, Text.get("MENU_FILE_OPEN"), Style.ICON_MENU_FILE_OPEN);
        addMenuItem(file, Text.get("MENU_FILE_SAVE"), Style.ICON_MENU_FILE_SAVE);
        addMenuItem(file, Text.get("MENU_FILE_UPDATE_CURRENCIES"), Style.ICON_MENU_FILE_UPDATE_CURRENCIES);
        addMenuItem(file, Text.get("MENU_FILE_EXIT"), Style.ICON_MENU_FILE_EXIT);

        addMenuItem(edit, Text.get("MENU_EDIT_ADD"), Style.ICON_MENU_EDIT_ADD);
        menuEdit = addMenuItem(edit, Text.get("MENU_EDIT_EDIT"), Style.ICON_MENU_EDIT_EDIT);
        menuDelete = addMenuItem(edit, Text.get("MENU_EDIT_DELETE"), Style.ICON_MENU_EDIT_DELETE);
        menuEdit.setEnabled(false);
        menuDelete.setEnabled(false);

        addMenuItem(view, Text.get("MENU_VIEW_OVERVIEW"), Style.ICON_MENU_VIEW_OVERVIEW);
        addMenuItem(view, Text.get("MENU_VIEW_ACCOUNTS"), Style.ICON_MENU_VIEW_ACCOUNTS);
        addMenuItem(view, Text.get("MENU_VIEW_ARTICLES"), Style.ICON_MENU_VIEW_ARTICLES);
        addMenuItem(view, Text.get("MENU_VIEW_TRANSACTIONS"), Style.ICON_MENU_VIEW_TRANSACTIONS);
        addMenuItem(view, Text.get("MENU_VIEW_TRANSFERS"), Style.ICON_MENU_VIEW_TRANSFERS);
        addMenuItem(view, Text.get("MENU_VIEW_CURRENCIES"), Style.ICON_MENU_VIEW_CURRENCIES);
        addMenuItem(view, Text.get("MENU_VIEW_STATISTICS"), Style.ICON_MENU_VIEW_STATISTICS);

        addMenuItem(help, Text.get("MENU_HELP_ABOUT"), Style.ICON_MENU_HELP_ABOUT);


        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem menuRussian = new JRadioButtonMenuItem(Text.get("MENU_SETTINGS_LANGUAGE_RUSSIAN"));
        JRadioButtonMenuItem menuEnglish = new JRadioButtonMenuItem(Text.get("MENU_SETTINGS_LANGUAGE_ENGLISH"));
        group.add(menuRussian);
        group.add(menuEnglish);

        menuRussian.setIcon(Style.ICON_MENU_SETTINGS_LANGUAGE_RUSSIAN);
        menuEnglish.setIcon(Style.ICON_MENU_SETTINGS_LANGUAGE_ENGLISH);

        language.add(menuRussian);
        language.add(menuEnglish);

        language.setIcon(Style.ICON_MENU_SETTINGS_LANGUAGE);
        settings.add(language);
    }

    private JMenuItem addMenuItem(JMenu jMenu, String title, ImageIcon icon) {
        JMenuItem menuItem = new JMenuItem(title);
        menuItem.setIcon(icon);
        jMenu.add(menuItem);
        return menuItem;
    }

}
