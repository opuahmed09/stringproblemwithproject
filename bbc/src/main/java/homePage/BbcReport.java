package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcReport extends CommonAPI {
    @FindBy(css = "#page > div:nth-child(1) > div.container > div > div.column--primary > div.story-body > h1")
    WebElement inputSearch;

    public void setInputSearch() {
        inputSearch.click();
    }
}
