package test;

import base.CommonAPI;
import homePage.BbcMessi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcMessi extends CommonAPI {
    BbcMessi bbcMessi;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sport/football/47662363");
        bbcMessi = PageFactory.initElements(driver, BbcMessi.class);

    }

    @Test
    public void testsearchInput() {
        bbcMessi.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
