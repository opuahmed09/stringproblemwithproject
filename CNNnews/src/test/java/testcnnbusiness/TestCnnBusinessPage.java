package testcnnbusiness;

import base.CommonAPI;
import cnnbusiness.CnnBusinessPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCnnBusinessPage extends CommonAPI {

    String businessUrl = "https://www.cnn.com/business";
    CnnBusinessPage cnnBusinessPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(businessUrl);
        cnnBusinessPage = PageFactory.initElements(driver,CnnBusinessPage.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(businessUrl);
    }

    @Test
    public void menubtn() throws Exception{
        cnnBusinessPage.gotoMenu();
        driver.navigate().to(businessUrl);
    }

    @Test
    public void pageTech()throws Exception{
        cnnBusinessPage.getBusinessPage();
    }

    @Test
    public void glaceAtMarket() throws Exception{
        cnnBusinessPage.seeMarketaGlance();
    }
    @Test
    public void imageTesting1()throws Exception{
        cnnBusinessPage.image1();
    }

    @Test
    public void nikeTraging() throws Exception {
        cnnBusinessPage.seeNikeTrade("Nike");
        driver.navigate().to(businessUrl);
    }

    @Test
    public void tradeScrolTest()throws Exception{
        cnnBusinessPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        cnnBusinessPage.setTopTitleImage();
    }

    @Test
    public void testCraditCard()throws Exception{
        cnnBusinessPage.craditCard();
    }

    @Test
    public void testPaidContent()throws Exception{
        cnnBusinessPage.paidContentImage();
    }
}
