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
        userAccountPage.clickOnNewMeetingButton();

    }

    @Test
    public void startNewSessionWithMyConnectionUserWithoutConnectionTest() {
        logger.info("start a new session with my connection. User without connections");
        newMeetingWindow.clickOnMyConnection();
        Boolean isOpened = newMeetingWindow.isYouHaveNoConnectionNotificationVisible();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("YouHaveNoConnectionWindow");
    }

    @Test
    public void startNewSessionWithMyConnectionUserWithConnectionTest() {
        logger.info("start a new session with my connection");
        newMeetingWindow.clickOnMyConnection();
        Boolean isVisible = newMeetingWindow.isNextButtonVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("NewSessionWindowMyConnection");
    }

    @Test
    public void enterTitleTest() {
        logger.info("enter meeting title");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnTitleField();
        newMeetingWindow.enterTitle("Testing Session");
        Boolean isEntered = newMeetingWindow.isTitleEntered("Testing Session");
        assertTrue(isEntered);
        newMeetingWindow.takeScreenshot("MeetingTitle");
    }

    @Test
    public void chooseStartNowOptionTest() {
        logger.info("choose start now option");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnNowOption();
        Boolean isChosen = newMeetingWindow.isNowOptionChosen();
        assertTrue(isChosen);
        newMeetingWindow.takeScreenshot("StartNowOption");
    }

    @Test
    public void chooseStartLaterOptionTest() {
        logger.info("choose start later option");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnLaterOption();
        Boolean isChosen = newMeetingWindow.isLaterOptionChosen();
        assertTrue(isChosen);
        newMeetingWindow.takeScreenshot("StartLaterOption");
    }

    @Test
    public void chooseDateAndTimeTest() {
        logger.info("choose date and time");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnLaterOption();
        newMeetingWindow.clickOnDateField();
        newMeetingWindow.chooseDate();
        Boolean isChosen = newMeetingWindow.isDateChosen("29/11/2022");
        assertTrue(isChosen);
        newMeetingWindow.takeScreenshot("ChosenDateForMeeting");
        newMeetingWindow.chooseTime("10:10");
        Boolean isChosen1 = newMeetingWindow.isTimeChosen("10:10");
        assertTrue(isChosen1);
        newMeetingWindow.takeScreenshot("ChosenTimeForMeeting");
    }

    @Test
    public void setMeetingWithConnection() throws Exception {
        logger.info("select participants from connections");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnNowOption();
        newMeetingWindow.clickOnConnections();
        newMeetingWindow.selectParticipants();
        newMeetingWindow.takeScreenshot("SelectedParticipantForMeeting");
        newMeetingWindow.clickOnNextButton();
        newMeetingWindow.takeScreenshot("YourSessionCreated");
    }

    @Test
    public void setMeetingWithConnectionsGroup() throws Exception {
        logger.info("select participants from connections");
        newMeetingWindow.clickOnMyConnection();
        newMeetingWindow.clickOnNowOption();
        newMeetingWindow.clickOnConnections();
        newMeetingWindow.clickOnConnectionGroup();
        newMeetingWindow.selectConnectionGroup();
        newMeetingWindow.clickOnNextButton();
    }

    @Test
    public void startNewGuestSessionTest() {
        logger.info("start a new session with guest test");
        newMeetingWindow.clickOnGuestOption();
        Boolean isOpened = newMeetingWindow.isNewSessionWithWindowOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("NewSessionWindow");
    }

    @Test
    public void closeNewSessionWindowTest() {
        logger.info("close the New Session window test");
        newMeetingWindow.clickOnGuestOption();
        newMeetingWindow.clickOnCloseButton();
        Boolean isClosed = dashboardPage.isDashboardHeaderVisible();
        assertTrue(isClosed);
    }

    @Test
    public void BackButtonNewSessionTest() {
        logger.info("Back button the New Session window test");
        newMeetingWindow.clickOnGuestOption();
        newMeetingWindow.clickOnBackButton();
        Boolean isClosed = newMeetingWindow.isNewSessionWithWindowOpened();
        assertTrue(isClosed);
    }

}

