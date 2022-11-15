package PopUpWindows;

import Constants.Const;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Constants.Const.GET_STARTED_BUTTON;

public class YourEmailAddressWindow extends BasePage {

    private static final String YOUR_EMAIL_ADDRESS_HEADER = "//*[text()= 'Your email address']";
    private static final String YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT = "//*[@class='popup-tab-content']";
    private static final String EMAIL_INPUT = "//*[@name = 'emailaddress-start']";
    private static final String CONTINUE_BUTTON = "//*[@class = 'button full-width button-sliding-icon']";
    private static final String CLOSE_BUTTON = "//*[@class='sign-in-form']//descendant::*[@type='button']";
    private static final String CONTINUE_WITH_GOOGLE_BUTTON = "//*[@class = 'google-login ripple-effect']";
    private static final String ERROR_TEXT = "//head//ancestor::*[@type='text/css']";


    public boolean isYourEmailAddressWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(YOUR_EMAIL_ADDRESS_WINDOW_TAB_CONTENT)));
        return elementExist(YOUR_EMAIL_ADDRESS_HEADER);
    }

    public void loginEmailInput(String email) {
        sendTextToElementByXpath(EMAIL_INPUT, email);
    }

    public void clickOnContinueButton() {
        clickElementByXpath(CONTINUE_BUTTON);
    }

    public void closeYourEmailWindow() {
        clickElementByXpath(CLOSE_BUTTON);
    }

    public boolean isYourEmailWindowClose() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(GET_STARTED_BUTTON)));
        return elementExist(GET_STARTED_BUTTON);
    }

    public void openGmailTab() throws InterruptedException {
        WebElement continueWithGoogleButton = webDriver.findElement(By.xpath(CONTINUE_WITH_GOOGLE_BUTTON));
        Thread.sleep(7000);
        continueWithGoogleButton.click();
        for (String str : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(str);
        }
        webDriver.getCurrentUrl();
    }

    public boolean isErrFillOutFieldVisible() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ERROR_TEXT)));
        return elementExist(ERROR_TEXT);
    }


}
