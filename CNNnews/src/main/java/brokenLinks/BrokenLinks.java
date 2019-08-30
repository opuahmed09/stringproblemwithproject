package brokenLinks;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks extends CommonAPI {

    @FindBy(tagName = "a")
    List<WebElement> aTag;

    @FindBy(tagName = "img")
    List<WebElement> imgTag;

    public void Blinks() throws IOException {
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//        list.addAll(driver.findElements(By.tagName("img")));

        List<WebElement> list2 = aTag;
        list2.addAll(imgTag);

        List<WebElement> activeLinkes = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).getAttribute("href") != null && (!list2.get(i).getAttribute("href").contains("javascript"))) {
                activeLinkes.add(list2.get(i));
            }
        }
        int total = list2.size();
        int active = activeLinkes.size();
        System.out.println("Size of All links and IMG is :" + total);
        System.out.println("Size of Active links is :" + active);

        for (int j = 0; j < activeLinkes.size(); j++) {

            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinkes.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            int responseCode = connection.getResponseCode();
            connection.disconnect();

            System.out.println(activeLinkes.get(j).getAttribute("href") + "   :    " + response + "          code IS-->" + responseCode);
        }
    }

    public void Blonks2() throws IOException {

        List<WebElement> list = driver.findElements(By.tagName("a"));
        list.addAll(driver.findElements(By.tagName("img")));

        List<WebElement> activeLinks = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAttribute("href") != null && (!list.get(i).getAttribute("href").contains("javascript"))
                    && list.get(i).getAttribute("href").contains("")) {
                activeLinks.add(list.get(i));
            }
        }

        System.out.println("Total links  : " + list.size());
        System.out.println("Active Links : " + activeLinks.size());

        for (int j = 0; j < activeLinks.size(); j++) {

            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();

            String responseMSG = connection.getResponseMessage();
            int responceCODE = connection.getResponseCode();

            connection.disconnect();

            System.out.println(activeLinks.get(j).getAttribute("href") + "\t  " + responceCODE + "  :  " + responseMSG);
        }

    }
}
