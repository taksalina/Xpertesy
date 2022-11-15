import Pages.HomePage;
import PopUpWindows.ForgotPassWindow;
import PopUpWindows.PasswordWindow;
import PopUpWindows.YourEmailAddressWindow;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForgotPassWindowTest extends UseCaseBase {

    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static ForgotPassWindow forgotPassWindow;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        forgotPassWindow = new ForgotPassWindow();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
    }

    @Test
    public void SendButtonTest() {
        logger.info("forgot password send message");
        yourEmailAddressWindow.loginEmailInput("alinataksa.testing@gmail.com");
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnForgotPassword();
        forgotPassWindow.clickOnSendButton();
        Boolean isNotificationSent = forgotPassWindow.isForgotMessageSent();
        assertTrue(isNotificationSent);
        forgotPassWindow.takeScreenshot("ForgotPassNotification");
    }

    @Test
    public void closeAlmostThereNotificationTest() {
        logger.info("close almost there notification");
        yourEmailAddressWindow.loginEmailInput("alinataksa.testing@gmail.com");
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnForgotPassword();
        forgotPassWindow.clickOnSendButton();
        forgotPassWindow.closeAlmostThereNotification();
        Boolean isClosed = forgotPassWindow.isAlmostThereNotificationClosed();
        assertTrue(isClosed);

    }

    @Test
    public void backToLoginWindowTest() {
        logger.info("back to your email address window");
        yourEmailAddressWindow.loginEmailInput("alinataksa.testing@gmail.com");
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnForgotPassword();
        forgotPassWindow.clickOnBackToLoginButton();
       Boolean isOpened = passwordWindow.isPasswordWindowOpened();
       assertTrue(isOpened);

    }
}

