import Constants.Const;
import Pages.GmailPage;
import Pages.HomePage;
import Pages.UserAccountPage;
import PopUpWindows.PasswordWindow;
import PopUpWindows.YourEmailAddressWindow;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class YourEmailAddressWindowTest extends UseCaseBase {

    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static UserAccountPage userAccountPage;
    private static GmailPage gmailPage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        userAccountPage = new UserAccountPage();
        gmailPage = new GmailPage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
    }

    @Test
    public void logInUserAcc() {
        logger.info("sign in user account");
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();
        Boolean success = userAccountPage.isUserAccOpened();
        assertTrue(success);
        homePage.takeScreenshot("UserAccDashboard");
    }

    @Test
    public void errorMessageEmptyEmailField() {
        logger.info("empty email field error massage test");
        yourEmailAddressWindow.clickOnContinueButton();
        boolean isVisible = yourEmailAddressWindow.isErrFillOutFieldVisible();
        assertTrue(isVisible);
        yourEmailAddressWindow.takeScreenshot("FillOutThisFieldError");
    }

    @Test
    public void loginWithGoogle() throws InterruptedException {
        logger.info(("sign in with Google"));
        yourEmailAddressWindow.openGmailTab();
        Boolean isGmailOpened = gmailPage.isGmailHeaderVisible();
        assertTrue(isGmailOpened);
        yourEmailAddressWindow.takeScreenshot("LoginWithGmailAccPage");
    }

    @Test
    public void closeYourEmailWindow() {
        logger.info("close 'Your email Window'");
        yourEmailAddressWindow.closeYourEmailWindow();
        Boolean isWindowClosed = yourEmailAddressWindow.isYourEmailWindowClose();
        assertTrue(isWindowClosed);
    }

    @Test
    public void openPasswordWindow() {
        logger.info("open Password window");
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        Boolean isOpened = passwordWindow.isPasswordWindowOpened();
        assertTrue(isOpened);
        passwordWindow.takeScreenshot("PasswordWindow");
    }

}
