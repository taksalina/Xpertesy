package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserAccountPage extends BasePage {
    private static final String ACCOUNT_ICON = "//img[@src ='images/user-avatar-placeholder.png']";
    private static final String DASHBOARD_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/index/']";
    private static final String MY_WORKSPACE_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/session-private.php']";
    private static final String NEW_MEETING_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = '#start-session-dialog']";
    private static final String PENDING_REQUESTS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/pending-requests/']";
    private static final String MY_CONNECTIONS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/client-list/']";
    private static final String CONNECTION_GROUP_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/connection-groups/']";
    private static final String CALENDAR_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/calendar/']";
    private static final String UPCOMING_SESSION_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/upcoming-sessions/']";
    private static final String SETTINGS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/settings/']";
    private static final String BILLING_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/billing/']";
    private static final String LOGOUT_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'helpers/logout.php']";
    private static final String BUSINESS_PAGE_HEADER = "//*[@class='item-description']//descendant::*[@class='item-description-headline main-page-title-side']";
    private static final String HOME_BUTTON = "Home";
    private static final String PRICING_BUTTON = "//*[@class='left-side']//descendant::*[@href = '/dashboard/pricing-plans']";
    private static final String CONTACT_US_BUTTON = "Contact Us";
    private static final String NOTIFICATION_BUTTON = "//*[@class='header-notifications-trigger']//descendant::*[@class='icon-feather-bell']";
    private static final String NOTIFICATION_WINDOW = "//*[@class='header-notifications-dropdown']//descendant::*[@class='header-notifications-headline']";
    private static final String PERSON_ICON = "//img[@src= 'images/user-avatar-placeholder.png']";
    private static final String XPERTESY_LOGO = "//*[@class='left-side']//descendant::*[@href='index']";


    public boolean isUserAccOpened() {
        return elementExist(ACCOUNT_ICON);
    }

    public void clickOnDashboardButton() {
        clickElementByXpath(DASHBOARD_OPTION);
    }

    public void clickOnMyWorkspaceButton() {
        clickElementByXpath(MY_WORKSPACE_OPTION);
    }

    public void clickOnNewMeetingButton() {
        clickElementByXpath(NEW_MEETING_OPTION);
    }

    public void clickOnPendingRequests() {
        clickElementByXpath(PENDING_REQUESTS_OPTION);
    }

    public void clickOnMyConnections() {
        clickElementByXpath(MY_CONNECTIONS_OPTION);
    }

    public void clickOnMyConnectionGroups() {
        clickElementByXpath(CONNECTION_GROUP_OPTION);
    }

    public void clickOnCalendar() {
        clickElementByXpath(CALENDAR_OPTION);
    }

    public void clickOnUpComingSession() {
        clickElementByXpath(UPCOMING_SESSION_OPTION);
    }

    public void clickOnSettings() {
        clickElementByXpath(SETTINGS_OPTION);
    }

    public void clickOnBillingButton() {
        clickElementByXpath(BILLING_OPTION);
    }

    public void clickOnLogoutButton() {
        clickElementByXpath(LOGOUT_OPTION);
    }

    public boolean isBusinessPageOpened() {
        return elementExist(BUSINESS_PAGE_HEADER);
    }

    public void clickOnPricingButton() {
        clickElementByXpath(PRICING_BUTTON);
    }

    public void clickOnContactUsButton() {
        clickElementByLinkText(CONTACT_US_BUTTON);
    }

    public void clickOnHomeButton() {
        clickElementByLinkText(HOME_BUTTON);
    }

    public boolean isUserAccPageReloaded() {
        return isPageReloaded(HOME_BUTTON);
    }

    public void clickOnNotificationButton() {
        clickElementByXpath(NOTIFICATION_BUTTON);
    }

    public boolean isNotificationsWindowOpened() {
        return elementExist(NOTIFICATION_WINDOW);
    }

    public void clickOnPersonIcon() {
        clickElementByXpath(PERSON_ICON);
    }

    public boolean isUserInfoOpened() {
        return elementExist(LOGOUT_OPTION);
    }

    public void clickOnXpertesyLogo() {
        clickElementByXpath(XPERTESY_LOGO);
    }
}


