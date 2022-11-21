package Pages;

public class BillingPage extends BasePage {
    private static final String BILLING_HEADER = "//*[@class='dashboard-content-inner']//descendant::*[@class='dashboard-headline']";

    public boolean isBillingHeaderVisible() {
        return elementExist(BILLING_HEADER);
    }
}
