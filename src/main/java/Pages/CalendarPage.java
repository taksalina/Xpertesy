package Pages;

public class CalendarPage extends BasePage {


    private static final String TODAY_BUTTON = "//*[@class='fc-right']//descendant::*[@type='button']";

    public boolean isTodayButtonVisible() {
        return elementExist(TODAY_BUTTON);
    }
}
