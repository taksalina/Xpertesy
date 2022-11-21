package Pages;

public class UserAccountPage extends BasePage {
    private static final String ACCOUNT_ICON = "//img[@src ='images/user-avatar-placeholder.png']",
            DASHBOARD_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/index/']",
            MY_WORKSPACE_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/session-private.php']",
            NEW_MEETING_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = '#start-session-dialog']",
            PENDING_REQUESTS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/pending-requests/']",
            MY_CONNECTIONS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/client-list/']",
            CONNECTION_GROUP_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/connection-groups/']",
            CALENDAR_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/calendar/']",
            UPCOMING_SESSION_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/upcoming-sessions/']",
            SETTINGS_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/settings/']",
            BILLING_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'dashboard/billing/']",
            LOGOUT_OPTION = "//*[@class='dashboard-nav-inner']//descendant::*[@href = 'helpers/logout.php']",
            BUSINESS_PAGE_HEADER = "//*[@class='item-description']//descendant::*[@class='item-description-headline main-page-title-side']",
            HOME_BUTTON = "Home",
            PRICING_BUTTON = "//*[@class='left-side']//descendant::*[@href = '/dashboard/pricing-plans']",
            CONTACT_US_BUTTON = "Contact Us",
            NOTIFICATION_BUTTON = "//*[@class='header-notifications-trigger']//descendant::*[@class='icon-feather-bell']",
            NOTIFICATION_WINDOW = "//*[@class='header-notifications-dropdown']//descendant::*[@class='header-notifications-headline']",
            PERSON_ICON = "//img[@src= 'images/user-avatar-placeholder.png']",
            XPERTESY_LOGO = "//*[@class='left-side']//descendant::*[@href='index']";


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


