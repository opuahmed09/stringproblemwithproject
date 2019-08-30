package test;

import base.CommonAPI;
import homePage.BbcWeatherNY;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcWeatherNY extends CommonAPI {
    BbcWeatherNY bbcWeatherNY;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/weather/");
        driver.findElement(By.cssSelector("#wr-location-name-id"));
        bbcWeatherNY = PageFactory.initElements(driver, BbcWeatherNY.class);

    }

    @Test
    public void testsearchInput() {
        bbcWeatherNY.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather : New York");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
