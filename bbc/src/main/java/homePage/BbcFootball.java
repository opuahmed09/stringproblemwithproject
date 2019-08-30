package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcFootball extends CommonAPI {
    @FindBy(css = "#u8190398924052715 > div > nav > div.sp-c-sport-navigation.sp-c-sport-navigation--primary.qa-primary > div > ul > li.sp-c-sport-navigation__item.sp-c-sport-navigation__item--primary-selected > a")

    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
