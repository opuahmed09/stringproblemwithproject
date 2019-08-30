package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElement extends CommonAPI {

    @FindBy(css = "#orb-nav-links > ul > li.orb-nav-sport > a")
    //@FindBy(xpath = "//*[@id='responsive-news']")
    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }

}
