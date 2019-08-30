package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAuthentication extends CommonAPI {
    @FindBy(css = "#user-identifier-input")
    //@FindBy(xpath = "//*[@id='responsive-news']")
            WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }
}
