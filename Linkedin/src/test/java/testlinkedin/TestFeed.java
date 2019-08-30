package testlinkedin;

import base.CommonAPI;
import linkedin.Feed;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFeed extends CommonAPI {

    String homeUrl = "https://www.linkedin.com/";
    Feed feed;


    @BeforeClass
    public void init() {
        driver.navigate().to(homeUrl);
        feed = PageFactory.initElements(driver, Feed.class);
        feed.logInLinkedIn("stest7380@gmail.com", "stest312@t");
    }


    @AfterMethod
    public void reStart() {
        driver.get(homeUrl);
    }

    @Test()
    public void getTitleOfFeedPage() {
        feed.getTitle();
    }

    @Test
    public void seeNotificationInFeed() throws Exception {
        feed.seeNotification();
    }

    //@Test
    public void clickWriteArticle() throws Exception {
        feed.clickArticle();

    }

    @Test
    public void navigateToMyNetworkPage() throws Exception {
        feed.clickMyNetworkPage();
    }

    @Test
    public void clickSearch() throws Exception {
        feed.clickSearchBox();
    }

    @Test
    public void search() {
        feed.searchForPeople("John");
    }

    @Test
    public void navigateToJobsPage() throws Exception {
        feed.findJobs();
    }

    @Test
    public void openDropDown() {
        feed.seeDropdown();
    }

    @Test
    public void chooseSettingsFromDropDown() throws Exception {
        feed.chooseSettings();
    }

    @Test
    public void clickWorkDropDown() {
        feed.clickWorkDdown();
    }
}
