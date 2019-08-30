package testsignInpage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import signInpage.SignInOnly;

public class TestSignInonly extends CommonAPI {

    String homeUrl ="https://www.facebook.com/";
    SignInOnly signInOnly;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        signInOnly = PageFactory.initElements(driver,SignInOnly.class);
    }
    @AfterMethod
    public void re_init(){
        driver.get(homeUrl);
    }

    @Test
    public void testLogInEmail(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Sign In");
        signInOnly.setLoginEmail("taherjuwel362@gmail.com");
    }
    @Test
    public void testLogInPass(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOnly.setLoginPassword("Juwel1234");
    }
    @Test
    public void testLogInTab(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInOnly.setLoginTab();
    }
}
