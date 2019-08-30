package testPopUpWindowHandle;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import popUpWindowsHandle.WindowsHandle;

public class TestPopUpWindows extends CommonAPI {

    WindowsHandle windowsHandle;

    @BeforeClass
    public void init(){
        windowsHandle = PageFactory.initElements(driver,WindowsHandle.class);
        driver.get("https://learn.letskodeit.com/p/practice");
    }

    @Test
    public void windowHandle(){
        windowsHandle.setOpenwindows();



    }
}
