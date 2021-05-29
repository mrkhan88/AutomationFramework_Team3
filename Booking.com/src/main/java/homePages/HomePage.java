package homePages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends WebAPI {

    public static final String flightLocator ="//span[normalize-space()='Flights']";
    @FindBy(how = How.XPATH,using=flightLocator)public WebElement flight_Button;


    public void clickFlight(){
        flight_Button.click();
    }
}
