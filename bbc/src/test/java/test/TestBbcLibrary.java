package test;

import base.CommonAPI;
import homePage.BbcLibrary;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcLibrary extends CommonAPI {
    BbcLibrary bbcLibrary;
    @BeforeMethod
    public void initializing() {
        driver.get("http://www.bbc.com/culture/story/20190125-the-tiny-library-bringing-books-to-remote-villages");
        bbcLibrary = PageFactory.initElements(driver, BbcLibrary.class);

    }

    @Test
    public void testsearchInput() {
        bbcLibrary.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
