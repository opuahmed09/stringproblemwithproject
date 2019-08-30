package testfacebookprohome;

import Facebookprofilehome.FaceBookProHome;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProfileHome extends CommonAPI {


    String homeUrl ="https://www.facebook.com/";
    FaceBookProHome faceBookProHome;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        faceBookProHome = PageFactory.initElements(driver,FaceBookProHome.class);
    }

    @Test(priority = 1)
    public void inputEmail(){
        faceBookProHome.setLoginEmail("taherjuwel3262@gmail.com");
    }
    @Test(priority = 2)
    public void inputpss(){
        faceBookProHome.setLoginPassword("Juwel1234");
    }

    @Test(priority = 3)
    public void clikOnTab(){
        faceBookProHome.setLoginTab();
    }

    @Test(priority = 4)
    public void clikOnHome()throws Exception{
        faceBookProHome.setHomeTab();
    }
    @Test(priority = 5)
    public void testsetTestImage(){
        faceBookProHome.setTestImage();
    }
    @Test(priority = 6)
    public void clickOnFindFriend(){
        faceBookProHome.setFindFriend();
        driver.navigate().back();
    }
    @Test(priority = 7)
    public void testlistSearch() throws Exception{
        faceBookProHome.setSearchTab();
    }
    @Test(priority = 8)
    public void testQuicHelpTab(){
        faceBookProHome.getListOfQuickHelp();
        driver.navigate().refresh();
    }
    @Test(priority = 9)
    public void testInputStatus()throws Exception{
        String str = "Today is a sunny day but can't go out due to lot of home work todo";
        faceBookProHome.setInputStatus(str);
    }
}
