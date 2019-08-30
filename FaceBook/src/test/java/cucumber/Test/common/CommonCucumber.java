package cucumber.Test.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonCucumber {

    public static WebDriver driver;

    public CommonCucumber(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cleanUp() {
        this.driver.quit();
    }


}
