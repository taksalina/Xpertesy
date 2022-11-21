
import Constants.Const;
import Pages.HomePage;
import Pages.UserAccountPage;
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

public class PasswordWindowTest extends UseCaseBase {
    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static ForgotPassWindow forgotPassWindow;
    private static UserAccountPage userAccountPage;


    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        forgotPassWindow = new ForgotPassWindow();
        userAccountPage = new UserAccountPage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
    }

    @Test
    public void logInUserAcc() {
        logger.info("sign in user account");
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();
        Boolean success = userAccountPage.isUserAccOpened();
        assertTrue(success);
        homePage.takeScreenshot("UserAccDashboard");
    }

    @Test
    public void openForgotPasswordWindowTest() {
        logger.info("open forgot pass window test");
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnForgotPassword();
        Boolean isOpened = forgotPassWindow.isForgotPasswordWindowOpened();
        assertTrue(isOpened);
        passwordWindow.takeScreenshot("ForgotPassWindow");
    }

    @Test
    public void showEnteredPass(){
        logger.info("show entered password");
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnEyeIcon();
        Boolean isVisible = passwordWindow.isEnteredPassVisible("Qwerty");
        assertTrue(isVisible);
        yourEmailAddressWindow.takeScreenshot("EnterePassVisible");

    }

    @Test
    public void incorrectPassTest() {
        logger.info("enter incorrect password");
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.enterPassword("DFGHU&");
        passwordWindow.clickOnLogInButton();
        Boolean exist = passwordWindow.isIncorrectPasswordErrVisible();
        assertTrue(exist);
        passwordWindow.takeScreenshot("IncorrectPassErr");
    }

    @Test
    public void closeIncorrectPassErr() {
        homePage.clickOnGetStartedButton();
        logger.info("enter incorrect password");
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.enterPassword("DFGHU&");
        passwordWindow.clickOnLogInButton();
        passwordWindow.closeIncorrectPassErr();
    }

    @Test
    public void emptyPassfieldTest() {
        homePage.clickOnGetStartedButton();
        logger.info("enter incorrect password");
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnLogInButton();
        Boolean isVisible = passwordWindow.isFillOutThisFieldErrVisible();
        assertTrue(isVisible);
        passwordWindow.takeScreenshot("FillOutThisFieldErr");
    }

    @Test
    public void checkBoxRememberMeTest() {
        homePage.clickOnGetStartedButton();
        logger.info("open forgot pass window test");
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.clickOnRememberMeOption();
        Boolean isChecked = passwordWindow.isRememberMeBoxChecked();
        assertTrue(isChecked);
        passwordWindow.takeScreenshot("RememberMeBoxChecked");
    }

}
