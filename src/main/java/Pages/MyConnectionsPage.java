package Pages;

public class MyConnectionsPage extends BasePage {

    private static final String INVITE_BUTTON = "//*[@class='dashboard-headline']//descendant::*[@class='button ripple-effect invite-connection']";

    public boolean isInviteButtonVisible() {
        return elementExist(INVITE_BUTTON);
    }
}
