package testcnnhealthpage;

import base.CommonAPI;
import cnnhealthpage.CnnHealth;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCnnHealth extends CommonAPI {

    String cnnHelthUrl = "https://www.cnn.com/health";

    CnnHealth health;

    @BeforeClass
    public void intiaizing(){
        driver.get(cnnHelthUrl);
        health = PageFactory.initElements(driver,CnnHealth.class);
    }

    @AfterMethod
    public void reIit(){
        driver.get(cnnHelthUrl);
    }

    @Test
    public void testSetStorisSix() throws InterruptedException {
        health.setStorisSix();
//        Thread.sleep(2000);
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,900)");
//        js.executeScript("");
//        Math.random();
//        Thread.sleep(10000);


    }
    @Test
    public void testSetTopStoris(){
        health.setTopStoris();
    }
    @Test
    public void testSetFirstIMG(){
        health.setFirstIMG();
    }
    @Test
    public void testParenting(){
        health.setTestParenting();
    }
    @Test
    public void testSetHouseStoris()throws Exception{
        health.setHouseStoris("Politics");
    }
    @Test
    public void testSetPaidPartnerIMG(){
        health.setPaidPartnerIMG();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        health.setBottomWorldAsianews();
    }
    @Test
    public void testSetbottomWorldAustralia(){
        health.setbottomWorldAustralia();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        health.setbottomPoliticsCongress();
    }
    @Test
    public void testSetPopulerSixthTopic(){
        health.setPopulerSixthTopic();
    }



    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        // Form a list of numbers from 0-9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // Insert a new set of numbers from 0-5.
        for (int i = 0; i <=5; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Input list : " + list);
        System.out.println("\nFiltered duplicates : " + processList(list));
    }

    public static Set<String> processList(List<String> listContainingDuplicates) {

        final Set<String> resultSet = new HashSet<String>();
        final Set<String> tempSet = new HashSet<String>();

        for (String yourInt : listContainingDuplicates) {
            if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }
}