import Constants.Const;
import Pages.ConnectionGroupPage;
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

public class ConnectionsGroupTest extends UseCaseBase {

    private static HomePage homePage;
    private static UserAccountPage userAccountPage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static ConnectionGroupPage connectionGroupPage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        userAccountPage = new UserAccountPage();
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        connectionGroupPage = new ConnectionGroupPage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();
        userAccountPage.clickOnMyConnectionGroups();
    }

    @Test
    public void createConnectionsGroupTest() {
        logger.info("create connections group");
        connectionGroupPage.clickOnCreateButton();
        Boolean isVisible = connectionGroupPage.isCreateNewGroupTextVisible();
        assertTrue(isVisible);
        connectionGroupPage.takeScreenshot("CreateNewGroupWindow");
        connectionGroupPage.enterGroupName("Test Group");
        Boolean isEntered = connectionGroupPage.isNameEntered("Test Group");
        assertTrue(isEntered);
        connectionGroupPage.selectGroupMembers();
        connectionGroupPage.clickOnCreateGroupButton();
        connectionGroupPage.clickOnCloseButton();
        connectionGroupPage.takeScreenshot("CreatedConnectionsGroup");




    }
}
