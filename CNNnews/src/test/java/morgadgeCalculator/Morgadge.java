package morgadgeCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Morgadge {


    /**
     *  Anis Bhai Give me that URL to perform sendKeys on mortgage rate
     */
    @Test
    public void mor() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/mortgage-calculator.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.cssSelector("#chouseprice"));
        element.click();
        element.clear();
        element.sendKeys("800000");
        Thread.sleep(5000);
        driver.quit();
    }




}
