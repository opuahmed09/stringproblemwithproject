package logintomycignapage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickOnLogInToMyCignaTest extends CommonAPI {


    @Test
    public void ClickOnLogInToMyCigna(){
        driver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary' and @target='_blank']")).click();
    }





}
