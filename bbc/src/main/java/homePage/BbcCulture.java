package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcCulture extends CommonAPI {
    @FindBy(id = "master-orb-body")

    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
