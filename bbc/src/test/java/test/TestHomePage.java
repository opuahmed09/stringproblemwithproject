package test;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage homePage;
    String bbcUrl = "https://www.bbc.com";

    @BeforeMethod
    public void initializing(){
        driver.get(bbcUrl);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testsearchInput(){
        homePage.setInputSearch();
        System.out.println("Navigate to Website - BBC");
        String title1 = driver.getCurrentUrl();
        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}
