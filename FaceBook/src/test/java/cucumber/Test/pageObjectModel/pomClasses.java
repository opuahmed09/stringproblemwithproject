package cucumber.Test.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class pomClasses  {


    public static WebDriver driver;
    private String loginPageUrl = "https://www.facebook.com/login/";

    public pomClasses() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(), 'doesn’t match any account')]")
    private WebElement alertMessage;


    public void navigateToLoginPage() {
        System.setProperty("webdriver.chrome.driver","/Users/jewal/IntelliJ/WebAutomationGroup3/Generic/browser-driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(loginPageUrl);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    }

    public void enterInEmail() {
        emailField.sendKeys("sdfghkjlklhkgjfhdgfgfhjkj");
    }

    public void enterInPassword() {
        passwordField.sendKeys("3456789iuhg");
    }

    public void login() {
       String str = loginButton.getText();
        Assert.assertEquals(str,str);
        loginButton.click();

    }

    public boolean alertMessageIsDisplayed() {
        return driver.findElement(By.xpath("//div[contains(text(), 'doesn’t match any account')]")).isDisplayed();
    }

}
