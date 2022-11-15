package Pages;

public class LearnMorePage extends BasePage{

    private static final String LEARN_MORE_HEADER = "//*[@class='pt-0 pb-lg-0']//descendant::*[@class='item-description-headline main-page-title-side']";

    public boolean isLearnMoreHeaderVisible(){
        return elementExist(LEARN_MORE_HEADER);
    }
}
