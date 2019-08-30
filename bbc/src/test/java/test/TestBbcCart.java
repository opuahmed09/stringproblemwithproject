package test;

import base.CommonAPI;
import homePage.BbcCart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcCart extends CommonAPI {
    BbcCart bbcCart;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/");
        bbcCart = PageFactory.initElements(driver, BbcCart.class);

    }

    @Test
    public void testsearchInput() {
        bbcCart.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
