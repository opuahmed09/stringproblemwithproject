package test;

import base.CommonAPI;
import homePage.BbcReport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcReport extends CommonAPI {
    BbcReport bbcReport;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/world-us-canada-47671715");
        bbcReport = PageFactory.initElements(driver, BbcReport.class);

    }

    @Test
    public void testsearchInput() {
        bbcReport.setInputSearch();
        System.out.println("Navigate to Website - BBC : Trump-Russia: Special counsel Robert Mueller delivers report");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
