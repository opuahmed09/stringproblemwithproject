package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcAddCart extends CommonAPI {
    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-shop > a")

    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
