package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcArt extends CommonAPI {
    @FindBy(css = "#nav-top > div > ul > li:nth-child(4) > a > div")
    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
