package cnnbusiness;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class CnnBusinessPage extends CommonAPI {

    @FindBy(css = "#menu")
    WebElement selectingMenu;

    @FindBy(xpath = "//div[@id='nav']/div/div[2]/a[2]")
    WebElement clickOnTech;

    @FindBy(xpath = "//a[@class='nav-menu-links__link' and text()='Markets']")
    WebElement marketInBuseness;

    @FindBy(css = "button:nth-child(2)>svg>path")
    WebElement tredeScrolling;

    @FindBy(id = "downshift-0-input")
    WebElement inputSearchInBusiness;

    @FindBy(xpath = "//img[@class='media__image']")
    WebElement testImage;

    @FindBy(xpath = "//section[@id='business-zone-1']/div[2]/div/div/ul/li/article/div/div/a/img")
    WebElement topTitleImage;

    @FindBy(css = "//label[text()='Credit Cards']")
    WebElement craditCardChosing;

    @FindBy(xpath = "//div[@id='outbrain_widget_0']//div//div//ul//li[3]")
    WebElement imageInPaidcontent;

    @FindBy(xpath = "//section[@id='business-zone-4']/div[2]/div/div[1]/div/div[2]/article/div/div[1]/a/img")
    WebElement testImage3;

    public void gotoMenu() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Menu Button in Business Page");
        selectingMenu.click();
    }

    public void getBusinessPage() {
        clickOnTech.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Business Page");
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void seeMarketaGlance() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To Market in Business Page");
        marketInBuseness.click();
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Business Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void seeNikeTrade(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Trade Button in Business Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Business Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void craditCard() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Credit Card Button in Business Page");
//        craditCardChosing.click();
        String str = craditCardChosing.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Credit Cards");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Business Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
}
