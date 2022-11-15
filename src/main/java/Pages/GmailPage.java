package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailPage extends BasePage {

    public static final String GMAIL_HEADER = "//*[text()='Sign in']";
    public static final String CREATE_ACC = "//*[text() = 'Create account']";


    public boolean isGmailHeaderVisible() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(CREATE_ACC)));
        return elementExist(GMAIL_HEADER);
    }


    }

