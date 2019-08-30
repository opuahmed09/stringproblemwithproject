package searchoncignatabpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchOnCignaTabTest extends CommonAPI {

    @Test
    public void searchOnCignaTab(){
        driver.findElement(By.xpath("//input[@class='csng-cigna-autocomplete form-control form-control-sm ng-untouched ng-pristine ng-valid']")).sendKeys("doctors", Keys.ENTER);
    }
}
