package testcnnworld;

import base.CommonAPI;
import cnnworld.CNNWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCNNWorld extends CommonAPI {

    CNNWorld world;
    String worldUrl = "https://www.cnn.com/world";

    @BeforeClass
    public void initialization(){
        driver.get(worldUrl);
        world = PageFactory.initElements(driver,CNNWorld.class);
        driver.navigate().refresh();
    }

    @AfterMethod
    public void reINIT(){
        driver.get(worldUrl);
    }

    @Test
    public void testTopVisibeIMG(){
        world.setVisiblefirstIMG();
    }
    @Test
    public void testHeadlines1(){
        world.setHeadlines();
    }
    @Test
    public void testHeadlones2(){
        world.setHeadlines2();
    }
    @Test
    public void testHeadlines3(){
        world.setHeadlines3();
    }
    @Test
    public void testHeadlines4(){
        world.setHeadlines4();
    }
    @Test
    public void testHeadlines5(){
        world.setHeadlines5();
    }
    @Test
    public void testFeatureSection(){
        world.setFeatureSection();
    }
    @Test
    public void testFeatureSection3(){
        world.setFeatureSection3();
    }
    @Test
    public void testFeatureSection4(){
        world.setFeatureSection4();
    }
    @Test
    public void testLatestStories(){
        world.setLatestSories1();
    }
    @Test
    public void testLatestStories2(){
        world.setLatestSories2();
    }
    @Test
    public void testLatestStories4(){
        world.setLatestStiries4();
    }
    @Test
    public void testLatestStories5(){
        world.setLatestStories5();
    }
    @Test
    public void testLatestStories6(){
        world.setLatestStories6();
    }
    @Test
    public void testLatestStories7(){
        world.setLatestSories7();
    }
    @Test
    public void testLatestStories8(){
        world.setLatestStories8();
    }
    @Test
    public void testLatestStories9() throws Exception{
        world.setLatestStories9();
    }
    @Test
    public void testLatestStories11() {
        world.setLatestStories11();
    }
    @Test
    public void testLatestStories12() {
        world.setLatestStories12();
    }
    @Test
    public void testLatestStories13() {
        world.setLatestStories13();
    }
}