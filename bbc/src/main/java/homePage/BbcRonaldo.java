package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcRonaldo extends CommonAPI {
    @FindBy(css = "#story-body > p.sp-story-body__introduction")
    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
