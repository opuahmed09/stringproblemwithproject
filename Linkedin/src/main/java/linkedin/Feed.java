package linkedin;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class Feed extends CommonAPI {
    //findbay

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy(id = "login-password")
    WebElement loginPassword;

    @FindBy(id = "login-submit")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\'notifications-nav-item\']/a")
    WebElement notifications;

    @FindBy(linkText = "Write an article")
    WebElement article;

    @FindBy(xpath = "//*[@id=\'mynetwork-nav-item\']/a")
    WebElement myNetwork;

    @FindBy(xpath = "//*[@id=\'ember31\']/input")
    WebElement searchBox;

    @FindBy(css = "#jobs-nav-item > a")
    WebElement jobs;

    @FindBy(xpath = "//*[@id=\'nav-settings__dropdown-trigger\']/div")
    WebElement meDropdown;

    @FindBy(xpath = "//*[@id=\'nav-settings__dropdown-options\']/li[2]/ul/li[1]")
    WebElement settingsInDrop;

    @FindBy(css = ".nav-item__title-container")
    WebElement workDropDown;

    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get title of feed page");
        Assert.assertEquals(driver.getTitle(), "LinkedIn");
    }

    public void seeNotification() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "see notifications");
        notifications.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.linkedin.com/notifications/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void clickWorkDdown() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "click on the Work dropdown");
        workDropDown.click();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void chooseSettings() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "choose setting from dropdown");
        Thread.sleep(3000);
        this.seeDropdown();
        Thread.sleep(5000);
        this.clickSettingsInDrop();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void seeDropdown() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "open drop down");
        meDropdown.click();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void clickSettingsInDrop() {
        settingsInDrop.click();
    }


    public void logInLinkedIn(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
    }


    public void clickArticle() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "click write article");
        article.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        driver.quit();
    }

    public void clickMyNetworkPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to My NetWork Page from feed");
        Thread.sleep(3000);
        myNetwork.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/mynetwork/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void clickSearchBox() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "click on search tab");
        searchBox.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void searchForPeople(String search) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "search for john");
        searchBox.sendKeys(search, Keys.ENTER);
    }

    public void findJobs() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to Jobs Page from feed");
        jobs.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}


