package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary' and @target='_self']")
    WebElement facility;

    public void setFacality() {
      boolean text = facility.isDisplayed();
        Assert.assertTrue(text);
//        System.out.println(text);
    }

    public void testTitleOfHomePage(){
        String str =   driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str,"Cigna Official Site | Global Health Service Company");
    }
}
