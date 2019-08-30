package facebookhometabsvarifys;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

public class HomeTabsVarifys extends CommonAPI {

    @FindBy(id = "email")
    WebElement loginemail;

    @FindBy(css = "#pass")
    WebElement loginPass;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    /*******************/

    @FindBy(className = "_y-c")
    WebElement seeMore;

    @FindBy(id = "navItem_4748854339")
    WebElement newsFeed;

    @FindBy(css = "#navItem_217974574879787")
    WebElement messengerTab;

    @FindBy(id = "navItem_2392950137")
    WebElement watchTab;

    @FindBy(css = "div._2yaa:nth-child(1)")
    WebElement latestVideo;

    @FindBy(id = "navItem_156203961126022")
    WebElement welcomeTab;

    @FindBy(css = "#navItem_2530096808")
    WebElement pagesTab;

    @FindBy(id = "navItem_1434659290104689")
    WebElement groupTab;

    @FindBy(id = "navItem_2344061033")
    WebElement eventsTab;

    @FindBy(id = "navItem_1572366616371383")
    WebElement friendList;

    @FindBy(id =  "navItem_140332009231")
    WebElement gamesTab;

    @FindBy(css = "#navItem_193356651002223")
    WebElement fundRisers;

    @FindBy(css = "#navItem_303257506544370")
    WebElement memoriesTab;

    @FindBy(xpath = "//ul[@class='_bui _3-96']/li[@id='navItem_2356318349']")
    WebElement findfriendTab;

    @FindBy(xpath = "//li[@id='navItem_526732794016279']")
    WebElement weatherTab;

    @FindBy(id = "navItem_577076605805053")
    WebElement recomendationTab;

    @FindBy(css = "#navItem_421935831521247")
    WebElement messengerKidsTab;

    @FindBy(id = "navItem_176339666193022")
    WebElement townHallTab;

    @FindBy(css = "#navItem_285571681929755")
    WebElement gamingVideoTab;

    @FindBy(xpath = "//li[@id='navItem_977114232337111']")
    WebElement jobsTab;

    @FindBy(id = "navItem_526732794016279")
    WebElement offerTab;

    @FindBy(id = "navItem_1291706757509010")
    WebElement filmTab;

    /*********************************/

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void setLogIn() {
        loginemail.sendKeys("taherjuwel3262@gmail.com");
        loginPass.sendKeys("Juwel1234");
        loginTab.click();
    }

    public boolean seeMore() {
        Actions actions = new Actions(driver);
        actions.moveToElement(seeMore);
        seeMore.click();
        return seeMore.isDisplayed();
    }

    public void setNewsFeed() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify NewsFeed Tab in FaceBook");
        String text = newsFeed.getText();
        newsFeed.click();
        Assert.assertEquals(text, text);
    }

    public void setMessengerTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Messenger Tab in FaceBook");
        String text = messengerTab.getText();
        messengerTab.click();
        Assert.assertEquals(text, "Messenger");
        driver.navigate().back();
    }

    public void setWatchTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Watch Tab in FaceBook");
        Actions actions = new Actions(driver);
        actions.moveToElement(watchTab);
        watchTab.click();
        Thread.sleep(3000);
        boolean tab = latestVideo.isSelected();
        Assert.assertFalse(tab);
        driver.navigate().back();
    }

    public void setWellcomeTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify WelCome Tab in FaceBook");
        String welcome = welcomeTab.getText();
        Assert.assertEquals(welcome, "Welcome");
    }

    public void setPagesTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Pages Tab in FaceBook");
        Actions actions = new Actions(driver);
        actions.moveToElement(pagesTab);
        pagesTab.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Suggested Pages");
        driver.navigate().back();
    }

    public void setGroupTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Group Tab in FaceBook");
        Actions actions = new Actions(driver);
        actions.moveToElement(groupTab);
        groupTab.click();
        Thread.sleep(3000);
        String groupTitle = driver.getTitle();
        Assert.assertEquals(groupTitle, "Discover Groups");
        System.out.println(groupTitle);
        driver.navigate().back();
    }

    public void setEventsTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Events Tab in FaceBook");
        String text = eventsTab.getText();
        Assert.assertEquals(text, text);
    }

    public void setFriendList() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Friend List Tab in FaceBook");
        Actions actions = new Actions(driver);
        actions.moveToElement(friendList);
        friendList.click();
        driver.navigate().refresh();
        String title = friendList.getText();
        Assert.assertEquals(title, "Friend lists");
        driver.navigate().back();
    }

    public void setGamesTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Games Tab in FaceBook");
        seeMore();
        gamesTab.click();
        driver.navigate().refresh();
        String title = driver.getTitle();
        Assert.assertEquals(title, title);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setFundRisers() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Fund Riser Tab in FaceBook");
        seeMore();
        String text = fundRisers.getText();
        System.out.println(text);
        Assert.assertEquals(text, text);
        Thread.sleep(4000);
    }

    public void setMemoriesTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Memories Tab in FaceBook");
        seeMore();
        String text = memoriesTab.getText();
        Assert.assertEquals(text, text);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setFindfriendTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Find Friends Tab in FaceBook");
        seeMore();
        boolean findTab = findfriendTab.isDisplayed();
        Assert.assertTrue(findTab);
    }

    public void setWeatherTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Weather Tab in FaceBook");
        seeMore();
        String text = weatherTab.getText();
        Assert.assertEquals(text, text);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setRecomendationTab() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Recomendetion Tab in FaceBook");
        seeMore();
        Actions actions = new Actions(driver);
        actions.moveToElement(recomendationTab);
        recomendationTab.click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Learn more");
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setMessengerKidsTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Messenger Kids Tab in FaceBook");
        seeMore();
        String text = messengerKidsTab.getText();
        Assert.assertEquals(text, "Messenger Kids");
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setTownHallTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify TownHall Tab in FaceBook");
        seeMore();
        String text = townHallTab.getText();
        Assert.assertEquals(text, text);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setGamingVideoTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Gaming Video Tab in FaceBook");
        seeMore();
//        gamingVideoTab.click();
        String currentUrl = driver.getCurrentUrl();
        String url = "https://www.facebook.com/gaming/?external_ref=games_video_bookmark";
        Assert.assertEquals(currentUrl, currentUrl);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setJobsTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Jobs Tab in FaceBook");
        seeMore();
        String text = jobsTab.getText();
        Assert.assertEquals(text, text);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setOfferTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Offer Tab in FaceBook");
        seeMore();
        boolean st = offerTab.isDisplayed();;
        Assert.assertFalse(st);
        driver.navigate().to("https://www.facebook.com/");
    }

    public void setFilmTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Film Tab in FaceBook");
        seeMore();
        String text = filmTab.getText();
        Assert.assertEquals(text, text);
        driver.get("https://www.facebook.com/");
    }
}
