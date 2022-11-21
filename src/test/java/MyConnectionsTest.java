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

public class MyConnectionsTest extends UseCaseBase {

    private static UserAccountPage userAccountPage;
    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static NewMeetingWindow newMeetingWindow;
    private static MyConnectionsPage myConnectionsPage;


    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        userAccountPage = new UserAccountPage();
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        newMeetingWindow = new NewMeetingWindow();
        myConnectionsPage = new MyConnectionsPage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();
        userAccountPage.clickOnMyConnections();
    }

    @Test
    public void inviteNewConnectionTest() throws Exception {
        logger.info("invite new connection");
        myConnectionsPage.clickOnInviteButton();
        Boolean isVisible = myConnectionsPage.isSuccessTextVisible();
        assertTrue(isVisible);
        myConnectionsPage.takeScreenshot("InvitingLink");
    }

}
