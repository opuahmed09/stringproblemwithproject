package ulta;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import reporting.TestLogger;

public class UltaHomePage extends CommonAPI {


    public UltaHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#searchInput")
    WebElement searchBox;

    @FindBy(linkText = "EMAIL SIGNUP")
    WebElement signUp;

    @FindBy(linkText = "SALES & COUPONS")
    WebElement salesPage;

    @FindBy(linkText = "FIND A STORE")
    WebElement findStorePage;

    @FindBy(id = "sign-in")
    WebElement signInPage;

    @FindBy(linkText = "MAKEUP")
    WebElement makeUpPage;

    @FindBy(linkText = "MEN")
    WebElement mensPage;

    @FindBy(xpath = "//*[@id=\'hide-desk-nav\']/div[2]/ul/li[6]/a")
    WebElement skinCarePage;

    @FindBy(id = "firstName")
    WebElement firstNameStickySignUp;

    @FindBy(id = "lastName")
    WebElement lastNameStickySignUp;

    @FindBy(xpath = "//input[@name='emailaddress']")
    WebElement emailStickySignUp;

    @FindBy(className = "StickyEmailSignUp__submit--signup--msg")
    WebElement submitInStickySignUp;


    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "get title of Ulta Homepage");
        driver.getTitle();
        String title = "Cosmetics, Fragrance, Skincare and Beauty Gifts | Ulta Beauty";
        Assert.assertEquals(driver.getTitle(), title);
    }


    public void findAStore() throws Exception {
        findStorePage.click();
        Thread.sleep(3000);
        String urlExpected = driver.getCurrentUrl();
        //"https://www.ulta.com/stores/#/?q=&z=12&c=40.67181512990815%2C-73.82387679211968";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signInPage() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to sign in page");
        signInPage.click();
        String urlExpected = "https://www.ulta.com/ulta/myaccount/login.jsp";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signUpPage() {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to signUp page");
        signUp.click();
        String urlExpected = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void mensPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to men's page");
        mensPage.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/men?N=26zq";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void enterInSearchBox(String search) throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "entering 'fragrance' in search bar");
        searchBox.sendKeys(search, Keys.ENTER);
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/fragrance?N=26wa";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);

    }

    public void salesPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to sales page");
        salesPage.click();
        Thread.sleep(3000);
        String urlExpected = "https://www.ulta.com/promotion/buy-more-save-more/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void makeUpPage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to makeup page");
        makeUpPage.click();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/makeup?N=26y1";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void skinCarePage() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "navigating to skincare page");
        skinCarePage.click();
        Thread.sleep(4000);
        String urlExpected = "https://www.ulta.com/skin-care?N=2707";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void signUpForUltaBeauty() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "sign up for ulta beauty");
        firstNameStickySignUp.sendKeys("Sylvana");
        lastNameStickySignUp.sendKeys("Rahman");
        emailStickySignUp.sendKeys("stest7380@gmail.com");
        submitInStickySignUp.click();
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverOverShopByBrand() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Shop By Brand");
        mouseHoverByXpath("//*[@id='hide-desk-nav']/div[2]/ul/li[2]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNewArrivals() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over New Arrivals");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[3]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMakeUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over make up");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[4]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverNails() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over nails");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[5]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSkinCare() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over skin care");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[6]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverHair() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Hair");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[7]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverToolsAndBrushes() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over tools and brushes");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[8]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverFragrance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over fragrance");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[9]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBathAndBody() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Bath And Body");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[10]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverMen() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Men");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[11]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverUltaCollections() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Ulta Collections");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[12]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverGifts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Gifts");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[13]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverSalesAndCoupon() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Sales and coupon section");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[14]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverCurrentAd() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over current Ad");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[15]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }


    public void hoverBeautyTips() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Beauty Tips");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[16]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverAllureWinners() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Allure Winners");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[17]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBeautyServices() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Beauty Services");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[19]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

    public void hoverBookAppointment() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "hover over Book Appointment");
        mouseHoverByXpath("//*[@id=\'hide-desk-nav\']/div[2]/ul/li[20]/a");
        Thread.sleep(5000);
        String urlExpected = "https://www.ulta.com/";
        Assert.assertEquals(driver.getCurrentUrl(), urlExpected);
    }

}
