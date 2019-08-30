package popUpWindowsHandle;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class WindowsHandle extends CommonAPI {

    @FindBy(id = "openwindow")
    WebElement openwindows;
    @FindBy(css = ".btn.btn-default.btn-lg.btn-course-filter.dropdown-toggle")
    WebElement all;
    @FindBy(xpath = "//a[contains (text(),'Software Development (6)')]")
    WebElement software;

    public void setOpenwindows(){
        String parentWindow = driver.getWindowHandle();

        openwindows.click();

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows){
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
                try{
                    Thread.sleep(5000);

                }catch (InterruptedException e){

                }
                all.click();
                software.click();
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
    }
}
