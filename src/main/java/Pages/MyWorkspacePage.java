package Pages;


public class MyWorkspacePage extends BasePage {

    private static final String JOIN_SESSION_BUTTON = "//button[@class='margin-top-15 button full-width button-sliding-icon ripple-effect'] [@id='btn-enter-session-preview']",
            PLACEHOLDER_BUTTON = "//a[@class='text-underline'] [@id='placeholder-image-upload']",
            SETTINGS_BUTTON = "//a[@class='text-underline'] [@id='av-preview-open-settings'] [@onclick='previewDialogOpenSettings']",
            VOLUME_CONTROL = "//input[@id='session-video-volume-preview'] [@name='session-video-volume-preview'] [@type='range']",
            AUDIO_ONLY_OPTION = "//*[@class='selection-box'] [@id='video-muted'] [@data-selection='1']",
            AUDIO_AND_VIDEO_OPTION = "//*[@class='selection-box-icon']//descendant::*[@class='d-inline-block icon-feather-video mr-3']",
            MUTE_ALL_OPTION = "//*[@class='selection-box-icon']//descendant::*[@class='d-inline-block icon-feather-video-off mr-3']",
            SKIP_PREVIEW_DIALOG_CHECK_BOX = "//*[@class='checkbox margin-top-15']//descendant::*[@class='checkbox-icon']",
            DUO_CAMERA_SWITCH_BUTTON = "//*[@class='switch lh-1 mb-0']//descendant::*[@class='switch-button']",
            MY_WORKSPACE_SESSION_TITLE = "//*[@class='dashboard-nav-container']//descendant::*[@id='session-title-top']";


    public boolean isJoinSessionWindowOpened() {
        return elementExist(JOIN_SESSION_BUTTON);
    }

    public void clickOnPlaceHolderButton() {
        clickElementByXpath(PLACEHOLDER_BUTTON);
    }

    public void clickOnSettingsButton() {
        clickElementByXpath(SETTINGS_BUTTON);
    }

    public boolean isVolumeControlVisible() {
        return elementExist(VOLUME_CONTROL);
    }

    public void clickVolumeSlider() {
        moveVolumeSlider(VOLUME_CONTROL);
    }

    public void clickOnAudioOnlyOption() {
        moveVolumeSlider(AUDIO_ONLY_OPTION);
    }

    public void clickOnAudioAndVideoOption() {
        moveVolumeSlider(AUDIO_AND_VIDEO_OPTION);
    }

    public void clickOnMuteAllOption() {
        moveVolumeSlider(MUTE_ALL_OPTION);
    }

    public void clickOnSkipPreviewDialog() {
        clickElementByXpath(SKIP_PREVIEW_DIALOG_CHECK_BOX);
    }

    public boolean isSkipPreviewDialogChecked() {
        return checkedBox(SKIP_PREVIEW_DIALOG_CHECK_BOX);
    }

    public void clickOnSwitchButton() {
        clickElementByXpath(DUO_CAMERA_SWITCH_BUTTON);
    }

    public void clickOnJoinSessionButton() {
        clickElementByXpath(JOIN_SESSION_BUTTON);
    }

    public boolean isMyWorkspaceSessionPageOpened() {
        return elementExist(MY_WORKSPACE_SESSION_TITLE);
    }
}

