import Constants.Const;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.UserAccountPage;
import PopUpWindows.NewMeetingWindow;
import PopUpWindows.PasswordWindow;
import PopUpWindows.YourEmailAddressWindow;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewMeetingWindowTest extends UseCaseBase {

    private static UserAccountPage userAccountPage;
    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static NewMeetingWindow newMeetingWindow;
    private static DashboardPage dashboardPage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        userAccountPage = new UserAccountPage();
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        newMeetingWindow = new NewMeetingWindow();
        dashboardPage = new DashboardPage();
    }

    @BeforeEach
    public void beforeTest() {

        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();

    }

    @Test
    public void openNewMeetingOptionTest() {
        logger.info("open NewMeeting option ");
        userAccountPage.clickOnNewMeetingButton();
        Boolean isOpened = newMeetingWindow.isNewSessionWithWindowOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("NewSessionWithWindow");
    }

    @Test
    public void startNewSessionWithMyConnectionUserWithoutConnectionTest() {
        logger.info("start a new session with my connection. User without connections");
        userAccountPage.clickOnNewMeetingButton();
        newMeetingWindow.clickOnMyConnection();
        Boolean isOpened = newMeetingWindow.isYouHaveNoConnectionNotificationVisible();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("YouHaveNoConnectionWindow");
    }

//    @Test
//    public void startNewSessionWithMyConnectionUserWithConnectionTest() {
//        logger.info("start a new session with my connection");
//        userAccountPage.clickOnNewMeetingButton();
//        newMeetingWindow.clickOnMyConnection();
//        Boolean isVisible = newMeetingWindow.isAvatarIconVisible();
//        assertTrue(isVisible);
//        userAccountPage.takeScreenshot("ConnectionsWindow");
//    }

    @Test
    public void startNewGuestSessionTest() {
        logger.info("start a new session with guest test");
        userAccountPage.clickOnNewMeetingButton();
        newMeetingWindow.clickOnGuestOption();
        Boolean isOpened = newMeetingWindow.isNewSessionWithWindowOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("NewSessionWindow");
    }

    @Test
    public void closeNewSessionWindowTest() {
        userAccountPage.clickOnNewMeetingButton();
        newMeetingWindow.clickOnGuestOption();
        logger.info("close the New Session window test");
        newMeetingWindow.clickOnCloseButton();
        Boolean isClosed = dashboardPage.isDashboardHeaderVisible();
        assertTrue(isClosed);
    }

    @Test
    public void BackButtonTest() {
        userAccountPage.clickOnNewMeetingButton();
        newMeetingWindow.clickOnGuestOption();
        logger.info("Back button the New Session window test");
        newMeetingWindow.clickOnBackButton();
        Boolean isClosed = newMeetingWindow.isNewSessionWithWindowOpened();
        assertTrue(isClosed);
    }
}

