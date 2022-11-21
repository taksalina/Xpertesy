package Pages;

public class UpcomingSessionPage extends BasePage {
    private static final String SESSION_HEADER = "//*[@class='dashboard-content-inner']//descendant::*[@class='dashboard-headline']";

    public boolean isUpcomingSessionHeaderVisible() {
        return elementExist(SESSION_HEADER);
    }
}
