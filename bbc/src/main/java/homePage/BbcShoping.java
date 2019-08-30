package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcShoping extends CommonAPI {
    @FindBy(id = "orb-search-q")
            WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
//*[@id="headerPanel"]/div[1]/a/img[2]