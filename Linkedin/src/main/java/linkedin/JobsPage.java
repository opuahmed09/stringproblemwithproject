package linkedin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class JobsPage extends CommonAPI {

    @FindBy(css = "#keyword-box-input")
    WebElement jobsBar;

    @FindBy(css = "#location-box-input")
    WebElement locationBar;

    @FindBy(css = "button[class ='job-search__button lazy-loaded']")
    WebElement searchButton;

    @FindBy(css = "div[class='global-alert global-alert--yield']")
    WebElement globalAlert;

    @FindBy(xpath = "/html/body/footer/ul/li[10]/div/div/label[1]/span")
    WebElement language;

    @FindBy(xpath = "//button[@data-locale='fr_FR']")
    WebElement frenchLanguage;

    @FindBy(linkText = "Salaries")
    WebElement salariesTab;

    @FindBy(css = "a[class='join-login__button join-login__button--secondary']")
    WebElement signInSecondaryButton;

    @FindBy(css = "a[class='global-alert__link t-white t-bold']")
    WebElement cookiePolicy;

    @FindBy(linkText = "Operations")
    WebElement operations;

    @FindBy(linkText = "Healthcare Services")
    WebElement healthcareServices;

    @FindBy(linkText = "Human Resources")
    WebElement humanResources;

    @FindBy(linkText = "Finance")
    WebElement finance;

    @FindBy(linkText = "Community and Social Services")
    WebElement communityNFinancial;

    @FindBy(linkText = "Engineering")
    WebElement engineering;

    @FindBy(linkText = "Sales")
    WebElement sales;

    @FindBy(linkText = "Support")
    WebElement support;

    @FindBy(linkText = "Education")
    WebElement education;

    @FindBy(linkText = "Administrative")
    WebElement administrative;

    @FindBy(linkText = "Research")
    WebElement research;

    @FindBy(linkText = "Marketing")
    WebElement marketing;

    @FindBy(linkText = "Information Technology")
    WebElement informationTechnology;

    @FindBy(linkText = "Military and Protective Services")
    WebElement militaryNProtectiveServices;

    @FindBy(linkText = "Entrepreneurship")
    WebElement entrepreneurship;

    @FindBy(linkText = "Real Estate")
    WebElement realEstate;

    @FindBy(linkText = "Purchasing")
    WebElement purchasing;

    @FindBy(linkText = "Program and Project Management")
    WebElement programNProjectManagement;

    @FindBy(linkText = "Product Management")
    WebElement productManagement;

    @FindBy(linkText = "Media and Communication")
    WebElement mediaNCommunication;

    @FindBy(linkText = "Legal")
    WebElement legal;

    @FindBy(linkText = "Business Development")
    WebElement businessDevelopment;

    @FindBy(linkText = "Quality Assurance")
    WebElement QA;

    @FindBy(linkText = "Accounting")
    WebElement accounting;

    @FindBy(linkText = "Consulting")
    WebElement consulting;

    @FindBy(linkText = "Arts and Design")
    WebElement artsNDesign;

    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "jobs Page Title");
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public void searchForJobsBox(String job) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter selenium tester jobs");
        jobsBar.sendKeys(job);
    }

    public void searchWhichLocation(String location) {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "enter the location");
        locationBar.sendKeys(location);
    }

    public void clearLocationBox() {
        locationBar.clear();
    }

    public void clickSearchButton() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "able to click search button");
        searchButton.click();
    }


    public String globalAlertText() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get Alert text");
        boolean alertMsg = globalAlert.isDisplayed();
        System.out.println(globalAlert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "This website uses cookies to improve service and provide tailored ads. By using this site, you agree to this use. See our Cookie Policy.";

        return expectedAlert;
    }

    public void seeLanguageOptions() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "see languages drop down");
        language.click();
        String expectedUrl = "https://www.linkedin.com/jobs?trk=uno-reg-guest-home-jobs";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void selectFrenchFromLanguage() {
        frenchLanguage.click();
        String expectedUrl = "https://www.linkedin.com/jobs?trk=uno-reg-guest-home-jobs";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public String frenchAlert() {
        boolean alertMsg = globalAlert.isDisplayed();
        System.out.println(globalAlert.getText());
        Assert.assertTrue(alertMsg);
        String expectedAlert = "Ce site web utilise des cookies pour un meilleur service et vous montrer des publicités personnalisées. En utilisant ce site, vous acceptez leur utilisation. Voir notre politique relative aux cookies.";

        return expectedAlert;
    }

    public void changeLanguageFrench() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "change language to french");
        seeLanguageOptions();
        Thread.sleep(3000);
        selectFrenchFromLanguage();
        Thread.sleep(3000);
    }

    public void getAlertMessageFrench() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get Alert message in french");
        changeLanguageFrench();
        Thread.sleep(3000);
        Assert.assertEquals(globalAlert.getText(), frenchAlert());
    }


    public void navToSalariesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigate to salaries page");
        salariesTab.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/salary/?trk=guest_job_home_subnav-salaries";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void signIn() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "sign in secondary button at bottom");
        signInSecondaryButton.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/uas/login?emailAddress=&fromSignIn=&trk=guest_job_home_sign_in";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void viewCookiePolicy() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "see cookie policy");
        cookiePolicy.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/legal/cookie-policy?trk=guest_job_home_cookie_policy_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void operationsLinkPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view operations page");
        operations.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/operations?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void healthcareServicesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view healthcare page");
        healthcareServices.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/healthcare-services?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void humanResourcesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view HR page");
        humanResources.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/human-resources?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void financePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view finance page");
        finance.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/finance?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void communityNFinancialPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view community page");
        communityNFinancial.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/community-and-social-services?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void engineeringPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view Engineering page");
        engineering.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/engineering?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void salesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view sales page");
        sales.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/sales?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void supportPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view support page");
        support.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void educationPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view education page");
        education.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/education?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void administrativePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view administrative page");
        administrative.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/administrative?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void researchPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view research page");
        research.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/research?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void marketingPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view marketing page");
        marketing.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/marketing?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void informationTechnologyPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view IT page");
        informationTechnology.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/information-technology?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void militaryAndProtectiveServicesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view military page");
        militaryNProtectiveServices.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void entrepreneurshipPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view entrepreneurship page");
        entrepreneurship.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/entrepreneurship?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void realEstatePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view real estate page");
        realEstate.click();
        Thread.sleep(5000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void purchasingPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view purchasing page");
        purchasing.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void programNProjectManagementPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view program and management page");
        programNProjectManagement.click();
        Thread.sleep(3000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void productManagementPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view product management page");
        productManagement.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/product-management?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void mediaAndCommunicationPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view media page");
        mediaNCommunication.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/media-and-communication?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void legalPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view legal page");
        legal.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/legal?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void businessDevelopmentPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view business page");
        businessDevelopment.click();
        Thread.sleep(5000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/business-development?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void QAPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view QA page");
        QA.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/quality-assurance?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void accountingPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view accounting page");
        accounting.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/accounting?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void consultingPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view consulting page");
        consulting.click();
        Thread.sleep(3000);
        String expectedUrl = "https://www.linkedin.com/jobs/browse/consulting?trk=guest_job_home_function_crossLink_click";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    public void artsAndDesignPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "view arts and design page");
        artsNDesign.click();
        Thread.sleep(10000);
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
