package cnnuspage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class CnnUsPage extends CommonAPI {

    @FindBy(xpath = "//section[@id='us-zone-1']/div/div/div/ul/a//following-sibling::li/article/div/div/a")
    WebElement topImage;

    @FindBy(xpath = "//div[@class='ad ad--epic ad--tablet']//following-sibling::ul/a//following-sibling::li/article/div/div/a/img")
    WebElement table1stImg;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed li")
    WebElement storiestext;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed")
    WebElement storiestext1;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_DCB8F55B-ECE9-602C-1A45-5919511B4582.cn--expandable.cn--collapsed")
    WebElement alltextfromUsPage;

    @FindBy(css = "section[id='us-zone-8']")
    WebElement aroundtheUsText;

    @FindBy(xpath = "//section[@id='homepage4-zone-7']/div/div/div/ul/li/article/div/div/a/img")
    WebElement lastImg;

    @FindBy(css = ".m-legal__list")
    WebElement bottomTopics;

    @FindBy(xpath = "//section[@id='us-zone-8']/div/div/div/div//div[22]/article/div/div/a/img")
    WebElement clickingonfb;

    public void setTopImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
        boolean tIMG = topImage.isDisplayed();
        Assert.assertTrue(tIMG);
    }

    public void testurl() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify url in U.S. Page");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.cnn.com/us");
    }

    public void setTable1stImg() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
        boolean tFisttIMG = table1stImg.isDisplayed();
        Assert.assertTrue(tFisttIMG);
    }

    public void setStoriestext() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories in U.S. Page");
        String str = storiestext.getText();
        System.out.println(str);
        Assert.assertEquals(str, str);
    }

    public void setStoriestext1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 1 in U.S. Page");
        String str = storiestext1.getText();
        System.out.println(str);
    }

    public void setalltextfromUsPage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 2 in U.S. Page");
        String str = alltextfromUsPage.getText();
        System.out.println(str);
        Assert.assertEquals(str, str);
    }

    public void setLastImg() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Image in U.S. Page");
        boolean limg = lastImg.isDisplayed();
        Assert.assertTrue(limg);
    }

    public void setaroundtheUsText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Text in U.S. Page");
        String str = aroundtheUsText.getText();
        System.out.println(str);
    }

    public void setBottomTopics() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom topics in U.S. Page");
        String st = bottomTopics.getText();
        String str = "Terms of UsePrivacy PolicyAccessibility & CCAdChoicesAbout usCNN " +
                "Studio ToursCNN StoreNewslettersTranscriptsLicense FootageCNN Newsource";
        System.out.println(st);
        Assert.assertEquals(st, st);
    }

    public void setclickingonfb() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 1 in U.S. Page");
        clickingonfb.click();
        driver.navigate().to("https:/cnn.com/us");
    }
}
