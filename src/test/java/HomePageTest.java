import Pages.HomePage;
import Pages.LearnMorePage;
import PopUpWindows.YourEmailAddressWindow;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest extends UseCaseBase {

    private static HomePage homePage;
    private static YourEmailAddressWindow yourEmailAddressWindow;
    private static LearnMorePage learnMorePage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
        yourEmailAddressWindow = new YourEmailAddressWindow();
        learnMorePage = new LearnMorePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("main page load test");
        Boolean success = homePage.isIntroBannerVisible();
        assertTrue(success);
        homePage.takeScreenshot("MainPage");
    }

    @Test
    public void openYourEmailWindowTest() {
        logger.info("your email address window load test");
        homePage.clickOnGetStartedButton();
        Boolean success = yourEmailAddressWindow.isYourEmailAddressWindowOpened();
        assertTrue(success);
        homePage.takeScreenshot("YourEmailAddressWindow");
    }

    @Test
    public void openLearnMorePageTest() {
        logger.info("open Learn More page");
        homePage.openLearnMorePage();
        homePage.takeScreenshot("LearnMorePage");
        Boolean isVisible = learnMorePage.isLearnMoreHeaderVisible();
        assertTrue(isVisible);
        homePage.takeScreenshot("LearnMorePage");
    }


}







