package Pages;


public class MyConnectionsPage extends BasePage {

    private static final String INVITE_BUTTON = "//*[@class='dashboard-headline']//descendant::*[@class='button ripple-effect invite-connection']",
            SUCCESS_TEXT = "//*[@class='mt-5 text-center']//descendant::*[text()='Copy and send the link']";


    public boolean isInviteButtonVisible() {
        return elementExist(INVITE_BUTTON);
    }

    public void clickOnInviteButton() {
        clickElementByXpath(INVITE_BUTTON);
    }

    public boolean isSuccessTextVisible() throws Exception {
        Thread.sleep(2000);
        return elementExist(SUCCESS_TEXT);
    }
}

