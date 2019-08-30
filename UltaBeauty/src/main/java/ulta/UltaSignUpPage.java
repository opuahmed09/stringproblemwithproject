package ulta;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class UltaSignUpPage extends CommonAPI {

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "zipcode")
    WebElement zipCode;

    @FindBy(id = "mobile_number_1")
    WebElement cellNumBox1;

    @FindBy(id = "mobile_number_2")
    WebElement cellNumBox2;

    @FindBy(id = "mobile_number_3")
    WebElement cellNumBox3;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(linkText = "Mobile Terms & Conditions")
    WebElement termsAndConditions;

    @FindBy(linkText = "Privacy Policy")
    WebElement privacyPolicy;

    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get title of signUp page");
        driver.getTitle();
        String expectedTitle = "Sign Up For Special Offers | Ulta.com";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public void enterFirstName(String enterFirstName) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter first name");
        firstName.sendKeys(enterFirstName);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterLastName(String enterLastName) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter last name");
        lastName.sendKeys(enterLastName);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterEmail(String enterEmail) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter email");
        email.sendKeys(enterEmail);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterZipCode(String enterZipCode) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter zipcode");
        zipCode.sendKeys(enterZipCode);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterCellBox1(String first3Numbers) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter cellbox 1");
        cellNumBox1.sendKeys(first3Numbers);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterCellBox2(String second3Numbers) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter cellbox 2");
        cellNumBox1.sendKeys(second3Numbers);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void enterCellBox3(String last4Numbers) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter cellbox 3");
        cellNumBox1.sendKeys(last4Numbers);
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void clickSubmit() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "click submit");
        submitButton.click();
        String expectedUrl = "https://pages.exacttarget.com/ulta-email-signup/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void seeTermsAndConditions() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "see terms and conditions");
        termsAndConditions.click();
        String urlExpected = "https://www.ulta.com/ulta/common/sms-help.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void seePrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "see privacy policy");
        privacyPolicy.click();
        String urlExpected = "https://www.ulta.com/ulta/common/privacyPolicy.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
        driver.navigate().back();
    }

}
