package Pages;

public class UserAccountPage extends BasePage {
    private static final String ACCOUNT_ICON = "//img[@src ='images/user-avatar-placeholder.png']";

    public boolean isUserAccOpened() {
        return elementExist(ACCOUNT_ICON);

    }
}
