package PopUpWindows;

import Constants.Const;
import Pages.BasePage;


public class NewMeetingWindow extends BasePage {
    private static final String NEW_SESSION_WITH = "//*[@class='popup-tabs-container']//descendant::*[@id='start-session-step-1']",
            MY_CONNECTION_OPTION = "//*[@class='category-box-icon']//descendant::*[@class='icon-feather-users']",
            GUEST_OPTION = "//*[@class='category-box-icon']//descendant::*[@class='icon-line-awesome-user-secret']",
            YOU_HAVE_NO_CONNECTION_YET_NOTIFICATION = "//*[@class='mt-5 text-center']//descendant::*[@class='tick-container']",
            CLOSE_BUTTON = "//button[@title='Close (Esc)'] [@type='button'] [@class='mfp-close']",
            BACK_BUTTON = "//*[@class='padding-bottom-0 padding-top-40 popup-tab-content']//descendant::*[@class = 'modal-back']",
            NEXT_BUTTON = "//*[@class='copy-submit-box margin-bottom-0 margin-top-0 submit-field']//descendant::*[@class = 'margin-top-0 button full-width button-sliding-icon ripple-effect start-session selection-invitation']",
            TITLE_INPUT_FIELD = "//*[@class='mb-0 submit-field']//descendant::*[@class = 'with-border session-title']",
            NOW_START_OPTION = "//*[@class='radio']//descendant::*[@class = 'radio-label']",
            LATER_START_OPTION = "//*[@class='radio']//descendant::*[@for = 'radio-2']",
            DATE_INPUT_FIELD = "//*[@class='col-6']//descendant::*[@placeholder = 'Date']",
            CALENDAR = "//*[@class='table-condensed']//descendant::*[@data-date = '1669680000000']",
            TIME_INPUT_FIELD = "//*[@class='col-6']//descendant::*[@placeholder = 'Time']",
            CONNECTIONS = "//*[@class='margin-bottom-10 margin-top-5 participant-type-selection']//descendant::*[@class = 'selected']",
            CONNECTIONS_GROUP = "//*[@class='margin-bottom-10 margin-top-5 participant-type-selection']//descendant::*[text() = 'Connections Groups']";


    public boolean isNewSessionWithWindowOpened() {
        return elementExist(NEW_SESSION_WITH);
    }

    public void clickOnMyConnection() {
        clickElementByXpath(MY_CONNECTION_OPTION);
    }

    public boolean isYouHaveNoConnectionNotificationVisible() {
        return elementExist(YOU_HAVE_NO_CONNECTION_YET_NOTIFICATION);
    }

    public boolean isNextButtonVisible() {
        return elementExist(NEXT_BUTTON);
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

    public void clickOnTitleField() {
        clickElementByXpath(TITLE_INPUT_FIELD);
    }

    public void enterTitle(String title) {
        findElementByXpath(TITLE_INPUT_FIELD).clear();
        sendTextToElementByXpath(TITLE_INPUT_FIELD, title);
    }

    public boolean isTitleEntered(String title) {
        return sameValue(TITLE_INPUT_FIELD, title);
    }

    public void clickOnNowOption() {
        clickElementByXpath(NOW_START_OPTION);
    }

    public boolean isNowOptionChosen() {
        return checkedBox(NOW_START_OPTION);
    }

    public void clickOnLaterOption() {
        clickElementByXpath(LATER_START_OPTION);
    }

    public boolean isLaterOptionChosen() {
        return checkedBox(LATER_START_OPTION);
    }

    public void clickOnDateField() {
        clickElementByXpath(DATE_INPUT_FIELD);
    }

    public void chooseDate() {
        clickElementByXpath(CALENDAR);
    }

    public boolean isDateChosen(String value) {
        return sameValue(DATE_INPUT_FIELD, value);
    }

    public void chooseTime(String date) {
        sendTextToElementByXpath(TIME_INPUT_FIELD, date);
    }

    public boolean isTimeChosen(String value) {
        return sameValue(TIME_INPUT_FIELD, value);
    }

    public void clickOnConnections() {
        clickElementByXpath(CONNECTIONS);
    }

    public void selectParticipants() {
        clickElementByXpath(Const.PARTICIPANT1);
    }

    public void clickOnNextButton() throws Exception {
        clickElementByXpath(NEXT_BUTTON);
        Thread.sleep(3000);
    }

    public void clickOnConnectionGroup() {
        clickElementByXpath(CONNECTIONS_GROUP);
    }

    public void selectConnectionGroup() {
        clickElementByXpath(Const.TEST_CONNECTION_GROUP);
    }
}
