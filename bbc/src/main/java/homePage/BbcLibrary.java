package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcLibrary extends CommonAPI {
    @FindBy(css = "#story-content > div.primary-content > div.primary-content-lining > div.top-unit > div.primary-header-wrapper > div > h1")

    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
