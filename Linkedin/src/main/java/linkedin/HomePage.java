package linkedin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy(css = "#reg-firstname")
    WebElement firstNameInput;

    @FindBy(css = "#reg-lastname")
    WebElement lastNameInput;

    @FindBy(css = "#reg-email")
    WebElement emailInput;

    @FindBy(css = "#reg-password")
    WebElement passwordInput;

    @FindBy(id = "registration-submit")
    WebElement registerButton;

    @FindBy(className = "reg-alert")
    WebElement alert;

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy(id = "login-password")
    WebElement loginPassword;

    @FindBy(id = "login-submit")
    WebElement loginButton;

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPassword;

    @FindBy(linkText = "Sign Up")
    WebElement signUp;

    @FindBy(linkText = "Help Center")
    WebElement helpCenter;

    @FindBy(linkText = "About")
    WebElement about;

    @FindBy(linkText = "Press")
    WebElement press;

    @FindBy(linkText = "Blog")
    WebElement blog;

    @FindBy(linkText = "Careers")
    WebElement careers;

    @FindBy(linkText = "Developers")
    WebElement developers;

    @FindBy(linkText = "Talent")
    WebElement talent;

    @FindBy(linkText = "Marketing")
    WebElement marketing;

    @FindBy(linkText = "Sales")
    WebElement sales;

    @FindBy(linkText = "Learning")
    WebElement learning;

    @FindBy(linkText = "Company Pages")
    WebElement companyPages;

    @FindBy(linkText = "Browse by country/region")
    WebElement browseByRegion;

    public void getTitleOfHomePage() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get title of LinkedIn homepage");
        driver.getTitle();
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public void registerLinkedIn() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "register for linkedin");
        inputFirstName("Selenium");
        inputLastName("Test");
        inputEmail("stest7380@gmail.com");
        inputPassword("stest312@t");
        submitRegistration();
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void registerNoLastName() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "register with no last name");
        inputFirstName("Selenium");
        inputEmail("stest7380@gmail.com");
        inputPassword("stest312@t");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your last name";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());
    }

    public void registerNoEmail() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "register with no email");
        inputFirstName("Selenium");
        inputLastName("Test");
        inputPassword("stest312@t");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your email address";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());

    }

    public void registerNoPassword() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "register with no password");
        inputFirstName("Selenium");
        inputLastName("Test");
        inputEmail("stest7380@gmail.com");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your password";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());

    }

    public void registerNoCredentials() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "register with no credential at all");
        submitRegistration();
        Thread.sleep(3000);
        String expectedAlert = "Please enter your first name";
        Assert.assertEquals(alert.getText(), expectedAlert);
        System.out.println(alert.getText());
    }

    public void inputFirstName(String fName) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter first name");
        firstNameInput.sendKeys(fName);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void inputLastName(String lName) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter last name");
        lastNameInput.sendKeys(lName);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void inputEmail(String email) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter email");
        emailInput.sendKeys(email);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void inputPassword(String passWord) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter password");
        passwordInput.sendKeys(passWord);
        String expectedUrl = "https://www.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void submitRegistration() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "click registration button");
        registerButton.click();
    }

    public String alertText() {
        boolean alertMsg = alert.isDisplayed();
        System.out.println(alert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "";

        return expectedAlert;
    }

    public void enterEmailLogin(String email) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter email in login section");
        loginEmail.sendKeys(email);
    }

    public void enterPasswordLogin(String password) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter password in login section");
        loginPassword.sendKeys(password);
    }

    public void logIn() {
        loginButton.click();
    }

    public void setForgotPassword() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to forgot password page");
        forgotPassword.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/request-password-reset?trk=uno-reg-guest-home-forgot-password";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }

    public void invalidLogInCredentials() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "sign in with invalid credentials");
        enterEmailLogin("blah blah blah");
        enterPasswordLogin("blah blah");
        logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/login-submit?loginSubmitSource=GUEST_HOME";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }


    public void logInLinkedIn(String email, String password) throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "sign in with valid credentials");
        enterEmailLogin(email);
        enterPasswordLogin(password);
        logIn();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void signUpPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view sign up page");
        signUp.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/start/join?trk=uno-reg-guest-home-join";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void helpCenterPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to help center page");
        helpCenter.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/help/linkedin?trk=uno-reg-guest-home-help-center&lang=en";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void aboutPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to about page");
        about.click();
        Thread.sleep(3000);
        String expectedUrl = "https://about.linkedin.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void pressPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to press page");
        press.click();
        Thread.sleep(3000);
        String expectedUrl = "https://news.linkedin.com/?trk=uno-reg-guest-home-press";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void blogPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to blog page");
        blog.click();
        Thread.sleep(3000);
        String expectedUrl = "https://blog.linkedin.com/?trk=uno-reg-guest-home-blog";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void careersPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to careers page");
        careers.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void developersPage() throws Exception {
        developers.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/developers?trk=uno-reg-guest-home-developers";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void talentPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to talent page");
        talent.click();
        Thread.sleep(3000);
        String expectedUrl = "https://business.linkedin.com/talent-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-talent";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void marketingPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to marketing page");
        marketing.click();
        Thread.sleep(3000);
        String expectedUrl = "https://business.linkedin.com/marketing-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-marketing";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void salesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to sales page");
        sales.click();
        Thread.sleep(3000);
        String expectedUrl = "https://business.linkedin.com/sales-solutions?src=li-footer&utm_source=linkedin&utm_medium=footer&trk=uno-reg-guest-home-enterprise-sales";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void learningPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to learning page");
        learning.click();
        Thread.sleep(3000);
        String expectedUrl = "https://learning.linkedin.com/?src=li-footer&trk=uno-reg-guest-home-enterprise-learning";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void companyPagesLink() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to company page");
        companyPages.click();
        Thread.sleep(3000);
        String expectedUrl = "https://business.linkedin.com/marketing-solutions/linkedin-pages?src=li-footer&trk=uno-reg-guest-home-enterprise-company-pages";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void browsByRegionPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to browse by region page");
        browseByRegion.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
