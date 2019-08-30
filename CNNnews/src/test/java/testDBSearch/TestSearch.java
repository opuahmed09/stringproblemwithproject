package testDBSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searchDBPages.SearchInCNN;

public class TestSearch extends CommonAPI {

    String homeUrl = "https://www.cnn.com/";

    SearchInCNN searchInCNN;

    @BeforeClass
    public void initialized(){
        driver.get(homeUrl);
        searchInCNN = PageFactory.initElements(driver,SearchInCNN.class);
    }



    @Test
    public void testFromDBsearch() throws Exception{
        TestLogger.log(getClass().getSimpleName() + " : " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInCNN.searchItemsAndSubmitButton();

    }
}
