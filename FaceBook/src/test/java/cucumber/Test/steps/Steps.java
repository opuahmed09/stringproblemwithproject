package cucumber.Test.steps;

import cucumber.Test.common.CommonCucumber;
import cucumber.Test.pageObjectModel.pomClasses;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Steps {

    pomClasses pomClass ;
    CommonCucumber commonCucumber;

    public static WebDriver driver;

    @Given("user navigate to the login page")
    public void user_navigate_to_the_login_page(){
        pomClass = new pomClasses();
        pomClass.navigateToLoginPage();
    }

    @And("user enters an email and an invalid password")
    public void userEntersAnEmailAndAnInvalidPassword() {
        pomClass = new pomClasses();
        pomClass.enterInEmail();
    }

    @When("user click on login")
    public void userClickOnLogin() {
        pomClass = new pomClasses();
        pomClass.enterInPassword();
    }

    @Then("user should go to home Page")
    public void userShouldGoToHomePage() {
        pomClass = new pomClasses();
        pomClass.login();

    }

    @Then("user click on sign out button")
    public void userClickOnSignOutButton() {
        pomClass = new pomClasses();

    }

    @And("user will sign out safely")
    public void userWillSignOutSafely() {
        pomClass = new pomClasses();

    }

    @Then("user navigate to cnn news home")
    public void userNavigateToCnnNewsHome() {
        pomClass = new pomClasses();

    }

    @Then("user will click on business page")
    public void userWillQuiteTheBrowser() {
        pomClass = new pomClasses();
    }

    @Then("user will quite the browser")
    public void userWillClickOnBusinessPage() {
        pomClass = new pomClasses();
        commonCucumber = new CommonCucumber(driver);
        commonCucumber.cleanUp();
    }

}
