package signInpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInOnly extends CommonAPI {

    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(css = "#pass")
    WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    public void setLoginTab(){
        loginTab.click();
    }

    public void setLoginEmail(String logInEmail){
        loginEmail.sendKeys(logInEmail);
    }
    public void setLoginPassword(String password){
        loginPassword.sendKeys(password);
    }



}
