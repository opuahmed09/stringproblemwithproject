package testBrokenLinks;

import base.CommonAPI;
import brokenLinks.BrokenLinks;
import listener.ListenNerClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
@Listeners(ListenNerClass.class)
public class TestBrokenLinks extends CommonAPI  {

    BrokenLinks brokenLinks ;
    SoftAssert softAssert = new SoftAssert();// softAssert

    @BeforeClass
    public void init() {
        brokenLinks = PageFactory.initElements(driver, BrokenLinks.class);
        driver.get("https://www.cnn.com/");
    }


    @Test
    public void testBrokenLinks() throws IOException{
        brokenLinks.Blinks();
//        softAssert.assertEquals("","");
//        softAssert.assertAll();
//        Assert.assertEquals(true,false);
    }

  //  @Test
    public void testBrokenLinks2() throws IOException {
        brokenLinks.Blonks2();
//        Assert.assertEquals(true,false);

    }
}