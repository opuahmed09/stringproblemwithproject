package Facebookprofilehome;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FaceBookProHome extends CommonAPI {

    @FindBy(id = "email")
    WebElement loginemail;

    @FindBy(css = "#pass")
    WebElement loginPass;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    @FindBy(css = "div[class='_4bl9 _42n-'] textarea")
    WebElement inputStatus;

    @FindBy(css = "div[class='_5rpb'] div")
    WebElement inputStatusClening;

    @FindBy(css = "div[class='_3u17 _3_fz']")
    WebElement inputStatusCloseing;

    @FindBy(xpath = "//html[@id='facebook']/body/div[20]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/button")
    WebElement leavePagepopup;

    @FindBy(linkText = "Home")
    WebElement homeTab;

    @FindBy(xpath = "//div[@class='_2tev']/div[@class='uiScaledImageContainer _2tew _6l-']//img")
    WebElement testImage;

    @FindBy(xpath = "//div[@class='_cy7']")
    WebElement findFriend;

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchTab;

    @FindBy(id = "u_0_h")
    WebElement quickHelpTab;

    public void setLoginTab() {
        loginTab.click();
    }

    public void setLoginEmail(String logInEmail) {
        loginemail.sendKeys(logInEmail);
    }

    public void setLoginPassword(String password) {
        loginPass.sendKeys(password);
    }

    public void clenInput() {
        inputStatusClening.clear();
    }

    public void closeInput() {
        inputStatusCloseing.click();
    }

    public void hendlePopup() {
        leavePagepopup.click();
    }

    public void setInputStatus(String value) throws Exception {

        inputStatus.sendKeys(value);
        clenInput();
        closeInput();
        Alert at = driver.switchTo().alert();
        at.dismiss();
    }

    public void setHomeTab() throws Exception {
        homeTab.click();
        Thread.sleep(3000);
    }

    public void setTestImage() {
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setFindFriend() {
        findFriend.click();
    }

    public void setSearchTab() throws Exception {

        List<String> frindList = new ArrayList<String>();
        frindList.add("Sylvana");
        frindList.add("Jewal Ahmed");
        frindList.add("Amir");
        frindList.add("Mustafizur");
        frindList.add("Hamid Bhai");
        frindList.add("People And Tech");
        frindList.add("Manhattan Mall");
        frindList.add("Nabil");

        Iterator<String> str = frindList.listIterator();
        while (str.hasNext()) {
            String str1 = str.next();
            searchTab.sendKeys(str1);
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+str1);
            Thread.sleep(2000);
            clear();
        }
    }

    public void clear() {
        searchTab.clear();
    }

    public void getListOfQuickHelp() {
        quickHelpTab.click();
        List<String> str = getTextFromWebElements("ul[class='_43uh']>li", driver);
        for (String st : str) {
            System.out.println(st);
        }
    }
}
