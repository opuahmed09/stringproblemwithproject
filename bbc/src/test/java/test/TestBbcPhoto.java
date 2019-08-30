package test;

import base.CommonAPI;
import homePage.BbcPhoto;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcPhoto extends CommonAPI {
    BbcPhoto bbcPhoto;
    @BeforeMethod
    public void initializing() {
        driver.get("http://www.bbc.com/culture/story/20181004-fascinating-moments-captured-on-film");
        bbcPhoto = PageFactory.initElements(driver, BbcPhoto.class);

    }

    @Test
    public void testsearchInput() {
        bbcPhoto.setInputSearch();
        System.out.println("Navigate to Website - BBC : Photo");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
