package citibanklogin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CityBankLogin extends CommonAPI {


    @FindBy(id = "usernameMasked")
    WebElement userName;

    @FindBy(id = "password")
    WebElement Password;

    public void setUserName() throws InterruptedException {
        userName.click();
        userName.clear();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("tahhejheijhwk@gmail.com");
        Thread.sleep(4000);
    }

    public void setPassword() {
        Password.sendKeys("3465789");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}