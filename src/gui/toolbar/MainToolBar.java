package gui.toolbar;

import settings.Style;
import settings.Text;

public final class MainToolBar extends AbstractToolBar {
    
    public MainToolBar() {
        super(Style.BORDER_MAIN_TOOLBAR);
        init();
    }

    @Override
    protected void init() {
        addButton(Text.get("TOOLBAR_OVERVIEW"));
        addButton(Text.get("TOOLBAR_ACCOUNTS"));
        addButton(Text.get("TOOLBAR_ARTICLES"));
        addButton(Text.get("TOOLBAR_TRANSACTIONS"));
        addButton(Text.get("TOOLBAR_TRANSFERS"));
        addButton(Text.get("TOOLBAR_CURRENCIES"));
        addButton(Text.get("TOOLBAR_STATISTICS"));
    }
    
}
