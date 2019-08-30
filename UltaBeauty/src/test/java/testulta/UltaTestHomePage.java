package testulta;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ulta.UltaHomePage;

public class UltaTestHomePage extends CommonAPI {

    UltaHomePage ultaHomePage;
    String homePageUrl = "https://www.ulta.com/";

    @BeforeClass
    public void initialize() {
        driver.get(homePageUrl);
        ultaHomePage = PageFactory.initElements(driver, UltaHomePage.class);
    }

    @AfterMethod
    public void reStart() {
        driver.get(homePageUrl);
    }

    @Test
    public void getUltaHomePageTitle() {
        ultaHomePage.getTitle();
    }

    @Test
    public void enterSearchBox() throws Exception {
        ultaHomePage.enterInSearchBox("Fragrance");
    }

    @Test
    public void navigateToSalesPage() throws Exception {
        ultaHomePage.salesPage();
    }

    @Test
    public void navigateToSignIn() {
        ultaHomePage.signInPage();
    }

    @Test
    public void navigateToSignup() {
        ultaHomePage.signUpPage();

    }

    @Test
    public void navigateToMakeUpPage() throws Exception {
        ultaHomePage.makeUpPage();
    }

    @Test
    public void navigateToFIndAStore() throws Exception {
        ultaHomePage.findAStore();
    }

    @Test
    public void navigateToMensPage() throws Exception {
        ultaHomePage.mensPage();
    }

    @Test
    public void navigateToSkinCarePage() throws Exception {
        ultaHomePage.skinCarePage();
    }

    @Test
    public void ableToSignUpForUltaThroughSticky() throws Exception {
        ultaHomePage.signUpForUltaBeauty();
    }

    @Test
    public void hoverShopByBrands() throws InterruptedException {
        ultaHomePage.hoverOverShopByBrand();
    }

    @Test
    public void hoverOverNewArrivals() throws InterruptedException {
        ultaHomePage.hoverNewArrivals();
    }

    @Test
    public void hoverOverMakeUp() throws InterruptedException {
        ultaHomePage.hoverMakeUp();
    }

    @Test
    public void hoverOverNails() throws InterruptedException {
        ultaHomePage.hoverNails();
    }

    @Test
    public void hoverOverSkinCare() throws InterruptedException {
        ultaHomePage.hoverSkinCare();
    }

    @Test
    public void hoverOverHair() throws InterruptedException {
        ultaHomePage.hoverHair();
    }

    @Test
    public void hoverOverToolsAndBrushes() throws InterruptedException {
        ultaHomePage.hoverToolsAndBrushes();
    }

    @Test
    public void hoverOverFragrance() throws InterruptedException {
        ultaHomePage.hoverFragrance();
    }

    @Test
    public void hoverOverBathAndBody() throws InterruptedException {
        ultaHomePage.hoverBathAndBody();
    }

    @Test
    public void hoverOverMen() throws InterruptedException {
        ultaHomePage.hoverMen();
    }

    @Test
    public void hoverOverUltaCollections() throws InterruptedException {
        ultaHomePage.hoverUltaCollections();
    }

    @Test
    public void hoverOverGifts() throws InterruptedException {
        ultaHomePage.hoverGifts();
    }

    @Test
    public void hoverOverSalesAndCoupons() throws InterruptedException {
        ultaHomePage.hoverSalesAndCoupon();
    }

    @Test
    public void hoverOverCurrentAd() throws InterruptedException {
        ultaHomePage.hoverCurrentAd();
    }

    @Test
    public void hoverOverBeautyTips() throws InterruptedException {
        ultaHomePage.hoverBeautyTips();
    }

    @Test
    public void hoverOverAllureWinners() throws InterruptedException {
        ultaHomePage.hoverAllureWinners();
    }

    @Test
    public void hoverOverBeautyServices() throws InterruptedException {
        ultaHomePage.hoverBeautyServices();
    }

    @Test
    public void hoverOverBookAppointment() throws InterruptedException {
        ultaHomePage.hoverBookAppointment();
    }

}
