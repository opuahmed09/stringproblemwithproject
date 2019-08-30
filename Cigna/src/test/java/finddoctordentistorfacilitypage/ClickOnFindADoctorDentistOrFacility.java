package finddoctordentistorfacilitypage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickOnFindADoctorDentistOrFacility extends CommonAPI {

    @Test
    public void clickOnFindADoctorDentistOrFacilityTest(){
        driver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary' and @target='_self']")).click();
    }
}
