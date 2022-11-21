package Pages;


public class MyWorkspacePage extends BasePage {
    private static final String JOIN_SESSION_BUTTON = "//button[@class='margin-top-15 button full-width button-sliding-icon ripple-effect'] [@id='btn-enter-session-preview']";

    public boolean isJoinSessionWindowOpened() {
        return elementExist(JOIN_SESSION_BUTTON);
    }
}
