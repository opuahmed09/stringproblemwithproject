package test;

import base.CommonAPI;
import homePage.BbcUSA;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcUSA extends CommonAPI {
    BbcUSA bbcUSA;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/world/us_and_canada/");
        bbcUSA = PageFactory.initElements(driver, BbcUSA.class);

    }

    @Test
    public void testsearchInput() {
        bbcUSA.setInputSearch();
        System.out.println("Navigate to Website - BBC : USA & Canada");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
