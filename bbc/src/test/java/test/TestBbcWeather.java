package test;

import base.CommonAPI;
import homePage.BbcWeather;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBbcWeather extends CommonAPI {
    BbcWeather bbcWeather;
    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com/weather/");
        bbcWeather = PageFactory.initElements(driver, BbcWeather.class);

    }

    @Test
    public void testsearchInput() {
        bbcWeather.setInputSearch();
        System.out.println("Navigate to Website - BBC : Weather");
//        String title1 = driver.getPageSource();
//        Assert.assertEquals(title1, "https://www.bbc.com/");
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
