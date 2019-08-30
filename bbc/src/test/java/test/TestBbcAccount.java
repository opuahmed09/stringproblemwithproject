package test;

import base.CommonAPI;
import homePage.BbcAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcAccount extends CommonAPI {
    BbcAccount bbcAccount;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://account.bbc.com/signin/");
        //driver.findElement(By.cssSelector("#user-identifier-input")).sendKeys("apple");//enter apple
        //driver.findElement(By.id("user-identifier-input")).click(); //click submit button
        //driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]")).sendKeys("TestSession");
        bbcAccount = PageFactory.initElements(driver, BbcAccount.class);

    }

    @Test
    public void testsearchInput() {
        bbcAccount.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
           }
//    @AfterMethod
//    public void cleanUp() {
//        driver.close();
//    }
}
