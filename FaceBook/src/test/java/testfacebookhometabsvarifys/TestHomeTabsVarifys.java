package testfacebookhometabsvarifys;

import base.CommonAPI;
import facebookhometabsvarifys.HomeTabsVarifys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomeTabsVarifys extends CommonAPI {

    HomeTabsVarifys homeTabsVarifys;
    String homeUrl = "https://www.facebook.com/";

    @BeforeClass
    public void initialization(){
        driver.get(homeUrl);
        homeTabsVarifys = PageFactory.initElements(driver,HomeTabsVarifys.class);
        homeTabsVarifys.setLogIn();
    }
    @AfterMethod
    public void cleanTest() {
        driver.navigate().to(homeUrl);
    }
    @Test
    public void testSetNewsFeed(){
        homeTabsVarifys.setNewsFeed();
    }
    @Test
    public void testSetMessengerTab(){
        homeTabsVarifys.setMessengerTab();
    }
    @Test
    public void testSetWatchTab()throws Exception{
        homeTabsVarifys.setWatchTab();
    }
    @Test
    public void testSetWellcomeTab(){
        homeTabsVarifys.setWellcomeTab();
    }
    @Test
    public void testSetPagesTab()throws Exception{
        homeTabsVarifys.setPagesTab();
    }
    @Test
    public void testGroupTab()throws Exception{
        homeTabsVarifys.setGroupTab();
    }
    @Test
    public void testEventsTab(){
        homeTabsVarifys.setEventsTab();
    }
    @Test
    public void testFriendListTab(){
        homeTabsVarifys.setFriendList();
    }
    @Test
    public void testGamesTab()throws Exception{
        homeTabsVarifys.setGamesTab();
    }
    @Test
    public void testFundRisers()throws Exception{
        homeTabsVarifys.setFundRisers();
    }
    @Test
    public void testMemoriesTab(){
        homeTabsVarifys.setMemoriesTab();
    }
    @Test
    public void testFindFriendTab(){
        homeTabsVarifys.setFindfriendTab();
    }
    @Test
    public void testWeatherTab(){
        homeTabsVarifys.setWeatherTab();
    }
    @Test
    public void testRecomendationTab() throws Exception{
        homeTabsVarifys.setRecomendationTab();
    }
    @Test
    public void testMessegerKidsTab(){
        homeTabsVarifys.setMessengerKidsTab();
    }
    @Test
    public void testTownHallTab(){
        homeTabsVarifys.setTownHallTab();
    }
    @Test
    public void testGamingVideo(){
        homeTabsVarifys.setGamingVideoTab();
    }
    @Test
    public void testJobTab(){
        homeTabsVarifys.setJobsTab();
    }
    @Test
    public void testOfferTab(){
        homeTabsVarifys.setOfferTab();
    }
    @Test
    public void testFilmTab(){
        homeTabsVarifys.setFilmTab();
    }
}