package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcCricket extends CommonAPI {
    @FindBy(css = "#sport > div.nav-top > nav.primary-nav > div > ul > li.primary-nav__item.primary-nav__item--active.primary-nav__item--full-highlight > a > span")

    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
