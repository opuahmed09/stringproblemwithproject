package individualsandfamiliespage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyIndividualsAndFamiliesTabByClick extends CommonAPI {

    @Test
    public void VerifyIndividualsAndFamiliesTabByClick(){
        driver.findElement(By.xpath("VerifyIndividualsAndFamiliesTabByClick")).click();
    }

}
