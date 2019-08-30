package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcPhoto extends CommonAPI {
    @FindBy(css = "#p06mxf45")
    WebElement inputSearch;

    public void setInputSearch() {
        inputSearch.click();
    }

}
