
import Constants.Const;
import Pages.*;
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

public class UserAccountTest extends UseCaseBase {

    private static UserAccountPage userAccountPage;
    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static NewMeetingWindow newMeetingWindow;
    private static PendingRequestsPage pendingRequestsPage;
    private static MyConnectionsPage myConnectionsPage;
    private static ConnectionGroupPage connectionGroupPage;
    private static CalendarPage calendarPage;
    private static UpcomingSessionPage upcomingSessionPage;
    private static SettingsPage settingsPage;
    private static BillingPage billingPage;
    private static DashboardPage dashboardPage;
    private static MyWorkspacePage myWorkspacePage;
    private static PricingPage pricingPage;
    private static ContactUsPage contactUsPage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        userAccountPage = new UserAccountPage();
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        newMeetingWindow = new NewMeetingWindow();
        pendingRequestsPage = new PendingRequestsPage();
        myConnectionsPage = new MyConnectionsPage();
        connectionGroupPage = new ConnectionGroupPage();
        calendarPage = new CalendarPage();
        upcomingSessionPage = new UpcomingSessionPage();
        settingsPage = new SettingsPage();
        billingPage = new BillingPage();
        dashboardPage = new DashboardPage();
        myWorkspacePage = new MyWorkspacePage();
        pricingPage = new PricingPage();
        contactUsPage = new ContactUsPage();


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
    public void clickOnDashboardTest() {
        logger.info("click on the Dashboard button");
        userAccountPage.clickOnDashboardButton();
        Boolean isVisible = dashboardPage.isDashboardHeaderVisible();
        assertTrue(isVisible);
    }

    @Test
    public void openMyWorkspaceTest() {
        logger.info("open My Workspace page");
        userAccountPage.clickOnMyWorkspaceButton();
        Boolean isOpened = myWorkspacePage.isJoinSessionWindowOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("JoinSessionWindow");
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
    public void openPendingRequestsPageTest() {
        logger.info("open pending requests");
        userAccountPage.clickOnPendingRequests();
        Boolean isOpened = pendingRequestsPage.isPendingRequestsOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("PendingRequestsWindow");
    }

    @Test
    public void openMyConnectionsPageTest() {
        logger.info("open My Connections window");
        userAccountPage.clickOnMyConnections();
        Boolean isVisible = myConnectionsPage.isInviteButtonVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("MyConnectionsWindow");
    }

    @Test
    public void openConnectionGroupsPageTest() {
        logger.info("open Connection Group window");
        userAccountPage.clickOnMyConnectionGroups();
        Boolean isVisible = connectionGroupPage.isCreateButtonVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("ConnectionGroupWindow");

    }

    @Test
    public void openCalendarWindowTest() {
        logger.info("open Calendar window");
        userAccountPage.clickOnCalendar();
        Boolean isVisible = calendarPage.isTodayButtonVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("CalendarWindow");

    }

    @Test
    public void openUpcomingSessionWindowTest() {
        logger.info("open Upcoming Session window");
        userAccountPage.clickOnUpComingSession();
        Boolean isVisible = upcomingSessionPage.isUpcomingSessionHeaderVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("UpcomingSessionWindow");

    }

    @Test
    public void openSettingsWindowTest() {
        logger.info("open Setting window");
        userAccountPage.clickOnSettings();
        Boolean isVisible = settingsPage.isSettingsHeaderVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("SettingsWindow");

    }

    @Test
    public void openBillingWindowTest() {
        logger.info("open Billing window");
        userAccountPage.clickOnBillingButton();
        Boolean isVisible = billingPage.isBillingHeaderVisible();
        assertTrue(isVisible);
        userAccountPage.takeScreenshot("BillingWindow");

    }

    @Test
    public void logoutFromUserAccTest() {
        logger.info(" log out from user account");
        userAccountPage.clickOnLogoutButton();
        Boolean isOpened = userAccountPage.isBusinessPageOpened();
        assertTrue(isOpened);

    }

    @Test
    public void openPricingPage() {
        logger.info("open Pricing page");
        userAccountPage.clickOnPricingButton();
        Boolean isOpened = pricingPage.isPricingPageOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("PricingPage");
    }

    @Test
    public void openContactUsPage() {
        logger.info("open Contact Us page");
        userAccountPage.clickOnContactUsButton();
        Boolean isOpened = contactUsPage.isContactUsPageOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("ContactUsPage");
    }

    @Test
    public void clickOnHomeButtonText() {
        logger.info("click on Home button");
        userAccountPage.clickOnHomeButton();
        Boolean isReloaded = userAccountPage.isUserAccPageReloaded();
        assertTrue(isReloaded);
    }

    @Test
    public void openNotifications() {
        logger.info("open notifications");
        userAccountPage.clickOnNotificationButton();
        userAccountPage.takeScreenshot("Notifications window");
        Boolean isOpened = userAccountPage.isNotificationsWindowOpened();
        assertTrue(isOpened);
    }

    @Test
    public void openUserInfo() {
        logger.info("open user account information");
        userAccountPage.clickOnPersonIcon();
        Boolean isOpened = userAccountPage.isUserInfoOpened();
        assertTrue(isOpened);
        userAccountPage.takeScreenshot("UserAccInfo");

    }

    @Test
    public void clickOnXpertesyLogo() {
        logger.info("click on Xpertesy logo");
        userAccountPage.clickOnXpertesyLogo();
        Boolean isOpened = userAccountPage.isUserAccPageReloaded();
        assertTrue(isOpened);

    }
}
