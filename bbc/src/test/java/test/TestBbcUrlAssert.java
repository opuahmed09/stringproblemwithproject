package test;

import base.CommonAPI;
import homePage.BbcUrlAssert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.*;

public class TestBbcUrlAssert extends CommonAPI {
    BbcUrlAssert bbcUrlAssert;
    String bbcUrl = "https://www.bbc.com";

    @BeforeMethod
    public void initializing(){
        driver.get(bbcUrl);
        bbcUrlAssert = PageFactory.initElements(driver,BbcUrlAssert.class);
    }

    @Test
    public void testsearchInput(){
        bbcUrlAssert.setInputSearch();
        System.out.println("Navigate to Website - BBC");
        String title1 = driver.getCurrentUrl();
        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}
