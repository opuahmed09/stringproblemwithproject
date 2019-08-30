package test;

import base.CommonAPI;
import homePage.LoginAuthentication;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginAuthentication extends CommonAPI {
    LoginAuthentication loginAuthentication;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://account.bbc.com/signin/");
        driver.findElement(By.name("username")).sendKeys("enter username");
        driver.findElement(By.name("password")).sendKeys("enter password");
        //driver.findElement(By.cssSelector("#user-identifier-input")).sendKeys("apple");//enter apple
        //driver.findElement(By.id("user-identifier-input")).click(); //click submit button
        //driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]")).sendKeys("TestSession");
        loginAuthentication = PageFactory.initElements(driver, LoginAuthentication.class);

    }

    @Test
    public void testsearchInput() {
        loginAuthentication.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");

    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}
