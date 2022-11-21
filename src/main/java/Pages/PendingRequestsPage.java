package Pages;

public class PendingRequestsPage extends BasePage {

    private static final String PENDING_REQUESTS_WINDOW_HEADLINE = "//*[@class='col-xl-12']//descendant::*[@class='headline']";

    public boolean isPendingRequestsOpened() {
        return elementExist(PENDING_REQUESTS_WINDOW_HEADLINE);
    }

}
