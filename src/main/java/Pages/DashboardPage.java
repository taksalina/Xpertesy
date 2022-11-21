package Pages;

public class DashboardPage extends BasePage {
    private static final String DASHBOARD_PAGE_HEADER = "//*[@class='dashboard-content-inner']//descendant::*[@class='dashboard-headline']";

    public boolean isDashboardHeaderVisible() {
        return elementExist(DASHBOARD_PAGE_HEADER);
    }
}
