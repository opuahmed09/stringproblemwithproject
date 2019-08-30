package WJplayer;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class JWPlayer extends CommonAPI {

    @FindBy(xpath = "(//ul[@class='nav-list nav-list--level-2'])[1]/li")
    List<WebElement> allPlayers;

    @FindBy(xpath = "(//ul[@class='nav-list nav-list--level-2'])[1]")
    WebElement player;

    @BeforeClass
    public void init() {
        driver.get("https://www.jwplayer.com/");
    }


    @Test
    public void setPlayerList() throws InterruptedException {
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Player ')]"));
        actions.moveToElement(element).build().perform();
        //   player.click();

        List<WebElement> totalList = driver.findElements(By.xpath("(//ul[@class='nav-list nav-list--level-2'])[1]/li"));
        // List<WebElement> totalList = allPlayers;
        for (int i = 0; i < totalList.size(); i++) {
            System.out.println(totalList.get(i).getText());

            if (totalList.get(i).getText().equalsIgnoreCase("Mobile SDKs")) {
                totalList.get(i).click();
                Thread.sleep(5000);
                break;
            }
        }
    }
}