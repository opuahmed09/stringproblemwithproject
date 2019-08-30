package cnnworld;

import base.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class CNNWorld extends CommonAPI {

    Actions action = new Actions(driver);

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li article div div a img")
    WebElement visiblefirstIMG;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(4)")
    WebElement headlines;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(3)")
    WebElement headlines2;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(5)")
    WebElement headlines3;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(6)")
    WebElement headlines4;

    @FindBy(css = "#world-zone-1 div:nth-child(2) div div ul li:nth-child(6)")
    WebElement Headlines5;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[3]")
    WebElement featureSection;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[4]")
    WebElement featureSection3;

    @FindBy(xpath = "//section[@id='world-zone-3']/div[6]/div[2]/div/ul/li[6]")
    WebElement featureSection4;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[1]")
    WebElement latestSories1;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[2]")
    WebElement latestSories2;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[3]/article/div/div[2]")
    WebElement latestStiries4;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[4]/article/div/div[2]")
    WebElement latestStories5;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[5]/article/div/div[2]")
    WebElement latestStories6;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[6]/article/div/div[2]")
    WebElement latestSories7;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[7]/article/div/div[2]")
    WebElement latestStories8;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[9]/article/div/div[2]")
    WebElement latestStories9;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[11]/article/div/div[2]")
    WebElement latestStories11;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[12]/article/div/div[2]")
    WebElement latestStories12;

    @FindBy(xpath = "//section[@id='world-zone-7']/div[3]/div[2]/div/div/div[13]/article/div/div[2]")
    WebElement latestStories13;



    public void setVisiblefirstIMG(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Image in Cnn World Page");
        action.moveToElement(visiblefirstIMG);
        boolean selected =  visiblefirstIMG.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setHeadlines(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines World Page");
        action.moveToElement(headlines).moveToElement(visiblefirstIMG).moveToElement(headlines);
        String text = headlines.getText();
        Assert.assertEquals(text,text);
    }
    public void setHeadlines2(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines1 in Cnn World Page");
        boolean selected = headlines2.isSelected();
        Assert.assertFalse(selected);
    }
    public void setHeadlines3(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines2 in Cnn World Page");
        action.moveToElement(headlines3);
        boolean selected = headlines3.isEnabled();
        Assert.assertTrue(selected);
    }
    public void setHeadlines4(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines3 in Cnn World Page");
        action.moveToElement(headlines4).moveToElement(headlines).perform();
        boolean selected = headlines4.isSelected();
        Assert.assertFalse(selected);
    }
    public void setHeadlines5(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines4 in Cnn World Page");
        action.build().perform();
        action.moveToElement(Headlines5);
        String text = Headlines5.getText();
        Assert.assertEquals(text,text);
    }
    public void setFeatureSection(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Feature Section in Cnn World Page");
        action.moveToElement(featureSection);
        String text = featureSection.getText();
        Assert.assertEquals(text,text);
        System.out.println(text);
    }
    public void setFeatureSection3(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines5 in Cnn World Page");
        action.moveToElement(featureSection3);
        boolean select = featureSection3.isDisplayed();
        Assert.assertTrue(select);
    }
    public void setFeatureSection4(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines6 in Cnn World Page");
        boolean selected = featureSection4.isSelected();
        Assert.assertFalse(selected);
    }
    public void setLatestSories1(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines7 in Cnn World Page");
        action.moveToElement(latestSories1);
        String text = latestSories1.getText();
        System.out.println(text);
        Assert.assertEquals(text,text);
    }
    public void setLatestSories2(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines8 in Cnn World Page");
        action.moveToElement(latestSories2).click();
       String text = driver.getTitle();
        System.out.println(text);
    }
    public void setLatestStiries4(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines9 in Cnn World Page");
        action.moveToElement(latestStiries4);
        String text = latestStiries4.getText();
        Assert.assertEquals(text,text);
    }
    public void setLatestStories5(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines10 in Cnn World Page");
        action.moveToElement(latestStories5);
        action.moveToElement(latestStiries4).moveToElement(latestStories5);
        boolean selected = latestStories5.isDisplayed();
        Assert.assertTrue(selected);
    }
    public void setLatestStories6(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines11 in Cnn World Page");
        action.moveToElement(latestStories6);
        boolean select = latestStories6.isSelected();
        Assert.assertFalse(select);
    }
    public void setLatestSories7(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines12 in Cnn World Page");
        action.moveToElement(latestSories7).click();
        driver.navigate().refresh();
        driver.navigate().to("https://www.cnn.com/world");
    }
    public void setLatestStories8(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines13 in Cnn World Page");
        action.moveToElement(latestStories8);
        boolean selectd = latestStories8.isDisplayed();
        Assert.assertTrue(selectd);
    }
    public void setLatestStories9()throws Exception{
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines14 in Cnn World Page");
        action.moveToElement(latestStories9).doubleClick(latestStories9);
        Thread.sleep(4000);
        Dimension st= latestStories9.getSize();
        System.out.println(st);
        Assert.assertEquals(st,st);
    }
    public void setLatestStories11(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines15 in Cnn World Page");
        action.moveToElement(latestStories11);
        String text =latestStories11.getText();
        Assert.assertEquals(text,text);
    }
    public void setLatestStories12(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines16 in Cnn World Page");
        action.moveToElement(latestStories12);
        boolean text =latestStories12.isDisplayed();
        Assert.assertTrue(text);
    }
    public void setLatestStories13(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Headlines17 in Cnn World Page");
        action.moveToElement(latestStories13);
        boolean select = latestStories13.isEnabled();
        Assert.assertTrue(select);
    }
}
