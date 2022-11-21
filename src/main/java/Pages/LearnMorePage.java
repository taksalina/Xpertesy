package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LearnMorePage extends BasePage {
private static final String LEARN_MORE_PAGE_URL = "https://xpertesy.com/biz/index";
    private static final String LEARN_MORE_HEADER = "//*[@class='pt-0 pb-lg-0']//descendant::*[@class='item-description-headline main-page-title-side']";
    private static final String YOUR_EMAIL_ADDRESS_HEADER = "//*[text()= 'Your email address']";
    private static final String YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT = "//*[@class='popup-tab-content']";
    private static final String PAGE_UP_BUTTON =  "//*[@class='visible']//descendant::*[@href='#']";
    private static final String GET_STARTED_BUTTON = "//*[@class='col-xl-12']//descendant::*[@class='popup-with-zoom-anim button ripple-effect margin-top-20']";
    private static final String SIGN_UP_BUTTON = "//*[@class='right-side']//descendant::*[@class = 'popup-with-zoom-anim button ripple-effect margin-left-5 margin-top-20 main-header-login-signup']";
    private static final String LOG_IN_BUTTON = "//*[@class='header-widget main-header-login border-left-0']//descendant::*[@class='activate-button']";

    public void navigateToLearnMorePage() {
    webDriver.get(LEARN_MORE_PAGE_URL);
    }

    public boolean isLearnMoreHeaderVisible() {
        return elementExist(LEARN_MORE_HEADER);
    }

    public void clickOnGetStartedButton() {
        clickElementByXpath(GET_STARTED_BUTTON);
    }

    public boolean isYourEmailAddressWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT)));
        return elementExist(YOUR_EMAIL_ADDRESS_HEADER);
    }
public void clickOnPageUpButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PAGE_UP_BUTTON)));
        clickElementByXpath(PAGE_UP_BUTTON);
}
public void clickOnSignUpButton(){
        clickElementByXpath(SIGN_UP_BUTTON);
}
    public void clickOnLogINButton(){
        clickElementByXpath(LOG_IN_BUTTON);
    }
}
