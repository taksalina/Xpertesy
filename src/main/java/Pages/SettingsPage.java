package Pages;

public class SettingsPage extends BasePage {
    private static final String SETTINGS_HEADER = "//*[@class='col-xl-12']//descendant::*[@class='dashboard-box margin-top-0']";

    public boolean isSettingsHeaderVisible() {
        return elementExist(SETTINGS_HEADER);
    }
}
