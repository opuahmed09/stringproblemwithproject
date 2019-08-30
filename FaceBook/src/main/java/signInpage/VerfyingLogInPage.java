package signInpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class VerfyingLogInPage extends CommonAPI {


    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(css = "#pass")
    WebElement inputpasword;

    @FindBy(id = "u_0_c")
    WebElement seeFisrtName;

    @FindBy(id = "day")
    WebElement dayDOB;

    @FindBy(css = "#u_0_e")
    WebElement surnameInput;

    @FindBy(id = "u_0_h")
    WebElement emailSignUpInput;

    @FindBy(css = "#u_0_o")
    WebElement signupPass;

    @FindBy(xpath = "//label[text()='Male']")
    WebElement selectGender;

    @FindBy(xpath = "//button[@id='u_0_u']")
    WebElement clickSignUp;

    @FindBy(css = ".fb_logo.img")
    WebElement testFaceBookLogo;




    public void putInpass(String password){
        inputpasword.sendKeys(password,Keys.ENTER);
        driver.navigate().back();
    }
    public void putInEmail(String email){
        inputEmail.sendKeys(email,Keys.ENTER);
        driver.navigate().back();
    }

    public void typeOnInputFirstName(String firstName) {
        seeFisrtName.sendKeys(firstName,Keys.ENTER);
    }

   public void dayfromDOB(){
       String str= dayDOB.getText();
       System.out.println(str);
   }
   public void setSurnameInput(String name){
        surnameInput.sendKeys(name,Keys.ENTER);
   }
   public void setEmailSignUpInput(String myEmail){
        emailSignUpInput.sendKeys(myEmail);
   }
   public void setSignupPass(String pass){
        signupPass.sendKeys(pass);
   }
   public void setSelectGender(){
        selectGender.click();
   }
   public void setClickSignUp(){
        clickSignUp.click();
   }
   public void setTestFaceBookLogo(){
       boolean fblogo= testFaceBookLogo.isDisplayed();
       Assert.assertTrue(fblogo);

   }
    public  void setMonthInDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }
    public static List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.id(locator));
        for (WebElement web : element) {
            String st = web.getText();
            text.add(st);
        }

        return text;
    }
}
