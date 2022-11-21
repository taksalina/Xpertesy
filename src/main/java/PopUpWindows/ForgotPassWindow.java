package PopUpWindows;

import Constants.Const;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPassWindow extends BasePage {

    private static final String
            SEND_BUTTON = "//*[@class= 'button full-width button-sliding-icon'] [@type='submit'] [@form='forgotpass-form']",
            FORGOT_PASSWORD_HEADER = "//*[@class='popup-tab-content']//descendant::*[@class='welcome-text']",
            FORGOT_PASSWORD_TEXT = "//*[@class='welcome-text']//descendant::*[text()='Forgot Password?']",
            ALMOST_THERE_NOTIFICATION = "//*[@class='success-modal']//descendant::*[@class='mt-5 pl-4 pr-4 text-center']",
            ALMOST_THERE_HEADER = "//*[@class='mfp-content']//descendant::*[@id='sign-in-dialog']",
            ALMOST_THERE_NOTIFICATION_CLOSE_BUTTON = "//*[@title='Close (Esc)'] [@type='button'] [@class='close-success mfp-close']",
            BACK_LOGIN_BUTTON = "//*[@id ='backtologin'] [@class='forgot-password auth-bottom']";

    public boolean isForgotPasswordWindowOpened() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(FORGOT_PASSWORD_TEXT)));
        return elementExist(FORGOT_PASSWORD_HEADER);
    }

    public void clickOnSendButton() {
        clickElementByXpath(SEND_BUTTON);
    }

    public boolean isForgotMessageSent() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ALMOST_THERE_HEADER)));
        return elementExist(ALMOST_THERE_NOTIFICATION);
    }

    public void closeAlmostThereNotification() {
        clickElementByXpath(ALMOST_THERE_NOTIFICATION_CLOSE_BUTTON);
    }

    public boolean isAlmostThereNotificationClosed() {
        return elementExist(Const.GET_STARTED_BUTTON);
    }

    public void clickOnBackToLoginButton() {
        clickElementByXpath(BACK_LOGIN_BUTTON);
    }

}
