package booking.pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingHomepage extends WebAPI {
    @FindBy(xpath = "(//span[@class='bui-tab__text'])[3]") public WebElement flightnhotel;

    public void clickFlightnHotel(){
        flightnhotel.click();
    }



}
