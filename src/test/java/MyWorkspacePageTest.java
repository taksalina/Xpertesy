import Constants.Const;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.MyWorkspacePage;
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

public class MyWorkspacePageTest extends UseCaseBase {
    private static UserAccountPage userAccountPage;
    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static PasswordWindow passwordWindow;
    private static NewMeetingWindow newMeetingWindow;
    private static DashboardPage dashboardPage;
    private static MyWorkspacePage myWorkspacePage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        userAccountPage = new UserAccountPage();
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        passwordWindow = new PasswordWindow();
        newMeetingWindow = new NewMeetingWindow();
        myWorkspacePage = new MyWorkspacePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
        homePage.clickOnGetStartedButton();
        yourEmailAddressWindow.loginEmailInput(Const.USER_EMAIL);
        yourEmailAddressWindow.clickOnContinueButton();
        passwordWindow.loginPassInput(Const.USER_PASSWORD);
        passwordWindow.clickOnLogInButton();
        userAccountPage.clickOnMyWorkspaceButton();
    }

    @Test
    public void openPlaceholderTest() {
        logger.info("download files with placeholder");
        myWorkspacePage.clickOnPlaceHolderButton();
        myWorkspacePage.takeScreenshot("Placeholder");
    }

    @Test
    public void openSettingsTest() {
        logger.info("open Settings");
        myWorkspacePage.clickOnSettingsButton();
        Boolean isVisible = myWorkspacePage.isVolumeControlVisible();
        assertTrue(isVisible);
        myWorkspacePage.takeScreenshot("Settings");
    }

    @Test
    public void changeVolumeTest() {
        logger.info("change volume");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickVolumeSlider();
        myWorkspacePage.takeScreenshot("VolumeSlider");
    }

    @Test
    public void chooseAudioOnlyOptionTest() {
        logger.info("choose audio only option");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickOnAudioOnlyOption();
        myWorkspacePage.takeScreenshot("AudioOnlyOption");
    }

    @Test
    public void chooseAudioAndVideoOptionTest() {
        logger.info("choose audio and video option");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickOnAudioAndVideoOption();
        myWorkspacePage.takeScreenshot("AudioAndVideoOption");
    }

    @Test
    public void chooseMuteAllOptionTest() {
        logger.info("choose mute all option");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickOnAudioOnlyOption();
        myWorkspacePage.clickOnMuteAllOption();
        myWorkspacePage.takeScreenshot("MuteAllOption");
    }

    @Test
    public void chooseSkipPreviewDialogOptionTest() {
        logger.info("choose skip preview dialog");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickOnSkipPreviewDialog();
        Boolean isChecked = myWorkspacePage.isSkipPreviewDialogChecked();
        assertTrue(isChecked);
        myWorkspacePage.takeScreenshot("SkipPreviewDialogOption");
    }

    @Test
    public void duoCameraOptionTest() throws Exception {
        logger.info("switch to Duo Camera ");
        myWorkspacePage.clickOnSettingsButton();
        myWorkspacePage.clickOnSwitchButton();
        Thread.sleep(3000);
        myWorkspacePage.takeScreenshot("DuoCameraSwitchButton");

    }
@Test
    public void joinSessionTest(){
        logger.info("join session ");
        myWorkspacePage.clickOnJoinSessionButton();
        Boolean isOpened = myWorkspacePage.isMyWorkspaceSessionPageOpened();
        assertTrue(isOpened);
        myWorkspacePage.takeScreenshot("SessionPage");
}
}
