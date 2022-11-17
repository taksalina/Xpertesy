
import Pages.LearnMorePage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LearnMorePageTest extends UseCaseBase {

    private static LearnMorePage learnMorePage;

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        learnMorePage = new LearnMorePage();
    }

    @BeforeEach
    public void beforeTest() {
        learnMorePage.navigateToLearnMorePage();
    }

    @Test
    public void openYourEmailWindowTest() {
        logger.info("your email address window load test");
        learnMorePage.clickOnGetStartedButton();
        Boolean success = learnMorePage.isYourEmailAddressWindowOpened();
        assertTrue(success);
        learnMorePage.takeScreenshot("YourEmailAddressWindowLearnMorePage");
    }

    @Test
    public void scrollLearnMoreWithUpButton() {
        logger.info("scroll learn more page with up button");
        learnMorePage.clickOnPageUpButton();
        learnMorePage.takeScreenshot("ScrollUpButton");
    }

    @Test
    public void signUpInUserAcc() {
        logger.info("Sign up in user account");
        learnMorePage.clickOnSignUpButton();
        Boolean isOpened = learnMorePage.isYourEmailAddressWindowOpened();
        assertTrue(isOpened);
        learnMorePage.takeScreenshot("YourEmailAddress");
    }

    @Test
    public void logInUserAcc() {
        logger.info("Log in user account");
        learnMorePage.clickOnLogINButton();
        Boolean isOpened = learnMorePage.isYourEmailAddressWindowOpened();
        assertTrue(isOpened);
        learnMorePage.takeScreenshot("YourEmailAddress");
    }
}