package testcnnuspage;

import base.CommonAPI;
import cnnuspage.CnnUsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCnnUsPage extends CommonAPI {


    String usPageUrl = "https://www.cnn.com/us";
    CnnUsPage usPage ;

    @BeforeClass
    public void Initializing(){
        driver.get(usPageUrl);
        usPage = PageFactory.initElements(driver,CnnUsPage.class);
    }

    @AfterMethod
    public void reINIT(){
        driver.get(usPageUrl);
    }

    @Test
    public void testsetImage(){
        usPage.setTopImage();
    }
    @Test
    public void testCurrentUrl(){
        usPage.testurl();
    }
    @Test
    public void testsetTable1stImg(){
        usPage.setTable1stImg();
    }
    @Test
    public void testsetStoriestext(){
        usPage.setStoriestext();
    }
    @Test
    public void testsetStoriestext1(){
        usPage.setStoriestext1();
    }
    @Test
    public void testalltextfromUsPage(){
        usPage.setalltextfromUsPage();
    }
    @Test
    public void testsetLastImg(){
        usPage.setLastImg();
    }
    @Test
    public void testsetaroundtheUsText(){
        usPage.setaroundtheUsText();
    }
    @Test
    public void testsetBottomTopics(){
        usPage.setBottomTopics();
    }
    @Test
    public void testsetclickingonfb(){
        usPage.setclickingonfb();
    }




}
