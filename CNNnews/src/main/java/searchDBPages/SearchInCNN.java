package searchDBPages;

import base.CommonAPI;
import datasource.DataBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchInCNN extends CommonAPI {

    DataBase dataBase = new DataBase();


    @FindBy(css = ".search__button.cnn-icon")
    WebElement searchTab;

    @FindBy(id = "search-input-field")
    WebElement searchInput;


    public WebElement getSubmitButton() {
        return searchTab;
    }

    public WebElement getSearchInputWebElement() {
        return searchInput;
    }


    public void submitSearchButton(){
        getSubmitButton().click();
    }


    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value, Keys.ENTER);

    }

    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception{
        List<String> list = dataBase.getItemsListFromDB();
        submitSearchButton();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            Thread.sleep(3000);
            clearInput();
        }
    }

}
