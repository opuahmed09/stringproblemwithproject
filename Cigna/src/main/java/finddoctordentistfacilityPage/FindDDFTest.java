package finddoctordentistfacilityPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindDDFTest extends CommonAPI {


 @FindBy(xpath ="//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[1]/a" )
    WebElement FindDoctorDentistFacility;

 public void FindDDFLinkClick(){
     driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[1]/a")).click();
 }








}
