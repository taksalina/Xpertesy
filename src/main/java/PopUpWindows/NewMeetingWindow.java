package PopUpWindows;

import Pages.BasePage;

public class NewMeetingWindow extends BasePage {
    private static final String NEW_SESSION_WITH = "//*[@class='popup-tabs-container']//descendant::*[@id='start-session-step-1']";
    private static final String MY_CONNECTION_OPTION = "//*[@class='category-box-icon']//descendant::*[@class='icon-feather-users']";
    private static final String GUEST_OPTION = "//*[@class='category-box-icon']//descendant::*[@class='icon-line-awesome-user-secret']";
    private static final String YOU_HAVE_NO_CONNECTION_YET_NOTIFICATION = "//*[@class='mt-5 text-center']//descendant::*[@class='tick-container']";
    private static final String AVATAR_ICON = "//*[@class='freelancer-avatar']//descendant::*[@src = 'images/user-avatar-placeholder.png']";
    private static final String CLOSE_BUTTON = "//button[@title='Close (Esc)'] [@type='button'] [@class='mfp-close']";
    private static final String BACK_BUTTON = "//*[@class='padding-bottom-0 padding-top-40 popup-tab-content']//descendant::*[@class = 'modal-back']";

    public boolean isNewSessionWithWindowOpened() {
        return elementExist(NEW_SESSION_WITH);
    }

    public void clickOnMyConnection() {
        clickElementByXpath(MY_CONNECTION_OPTION);
    }

    public boolean isYouHaveNoConnectionNotificationVisible() {
        return elementExist(YOU_HAVE_NO_CONNECTION_YET_NOTIFICATION);
    }

    public boolean isAvatarIconVisible() {
        return elementExist(AVATAR_ICON);
    }

    public void clickOnGuestOption() {
        clickElementByXpath(GUEST_OPTION);
    }

    public void clickOnCloseButton() {
        clickElementByXpath(CLOSE_BUTTON);
    }

    public void clickOnBackButton() {
        clickElementByXpath(BACK_BUTTON);
    }
}
