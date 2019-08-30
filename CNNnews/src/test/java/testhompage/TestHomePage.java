package testhompage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "https://www.cnn.com/";
    HomePage homePage;

    @BeforeClass
    public void initialize() {
        driver.get(homepageUrl);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @AfterMethod
    public void init(){
        driver.get(homepageUrl);
    }

    @Test
    public void testBottomHome() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Home Source");
        homePage.setBottomHome();
    }

    @Test
    public void testCrimeJusticeSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Crime And Justice Source");
        homePage.setCrimeJusticeSource();
    }

    @Test
    public void testEnargyEnvironmentSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Energy And Environment Source");
        homePage.setEnargyEnvironmentSource();
    }

    @Test
    public void testExtremeWeather() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Extreme Weather Source");
        homePage.setExtremeWeather();
    }

    @Test
    public void testSpaceScince() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Space And Science Source");
        homePage.setSpaceScince();
    }

    @Test
    public void testWorldNews() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom World News Source");
        homePage.setWorldNews();
    }

    @Test
    public void testAfricaSorce() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Africa Source");
        homePage.setAfricaSouce();
    }

    @Test
    public void testAmericaSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom America Source");
        homePage.setAmericaSource();
    }

    @Test
    public void testAsiaSoure() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Asia Source");
        homePage.setAsiaSoure();
    }

    @Test
    public void testChinaSource() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom China Source");
        homePage.setChinaSoure();
    }

    @Test
    public void testEuropeSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Europe Source");
        homePage.setEuropeSource();
    }

    @Test
    public void testMiddleEastSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Middle East Source");
        homePage.setMiddleEast();
    }

    @Test
    public void testIndiaSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom India Source");
        homePage.setIndiaSource();
    }

    @Test
    public void testSupremeCourtSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Supreme Court Source");
        homePage.setSuprimeCourtSource();
    }

    @Test
    public void testFactsFirst() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Facts Source");
        homePage.setFactsFirst();
    }

    @Test
    public void testOpinionSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Opinion Source");
        homePage.setOpinioSource();
    }

    @Test
    public void testFoodSource() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Food Source");
        homePage.setFoodSource();
    }

    @Test
    public void testFitnessSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Fitness Source");
        homePage.setFitnessSource();
    }

    @Test
    public void testWellnessSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Wellness Source");
        homePage.setWellnessSource();
    }

    @Test
    public void testLiveLonger() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Live Longer Source");
        homePage.setLiveLongerSource();
    }

    @Test
    public void testArtSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Art Source");
        homePage.setArtSource();
    }

    @Test
    public void testDesignSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Design Source");
        homePage.setDesignSource();
    }

    @Test
    public void testFashionSource() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Fashion Source");
        homePage.setFasionSoure();
    }

    @Test
    public void testLuxurySource() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Bottom Luxury Source");
        homePage.setLuxurySource();
    }

    @Test
    public void testDestinationSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom Destination Source");
        homePage.setDestinationSource();
    }

    @Test
    public void testFoodAndDrinks() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom Food And Drinks Source");
        homePage.setFoodAndDrinksSource();
    }

    @Test
    public void testCollegeFootballSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom College Football Source");
        homePage.setCollegeFootball();
    }

    @Test
    public void testBasketBallSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom BasketBall Source");
        homePage.setBasketBallSource();
    }

    @Test
    public void testBaseBallSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom BaseBall Source");
        homePage.setBaseBallSource();
    }

    @Test
    public void testSoccerSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom Soccer News Source");
        homePage.setSoccerSource();
    }

    @Test
    public void testOlympicSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom Olympic Source");
        homePage.setOlympicSource();
    }

    @Test
    public void clickOnSerchTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Search Tab");
        homePage.clickOnSearch();
    }

    @Test
    public void testDigitalStudio() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom Digital Studio Source");
        homePage.setDigitalStudioSource();
    }

    @Test
    public void testCNNFilmSOurce() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom CNN Film Source");
        homePage.setCnnFilmsSource();
    }

    @Test
    public void testHLNSource() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom HLN Source");
        homePage.setHLNSource();
    }

    @Test
    public void searchWithSearchIteems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + " Christchurch");
        homePage.SearchWithtext("christchurch");
    }

    @Test
    public void titleMatching() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Page Title ");
        String str = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(str, driver.getTitle());
    }

    @Test
    public void testCnnLogo() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify CNN Logo");
        homePage.setCnnLogo();
    }

    @Test
    public void testUsHeadlinesTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title U.S. Link Tab");
        homePage.setUsHeadlines();
    }

    @Test
    public void testWorldHeadlines() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title World Link Tab");
        homePage.setWorldHeadlines();
    }

    @Test
    public void testPoliticsHeadlines() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Politics Link Tab");
        homePage.setPoliticsHeadlines();
    }

    @Test
    public void testBusinessHeadlinestab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Business Link Tab");
        homePage.setBusinessHeadlines();
    }

    @Test
    public void testOpinionHeadlinesTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Opinion Link Tab");
        homePage.setOpinionHeadlines();
    }

    @Test
    public void testHealthHeadlinesTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Health Link Tab");
        homePage.setHealthHeadlinesTab();
    }

    @Test
    public void testEntertainmentTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Entertainment Link Tab");
        homePage.setEntertainmentTab();
    }

    @Test
    public void testStyleHeadlineTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Style Link Tab");
        homePage.setStyleHeadlinetab();
    }

    @Test
    public void testTravelHeadlineTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Travel Link Tab");
        homePage.setTravelHeadlineTab();
    }

    @Test
    public void testSportsHeadlineTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Sports Link Tab");
        homePage.setSportsHeadlineTab();
    }

    @Test
    public void testVideoHeadlineTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title Video Link Tab");
        homePage.setVideoHeadlineTab();
    }

    @Test
    public void testLiveTVTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title LiveTV Link Tab");
        homePage.setLiveTVTab();
    }

    @Test
    public void testUSEditionTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Title U.S. Edition Tab");
        homePage.setUSEditionTab();
    }

    @Test
    public void testMenuTab() {
        TestLogger.log(getClass().getSimpleName() + "  " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Menu Tab");
        homePage.setMenuTab();
    }
}