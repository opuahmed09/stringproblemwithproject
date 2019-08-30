package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaHomePageTest extends CommonAPI {

    String url = "https://www.cigna.com/";
    HomePage homePage;

    @BeforeMethod
    public void init(){
        driver.get(url);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testTitle(){
        homePage.testTitleOfHomePage();
    }
    @Test
    public void testFaculty(){
        homePage.setFacality();
    }
    //@Test
    //public void testFindDDF(){homePage.}


}
