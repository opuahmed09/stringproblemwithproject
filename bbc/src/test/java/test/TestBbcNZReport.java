package test;

import base.CommonAPI;
import homePage.BbcNZReport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcNZReport extends CommonAPI {
    BbcNZReport bbcNZReport;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/world-asia-47677523");
        bbcNZReport = PageFactory.initElements(driver, BbcNZReport.class);

    }

    @Test
    public void testsearchInput() {
        bbcNZReport.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
