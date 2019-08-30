package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcSearch extends CommonAPI {
    @FindBy(name = "BBC")
    //@FindBy(xpath = "//*[@id='responsive-news']")
            WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }

}
