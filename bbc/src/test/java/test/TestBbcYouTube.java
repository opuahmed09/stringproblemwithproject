package test;

import base.CommonAPI;
import homePage.BbcYouTube;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcYouTube extends CommonAPI {
    BbcYouTube bbcYouTube;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/news/world-europe-47669807");
        bbcYouTube = PageFactory.initElements(driver, BbcYouTube.class);

    }

    @Test
    public void testsearchInput() {
        bbcYouTube.setInputSearch();
        System.out.println("BBC : YouTube News");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
