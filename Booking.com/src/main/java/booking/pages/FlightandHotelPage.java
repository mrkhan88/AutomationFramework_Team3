package booking.pages;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightandHotelPage extends WebAPI {

    @FindBy(xpath = "//input[@placeholder='Where from?']")public WebElement whereFrominput;
    @FindBy(xpath = "//ul[contains(@class, 'list sb-autocomplete__list-with_photos -visible')]/li")public List<WebElement> autosuggestivedropdown;

    @FindBy(xpath = "//ul[contains(@aria-label,'List of suggested destinations')]/li")public List<WebElement> autosuggest2;
    @FindBy(css = "input[placeholder='Where to?']")public WebElement whereToinput;

    @FindBy(xpath = "(//div[contains(@class,'bui-grid bui-grid')]/span[1])[1]")public WebElement calenderButton;

    public void typeinWherFrominputBox(){
        whereFrominput.sendKeys("New York");
        sleepFor(5);
    }
    public void clickOnNewYork(){
//        for (WebElement city : autosuggestivedropdown) {
//            if (city.getText().contains("New York"))
//                city.click();
//                break;
//        }
//        List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@aria-label,'List of suggested destinations')]/li"));
//        for (WebElement li : list) {
//            if (li.getText().contains("New York State, United States"))
//                li.click();
//                break;
//        }

        whereFrominput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        sleepFor(3);
    }

    public void typeinWhereToinputbox(){

        whereToinput.sendKeys("Texas");
        sleepFor(3);
    }
    public void selectPreferedCity(){
        whereToinput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void clickonCalender(){
        calenderButton.click();
    }




}
