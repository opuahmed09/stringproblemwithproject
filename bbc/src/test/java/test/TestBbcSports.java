package test;

import base.CommonAPI;
import homePage.BbcSports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcSports extends CommonAPI {
    BbcSports bbcSports;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/sports/");
        bbcSports = PageFactory.initElements(driver, BbcSports.class);

    }

    @Test
    public void testsearchInput() {
        bbcSports.setInputSearch();
        System.out.println("Navigate to Website - BBC : Sports");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
