package Pages;

public class ConnectionGroupPage extends BasePage {
    private static final String CREATE_BUTTON = "//*[@class='dashboard-headline']//descendant::*[@class='connection-session-dialog button popup-with-zoom-anim ripple-effect']";

    public boolean isCreateButtonVisible() {
        return elementExist(CREATE_BUTTON);
    }
}
