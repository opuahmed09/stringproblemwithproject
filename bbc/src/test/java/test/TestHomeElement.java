package test;

import base.CommonAPI;
import homePage.HomeElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestHomeElement extends CommonAPI {

    HomeElement homeElement;
    //String bbcxpath = "//*[@id=\"orb-nav-links\"]/ul/li[2]";

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com");
        //driver.findElement(By.id("orb-search-q")).sendKeys("apple");//enter apple
        //driver.findElement(By.id("orb-search-button")).click(); //click submit button
        //driver.findElement(By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]")).sendKeys("TestSession");
        homeElement = PageFactory.initElements(driver, HomeElement.class);

    }

    @Test
    public void testsearchInput() {
        homeElement.setInputSearch();
//        System.out.println("Navigate to Website - BBC");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}