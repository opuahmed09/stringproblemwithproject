package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Travel extends CommonAPI {
    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-traveldotcom > a")
    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }

}

