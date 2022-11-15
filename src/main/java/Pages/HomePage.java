package Pages;

import Constants.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
    private static final String INTRO_BANNER = "//*[@class = 'intro-banner dark-overlay big-padding']";
   // private static final String GET_STARTED_BUTTON = "//*[@class='button ripple-effect home-index-login input-user-type-biz popup-with-zoom-anim']";
    private static final String TEXT_CONTENT = "//*[@class='text-content']";
    private static final String LEARN_MORE_BUTTON = "//*[@class='col-6 text-right']//descendant::*[@class='button ripple-effect']";


    public void navigateToMainPage() {
        webDriver.get(Const.MAIN_URL);
    }

    public boolean isIntroBannerVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TEXT_CONTENT)));
        return elementExist(INTRO_BANNER);
    }

    public void clickOnGetStartedButton() {
        clickElementByXpath(Const.GET_STARTED_BUTTON);
    }

    public LearnMorePage openLearnMorePage() {
        clickElementByXpath(LEARN_MORE_BUTTON);
        return new LearnMorePage();
    }
}

