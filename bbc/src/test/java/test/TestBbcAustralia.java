package test;

import base.CommonAPI;
import homePage.BbcAustralia;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcAustralia extends CommonAPI {
    BbcAustralia bbcAustralia;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/world-australia-47671306");
        bbcAustralia = PageFactory.initElements(driver, BbcAustralia.class);

    }

    @Test
    public void testsearchInput() {
        bbcAustralia.setInputSearch();
        System.out.println("BBC : Australian Weather News");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
