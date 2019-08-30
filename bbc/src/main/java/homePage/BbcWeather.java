package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcWeather extends CommonAPI {
    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-weather")
    WebElement inputSearch;

    public void setInputSearch() {
        inputSearch.click();
    }
}

