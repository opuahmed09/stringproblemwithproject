package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(css = "#orb-header > div.orb-nav-pri-container.b-r.b-g-p > div.orb-nav-section.orb-nav-blocks > a")
    WebElement inputSearch;

    public void setInputSearch(){
        inputSearch.click();
    }

}
