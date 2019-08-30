package testulta;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ulta.UltaMakeUpPage;

public class UltaTestMakeUpPage extends CommonAPI {

    UltaMakeUpPage ultaMakeUpPage;
    String makeupPageUrl = "https://www.ulta.com/makeup?N=26y1";

    @BeforeClass
    public void initialize() {
        driver.get(makeupPageUrl);
        ultaMakeUpPage = PageFactory.initElements(driver, UltaMakeUpPage.class);
    }

    @AfterMethod
    public void reStart() {
        driver.get(makeupPageUrl);
    }

    @Test
    public void makeUpPageTitle() {
        ultaMakeUpPage.getTitle();
    }

    @Test
    public void chooseNewArrival1stFrame() throws Exception {
        ultaMakeUpPage.setMacPallete();
    }

    @Test
    public void chooseNewArrival2ndFrame() {
        ultaMakeUpPage.setTarteFaceTape();

    }

    @Test
    public void chooseBestSeller1() {
        ultaMakeUpPage.setBestSeller1stframe();
    }

    @Test
    public void lipsSection1stFrame() {
        ultaMakeUpPage.setLipsSection1stFrame();
    }


    @Test
    public void makeUp3rdFrame() {
        ultaMakeUpPage.setFaceMakeUp3rdFrame();
    }

    @Test
    public void eyeMakeUp2ndFrame() {
        ultaMakeUpPage.setEyeMakeUp2ndFrame();
    }


    @Test
    public void verifyLogo() {
        ultaMakeUpPage.verifyLogoImg();
    }


    @Test
    public void hoverShopByBrand() throws InterruptedException {
        ultaMakeUpPage.hoverShopByBrands();
    }

    @Test
    public void hoverNChoose() throws InterruptedException {
        ultaMakeUpPage.hoverNChooseFromBrands();
    }

    @Test
    public void hoverOverNewArrivals() throws InterruptedException {
        ultaMakeUpPage.hoverNewArrivals();
    }

    @Test
    public void hoverOverMakeUp() throws InterruptedException {
        ultaMakeUpPage.hoverMakeUp();
    }

    @Test
    public void hoverOverNails() throws InterruptedException {
        ultaMakeUpPage.hoverNails();
    }

    @Test
    public void hoverOverSkinCare() throws InterruptedException {
        ultaMakeUpPage.hoverSkinCare();
    }

    @Test
    public void hoverOverHair() throws InterruptedException {
        ultaMakeUpPage.hoverHair();
    }

    @Test
    public void hoverOverToolsAndBrushes() throws InterruptedException {
        ultaMakeUpPage.hoverToolsAndBrushes();
    }

    @Test
    public void hoverOverFragrance() throws InterruptedException {
        ultaMakeUpPage.hoverFragrance();
    }

    @Test
    public void hoverOverBathAndBody() throws InterruptedException {
        ultaMakeUpPage.hoverBathAndBody();
    }

    @Test
    public void hoverOverMen() throws InterruptedException {
        ultaMakeUpPage.hoverBookAppointment();
    }

    @Test
    public void hoverOverUltaCollections() throws InterruptedException {
        ultaMakeUpPage.hoverUltaCollections();
    }

    @Test
    public void hoverOverGifts() throws InterruptedException {
        ultaMakeUpPage.hoverGifts();
    }

    @Test
    public void hoverOverSalesAndCoupons() throws InterruptedException {
        ultaMakeUpPage.hoverSalesAndCoupon();
    }

    @Test
    public void hoverOverCurrentAd() throws InterruptedException {
        ultaMakeUpPage.hoverCurrentAd();
    }

    @Test
    public void hoverOverBeautyTips() throws InterruptedException {
        ultaMakeUpPage.hoverBeautyTips();
    }

    @Test
    public void hoverOverAllureWinners() throws InterruptedException {
        ultaMakeUpPage.hoverAllureWinners();
    }

    @Test
    public void hoverOverBeautyServices() throws InterruptedException {
        ultaMakeUpPage.hoverBeautyServices();
    }

    @Test
    public void hoverOverBookAppointment() throws InterruptedException {
        ultaMakeUpPage.hoverBookAppointment();
    }

    @Test
    public void viewFaceSection() {
        ultaMakeUpPage.seeFaceSection();
    }

    @Test
    public void viewEyesSection() {
        ultaMakeUpPage.seeEyesSection();
    }

    @Test
    public void viewUltaCollectionSection() {
        ultaMakeUpPage.seeUltaCollectionSection();
    }

    @Test
    public void viewLipsSection() {
        ultaMakeUpPage.seelipsSection();
    }

    @Test
    public void viewBrushesAndToolsSection() {
        ultaMakeUpPage.seeBrushesAndToolsSection();
    }

    @Test
    public void viewBagsAndCasesSection() {
        ultaMakeUpPage.seeBagsAndCasesSection();
    }

    @Test
    public void viewTravelSizeSection() {
        ultaMakeUpPage.seeTravelSizeSection();
    }

    @Test
    public void viewGiftsAndValueSetsSection() {
        ultaMakeUpPage.seeGiftsAndValueSetsSection();
    }

    @Test
    public void viewAllureBestOfBeautySection() {
        ultaMakeUpPage.seeAllureBestOfBeautySection();
    }
}
