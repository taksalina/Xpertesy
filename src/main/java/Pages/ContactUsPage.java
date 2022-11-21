package Pages;

public class ContactUsPage extends BasePage {
    private static final String CONTACT_US_HEADER = "//*[@class='col-md-12']//descendant::*[text() = 'Contact Us']";

    public boolean isContactUsPageOpened() {
        return elementExist(CONTACT_US_HEADER);
    }
}
