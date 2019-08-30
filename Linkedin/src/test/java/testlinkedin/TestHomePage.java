package testlinkedin;

import linkedin.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends HomePage {

    HomePage homePage;
    String homePageUrl = "https://www.linkedin.com/";

    @BeforeClass
    public void initialize() {
        driver.get(homePageUrl);
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @AfterMethod
    public void reStart() {
        driver.get(homePageUrl);
    }

    @Test
    public void getTitleOfLinkedInHomePage() {
        getTitleOfHomePage();
    }

    @Test
    public void enterFirstName() {
        homePage.inputFirstName("Selenium");
    }

    @Test
    public void enterLastName() {
        homePage.inputLastName("Test");
    }

    @Test
    public void enterEmail() {
        homePage.inputEmail("stest7380@gmail.com");
    }

    @Test
    public void enterPassword() {
        homePage.inputPassword("stest312@t");
    }

    @Test
    public void registerButton() {
        homePage.submitRegistration();
    }

    @Test(priority = 6)
    public void registerForLinkedIn() throws Exception {
        homePage.registerLinkedIn();
    }

    @Test
    public void registerWithNoLastName() throws Exception {
        homePage.registerNoLastName();
    }

    @Test
    public void registerWithNoEmail() throws Exception {
        homePage.registerNoEmail();
    }

    @Test
    public void registerWithNoPassword() throws Exception {
        homePage.registerNoPassword();
    }

    @Test
    public void registerWithNoCredentials() throws Exception {
        homePage.registerNoCredentials();
    }

    @Test
    public void emailLogin() {
        homePage.enterEmailLogin("stest7380@gmail.com");
    }

    @Test
    public void passwordLogin() {
        homePage.enterPasswordLogin("stest312@t");
    }

    // @Test
    public void signIn() throws Exception {
        homePage.logInLinkedIn("stest7380@gmail.com", "stest312@t");
    }

    @Test
    public void usingInvalidLogInCredentials() throws Exception {
        homePage.invalidLogInCredentials();
    }

    @Test
    public void navigateToForgotPasswordPage() throws Exception {
        homePage.setForgotPassword();
    }

    @Test
    public void viewSignUpPage() throws Exception {
        homePage.signUpPage();
    }

    @Test
    public void viewHelpCenterPage() throws Exception {
        homePage.helpCenterPage();
    }

    @Test
    public void viewAboutPage() throws Exception {
        homePage.aboutPage();
    }

    @Test
    public void viewPressPage() throws Exception {
        homePage.pressPage();
    }

    @Test
    public void viewBlogPage() throws Exception {
        homePage.blogPage();
    }

    @Test
    public void viewCareersPage() throws Exception {
        homePage.careersPage();
    }

    @Test
    public void viewDevelopersPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to developers page");
        homePage.developersPage();
    }

    @Test
    public void viewTalentPage() throws Exception {
        homePage.talentPage();
    }

    @Test
    public void viewMarketingPage() throws Exception {
        homePage.marketingPage();
    }

    @Test
    public void viewSalesPage() throws Exception {
        homePage.salesPage();
    }

    @Test
    public void viewLearningPage() throws Exception {
        homePage.learningPage();
    }

    @Test
    public void viewCompanyPages() throws Exception {
        homePage.companyPagesLink();
    }

    @Test
    public void viewBrowsByRegionPage() throws Exception {
        homePage.browsByRegionPage();
    }

}
