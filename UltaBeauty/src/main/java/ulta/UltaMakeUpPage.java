package ulta;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class UltaMakeUpPage extends CommonAPI {

    @FindBy(css = "#pimprod2004212")
    WebElement newArrival1stFrame;

    @FindBy(css = "#pimprod2003933")
    WebElement newArrival2ndFrame;

    @FindBy(css = "#xlsImpprod14291015")
    WebElement bestSeller1stframe;

    @FindBy(css = "#xlsImpprod13631033")
    WebElement lipsSection1stFrame;

    @FindBy(css = "#xlsImpprod18121011")
    WebElement faceMakeUp3rdFrame;

    @FindBy(css = "#xlsImpprod17731247")
    WebElement eyeMakeUp2ndFrame;

    @FindBy(xpath = "//*[@id=\'show-deskmob-con\']/a/img")
    WebElement UltaBeautyLogo;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:face']")
    WebElement face;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:eyes']")
    WebElement eyes;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:ulta collection']")
    WebElement ultaCollection;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:lips']")
    WebElement lips;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:makeup brushes & tools']")
    WebElement brushesAndTools;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:makeup bags & cases']")
    WebElement bagsAndCases;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:travel size']")
    WebElement travelSize;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:gifts & value sets']")
    WebElement giftsAndValueSets;

    @FindBy(xpath = "//a[@data-nav-description='cn - makeup:allure best of beauty']")
    WebElement allureBestOfBeauty;

    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "getting title of MakeUp Page");
        driver.getTitle();
        String expectedTitle = "Makeup | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public void setMacPallete() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view first frame of new arrivals");
        newArrival1stFrame.click();
        Thread.sleep(5000);
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void setTarteFaceTape() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view second frame of new arrivals");
        newArrival2ndFrame.click();
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void setBestSeller1stframe() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view first frame of Best Sellers");
        bestSeller1stframe.click();
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void setLipsSection1stFrame() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view first frame of lips section");
        lipsSection1stFrame.click();
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void setFaceMakeUp3rdFrame() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view 3rd frame of face section");
        faceMakeUp3rdFrame.click();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void setEyeMakeUp2ndFrame() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view second frame of eye section");
        eyeMakeUp2ndFrame.click();
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void verifyLogoImg() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "verify logo of Ulta Beauty");
        boolean ultaImg = UltaBeautyLogo.isDisplayed();
        System.out.println(UltaBeautyLogo.getText());
        Assert.assertTrue(ultaImg);
        String urlExpected = driver.getCurrentUrl();
        ;
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverShopByBrands() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover Shop By Brand");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNChooseFromBrands() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover Shop By Brand and choose");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/a");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[2]/div/div/div/div[3]/ul/li[1]/a/img")).click();
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void hoverNewArrivals() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over ");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMakeUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over make up");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNails() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over nails");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[5]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSkinCare() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over skin care");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[6]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverHair() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over hair");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[7]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverToolsAndBrushes() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over tools and brushes");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[8]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverFragrance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over fragrance");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[9]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBathAndBody() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over bath and body");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[10]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMen() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over men");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[11]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverUltaCollections() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over ulta collection");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[12]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverGifts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over gifts");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[13]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSalesAndCoupon() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "Hover over sales and coupons");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[14]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverCurrentAd() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over current ad");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[15]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void hoverBeautyTips() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over beauty tips");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[16]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverAllureWinners() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over allure winners");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[17]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBeautyServices() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over beauty services");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[19]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBookAppointment() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over book appointments");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[20]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void seeFaceSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over face section");
        face.click();
    }

    public void seeEyesSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over eyes section");
        eyes.click();
    }

    public void seeUltaCollectionSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over ulta collections");
        ultaCollection.click();
    }

    public void seelipsSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view lips section");
        lips.click();
    }

    public void seeBrushesAndToolsSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view brushes and tools");
        brushesAndTools.click();
    }

    public void seeBagsAndCasesSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view bags and cases");
        bagsAndCases.click();
    }

    public void seeTravelSizeSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view travel size");
        travelSize.click();
    }

    public void seeGiftsAndValueSetsSection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view gifts and value sets");
        giftsAndValueSets.click();
    }

    public void seeAllureBestOfBeautySection() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view allure best of beauty section");
        allureBestOfBeauty.click();
    }

}
