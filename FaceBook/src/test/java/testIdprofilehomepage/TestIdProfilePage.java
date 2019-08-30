package testIdprofilehomepage;

import base.CommonAPI;
import idprofilehomepage.IDProfileHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestIdProfilePage extends CommonAPI {

    String homeUrl ="https://www.facebook.com/";
    IDProfileHomePage profile;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        profile = PageFactory.initElements(driver,IDProfileHomePage.class);
    }
    @Test(priority = 1)
    public void inputEmail(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        profile.setLoginEmail("taherjuwel3262@gmail.com");
    }
    @Test(priority = 2)
    public void inputpss(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        profile.setLoginPassword("Juwel1234");
    }
    public void shortCut()throws Exception{
        inputEmail();
        inputpss();
        clikOnTab();
        gotoProfile();
    }
    @Test(priority = 3)
    public void clikOnTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        profile.setLoginTab();
    }
    @Test(priority = 4)
    public void gotoProfile()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        profile.setProfileTab();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void testClickOnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        profile.setClickOnMore();
    }
    @Test(priority = 6)
    public void testClickAbout()throws Exception{
        profile.setClickOnAbout();
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void testIdprofileCoverPicture(){
        profile.setIdProfileCoverPicture();
    }
    @Test(priority = 8)
    public void testsetClickOnArchive(){
        profile.setClickOnArchive();
    }
//    @Test(priority = 9)
    public void testTestUpLoadingPicture()throws Exception{
        profile.testUploadingPicture();
    }

}
