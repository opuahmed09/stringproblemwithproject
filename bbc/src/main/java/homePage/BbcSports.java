package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcSports extends CommonAPI {
    @FindBy(css = "#site-container > div.site-brand.site-brand--height > div.navigation.navigation--wide > ul > li.selected > a")
    WebElement inputSearch;

    public void setInputSearch() {
        inputSearch.click();
    }
}