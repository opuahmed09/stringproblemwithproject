package testdatadriven;

import base.CommonAPI;
import datadriven.SearchWithDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSearchWithDB extends CommonAPI {

    String homeUrl = "https://www.ulta.com/";
    SearchWithDB searchWithDB;

    @BeforeClass
    public void init() {
        driver.navigate().to(homeUrl);
        searchWithDB = PageFactory.initElements(driver, SearchWithDB.class);
    }

    @AfterMethod
    public void reStart() {
        driver.get(homeUrl);
    }

    @Test
    public void testSearchDB() throws Exception {
        searchWithDB.searchItemsOfDB();
    }
}
