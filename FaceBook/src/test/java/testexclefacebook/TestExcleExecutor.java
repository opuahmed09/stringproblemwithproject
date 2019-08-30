package testexclefacebook;

import base.CommonAPI;
import exclefacebook.ExcleExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExcleExecutor extends CommonAPI {
    ExcleExecutor executor;

    @BeforeClass
    public void initialize(){
        driver.get("https://www.facebook.com/");
        executor = PageFactory.initElements(driver,ExcleExecutor.class);
    }


    @Test
    public void testFBinExcle() throws Exception {
        executor.runOnexcle();
    }
}
