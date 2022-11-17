package PopUpWindows;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PasswordWindow extends BasePage {
    private static final String PASSWORD_HEADER = "//*[@id='password-login']";
    private static final String LOG_IN_BUTTON = "//*[@form = 'login-form']";
    private static final String PASS_INPUT = "//*[@id = 'password-login']";
    private static final String FORGOT_PASSWORD_BUTTON = "//*[@id='forgotpass'] [@class='forgot-password auth-bottom']";
    private static final String REMEMBER_ME_CHECK_BOX = "//*[@class='auth-bottom checkbox d-block remember-me-container']//descendant::*[@class='margin-bottom-0']";
    private static final String INCORRECT_USERNAME_OR_PASSWORD_ERR = "//*[@class='closeable error notification'] [@id='login-notification']";
    private static final String INCORRECT_USERNAME_OR_PASSWORD_ERR_CLOSE_BUTTON = "//*[@class='closeable error notification']//descendant::*[@class='close']";
    private static final String FILL_OUT_THIS_FIELD_ERR = "//input[@type='hidden'] [@name='user-type'] [@value='2']";
    private static final String EYE_ICON = "//*[@class='input-with-icon-left']//descendant::*[@class='icon-feather-eye']";

    public boolean isPasswordWindowOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOG_IN_BUTTON)));
        return elementExist(PASSWORD_HEADER);
    }

    public void loginPassInput(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PASSWORD_HEADER)));
        sendTextToElementByXpath(PASS_INPUT, password);
    }

    public void clickOnLogInButton() {
        clickElementByXpath(LOG_IN_BUTTON);
    }

    public void clickOnForgotPassword() {
        clickElementByXpath(FORGOT_PASSWORD_BUTTON);
    }

    public void enterPassword(String password) {
        sendTextToElementByXpath(PASS_INPUT, password);
    }

    public boolean isIncorrectPasswordErrVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INCORRECT_USERNAME_OR_PASSWORD_ERR_CLOSE_BUTTON)));
        return elementExist(INCORRECT_USERNAME_OR_PASSWORD_ERR);

    }

    public void closeIncorrectPassErr() {
        clickElementByXpath(INCORRECT_USERNAME_OR_PASSWORD_ERR_CLOSE_BUTTON);

    }

    public boolean isFillOutThisFieldErrVisible() {
        return elementExist(FILL_OUT_THIS_FIELD_ERR);
    }

    public void clickOnRememberMeOption() {
        clickElementByXpath(REMEMBER_ME_CHECK_BOX);
    }

    public boolean isRememberMeBoxChecked() {
        return checkedBox(REMEMBER_ME_CHECK_BOX);
    }

    public void clickOnEyeIcon() {
        clickElementByXpath(EYE_ICON);
    }

    public boolean isEnteredPassVisible(String password) {
        return sameValue(PASS_INPUT, password);

    }
}