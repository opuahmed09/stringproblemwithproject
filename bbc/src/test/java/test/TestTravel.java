package test;

import base.CommonAPI;
import homePage.Travel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTravel extends CommonAPI {
    Travel travel;

    @BeforeMethod
    public void initializing() {
        driver.get("https://www.bbc.com");
        travel = PageFactory.initElements(driver, Travel.class);

    }

    @Test
    public void testsearchInput() {
        travel.setInputSearch();

    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}


