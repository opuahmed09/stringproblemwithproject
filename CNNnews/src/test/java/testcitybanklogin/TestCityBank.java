package testcitybanklogin;

import base.CommonAPI;
import citibanklogin.CityBankLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCityBank extends CommonAPI {

    CityBankLogin cityBankLogin ;
    String url = "https://online.citi.com/US/login.do";

    @BeforeClass
    public void init() {
        cityBankLogin = PageFactory.initElements(driver,CityBankLogin.class);
        driver.get(url);
    }

    @Test(priority = 1)
    public void testUserName()  throws InterruptedException{
        cityBankLogin.setUserName();
    }

    @Test(priority = 2)
    public void testPassWord() {
        cityBankLogin.setPassword();
    }
}