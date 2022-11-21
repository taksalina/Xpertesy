package Pages;

public class PricingPage extends BasePage{
    private static final String PRICING_PLANS_HEADER = "//*[@class='col-md-12']//descendant::*[text() = 'Pricing Plans']";

    public boolean isPricingPageOpened(){
        return elementExist(PRICING_PLANS_HEADER);
    }
}
