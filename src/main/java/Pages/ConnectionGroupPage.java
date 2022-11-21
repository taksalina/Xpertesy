package Pages;

import Constants.Const;

public class ConnectionGroupPage extends BasePage {
    private static final String CREATE_BUTTON = "//*[@class='dashboard-headline']//descendant::*[@class='connection-session-dialog button popup-with-zoom-anim ripple-effect']",
            CREATE_NEW_GROUP_HEADER = "//*[@class='welcome-text']//descendant::*[text()='Create New Group']",
            CREATE_NEW_GROUP_INPUT_FIELD = "//input[@type='text'] [@class='with-border group-name']",
            CREATE_GROUP_BUTTON = "//*[@class='copy-submit-box margin-top-25 mb-0 submit-field']//descendant::*[@type='submit']",
            YOUR_CONNECTION_GROUP_CREATED_NOTIFICATION_CLOSE_BUTTON = "//button[@title='Close (Esc)'] [@type='button'] [@class='close-success mfp-close']";

    public boolean isCreateButtonVisible() {
        return elementExist(CREATE_BUTTON);
    }

    public void clickOnCreateButton() {
        clickElementByXpath(CREATE_BUTTON);
    }

    public boolean isCreateNewGroupTextVisible() {
        return elementExist(CREATE_NEW_GROUP_HEADER);
    }

    public void enterGroupName(String name) {
        sendTextToElementByXpath(CREATE_NEW_GROUP_INPUT_FIELD, name);
    }

    public boolean isNameEntered(String name) {
        return sameValue(CREATE_NEW_GROUP_INPUT_FIELD, name);
    }

    public void selectGroupMembers() {
        clickElementByXpath(Const.PARTICIPANT1);
    }

    public void clickOnCreateGroupButton() {
        clickElementByXpath(CREATE_GROUP_BUTTON);
    }

    public void clickOnCloseButton() {
        clickElementByXpath(YOUR_CONNECTION_GROUP_CREATED_NOTIFICATION_CLOSE_BUTTON);
    }
}
