package booking.pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingHomepage extends WebAPI {
    @FindBy(xpath = "(//span[@class='bui-tab__text'])[3]") public WebElement flightnhotel;
    @FindBy(xpath = "//a[normalize-space()='Countries']") public WebElement countriesButton;

    @FindBy(xpath = "(//li[@class='footer-navigation-link']/a)[2]") public WebElement regionButton;

    public void clickFlightnHotel(){
        flightnhotel.click();
    }
    public void clickCountriesbutton(){
        countriesButton.click();
    }
    public void clickOnRegion(){
        regionButton.click();
    }


}
