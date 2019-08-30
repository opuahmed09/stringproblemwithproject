package test;

import base.CommonAPI;
import homePage.BbcShoping;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcShoping extends CommonAPI {
    BbcShoping bbcShoping;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com");
        driver.findElement(By.id("orb-search-q")).sendKeys("shop");//enter apple
        driver.findElement(By.id("orb-search-button")).click(); //click submit button
        //driver.findElement(By.cssSelector("#headerPanel > div.header-logo > a > img.header-logo-image-small"));
        bbcShoping = PageFactory.initElements(driver, BbcShoping.class);

    }

    @Test
    public void testsearchInput() {
        bbcShoping.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}

