package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcWeatherNY extends CommonAPI {
    @FindBy(css = "#ls-c-search__input-label")
    WebElement inputSearch;

    public void setInputSearch() {
        inputSearch.click();
    }
}
